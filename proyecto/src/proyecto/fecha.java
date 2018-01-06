package proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class fecha extends javax.swing.JFrame {

    public fecha() {
        initComponents();
    }
    
    public static void connect(){
        String url = "jdbc:mysql://localhost:3306/empleados";
        String user = "root";
        String pass = "";
        System.out.println("Conectando...");
        try(
                Connection connection = DriverManager.getConnection(url, user,pass)){
                System.out.println("Conectado!!");

        }catch(SQLException e){
                System.out.println(e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtmes = new javax.swing.JTextField();
        txtaño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmblimpiar = new javax.swing.JButton();
        cmbmenu = new javax.swing.JButton();
        cmbsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtmes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmesKeyTyped(evt);
            }
        });

        txtaño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtañoKeyTyped(evt);
            }
        });

        jLabel1.setText(" INGRESE  MES ACTUAL");

        cmbingresar.setText("INGRESAR");
        cmbingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbingresarActionPerformed(evt);
            }
        });

        jLabel3.setText("  -");

        jLabel5.setText("      MES");

        jLabel6.setText("AÑO");

        cmblimpiar.setText("LIMPIAR");
        cmblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblimpiarActionPerformed(evt);
            }
        });

        cmbmenu.setText("VOLVER AL MENÚ");
        cmbmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmenuActionPerformed(evt);
            }
        });

        cmbsalir.setText("SALIR");
        cmbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cmbingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbmenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbingresar)
                    .addComponent(cmblimpiar)
                    .addComponent(cmbmenu)
                    .addComponent(cmbsalir))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbingresarActionPerformed
        Calendar fecha = Calendar.getInstance();    		
        String fecha2=((fecha.get(Calendar.MONTH) + 1)+ "-"+ fecha.get(Calendar.YEAR));    		
        String fecha3;
        fecha3=txtmes.getText()+ "-"+ txtaño.getText();
 			
        if(fecha2.equals(fecha3)){
            String base="";
            String base2="";
            String base3="";
            String base4="";
            String base5="";
            String base6="";
            String base7="";
            String base8="";   
            String base9="";
            String base10="";
            String base11="";
            String base12="";
            String base13="";
            String base14="";
            String base15="";
            
            int num = 0;
            String vacio = "";
            
            base="UPDATE TabSue Set FECHA='"+vacio+"'";
            base2="UPDATE TabSue Set NUM_HORAS_EXTRAS="+num+"";
            base3="UPDATE TabSue Set MONTO_HORAS_EXTRAS="+num+"";
            base4="UPDATE TabSue Set BONOS="+num+"";
            base5="UPDATE TabSue Set GRATIFICACIÓN="+num+"";
            base6="UPDATE TabSue Set BASE_IMPONIBLE="+num+"";
            base7="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES="+num+"";
            base8="UPDATE TabSue Set MOVILIZACIÓN="+num+"";
            base9="UPDATE TabSue Set COLACIÓN="+num+"";
            base10="UPDATE TabSue Set TOTAL_HABERES="+num+"";
            base11="UPDATE TabSue Set MONTO_AFP="+num+"";
            base12="UPDATE TabSue Set MONTO_SALUD="+num+"";
            base13="UPDATE TabSue Set EXCEDENTE_SALUD="+num+"";
            base14="UPDATE TabSue Set SEGURO_CESANTIA="+num+"";
            base15="UPDATE TabSue Set SUELDO_LIQUIDO="+num+"";            
            
            //SUELDO_LIQUIDO
            System.out.println(base);
            System.out.println(base2);
            System.out.println(base3);
            System.out.println(base4);
            System.out.println(base5);
            System.out.println(base6);
            System.out.println(base7);
            System.out.println(base8);
            System.out.println(base9);
            System.out.println(base10);
            System.out.println(base11);
            System.out.println(base12);
            System.out.println(base13);
            System.out.println(base14);
            System.out.println(base15);
            
            try {
                /*String con=".\\bd\\empleados.accdb";
                Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
                Statement st=db.createStatement();*/
                String url = "jdbc:mysql://localhost:3306/empleados";
                String user = "root";
                String pass = "";
                Connection connection = DriverManager.getConnection(url, user,pass);
                Statement st=connection.createStatement();
                st.execute(base);
                st.execute(base2);
                st.execute(base3);
                st.execute(base4);
                st.execute(base5);
                st.execute(base6);
                st.execute(base7);
                st.execute(base8);
                st.execute(base9);
                st.execute(base10);
                st.execute(base11);
                st.execute(base12);
                st.execute(base13);
                st.execute(base14);
                st.execute(base15);
               
                JOptionPane.showMessageDialog(null,"Ingresando a un nuevo mes de trabajo");
            }
            catch (SQLException ex) {
                Logger.getLogger(fecha.class.getName()).log(Level.SEVERE, null, ex);
            }
            sueldos TR=new sueldos();        
            TR.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"fecha incorrecta");
        }
    }//GEN-LAST:event_cmbingresarActionPerformed

    private void txtmesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmesKeyTyped
        char c=evt.getKeyChar();
        if (c<'0' || c>'9') 
        evt.consume();
    }//GEN-LAST:event_txtmesKeyTyped

    private void txtañoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtañoKeyTyped
        char c=evt.getKeyChar();
        if (c<'0' || c>'9') 
        evt.consume();
    }//GEN-LAST:event_txtañoKeyTyped

    private void cmblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiarActionPerformed
        txtmes.setText("");
        txtaño.setText("");
    }//GEN-LAST:event_cmblimpiarActionPerformed

    private void cmbmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmenuActionPerformed
        menuprincipal TR=new menuprincipal();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_cmbmenuActionPerformed

    private void cmbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmbsalirActionPerformed

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
            java.util.logging.Logger.getLogger(fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbingresar;
    private javax.swing.JButton cmblimpiar;
    private javax.swing.JButton cmbmenu;
    private javax.swing.JButton cmbsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtaño;
    private javax.swing.JTextField txtmes;
    // End of variables declaration//GEN-END:variables
}
