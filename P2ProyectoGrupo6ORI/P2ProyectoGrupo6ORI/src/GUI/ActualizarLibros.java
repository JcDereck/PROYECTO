package GUI;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.bson.Document;

public class ActualizarLibros extends javax.swing.JFrame {
    String ID;
    String TITULO;
    
    public ActualizarLibros(String ID, String TITULO) {
        this.ID=ID;
        this.TITULO=TITULO;
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jPTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPOpciones = new javax.swing.JPanel();
        jPVolver = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPActualizar = new javax.swing.JPanel();
        jLbActulaizar = new javax.swing.JLabel();
        jLbGenero = new javax.swing.JLabel();
        jLbAutor = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jTxtTitulo = new javax.swing.JTextField();
        jTxtEditorial = new javax.swing.JTextField();
        jCBGenero = new javax.swing.JComboBox<>();
        jLbEditorial = new javax.swing.JLabel();
        jLbAnioPublicacion = new javax.swing.JLabel();
        jTxtEdicion = new javax.swing.JTextField();
        jTxtAutor = new javax.swing.JTextField();
        jLbEdicion = new javax.swing.JLabel();
        jTxtAnioPublicacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTitulo.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR LIBRO");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPFondo.add(jPTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jPOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<< VOLVER");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPVolverLayout = new javax.swing.GroupLayout(jPVolver);
        jPVolver.setLayout(jPVolverLayout);
        jPVolverLayout.setHorizontalGroup(
            jPVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPVolverLayout.setVerticalGroup(
            jPVolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPOpciones.add(jPVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLbActulaizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbActulaizar.setText("ACTUALIZAR");
        jLbActulaizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbActulaizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbActulaizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbActulaizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPActualizarLayout = new javax.swing.GroupLayout(jPActualizar);
        jPActualizar.setLayout(jPActualizarLayout);
        jPActualizarLayout.setHorizontalGroup(
            jPActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbActulaizar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPActualizarLayout.setVerticalGroup(
            jPActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbActulaizar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPOpciones.add(jPActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, 60));

        jPFondo.add(jPOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 400, 60));

        jLbGenero.setText("GÉNERO:");
        jPFondo.add(jLbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLbAutor.setText("AUTOR:");
        jPFondo.add(jLbAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLbTitulo.setText("TÍTULO:");
        jPFondo.add(jLbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPFondo.add(jTxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, -1));
        jPFondo.add(jTxtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, -1));

        jCBGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIENCIA FICCION", "NOBELA", "HISTORIA", "ROMANCE" }));
        jPFondo.add(jCBGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));

        jLbEditorial.setText("EDITORIAL:");
        jPFondo.add(jLbEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLbAnioPublicacion.setText("AÑO DE PUBLICACION:");
        jPFondo.add(jLbAnioPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        jPFondo.add(jTxtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 160, -1));
        jPFondo.add(jTxtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, -1));

        jLbEdicion.setText("EDICION: ");
        jPFondo.add(jLbEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));
        jPFondo.add(jTxtAnioPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLbActulaizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActulaizarMouseEntered
        jPActualizar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLbActulaizarMouseEntered

    private void jLbActulaizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActulaizarMouseExited
        jPActualizar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbActulaizarMouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jPVolver.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jPVolver.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLbActulaizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActulaizarMouseClicked
        try {
            MongoClient mongo=new MongoClient("localhost",27017);
            MongoDatabase database= mongo.getDatabase("BIBLIOTECA_VIRTUAL");
            MongoCollection<Document> collect=database.getCollection("LIBROS_REGISTRADOS");
            actualizarLibros(collect);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
        }
    }//GEN-LAST:event_jLbActulaizarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> jCBGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbActulaizar;
    private javax.swing.JLabel jLbAnioPublicacion;
    private javax.swing.JLabel jLbAutor;
    private javax.swing.JLabel jLbEdicion;
    private javax.swing.JLabel jLbEditorial;
    private javax.swing.JLabel jLbGenero;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JPanel jPActualizar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPVolver;
    public javax.swing.JTextField jTxtAnioPublicacion;
    public javax.swing.JTextField jTxtAutor;
    public javax.swing.JTextField jTxtEdicion;
    public javax.swing.JTextField jTxtEditorial;
    public javax.swing.JTextField jTxtTitulo;
    // End of variables declaration//GEN-END:variables
    private void actualizarLibros(MongoCollection<Document> collect){
        InventarioLibros obLibros=new InventarioLibros();
        int opcion=0,id=1,titulo2=2,ambos=3;
        String ID=obLibros.jTxtBuscarID.getText();
        String titulo=obLibros.jTxtBuscarTitulo.getText();
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
                Document filtro=new Document("ID",obLibros.jTxtBuscarID.getText());
                collect.deleteOne(filtro);
                JOptionPane.showMessageDialog(null, "[ EL LIBRO FUE ELIMINADO DE LA BASE DE DATOS ]");
                break;
            case 2:
                Document filtro1=new Document("TÍTULO",obLibros.jTxtBuscarTitulo.getText());
                collect.deleteOne(filtro1);
                JOptionPane.showMessageDialog(null, "[ EL LIBRO FUE ELIMINADO DE LA BASE DE DATOS ]");
                break;
            case 3:
                Document filtro2=new Document("TÍTULO",obLibros.jTxtBuscarTitulo.getText()).append("ID", obLibros.jTxtBuscarID.getText());
                collect.deleteOne(filtro2);
                JOptionPane.showMessageDialog(null, "[ EL LIBRO FUE ELIMINADO DE LA BASE DE DATOS ]");
                break;
        }
    }
}