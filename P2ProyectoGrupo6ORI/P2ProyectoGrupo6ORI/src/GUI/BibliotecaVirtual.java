package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import p2proyectoGrupo6.ArchivoCSV;

public class BibliotecaVirtual extends javax.swing.JFrame {
    
    public BibliotecaVirtual() {
        initComponents();
        setTitle("BIBLIOTECA VIRTUAL");
        icon();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPFondo = new javax.swing.JPanel();
        jPOpciones = new javax.swing.JPanel();
        jLbMenu = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPSalir = new javax.swing.JPanel();
        jLbSalir = new javax.swing.JLabel();
        jPPrincipal = new javax.swing.JPanel();
        jLbPrincipal = new javax.swing.JLabel();
        jPRegistroLibros = new javax.swing.JPanel();
        jLbRegistroLibros = new javax.swing.JLabel();
        jPInventarioLibros = new javax.swing.JPanel();
        jLbInventarioLibros = new javax.swing.JLabel();
        jPPrestamo = new javax.swing.JPanel();
        jLbPrestamos = new javax.swing.JLabel();
        jPRegistroUsuario = new javax.swing.JPanel();
        jLbRegistroUsuario = new javax.swing.JLabel();
        jPMostrarUsuario = new javax.swing.JPanel();
        jLbMostrarUsuario = new javax.swing.JLabel();
        jPTitulo = new javax.swing.JPanel();
        jLbTitulo = new javax.swing.JLabel();
        jPMostar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPOpciones.setBackground(new java.awt.Color(0, 102, 204));
        jPOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbMenu.setBackground(new java.awt.Color(255, 255, 255));
        jLbMenu.setForeground(new java.awt.Color(255, 255, 255));
        jLbMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbMenu.setText("MENÚ");
        jPOpciones.add(jLbMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 90));
        jPOpciones.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 210, 10));

        jPSalir.setBackground(new java.awt.Color(0, 102, 204));

        jLbSalir.setForeground(new java.awt.Color(255, 255, 255));
        jLbSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbSalir.setText("SALIR");
        jLbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPSalirLayout = new javax.swing.GroupLayout(jPSalir);
        jPSalir.setLayout(jPSalirLayout);
        jPSalirLayout.setHorizontalGroup(
            jPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPSalirLayout.setVerticalGroup(
            jPSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPOpciones.add(jPSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 230, 60));

        jPPrincipal.setBackground(new java.awt.Color(0, 102, 204));

        jLbPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jLbPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbPrincipal.setText("PRINCIPAL");
        jLbPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbPrincipalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPOpciones.add(jPPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, 40));

        jPRegistroLibros.setBackground(new java.awt.Color(0, 102, 204));

        jLbRegistroLibros.setForeground(new java.awt.Color(255, 255, 255));
        jLbRegistroLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbRegistroLibros.setText("REGISTRO DE LIBROS");
        jLbRegistroLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbRegistroLibrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbRegistroLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbRegistroLibrosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPRegistroLibrosLayout = new javax.swing.GroupLayout(jPRegistroLibros);
        jPRegistroLibros.setLayout(jPRegistroLibrosLayout);
        jPRegistroLibrosLayout.setHorizontalGroup(
            jPRegistroLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbRegistroLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPRegistroLibrosLayout.setVerticalGroup(
            jPRegistroLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbRegistroLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPOpciones.add(jPRegistroLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, 40));

        jPInventarioLibros.setBackground(new java.awt.Color(0, 102, 204));

        jLbInventarioLibros.setForeground(new java.awt.Color(255, 255, 255));
        jLbInventarioLibros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbInventarioLibros.setText("INVENTARIO DE LIBROS");
        jLbInventarioLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbInventarioLibrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbInventarioLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbInventarioLibrosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPInventarioLibrosLayout = new javax.swing.GroupLayout(jPInventarioLibros);
        jPInventarioLibros.setLayout(jPInventarioLibrosLayout);
        jPInventarioLibrosLayout.setHorizontalGroup(
            jPInventarioLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbInventarioLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPInventarioLibrosLayout.setVerticalGroup(
            jPInventarioLibrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbInventarioLibros, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPOpciones.add(jPInventarioLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 230, 40));

        jPPrestamo.setBackground(new java.awt.Color(0, 102, 204));

        jLbPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        jLbPrestamos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbPrestamos.setText("PRESTAMOS");
        jLbPrestamos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbPrestamosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbPrestamosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbPrestamosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPPrestamoLayout = new javax.swing.GroupLayout(jPPrestamo);
        jPPrestamo.setLayout(jPPrestamoLayout);
        jPPrestamoLayout.setHorizontalGroup(
            jPPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPPrestamoLayout.setVerticalGroup(
            jPPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPOpciones.add(jPPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 230, 40));

        jPRegistroUsuario.setBackground(new java.awt.Color(0, 102, 204));
        jPRegistroUsuario.setDoubleBuffered(false);

        jLbRegistroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLbRegistroUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbRegistroUsuario.setText("REGISTRO DE USUARIO");
        jLbRegistroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbRegistroUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbRegistroUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbRegistroUsuarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPRegistroUsuarioLayout = new javax.swing.GroupLayout(jPRegistroUsuario);
        jPRegistroUsuario.setLayout(jPRegistroUsuarioLayout);
        jPRegistroUsuarioLayout.setHorizontalGroup(
            jPRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbRegistroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPRegistroUsuarioLayout.setVerticalGroup(
            jPRegistroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbRegistroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPOpciones.add(jPRegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 230, 40));

        jPMostrarUsuario.setBackground(new java.awt.Color(0, 102, 204));

        jLbMostrarUsuario.setBackground(new java.awt.Color(0, 102, 204));
        jLbMostrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLbMostrarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbMostrarUsuario.setText("MOSTRAR USUARIOS");
        jLbMostrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbMostrarUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLbMostrarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbMostrarUsuarioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPMostrarUsuarioLayout = new javax.swing.GroupLayout(jPMostrarUsuario);
        jPMostrarUsuario.setLayout(jPMostrarUsuarioLayout);
        jPMostrarUsuarioLayout.setHorizontalGroup(
            jPMostrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbMostrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPMostrarUsuarioLayout.setVerticalGroup(
            jPMostrarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbMostrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPOpciones.add(jPMostrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 230, 40));

        jPFondo.add(jPOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 450));

        jPTitulo.setBackground(new java.awt.Color(0, 102, 255));

        jLbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbTitulo.setText("BIBLIOTECA VIRTUAL");

        javax.swing.GroupLayout jPTituloLayout = new javax.swing.GroupLayout(jPTitulo);
        jPTitulo.setLayout(jPTituloLayout);
        jPTituloLayout.setHorizontalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        jPTituloLayout.setVerticalGroup(
            jPTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        jPFondo.add(jPTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 490, 70));

        jPMostar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPMostarLayout = new javax.swing.GroupLayout(jPMostar);
        jPMostar.setLayout(jPMostarLayout);
        jPMostarLayout.setHorizontalGroup(
            jPMostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        jPMostarLayout.setVerticalGroup(
            jPMostarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jPFondo.add(jPMostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 490, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLbRegistroLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbRegistroLibrosMouseClicked
       RegistroLibros obLibros=new RegistroLibros();
       obLibros.setSize(490, 340);
       obLibros.setLocation(0, 0);
       
       jPMostar.removeAll();
       jPMostar.add(obLibros, BorderLayout.CENTER);
       jPMostar.revalidate();
       jPMostar.repaint();
    }//GEN-LAST:event_jLbRegistroLibrosMouseClicked

    private void jLbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLbSalirMouseClicked

    private void jLbSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbSalirMouseEntered
       jPSalir.setBackground(new Color(0, 102, 255));
       jLbSalir.setForeground(Color.red);
    }//GEN-LAST:event_jLbSalirMouseEntered

    private void jLbSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbSalirMouseExited
        jPSalir.setBackground(new Color(0, 102, 204));
        jLbSalir.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLbSalirMouseExited

    private void jLbInventarioLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbInventarioLibrosMouseClicked
        InventarioLibros obInventarioLibros=new InventarioLibros();
            ArchivoCSV obArchivoCSV=new ArchivoCSV();
            obArchivoCSV.readerFile();
            obInventarioLibros.setSize(490, 340);
            obInventarioLibros.setLocation(0, 0);

            jPMostar.removeAll();
            jPMostar.add(obInventarioLibros, BorderLayout.CENTER);
            jPMostar.revalidate();
            jPMostar.repaint();
    }//GEN-LAST:event_jLbInventarioLibrosMouseClicked

    private void jLbPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbPrincipalMouseEntered
        jPPrincipal.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jLbPrincipalMouseEntered

    private void jLbRegistroLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbRegistroLibrosMouseEntered
        jPRegistroLibros.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jLbRegistroLibrosMouseEntered

    private void jLbInventarioLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbInventarioLibrosMouseEntered
        jPInventarioLibros.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jLbInventarioLibrosMouseEntered

    private void jLbPrestamosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbPrestamosMouseEntered
        jPPrestamo.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jLbPrestamosMouseEntered

    private void jLbPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbPrincipalMouseExited
        jPPrincipal.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_jLbPrincipalMouseExited

    private void jLbRegistroLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbRegistroLibrosMouseExited
        jPRegistroLibros.setBackground(new Color(0, 102, 204));
        jLbRegistroLibros.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLbRegistroLibrosMouseExited

    private void jLbInventarioLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbInventarioLibrosMouseExited
        jPInventarioLibros.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_jLbInventarioLibrosMouseExited

    private void jLbPrestamosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbPrestamosMouseExited
        jPPrestamo.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_jLbPrestamosMouseExited

    private void jLbPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbPrincipalMouseClicked
       Principal obPrincipal =new Principal();
       obPrincipal.setSize(490, 340);
       obPrincipal.setLocation(0, 0);
       
       jPMostar.removeAll();
       jPMostar.add(obPrincipal, BorderLayout.CENTER);
       jPMostar.revalidate();
       jPMostar.repaint();
    }//GEN-LAST:event_jLbPrincipalMouseClicked

    private void jLbPrestamosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbPrestamosMouseClicked
       Prestamo obEstadisticaBiblioteca=new Prestamo();
       obEstadisticaBiblioteca.setSize(490,340);
       obEstadisticaBiblioteca.setLocation(0 , 0);
       
       jPMostar.removeAll();
       jPMostar.add(obEstadisticaBiblioteca, BorderLayout.CENTER);
       jPMostar.revalidate();
       jPMostar.repaint();
    }//GEN-LAST:event_jLbPrestamosMouseClicked

    private void jLbRegistroUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbRegistroUsuarioMouseEntered
        jPRegistroUsuario.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jLbRegistroUsuarioMouseEntered

    private void jLbMostrarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMostrarUsuarioMouseEntered
        jPMostrarUsuario.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_jLbMostrarUsuarioMouseEntered

    private void jLbRegistroUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbRegistroUsuarioMouseExited
        jPRegistroUsuario.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_jLbRegistroUsuarioMouseExited

    private void jLbMostrarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMostrarUsuarioMouseExited
        jPMostrarUsuario.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_jLbMostrarUsuarioMouseExited

    private void jLbRegistroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbRegistroUsuarioMouseClicked
        RegistroUsuario obRegistroUsuario=new RegistroUsuario();
        obRegistroUsuario.setSize(490, 340);
        obRegistroUsuario.setLocation(0, 0);
        jPMostar.removeAll();
        jPMostar.add(obRegistroUsuario, BorderLayout.CENTER);
        jPMostar.revalidate();
        jPMostar.repaint();
    }//GEN-LAST:event_jLbRegistroUsuarioMouseClicked

    private void jLbMostrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMostrarUsuarioMouseClicked
        MostrarUsuarios obMostrarUsuarios=new MostrarUsuarios();
        obMostrarUsuarios.setSize(490, 340);
        obMostrarUsuarios.setLocation(0, 0);
        
        jPMostar.removeAll();
        jPMostar.add(obMostrarUsuarios, BorderLayout.CENTER);
        jPMostar.revalidate();
        jPMostar.repaint();
    }//GEN-LAST:event_jLbMostrarUsuarioMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLbInventarioLibros;
    private javax.swing.JLabel jLbMenu;
    private javax.swing.JLabel jLbMostrarUsuario;
    private javax.swing.JLabel jLbPrestamos;
    private javax.swing.JLabel jLbPrincipal;
    private javax.swing.JLabel jLbRegistroLibros;
    private javax.swing.JLabel jLbRegistroUsuario;
    private javax.swing.JLabel jLbSalir;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JPanel jPFondo;
    private javax.swing.JPanel jPInventarioLibros;
    private javax.swing.JPanel jPMostar;
    private javax.swing.JPanel jPMostrarUsuario;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JPanel jPPrestamo;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPRegistroLibros;
    private javax.swing.JPanel jPRegistroUsuario;
    private javax.swing.JPanel jPSalir;
    private javax.swing.JPanel jPTitulo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    public void icon(){
        Principal principal=new Principal();
        principal.setSize(490, 340);
        principal.setLocation(0, 0);
        
        jPMostar.removeAll();
        jPMostar.add(principal, BorderLayout.CENTER);
        jPMostar.revalidate();
        jPMostar.repaint();
    }
}