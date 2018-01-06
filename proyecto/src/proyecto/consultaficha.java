package proyecto;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class consultaficha extends javax.swing.JFrame {
private TableRowSorter trsFiltro;
DefaultTableModel model = new DefaultTableModel();

    public consultaficha() {
        initComponents();
        /*try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }*/
        
        model.addColumn("RUT");
        model.addColumn("NOMBRE");
        model.addColumn("CARGO");
        model.addColumn("DEPARTAMENTO"); 
        model.addColumn("NUMERO DE CARGAS");
        model.addColumn("SUELDO BASE");
        model.addColumn("AFP");
        model.addColumn("SALUD"); 
        model.addColumn("PLAN ISAPRE TRABAJADOR");
        this.tablaficha.setModel(model);
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

        jLabel2 = new javax.swing.JLabel();
        cbbfiltro = new javax.swing.JComboBox<>();
        txtfiltro = new javax.swing.JTextField();
        cmbventas = new javax.swing.JButton();
        cmblimpiar = new javax.swing.JButton();
        cmbmenu = new javax.swing.JButton();
        cmbsalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaficha = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Busqueda por:");

        cbbfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "RUT", "NOMBRE", "CARGO", "DEPARTAMENTO" }));
        cbbfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbfiltroActionPerformed(evt);
            }
        });

        txtfiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiltroActionPerformed(evt);
            }
        });
        txtfiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfiltroKeyTyped(evt);
            }
        });

        cmbventas.setText("VER FICHA");
        cmbventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbventasActionPerformed(evt);
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

        jLabel1.setText("FILTRO:");

        tablaficha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RUT", "NOMBRE", "CARGO", "DEPARTAMENTO", "CARGAS FAMILIARES", "SUELDO BASE", "AFP", "SALUD", "PLAN ISAPRE TRABAJADOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaficha);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbventas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(cmbmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(cmbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmblimpiar)
                    .addComponent(cmbmenu)
                    .addComponent(cmbsalir)
                    .addComponent(cmbventas))
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbfiltroActionPerformed

    private void txtfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiltroActionPerformed

    private void txtfiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyTyped
        txtfiltro.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtfiltro.getText());
                txtfiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablaficha.getModel());
        tablaficha.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtfiltroKeyTyped

    private void cmbventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbventasActionPerformed
        Statement st = null;

        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            st = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st=connection.createStatement();
        }
        catch (SQLException ex) {
            Logger.getLogger(consultaficha.class.getName()).log(Level.SEVERE, null, ex);
        }

        String query ="";
        query= "select * from TabFicha";
        ResultSet res = null;

        try {
            res = st.executeQuery(query);
            while(res.next()){

                DecimalFormat formatea = new DecimalFormat("###,###.##");//Sirve para sacar los decimales del número en la tabla de consulta

                String []agregar=new String[9];
                try {
                    agregar[0]=res.getString(1);
                    agregar[1]=res.getString(2);
                    agregar[2]=res.getString(3);
                    agregar[3]=res.getString(4);
                    agregar[4]=res.getString(5);
                    agregar[5]=formatea.format(res.getInt(6));
                    agregar[6]=res.getString(7);
                    agregar[7]=res.getString(8);
                    agregar[8]=res.getString(9);
                    model.addRow(agregar);
                }
                catch (SQLException ex) {
                    Logger.getLogger(consultaficha.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            db.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(consultaficha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbventasActionPerformed

    private void cmblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiarActionPerformed
        model.setRowCount(0);
        cbbfiltro.setSelectedIndex(0);
        txtfiltro.setText("");
    }//GEN-LAST:event_cmblimpiarActionPerformed

    private void cmbmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmenuActionPerformed
        menuprincipal TR=new menuprincipal();
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_cmbmenuActionPerformed

    private void cmbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmbsalirActionPerformed

    public void filtro(){
        int columnaABuscar=0;
        
        if(cbbfiltro.getSelectedItem()=="RUT"){
            columnaABuscar = 0;
        }
        if(cbbfiltro.getSelectedItem()=="NOMBRE"){
            columnaABuscar = 1;
        }
        if(cbbfiltro.getSelectedItem()=="CARGO"){
            columnaABuscar = 2;
        }        
        if(cbbfiltro.getSelectedItem()=="DEPARTAMENTO"){
            columnaABuscar = 3;
        }
        
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtfiltro.getText(),columnaABuscar));
    }
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
            java.util.logging.Logger.getLogger(consultaficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultaficha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbfiltro;
    private javax.swing.JButton cmblimpiar;
    private javax.swing.JButton cmbmenu;
    private javax.swing.JButton cmbsalir;
    private javax.swing.JButton cmbventas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaficha;
    private javax.swing.JTextField txtfiltro;
    // End of variables declaration//GEN-END:variables

}
