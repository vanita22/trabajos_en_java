package proyecto;

public class menuprincipal extends javax.swing.JFrame {

    public menuprincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        ingreso = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        proceso = new javax.swing.JMenu();
        actualizacion = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        consulta = new javax.swing.JMenu();
        fichaempleados = new javax.swing.JMenuItem();
        mes = new javax.swing.JMenuItem();
        ficha = new javax.swing.JMenuItem();
        bonos = new javax.swing.JMenuItem();
        renta = new javax.swing.JMenu();
        productos = new javax.swing.JMenuItem();
        ventas = new javax.swing.JMenuItem();
        contab = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SISTEMA DE CÁLCULO DE REMUNERACIONES HECHA POR:");

        jLabel2.setText("INÉS VANESSA PÉREZ CHÁVEZ");

        ingreso.setText("Ingresos");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Empleados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        ingreso.add(jMenuItem1);

        jMenuBar1.add(ingreso);

        proceso.setText("Procesos");

        actualizacion.setText("Cálculo de renta mensual");
        actualizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizacionActionPerformed(evt);
            }
        });
        proceso.add(actualizacion);

        jMenuItem8.setText("Actualización de sueldo base");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        proceso.add(jMenuItem8);

        jMenuBar1.add(proceso);

        consulta.setText("Consultas");

        fichaempleados.setText("Tabla de sueldos");
        fichaempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichaempleadosActionPerformed(evt);
            }
        });
        consulta.add(fichaempleados);

        mes.setText("Tabla por mes");
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        consulta.add(mes);

        ficha.setText("Por Ficha ");
        ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichaActionPerformed(evt);
            }
        });
        consulta.add(ficha);

        bonos.setText("Tabla de Bonos");
        bonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bonosActionPerformed(evt);
            }
        });
        consulta.add(bonos);

        renta.setText("Por Departamento");

        productos.setText("Producción");
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        renta.add(productos);

        ventas.setText("ventas");
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });
        renta.add(ventas);

        contab.setText("contabilidad");
        contab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contabActionPerformed(evt);
            }
        });
        renta.add(contab);

        consulta.add(renta);

        jMenuBar1.add(consulta);

        jMenu1.setText("Modificar");

        jMenuItem2.setText("Por RUT");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Eliminar");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Por RUT");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        jMenuItem6.setText("Por Nombre");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Gráfico");

        jMenuItem5.setText("Gráfico por departamento y salud");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Reporte");

        jMenuItem4.setText("Reporte Sueldos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuBar1.add(jMenu6);

        salir.setText("Salir");

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText("Salir del sistema");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        salir.add(exit);

        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ingreso TR=new ingreso();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void actualizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizacionActionPerformed
        fecha TR=new fecha();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_actualizacionActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        actualizacionsueldobase TR=new actualizacionsueldobase();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void fichaempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichaempleadosActionPerformed
        consultasueldos TR=new consultasueldos();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_fichaempleadosActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        consultaproduccion TR=new consultaproduccion();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_productosActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        consultaventas TR=new consultaventas();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_ventasActionPerformed

    private void contabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contabActionPerformed
        consultascontabilidad TR=new consultascontabilidad();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_contabActionPerformed

    private void bonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bonosActionPerformed
        consultabonos TR=new consultabonos();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_bonosActionPerformed

    private void fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichaActionPerformed
        consultaficha TR=new consultaficha();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_fichaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        modificar TR=new modificar();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        eliminarnombre TR=new eliminarnombre();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        grafico TR=new grafico();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        eliminarrut TR=new eliminarrut();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        reporte TR=new reporte();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        consultames TR=new consultames();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_mesActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizacion;
    private javax.swing.JMenuItem bonos;
    private javax.swing.JMenu consulta;
    private javax.swing.JMenuItem contab;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem ficha;
    private javax.swing.JMenuItem fichaempleados;
    private javax.swing.JMenu ingreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JMenuItem mes;
    private javax.swing.JMenu proceso;
    private javax.swing.JMenuItem productos;
    private javax.swing.JMenu renta;
    private javax.swing.JMenu salir;
    private javax.swing.JMenuItem ventas;
    // End of variables declaration//GEN-END:variables
}
