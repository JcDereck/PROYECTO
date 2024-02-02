package GUI;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

public class InventarioLibros extends javax.swing.JPanel {

    public InventarioLibros() {
        initComponents();
        mostrarInventarioLibros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPFondo = new javax.swing.JPanel();
        jPTitulo = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();
        jPOpciones = new javax.swing.JPanel();
        jPActualizar = new javax.swing.JPanel();
        jLbActualizar = new javax.swing.JLabel();
        jPEliminar = new javax.swing.JPanel();
        jLbEliminar = new javax.swing.JLabel();
        jPBuscar = new javax.swing.JPanel();
        jLbBuscar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTbLibros = new javax.swing.JTable();
        jLbIDBuscar = new javax.swing.JLabel();
        jTxtBuscarID = new javax.swing.JTextField();
        jLbTituloBuscar1 = new javax.swing.JLabel();
        jTxtBuscarTitulo = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(480, 340));

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTitulo.setBackground(new java.awt.Color(0, 0, 204));

        LbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTitulo.setText("INVENTARIO DE LIBROS");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jPFondo.add(jPTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

        jPOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbActualizar.setText("ACTUALIZAR");
        jLbActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPActualizarLayout = new javax.swing.GroupLayout(jPActualizar);
        jPActualizar.setLayout(jPActualizarLayout);
        jPActualizarLayout.setHorizontalGroup(
            jPActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPActualizarLayout.setVerticalGroup(
            jPActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPOpciones.add(jPActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 100, 60));

        jLbEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbEliminar.setText("ELIMINAR");
        jLbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPEliminarLayout = new javax.swing.GroupLayout(jPEliminar);
        jPEliminar.setLayout(jPEliminarLayout);
        jPEliminarLayout.setHorizontalGroup(
            jPEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPEliminarLayout.setVerticalGroup(
            jPEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPOpciones.add(jPEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 60));

        jLbBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbBuscar.setText("BUSCAR");
        jLbBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPBuscarLayout = new javax.swing.GroupLayout(jPBuscar);
        jPBuscar.setLayout(jPBuscarLayout);
        jPBuscarLayout.setHorizontalGroup(
            jPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBuscarLayout.createSequentialGroup()
                .addComponent(jLbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPBuscarLayout.setVerticalGroup(
            jPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPOpciones.add(jPBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 0, 290, 60));

        jPFondo.add(jPOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 490, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTbLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTbLibros);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 480, 138));

        jPFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 490, 150));

        jLbIDBuscar.setText("ID: ");
        jPFondo.add(jLbIDBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPFondo.add(jTxtBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, -1));

        jLbTituloBuscar1.setText("TITULO: ");
        jPFondo.add(jLbTituloBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));
        jPFondo.add(jTxtBuscarTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLbEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbEliminarMouseEntered
        jPEliminar.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_jLbEliminarMouseEntered

    private void jLbEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbEliminarMouseExited
        jPEliminar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbEliminarMouseExited

    private void jLbActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActualizarMouseEntered
        jPActualizar.setBackground(new Color(255, 255, 204));
       // jPActualizar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLbActualizarMouseEntered

    private void jLbActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActualizarMouseExited
        jPActualizar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbActualizarMouseExited

    private void jLbActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActualizarMouseClicked
        ActualizarLibros obAcLibros =new ActualizarLibros(jTxtBuscarID.getText(),jTxtBuscarTitulo.getText());
        int opcion=0,id=1,titulo2=2,ambos=3;
        String ID=jTxtBuscarID.getText();
        String titulo=jTxtBuscarTitulo.getText();
        if (ID.equals("") && titulo.equals("")) {
            opcion = 0; // Ambos campos están vacíos
        } else if (ID.equals("") && !titulo.equals("")) {
            opcion = titulo2; // Buscar por título
        } else if (!ID.equals("") && titulo.equals("")) {
            opcion = id; // Buscar por ID
        } else if (!ID.equals("") && !titulo.equals("")) {
            opcion = ambos; // Buscar por ambos
        }
        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null, "[ ERROR PARA ACTUALIZAR ]"
                        + "\n Debe rellenar al menos uno de los campos");
                break;
            case 1:
                obAcLibros.setVisible(true);
                obAcLibros.setLocationRelativeTo(null);
                break;
            case 2:
                obAcLibros.setVisible(true);
                obAcLibros.setLocationRelativeTo(null);
                break;
            case 3:
                obAcLibros.setVisible(true);
                obAcLibros.setLocationRelativeTo(null);
                break;
        }
        
        
    }//GEN-LAST:event_jLbActualizarMouseClicked

    private void jLbBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBuscarMouseEntered
        jPBuscar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLbBuscarMouseEntered

    private void jLbBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBuscarMouseExited
        jPBuscar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbBuscarMouseExited

    private void jLbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBuscarMouseClicked
        try {
            MongoClient mongo=new MongoClient("localhost",27017);
            MongoDatabase database= mongo.getDatabase("BIBLIOTECA_VIRTUAL");
            MongoCollection<Document> collect=database.getCollection("LIBROS_REGISTRADOS");
            buscarLibro(collect);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
        }
    }//GEN-LAST:event_jLbBuscarMouseClicked

    private void jLbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbEliminarMouseClicked
        try {
            MongoClient mongo=new MongoClient("localhost",27017);
            MongoDatabase database= mongo.getDatabase("BIBLIOTECA_VIRTUAL");
            MongoCollection<Document> collect=database.getCollection("LIBROS_REGISTRADOS");
            eliminarLibro(collect);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
        }
    }//GEN-LAST:event_jLbEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JLabel jLbActualizar;
    private javax.swing.JLabel jLbBuscar;
    private javax.swing.JLabel jLbEliminar;
    private javax.swing.JLabel jLbIDBuscar;
    private javax.swing.JLabel jLbTituloBuscar1;
    private javax.swing.JPanel jPActualizar;
    private javax.swing.JPanel jPBuscar;
    private javax.swing.JPanel jPEliminar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTbLibros;
    protected javax.swing.JTextField jTxtBuscarID;
    protected javax.swing.JTextField jTxtBuscarTitulo;
    // End of variables declaration//GEN-END:variables
    private void mostrarInventarioLibros(){
        DefaultTableModel tbInventarioLibros=new  DefaultTableModel();
        tbInventarioLibros.addColumn("ID");
        tbInventarioLibros.addColumn("GÉNERO");
        tbInventarioLibros.addColumn("AUTOR");
        tbInventarioLibros.addColumn("TÍTULO");
        tbInventarioLibros.addColumn("EDITORIAL");
        tbInventarioLibros.addColumn("AÑO PUBLI");
        tbInventarioLibros.addColumn("EDICION");
        jTbLibros.setModel(tbInventarioLibros);
        try {
            MongoClient mongo=new MongoClient("localhost",27017);
            MongoDatabase database= mongo.getDatabase("BIBLIOTECA_VIRTUAL");
            MongoCollection<Document> collect=database.getCollection("LIBROS_REGISTRADOS");
            MongoCursor<Document> cursor= collect.find().iterator();
            
            while (cursor.hasNext()) {
                // Obtener valores del documento
                Document documento = cursor.next();
                String id = documento.getString("ID");
                String genero = documento.getString("GÉNERO");
                String autor = documento.getString("AUTOR");
                String titulo = documento.getString("TÍTULO");
                String editorial = documento.getString("EDITORIAL ");
                String anioPublicacion = documento.getString("AÑO DE PUBLICACION");
                String edicion = documento.getString("EDICION");

                // Crear un arreglo de Strings para la fila
                String[] datos = {id, genero,autor, titulo, editorial,anioPublicacion,edicion};
                tbInventarioLibros.addRow(datos);
            }
            jTbLibros.setModel(tbInventarioLibros);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
        }
    }
    
    private void buscarLibro(MongoCollection<Document> collect){
        int opcion=0,id=1,titulo2=2,ambos=3;
        String ID=jTxtBuscarID.getText();
        String titulo=jTxtBuscarTitulo.getText();
        if (ID.equals("") && titulo.equals("")) {
            opcion = 0; // Ambos campos están vacíos
        } else if (ID.equals("") && !titulo.equals("")) {
            opcion = titulo2; // Buscar por título
        } else if (!ID.equals("") && titulo.equals("")) {
            opcion = id; // Buscar por ID
        } else if (!ID.equals("") && !titulo.equals("")) {
            opcion = ambos; // Buscar por ambos
        }

        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null, "[ ERROR AL BUSCAR ]\n Debe rellenar al menos uno de los campos");
                break;
            case 1:
                try {
                    Document filtro=new Document("ID",jTxtBuscarID.getText());
                    Document encontrar = collect.find(filtro).first();
                    if(encontrar != null){
                        String id1 = encontrar.getString("ID");
                        String genero = encontrar.getString("GÉNERO");
                        String autor = encontrar.getString("AUTOR");
                        String titulo3 = encontrar.getString("TÍTULO");
                        String editorial = encontrar.getString("EDITORIAL ");
                        String anioPublicacion = encontrar.getString("AÑO DE PUBLICACION");
                        String edicion = encontrar.getString("EDICION");
                        JOptionPane.showMessageDialog(null, "   ====================\n"
                                + "     Libro encontrado:\n" +
                                "   ===================="+ "\n" +
                                "ID: " + genero + "\n" +
                                "GÉNERO: " + genero + "\n" +
                                "AUTOR: " + autor + "\n" +
                                "TÍTULO: " + titulo3+ "\n" +
                                "EDITORIAL: " + editorial + "\n" +
                                "AÑO DE PUBLICACION: " + anioPublicacion+ "\n" +
                                "EDICION: " + edicion);
                    }else{
                        JOptionPane.showMessageDialog(null, "[ El LIBRO NO SE ENCONTRO EN LA BASE DE DATOS ]");
                    }
                } catch (MongoException e) {
                    JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
                }
                break;
            case 2:
                try {
                    Document filtro=new Document("TÍTULO",jTxtBuscarTitulo.getText());
                    Document encontrar = collect.find(filtro).first();
                    if(encontrar != null){
                        String id1 = encontrar.getString("ID");
                        String genero = encontrar.getString("GÉNERO");
                        String autor = encontrar.getString("AUTOR");
                        String titulo3 = encontrar.getString("TÍTULO");
                        String editorial = encontrar.getString("EDITORIAL ");
                        String anioPublicacion = encontrar.getString("AÑO DE PUBLICACION");
                        String edicion = encontrar.getString("EDICION");
                        JOptionPane.showMessageDialog(null, "   ====================\n"
                                + "     Libro encontrado:\n" +
                                "   ===================="+ "\n" +
                                "ID: " + genero + "\n" +
                                "GÉNERO: " + genero + "\n" +
                                "AUTOR: " + autor + "\n" +
                                "TÍTULO: " + titulo3+ "\n" +
                                "EDITORIAL: " + editorial + "\n" +
                                "AÑO DE PUBLICACION: " + anioPublicacion+ "\n" +
                                "EDICION: " + edicion);
                    }else{
                        JOptionPane.showMessageDialog(null, "[ El LIBRO NO SE ENCONTRO EN LA BASE DE DATOS ]");
                    }
                } catch (MongoException e) {
                    JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
                }
                break;
            case 3:
                try {
                    Document filtro=new Document("TÍTULO",jTxtBuscarTitulo.getText()).append("ID", jTxtBuscarID.getText());
                    Document encontrar = collect.find(filtro).first();
                    if(encontrar != null){
                        String id1 = encontrar.getString("ID");
                        String genero = encontrar.getString("GÉNERO");
                        String autor = encontrar.getString("AUTOR");
                        String titulo3 = encontrar.getString("TÍTULO");
                        String editorial = encontrar.getString("EDITORIAL ");
                        String anioPublicacion = encontrar.getString("AÑO DE PUBLICACION");
                        String edicion = encontrar.getString("EDICION");
                        JOptionPane.showMessageDialog(null, "   ====================\n"
                                + "     Libro encontrado:\n" +
                                "   ===================="+ "\n" +
                                "ID: " + genero + "\n" +
                                "GÉNERO: " + genero + "\n" +
                                "AUTOR: " + autor + "\n" +
                                "TÍTULO: " + titulo3+ "\n" +
                                "EDITORIAL: " + editorial + "\n" +
                                "AÑO DE PUBLICACION: " + anioPublicacion+ "\n" +
                                "EDICION: " + edicion);
                    }else{
                        JOptionPane.showMessageDialog(null, "[ El LIBRO NO SE ENCONTRO EN LA BASE DE DATOS ]");
                    }
                } catch (MongoException e) {
                    JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
                }
                break;
        }
    }
    private void eliminarLibro(MongoCollection<Document> collect) {
        int opcion=0,id=1,titulo2=2,ambos=3;
        String ID=jTxtBuscarID.getText();
        String titulo=jTxtBuscarTitulo.getText();
        if (ID.equals("") && titulo.equals("")) {
            opcion = 0; // Ambos campos están vacíos
        } else if (ID.equals("") && !titulo.equals("")) {
            opcion = titulo2; // Buscar por título
        } else if (!ID.equals("") && titulo.equals("")) {
            opcion = id; // Buscar por ID
        } else if (!ID.equals("") && !titulo.equals("")) {
            opcion = ambos; // Buscar por ambos
        }
        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null, "[ ERROR PARA ELIMINAR ]"
                        + "\n Debe rellenar al menos uno de los campos");
                break;
            case 1:
                Document filtro=new Document("ID",jTxtBuscarID.getText());
                collect.deleteOne(filtro);
                JOptionPane.showMessageDialog(null, "[ EL LIBRO FUE ELIMINADO DE LA BASE DE DATOS ]");
                break;
            case 2:
                Document filtro1=new Document("TÍTULO",jTxtBuscarTitulo.getText());
                collect.deleteOne(filtro1);
                JOptionPane.showMessageDialog(null, "[ EL LIBRO FUE ELIMINADO DE LA BASE DE DATOS ]");
                break;
            case 3:
                Document filtro2=new Document("TÍTULO",jTxtBuscarTitulo.getText()).append("ID", jTxtBuscarID.getText());
                collect.deleteOne(filtro2);
                JOptionPane.showMessageDialog(null, "[ EL LIBRO FUE ELIMINADO DE LA BASE DE DATOS ]");
                break;
        }
    }
}