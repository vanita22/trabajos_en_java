package proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class eliminarnombre extends javax.swing.JFrame {

    public eliminarnombre() {
        initComponents();
        /*try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }*/
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

        cmbeliminar = new javax.swing.JButton();
        cmblimpiar = new javax.swing.JButton();
        cmbmenu = new javax.swing.JButton();
        cmbsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbeliminar.setText("ELIMINAR");
        cmbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbeliminarActionPerformed(evt);
            }
        });

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

        jLabel1.setText("ELIMINACIÓN POR NOMBRE");

        jLabel2.setText("Seleccione nombre:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(cmbmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(cmbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbeliminar)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsalir)
                    .addComponent(cmbmenu)
                    .addComponent(cmblimpiar))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbeliminarActionPerformed
        Object [] eleccion ={"SI","NO"};
        Object opcion = JOptionPane.showInputDialog(null,"¿Desea eliminar departamento?", "Elegir",JOptionPane.QUESTION_MESSAGE,null,eleccion, eleccion[0]);

        if(opcion=="SI"){
            String query ="";String query2 ="";String query3 ="";String query4 ="";String query5 ="";String query6 ="";String query7 ="";
            
            String res=txtnombre.getText().toUpperCase();

            query="DELETE FROM TabFicha WHERE NOMBRE='"+res+"'";
            query2="DELETE FROM TabSue WHERE NOMBRE='"+res+"'";            
            query3="DELETE FROM TabRenta WHERE NOMBRE='"+res+"'";
            query4="DELETE FROM TabPro WHERE NOMBRE='"+res+"'";
            query5="DELETE FROM TabCon WHERE NOMBRE='"+res+"'";
            query6="DELETE FROM TabVen WHERE NOMBRE='"+res+"'";
            query7="DELETE FROM TabBono WHERE NOMBRE='"+res+"'";

            System.out.println(query);System.out.println(query2);System.out.println(query3);
            System.out.println(query4);System.out.println(query5);System.out.println(query6);
            System.out.println(query7);

            try {
                /*String con=".\\bd\\empleados.accdb";
                Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
                Statement st=db.createStatement();*/
                String url = "jdbc:mysql://localhost:3306/empleados";
                String user = "root";
                String pass = "";
                Connection connection = DriverManager.getConnection(url, user,pass);
                Statement st=connection.createStatement();
                st.execute(query);st.execute(query2);st.execute(query3);st.execute(query4);
                st.execute(query5);st.execute(query6);st.execute(query7);

                JOptionPane.showMessageDialog(null,"Datos actualizados");
            }
            catch (SQLException ex) {
                Logger.getLogger(eliminarnombre.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Datos actualizados correctamente");
            db.close();
        }else if(opcion=="NO"){
            JOptionPane.showMessageDialog(null,"Dato a salvo");
        }

    }//GEN-LAST:event_cmbeliminarActionPerformed

    private void cmblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiarActionPerformed
        txtnombre.setText("");
    }//GEN-LAST:event_cmblimpiarActionPerformed

    private void cmbmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmenuActionPerformed
        menuprincipal TR=new menuprincipal();
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_cmbmenuActionPerformed

    private void cmbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmbsalirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(eliminarnombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminarnombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminarnombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminarnombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminarnombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbeliminar;
    private javax.swing.JButton cmblimpiar;
    private javax.swing.JButton cmbmenu;
    private javax.swing.JButton cmbsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
