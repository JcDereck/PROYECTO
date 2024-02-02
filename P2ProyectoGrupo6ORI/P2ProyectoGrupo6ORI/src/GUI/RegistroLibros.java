package GUI;

import com.mongodb.client.MongoCollection;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.bson.Document;
import p2proyectoGrupo6.ArchivoCSV;
import p2proyectoGrupo6.Libro;

public class RegistroLibros extends javax.swing.JPanel {
    public RegistroLibros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jPTitulo = new javax.swing.JPanel();
        LbTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLbGenero = new javax.swing.JLabel();
        jLbAutor = new javax.swing.JLabel();
        jLbTitulo = new javax.swing.JLabel();
        jTxtTitulo = new javax.swing.JTextField();
        jTxtEditoriol = new javax.swing.JTextField();
        jCBGenero = new javax.swing.JComboBox<>();
        jLbEditorial = new javax.swing.JLabel();
        jLbAnioPublicacion = new javax.swing.JLabel();
        jTxtEdicion = new javax.swing.JTextField();
        jTxtAutor = new javax.swing.JTextField();
        jLbEdicion = new javax.swing.JLabel();
        jTxtAnioPublicanion = new javax.swing.JTextField();
        jPOpciones = new javax.swing.JPanel();
        jPGuardar = new javax.swing.JPanel();
        jLbGuardar = new javax.swing.JLabel();
        jLbID = new javax.swing.JLabel();
        jTxtID = new javax.swing.JTextField();

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTitulo.setBackground(new java.awt.Color(0, 0, 204));

        LbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTitulo.setText("REGISTRO DE LIBROS");

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbGenero.setText("GÉNERO:");
        jPanel1.add(jLbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLbAutor.setText("AUTOR:");
        jPanel1.add(jLbAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLbTitulo.setText("TÍTULO:");
        jPanel1.add(jLbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(jTxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 160, -1));
        jPanel1.add(jTxtEditoriol, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 160, -1));

        jCBGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIENCIA FICCION", "NOBELA", "HISTORIA", "ROMANCE" }));
        jPanel1.add(jCBGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, -1));

        jLbEditorial.setText("EDITORIAL:");
        jPanel1.add(jLbEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLbAnioPublicacion.setText("AÑO DE PUBLICACION:");
        jPanel1.add(jLbAnioPublicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));
        jPanel1.add(jTxtEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 160, -1));
        jPanel1.add(jTxtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, -1));

        jLbEdicion.setText("EDICION: ");
        jPanel1.add(jLbEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        jPanel1.add(jTxtAnioPublicanion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, -1));

        jPFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 410, 170));

        jLbGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbGuardar.setText("GUARDAR");
        jLbGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPGuardarLayout = new javax.swing.GroupLayout(jPGuardar);
        jPGuardar.setLayout(jPGuardarLayout);
        jPGuardarLayout.setHorizontalGroup(
            jPGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        jPGuardarLayout.setVerticalGroup(
            jPGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPOpcionesLayout = new javax.swing.GroupLayout(jPOpciones);
        jPOpciones.setLayout(jPOpcionesLayout);
        jPOpcionesLayout.setHorizontalGroup(
            jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPOpcionesLayout.setVerticalGroup(
            jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPFondo.add(jPOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 490, 60));

        jLbID.setText("ID:");
        jPFondo.add(jLbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
        jPFondo.add(jTxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 110, -1));

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

    private void jLbGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbGuardarMouseEntered
        jPGuardar.setBackground(new Color(204, 255, 204));
    }//GEN-LAST:event_jLbGuardarMouseEntered

    private void jLbGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbGuardarMouseExited
        jPGuardar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbGuardarMouseExited

    private void jLbGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbGuardarMouseClicked
        String ID=jTxtID.getText();
        String titulo=jTxtTitulo.getText();
        String genero=(String) jCBGenero.getSelectedItem();
        String autor=jTxtAutor.getText();
        String editorial=jTxtEditoriol.getText();
        String anioPublicacion=jTxtAnioPublicanion.getText();
        String edicion=jTxtEdicion.getText();        
        if(ID.equals("")||titulo.equals("")||autor.equals("")||editorial.equals("")||anioPublicacion.equals("")||edicion.equals("")){
            JOptionPane.showMessageDialog(null, "[ ERROR AL GUARDAR ]"
                    + "\n Debe rellenar todos los campas");
        }else{
            ArchivoCSV obArchivoCSV=new ArchivoCSV();
            Libro nuvoLibro=new Libro(genero, autor, titulo, editorial, ID, Integer.parseInt(anioPublicacion), edicion);
            obArchivoCSV.createFile(nuvoLibro);
            JOptionPane.showMessageDialog(null, "[ EL LIBRO SE GUARDADO ]");
            jTxtID.setText("");
            jTxtTitulo.setText("");
            jTxtAutor.setText("");
            jTxtEditoriol.setText("");
            jTxtAnioPublicanion.setText("");
            jTxtEdicion.setText("");
        }
        
    }//GEN-LAST:event_jLbGuardarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTitulo;
    public javax.swing.JComboBox<String> jCBGenero;
    private javax.swing.JLabel jLbAnioPublicacion;
    private javax.swing.JLabel jLbAutor;
    private javax.swing.JLabel jLbEdicion;
    private javax.swing.JLabel jLbEditorial;
    private javax.swing.JLabel jLbGenero;
    private javax.swing.JLabel jLbGuardar;
    private javax.swing.JLabel jLbID;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPGuardar;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTxtAnioPublicanion;
    public javax.swing.JTextField jTxtAutor;
    public javax.swing.JTextField jTxtEdicion;
    public javax.swing.JTextField jTxtEditoriol;
    private javax.swing.JTextField jTxtID;
    public javax.swing.JTextField jTxtTitulo;
    // End of variables declaration//GEN-END:variables
}