package GUI;

import java.awt.Color;

public class RealizarPrestamo extends javax.swing.JFrame {

    public RealizarPrestamo() {
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
        jTxtEditorial = new javax.swing.JTextField();
        jLbEditorial = new javax.swing.JLabel();
        jTxtEditorial1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPTitulo.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REALIZAR EL PRESTAMO");

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

        jLbGenero.setText("FECHA DEL PRESTAMO:");
        jPFondo.add(jLbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));
        jPFondo.add(jTxtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, -1));

        jLbEditorial.setText("FECHA DE ENTREGA:");
        jPFondo.add(jLbEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));
        jPFondo.add(jTxtEditorial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, -1));

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

    }//GEN-LAST:event_jLbActulaizarMouseClicked

    private void jLbActulaizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActulaizarMouseEntered
        jPActualizar.setBackground(new Color(153, 153, 153));
    }//GEN-LAST:event_jLbActulaizarMouseEntered

    private void jLbActulaizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbActulaizarMouseExited
        jPActualizar.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_jLbActulaizarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbActulaizar;
    private javax.swing.JLabel jLbEditorial;
    private javax.swing.JLabel jLbGenero;
    private javax.swing.JPanel jPActualizar;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JPanel jPVolver;
    public javax.swing.JTextField jTxtEditorial;
    public javax.swing.JTextField jTxtEditorial1;
    // End of variables declaration//GEN-END:variables
}
