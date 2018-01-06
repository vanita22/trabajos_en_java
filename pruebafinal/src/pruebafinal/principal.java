package pruebafinal;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;


public class principal extends javax.swing.JFrame {
private ButtonGroup grupo;

    public principal() {
        initComponents();
        this.setDefaultCloseOperation(principal.DISPOSE_ON_CLOSE);
        grupo=new ButtonGroup();        
        grupo.add(rbsqlserver);
        grupo.add(rbmysql);
        grupo.add(rbpost);
        grupo.add(rbucan);
        grupo.add(rbaccess);
        
        //CONEXION AL UCANACCESS
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        //CONEXION A POSTGRES
        try { 
            Class.forName("org.postgresql.Driver");
        } 
        catch (ClassNotFoundException ex) {
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        }
    }
    
    //PARA LA CONEXION A MYSQL
    public static void connect(){
        String url = "jdbc:mysql://localhost:3306/conexion";
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        rbsqlserver = new javax.swing.JRadioButton();
        rbmysql = new javax.swing.JRadioButton();
        rbpost = new javax.swing.JRadioButton();
        rbaccess = new javax.swing.JRadioButton();
        rbucan = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmblimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese nombre:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese teléfono:");

        txtfono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfonoActionPerformed(evt);
            }
        });
        txtfono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfonoKeyTyped(evt);
            }
        });

        jLabel3.setText("Ingrese ciudad:");

        rbsqlserver.setText("SQL SERVER");

        rbmysql.setText("MYSQL");

        rbpost.setText("POSTGRE SQL");

        rbaccess.setText("ACCESS ");

        rbucan.setText("UCANACCESS");

        jButton1.setText("CONECTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Elija base de datos a enviar:");

        cmblimpiar.setText("LIMPIAR");
        cmblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnombre)
                                .addComponent(txtfono)
                                .addComponent(txtciudad, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rbsqlserver, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(rbmysql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addComponent(cmblimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rbucan, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rbpost, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(127, 127, 127))
                        .addComponent(rbaccess, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbsqlserver)
                    .addComponent(jButton1)
                    .addComponent(rbucan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbmysql)
                    .addComponent(cmblimpiar)
                    .addComponent(rbaccess))
                .addGap(18, 18, 18)
                .addComponent(rbpost)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtfonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfonoActionPerformed
        
    }//GEN-LAST:event_txtfonoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre=txtnombre.getText().toUpperCase();
        String fono=txtfono.getText();
        int fono2=Integer.parseInt(fono);
        String ciudad=txtciudad.getText().toUpperCase();
        
                
        //CONEXION CON SQLSERVER
        if(rbsqlserver.isSelected()){          
           try {
           // Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String connectionUrl = "jdbc:sqlserver://;database=conexion1;integratedSecurity=false;";
            Connection conect = DriverManager.getConnection(connectionUrl,"prueba","prueba");
            PreparedStatement st;
            st=conect.prepareStatement("INSERT INTO primero3 VALUES('"+nombre+"',"+fono2+",'"+ciudad+"')");
            st.execute();
            System.out.println("Conectado."); 
            JOptionPane.showMessageDialog(null,"Datos agregado correctamente");
            } 
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error");
                System.out.println("Error.");
                System.out.println(ex);
            }
        }
        
        
        //CONEXION CON MYSQL
        if(rbmysql.isSelected()){
            String base="";
            base="INSERT INTO primero2 (NOMBRE,TELEFONO,CIUDAD) VALUES('"+nombre+"',"+fono2+",'"+ciudad+"')";
            System.out.println(base);
            try {
                String url = "jdbc:mysql://localhost:3306/conexion";
                String user = "root";
                String pass = "";
                Connection connection = DriverManager.getConnection(url,user,pass);
                Statement st=connection.createStatement();
                st.execute(base);

                JOptionPane.showMessageDialog(null,"Datos agregado correctamente");     
            }
            catch(SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Error");
            }
        }
        
        
        //CONEXION CON ACCESS
        if(rbaccess.isSelected()){           
            /*try{
                String base3="";
                try {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                }
    		Connection co=DriverManager.getConnection("jdbc:odbc:conex","","");
    		Statement st=co.createStatement();            
                st.execute(base3);
                
                
                base3="INSERT INTO primero (NOMBRE,TELEFONO,CIUDAD) VALUES('"+nombre+"',"+fono2+",'"+ciudad+"')";
                System.out.println(base3);

                JOptionPane.showMessageDialog(null,"Datos agregado correctamente");     
            }
            catch(SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Error");
            } */
            JOptionPane.showMessageDialog(null,"Conexión no funciona");
        }
        
        
        //CONEXION CON UCANACCESS
        if(rbucan.isSelected()){            
            String base2="";
            base2="INSERT INTO primero (NOMBRE,TELEFONO,CIUDAD) VALUES('"+nombre+"',"+fono2+",'"+ciudad+"')";
            System.out.println(base2);
            try {
                String con=".\\bd\\conexion.accdb";
                Connection db = DriverManager.getConnection("jdbc:ucanaccess://"+con);
                Statement st=db.createStatement();
                st.execute(base2);

                JOptionPane.showMessageDialog(null,"Datos agregado correctamente");     
            }
            catch(SQLException e) {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Error");
            }
        }
        
        //CONEXION CON POSTGRES
        if(rbpost.isSelected()){            
            String base2="";
            base2="INSERT INTO primero (NOMBRE,TELEFONO,CIUDAD) VALUES('"+nombre+"',"+fono2+",'"+ciudad+"')";
            System.out.println(base2);
             
            Connection conn = null;
            String urlDatabase =  "jdbc:postgresql://localhost:5432/conexion"; 
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(urlDatabase,"postgres","123");
                Statement st=conn.createStatement();
                st.execute(base2);
                
                System.out.println("La conexión se realizo sin problemas! =) ");
                JOptionPane.showMessageDialog(null,"Datos agregado correctamente"); 
            } 
            catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println("Ocurrio un error : "+e.getMessage());
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Error");
            }                         
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiarActionPerformed
        txtnombre.setText("");
        txtfono.setText("");
        txtciudad.setText("");
    }//GEN-LAST:event_cmblimpiarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtfonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfonoKeyTyped
        char c=evt.getKeyChar();
        if (c<'0' || c>'9') 
        evt.consume();
    }//GEN-LAST:event_txtfonoKeyTyped

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cmblimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton rbaccess;
    private javax.swing.JRadioButton rbmysql;
    private javax.swing.JRadioButton rbpost;
    private javax.swing.JRadioButton rbsqlserver;
    private javax.swing.JRadioButton rbucan;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtfono;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

    private static class JavaPostgreSQLBasic {

        public JavaPostgreSQLBasic() {
        }
    }
}
