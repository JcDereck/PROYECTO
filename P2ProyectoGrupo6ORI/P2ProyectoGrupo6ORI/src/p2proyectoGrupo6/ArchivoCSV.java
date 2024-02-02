package p2proyectoGrupo6;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import jdk.jfr.FlightRecorder;
import org.bson.Document;
import p2proyectoGrupo6.Interfaz.archivoCSV;

public class ArchivoCSV implements archivoCSV{
    private static final String NameFile="LIBROS.csv";

    @Override
    public void createFile(Libro books) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NameFile,true))) {
            if (new File(NameFile).length()== 0) {
                writer.write("ID,GÉNERO,AUTOR,TÍTULO,EDITORIAL,AÑO DE PUBLICACION,EDICION");
                writer.newLine();
            }
            String nuvaLina=String.join(",", books.getId(),books.getGenero(),books.getAutor()
                    ,books.getTitulo(),books.getEditorial(),String.valueOf(books.getAnioPublicacion())
                    ,books.getEdicion());
            writer.write(nuvaLina);
            writer.newLine();
            writer.close();
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null, "[ ERROR AL CREAR EL ARCHIVO: "+NameFile+"]");
        }
    }
    
    public void readerFile(){
        try {
            MongoClient mongo = new MongoClient("localhost", 27017);
            MongoDatabase database = mongo.getDatabase("BIBLIOTECA_VIRTUAL");
            MongoCollection<Document> collect = database.getCollection("LIBROS_REGISTRADOS");

            // Verificar si la colección ya contiene datos
            long count = collect.countDocuments();
            boolean yaExistenDatos = count > 0;

            // Leer el archivo CSV
            try (BufferedReader reader = new BufferedReader(new FileReader("LIBROS.csv"))) {
                String linea;
                reader.readLine(); // Saltar la primera línea (encabezados)

                while ((linea = reader.readLine()) != null) {
                    String[] partes = linea.split(",");
                    Document document = new Document("ID", partes[0])
                            .append("GÉNERO", partes[1])
                            .append("AUTOR", partes[2])
                            .append("TÍTULO", partes[3])
                            .append("EDITORIAL ", partes[4])
                            .append("AÑO DE PUBLICACION", partes[5])
                            .append("EDICION", partes[6]);

                    // Buscar un libro existente con el mismo ID
                    Document libroExistente = collect.find(eq("ID", partes[0])).first();

                    if (libroExistente != null) {
                        // Si el libro ya existe, actualizarlo
                        collect.replaceOne(eq("ID", partes[0]), document);
                    } else {
                        // Si el libro no existe, insertarlo
                        collect.insertOne(document);
                    }
                }
            }
            System.out.println("Carga de libros desde el archivo CSV completada.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexión a MongoDB o al cargar el archivo CSV");
        }
    }
}
