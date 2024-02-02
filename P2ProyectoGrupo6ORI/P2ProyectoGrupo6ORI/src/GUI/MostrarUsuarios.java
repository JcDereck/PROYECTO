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

public class MostrarUsuarios extends javax.swing.JPanel {

    public MostrarUsuarios() {
        initComponents();
        mostrarUsuarios();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jTbUsuarios = new javax.swing.JTable();
        jLbCedulaBuscar = new javax.swing.JLabel();
        jTxtCedulaBuscar = new javax.swing.JTextField();
        jTxtNombreBuscar = new javax.swing.JTextField();
        jLbNombreBuscar = new javax.swing.JLabel();

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTitulo.setBackground(new java.awt.Color(0, 0, 204));

        LbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbTitulo.setText("USUARIOS REGISTRADOS");

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
            .addComponent(jLbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        jPBuscarLayout.setVerticalGroup(
            jPBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPOpciones.add(jPBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 0, 290, 60));

        jPFondo.add(jPOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 490, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTbUsuarios);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 480, 138));

        jPFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 490, 150));

        jLbCedulaBuscar.setText("CEDULA:");
        jPFondo.add(jLbCedulaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 20));
        jPFondo.add(jTxtCedulaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 140, -1));
        jPFondo.add(jTxtNombreBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 140, -1));

        jLbNombreBuscar.setText("NOMBRE:");
        jPFondo.add(jLbNombreBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, 20));

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

    private void jLbActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActualizarMouseClicked
        ActualizarUsuario obUsuario = new ActualizarUsuario();
        obUsuario.setVisible(true);
        obUsuario.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLbActualizarMouseClicked

    private void jLbActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActualizarMouseEntered
        jPActualizar.setBackground(new Color(255, 255, 204));
        // jPActualizar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLbActualizarMouseEntered

    private void jLbActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActualizarMouseExited
        jPActualizar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbActualizarMouseExited

    private void jLbEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbEliminarMouseEntered
        jPEliminar.setBackground(new Color(255, 204, 204));
    }//GEN-LAST:event_jLbEliminarMouseEntered

    private void jLbEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbEliminarMouseExited
        jPEliminar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbEliminarMouseExited

    private void jLbBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBuscarMouseClicked
        try {
            MongoClient mongo=new MongoClient("localhost",27017);
            MongoDatabase database= mongo.getDatabase("BIBLIOTECA_VIRTUAL");
            MongoCollection<Document> collect=database.getCollection("USUARIOS_REGISTRADOS");
            buscarUsuario(collect);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
        }
    }//GEN-LAST:event_jLbBuscarMouseClicked

    private void jLbBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBuscarMouseEntered
        jPBuscar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLbBuscarMouseEntered

    private void jLbBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbBuscarMouseExited
        jPBuscar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbBuscarMouseExited

    private void jLbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbEliminarMouseClicked
        try {
            MongoClient mongo=new MongoClient("localhost",27017);
            MongoDatabase database= mongo.getDatabase("BIBLIOTECA_VIRTUAL");
            MongoCollection<Document> collect=database.getCollection("USUARIOS_REGISTRADOS");
            eliminarLibro(collect);
        } catch (MongoException e) {
            JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
        }
    }//GEN-LAST:event_jLbEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbTitulo;
    private javax.swing.JLabel jLbActualizar;
    private javax.swing.JLabel jLbBuscar;
    private javax.swing.JLabel jLbCedulaBuscar;
    private javax.swing.JLabel jLbEliminar;
    private javax.swing.JLabel jLbNombreBuscar;
    private javax.swing.JPanel jPActualizar;
    private javax.swing.JPanel jPBuscar;
    private javax.swing.JPanel jPEliminar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTbUsuarios;
    public javax.swing.JTextField jTxtCedulaBuscar;
    public javax.swing.JTextField jTxtNombreBuscar;
    // End of variables declaration//GEN-END:variables
    private void mostrarUsuarios(){
        DefaultTableModel tbUsuarios=new  DefaultTableModel();
        tbUsuarios.addColumn("ID");
        tbUsuarios.addColumn("NOMBRE");
        tbUsuarios.addColumn("APELLIDO");
        tbUsuarios.addColumn("CEDULA");
        tbUsuarios.addColumn("CORREO");
        tbUsuarios.addColumn("DIRECION");
        tbUsuarios.addColumn("PERFIL");
        jTbUsuarios.setModel(tbUsuarios);
        try {
                MongoClient mongo=new MongoClient("localhost",27017);
                MongoDatabase database= mongo.getDatabase("BIBLIOTECA_VIRTUAL");
                MongoCollection<Document> collect=database.getCollection("USUARIOS_REGISTRADOS");
                MongoCursor<Document> cursor= collect.find().iterator();
                while (cursor.hasNext()) {
                // Obtener valores del documento
                Document documento = cursor.next();
                String id = documento.getString("ID");
                String nombre = documento.getString("NOMBRE");
                String apellido = documento.getString("APELLIDO");
                String cedula = documento.getString("CEDULA");
                String correo = documento.getString("CORREO");
                String direcion = documento.getString("DIRECION");
                String perfli = documento.getString("PERFIL");

                // Crear un arreglo de Strings para la fila
                String[] datos = {id, nombre,apellido, cedula, correo,direcion,perfli};
                tbUsuarios.addRow(datos);
            }
            jTbUsuarios.setModel(tbUsuarios);
            } catch (MongoException e) {
                JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
            }
    }
    private void buscarUsuario(MongoCollection<Document> collect){
        int opcion=0,cedula1=1,nombre1=2,ambos=3;
        String cedula=jTxtCedulaBuscar.getText();
        String nombre=jTxtNombreBuscar.getText();
        if (cedula.equals("") && nombre.equals("")) {
            opcion = 0; // Ambos campos están vacíos
        } else if (cedula.equals("") && !nombre.equals("")) {
            opcion = nombre1; // Buscar por nombre
        } else if (!cedula.equals("") && nombre.equals("")) {
            opcion = cedula1; // Buscar por cedula
        } else if (!cedula.equals("") && !nombre.equals("")) {
            opcion = ambos; // Buscar por ambos
        }
        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null, "[ ERROR AL BUSCAR ]\n Debe rellenar al menos uno de los campos");
                break;
            case 1:
                try {
                    Document filtro=new Document("CEDULA",jTxtCedulaBuscar.getText());
                    Document encontrar = collect.find(filtro).first();
                    if(encontrar != null){
                        String id1 = encontrar.getString("ID");
                        String nombre2 = encontrar.getString("NOMBRE");
                        String apellido = encontrar.getString("APELLIDO");
                        String cedula2 = encontrar.getString("CEDULA");
                        String correo = encontrar.getString("CORREO");
                        String direcion = encontrar.getString("DIRECION");
                        String perfil = encontrar.getString("PERFIL");
                        JOptionPane.showMessageDialog(null, "   ====================\n"
                                + "     Usuario encontrado:\n" +
                                "   ===================="+ "\n" +
                                "ID: " + id1 + "\n" +
                                "NOMBRE: " + nombre2 + "\n" +
                                "APELLIDO: " + apellido + "\n" +
                                "CEDULA: " + cedula2+ "\n" +
                                "CORREO: " + correo + "\n" +
                                "DIRECION: " + direcion+ "\n" +
                                "PERFIL: " + perfil);
                    }else{
                        JOptionPane.showMessageDialog(null, "[ El USUARIO NO SE ENCONTRO EN LA BASE DE DATOS ]");
                    }
                } catch (MongoException e) {
                    JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
                }
                break;
            case 2:
                try {
                    Document filtro=new Document("NOMBRE",jTxtNombreBuscar.getText());
                    Document encontrar = collect.find(filtro).first();
                    if(encontrar != null){
                        String id1 = encontrar.getString("ID");
                        String nombre2 = encontrar.getString("NOMBRE");
                        String apellido = encontrar.getString("APELLIDO");
                        String cedula2 = encontrar.getString("CEDULA");
                        String correo = encontrar.getString("CORREO");
                        String direcion = encontrar.getString("DIRECION");
                        String perfil = encontrar.getString("PERFIL");
                        JOptionPane.showMessageDialog(null, "   ====================\n"
                                + "     Usuario encontrado:\n" +
                                "   ===================="+ "\n" +
                                "ID: " + id1 + "\n" +
                                "NOMBRE: " + nombre2 + "\n" +
                                "APELLIDO: " + apellido + "\n" +
                                "CEDULA: " + cedula2+ "\n" +
                                "CORREO: " + correo + "\n" +
                                "DIRECION: " + direcion+ "\n" +
                                "PERFIL: " + perfil);
                    }else{
                        JOptionPane.showMessageDialog(null, "[ El USUARIO NO SE ENCONTRO EN LA BASE DE DATOS ]");
                    }
                } catch (MongoException e) {
                    JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
                }
                break;
            case 3:
                try {
                    Document filtro=new Document("NOMBRE",jTxtNombreBuscar.getText()).append("CEDULA", jTxtCedulaBuscar.getText());
                    Document encontrar = collect.find(filtro).first();
                    if(encontrar != null){
                        String id1 = encontrar.getString("ID");
                        String nombre2 = encontrar.getString("NOMBRE");
                        String apellido = encontrar.getString("APELLIDO");
                        String cedula2 = encontrar.getString("CEDULA");
                        String correo = encontrar.getString("CORREO");
                        String direcion = encontrar.getString("DIRECION");
                        String perfil = encontrar.getString("PERFIL");
                        JOptionPane.showMessageDialog(null, "   ====================\n"
                                + "     Usuario encontrado:\n" +
                                "   ===================="+ "\n" +
                                "ID: " + id1 + "\n" +
                                "NOMBRE: " + nombre2 + "\n" +
                                "APELLIDO: " + apellido + "\n" +
                                "CEDULA: " + cedula2+ "\n" +
                                "CORREO: " + correo + "\n" +
                                "DIRECION: " + direcion+ "\n" +
                                "PERFIL: " + perfil);
                    }else{
                        JOptionPane.showMessageDialog(null, "[ El USUARIO NO SE ENCONTRO EN LA BASE DE DATOS ]");
                    }
                } catch (MongoException e) {
                    JOptionPane.showMessageDialog(null, "ERROR A LA CONECTION A MONGODB");
                }
                break;
        }
    }
    private void eliminarLibro(MongoCollection<Document> collect) {
        int opcion=0,cedula1=1,nombre1=2,ambos=3;
        String cedula=jTxtCedulaBuscar.getText();
        String nombre=jTxtNombreBuscar.getText();
        if (cedula.equals("") && nombre.equals("")) {
            opcion = 0; // Ambos campos están vacíos
        } else if (cedula.equals("") && !nombre.equals("")) {
            opcion = nombre1; // Buscar por nombre
        } else if (!cedula.equals("") && nombre.equals("")) {
            opcion = cedula1; // Buscar por cedula
        } else if (!cedula.equals("") && !nombre.equals("")) {
            opcion = ambos; // Buscar por ambos
        }
        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null, "[ ERROR PARA ELIMINAR ]\n Debe rellenar al menos uno de los campos");
                break;
            case 1:
                Document filtro=new Document("CEDULA",jTxtCedulaBuscar.getText());
                collect.deleteOne(filtro);
                JOptionPane.showMessageDialog(null, "[ EL USUARIO FUE ELIMINADO DE LA BASE DE DATOS ]");
                break;
            case 2:
                Document filtro1=new Document("NOMBRE",jTxtNombreBuscar.getText());
                collect.deleteOne(filtro1);
                JOptionPane.showMessageDialog(null, "[ EL USUARIO FUE ELIMINADO DE LA BASE DE DATOS ]");
                break;
            case 3:
                Document filtro2=new Document("NOMBRE",jTxtNombreBuscar.getText()).append("CEDULA", jTxtCedulaBuscar.getText());
                collect.deleteOne(filtro2);
                JOptionPane.showMessageDialog(null, "[ EL USUARIO FUE ELIMINADO DE LA BASE DE DATOS ]");
                break;
        }
        
    }
}