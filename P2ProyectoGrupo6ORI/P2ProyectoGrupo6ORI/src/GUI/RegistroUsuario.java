package GUI;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.bson.Document;

public class RegistroUsuario extends javax.swing.JPanel {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jPTitulo = new javax.swing.JPanel();
        LbTitulo1 = new javax.swing.JLabel();
        jPGuardar = new javax.swing.JPanel();
        jLbGuardar = new javax.swing.JLabel();
        jPDatoUsuario = new javax.swing.JPanel();
        jLbPerfil = new javax.swing.JLabel();
        jLbApellido = new javax.swing.JLabel();
        jTxtApellido = new javax.swing.JTextField();
        jLbCedula = new javax.swing.JLabel();
        jTxtCedula = new javax.swing.JTextField();
        jTxtCorreo = new javax.swing.JTextField();
        jLbCorreo = new javax.swing.JLabel();
        jTxtDireccion = new javax.swing.JTextField();
        jLbDireccion = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLbNombre = new javax.swing.JLabel();
        jCBPerfil = new javax.swing.JComboBox<>();
        jLbID = new javax.swing.JLabel();
        jTxtID = new javax.swing.JTextField();

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTitulo.setBackground(new java.awt.Color(0, 0, 204));

        LbTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        LbTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTitulo1.setText("REGISTRO DE USUARIO");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jPFondo.add(jPTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, -1));

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

        jPFondo.add(jPGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 490, -1));

        jPDatoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPDatoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Usuario"));
        jPDatoUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbPerfil.setText("PERFIL:");
        jPDatoUsuario.add(jLbPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLbApellido.setText("APELLIDO:");
        jPDatoUsuario.add(jLbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        jPDatoUsuario.add(jTxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, -1));

        jLbCedula.setText("CEDULA:");
        jPDatoUsuario.add(jLbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        jPDatoUsuario.add(jTxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, -1));
        jPDatoUsuario.add(jTxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 110, -1));

        jLbCorreo.setText("CORREO:");
        jPDatoUsuario.add(jLbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));
        jPDatoUsuario.add(jTxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 110, -1));

        jLbDireccion.setText("DIRECCION:");
        jPDatoUsuario.add(jLbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));
        jPDatoUsuario.add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 110, -1));

        jLbNombre.setText("NOMBRE:");
        jPDatoUsuario.add(jLbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jCBPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTUDIANTE", "PROFESOR" }));
        jCBPerfil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPDatoUsuario.add(jCBPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 110, -1));

        jPFondo.add(jPDatoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 390, 180));

        jLbID.setText("ID:");
        jPFondo.add(jLbID, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
        jPFondo.add(jTxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 110, -1));

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

    private void jLbGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbGuardarMouseClicked
        String id=jTxtID.getText();
        String nombre=jTxtNombre.getText();
        String apelldios=jTxtApellido.getText();
        String cedula=jTxtCedula.getText();
        String correo=jTxtCorreo.getText();
        String direcion=jTxtDireccion.getText();
        if(id.equals("")||nombre.equals("")||apelldios.equals("")||cedula.equals("")||correo.equals("")||direcion.equals("")){
           JOptionPane.showMessageDialog(null, "[ ERROR AL GUARDAR ]"
                    + "\n Debe rellenar todos los campas");
        }else{
            try {
                MongoClient mongo=new MongoClient("localhost",27017);
                MongoDatabase database= mongo.getDatabase("BIBLIOTECA_VIRTUAL");
                MongoCollection<Document> collect=database.getCollection("USUARIOS_REGISTRADOS");
                guardarUsuario(collect);
            } catch (MongoException e) {
                JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
            }
            jTxtID.setText("");
            jTxtNombre.setText("");
            jTxtApellido.setText("");
            jTxtCedula.setText("");
            jTxtCorreo.setText("");
            jTxtDireccion.setText("");
        }    
    }//GEN-LAST:event_jLbGuardarMouseClicked

    private void jLbGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbGuardarMouseEntered
        jPGuardar.setBackground(new Color(204, 255, 204));
    }//GEN-LAST:event_jLbGuardarMouseEntered

    private void jLbGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbGuardarMouseExited
        jPGuardar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbGuardarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTitulo1;
    private javax.swing.JComboBox<String> jCBPerfil;
    private javax.swing.JLabel jLbApellido;
    private javax.swing.JLabel jLbCedula;
    private javax.swing.JLabel jLbCorreo;
    private javax.swing.JLabel jLbDireccion;
    private javax.swing.JLabel jLbGuardar;
    private javax.swing.JLabel jLbID;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JLabel jLbPerfil;
    private javax.swing.JPanel jPDatoUsuario;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPGuardar;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JTextField jTxtApellido;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtCorreo;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtID;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
    public void guardarUsuario(MongoCollection<Document> collect){
        String id=jTxtID.getText();
        String nombre=jTxtNombre.getText();
        String apelldios=jTxtApellido.getText();
        String cedula=jTxtCedula.getText();
        String correo=jTxtCorreo.getText();
        String direcion=jTxtDireccion.getText();
        String perfil=(String) jCBPerfil.getSelectedItem();
        Document document=new Document("ID",id).append("NOMBRE", nombre).append("APELLIDO", apelldios)
                .append("CEDULA", cedula).append("CORREO", correo).append("DIRECION", direcion)
                .append("PERFIL", perfil);
        collect.insertOne(document);
        JOptionPane.showMessageDialog(null, "[ EL USUARIO SE GUARDO EN LA BASE DE DATOS ]");
    }
}