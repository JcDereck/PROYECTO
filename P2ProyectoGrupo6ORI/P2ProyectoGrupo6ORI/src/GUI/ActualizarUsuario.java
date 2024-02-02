package GUI;

import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.bson.Document;

public class ActualizarUsuario extends javax.swing.JFrame {

    public ActualizarUsuario() {
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
        jLbCedula = new javax.swing.JLabel();
        jTxtCedula = new javax.swing.JTextField();
        jTxtApellido = new javax.swing.JTextField();
        jLbApellido = new javax.swing.JLabel();
        jTxtNombre = new javax.swing.JTextField();
        jLbNombre = new javax.swing.JLabel();
        jTxtCorreo = new javax.swing.JTextField();
        jLbCorreo = new javax.swing.JLabel();
        jLbDireccion = new javax.swing.JLabel();
        jTxtDireccion = new javax.swing.JTextField();
        jLbPerfil = new javax.swing.JLabel();
        jCBPerfil = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTitulo.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR USUARIO");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        jLbCedula.setText("CEDULA:");
        jPFondo.add(jLbCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));
        jPFondo.add(jTxtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, -1));
        jPFondo.add(jTxtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, -1));

        jLbApellido.setText("APELLIDO:");
        jPFondo.add(jLbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        jPFondo.add(jTxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, -1));

        jLbNombre.setText("NOMBRE:");
        jPFondo.add(jLbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));
        jPFondo.add(jTxtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 110, -1));

        jLbCorreo.setText("CORREO:");
        jPFondo.add(jLbCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, -1));

        jLbDireccion.setText("DIRECCION:");
        jPFondo.add(jLbDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        jPFondo.add(jTxtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 110, -1));

        jLbPerfil.setText("PERFIL:");
        jPFondo.add(jLbPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jCBPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTUDIANTE", "PROFESOR" }));
        jCBPerfil.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPFondo.add(jCBPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 110, -1));

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

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jPVolver.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jPVolver.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLbActulaizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActulaizarMouseClicked
        try {
            MongoClient mongo=new MongoClient("localhost",27017);
            MongoDatabase databasa=mongo.getDatabase("BIBLIOTECA_VIRTUAL");
            MongoCollection<Document> collection=databasa.getCollection("Registro de Libros");
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
        }
    }//GEN-LAST:event_jLbActulaizarMouseClicked

    private void jLbActulaizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActulaizarMouseEntered
        jPActualizar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLbActulaizarMouseEntered

    private void jLbActulaizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActulaizarMouseExited
        jPActualizar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbActulaizarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCBPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbActulaizar;
    private javax.swing.JLabel jLbApellido;
    private javax.swing.JLabel jLbCedula;
    private javax.swing.JLabel jLbCorreo;
    private javax.swing.JLabel jLbDireccion;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JLabel jLbPerfil;
    private javax.swing.JPanel jPActualizar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPVolver;
    private javax.swing.JTextField jTxtApellido;
    private javax.swing.JTextField jTxtCedula;
    private javax.swing.JTextField jTxtCorreo;
    private javax.swing.JTextField jTxtDireccion;
    private javax.swing.JTextField jTxtNombre;
    // End of variables declaration//GEN-END:variables
}
