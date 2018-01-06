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
public class consultasueldos extends javax.swing.JFrame {
private TableRowSorter trsFiltro;
DefaultTableModel model = new DefaultTableModel(); 

    public consultasueldos() {
        initComponents();
        /*try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }*/
        
        model.addColumn("RUT");
        model.addColumn("NOMBRE");
        model.addColumn("DEPARTAMENTO");
        model.addColumn("FECHA");
        model.addColumn("SueldoBase");
        model.addColumn("NUM_HORAS_EXTRAS");
        model.addColumn("MONTO_HORAS_EXTRAS");
        model.addColumn("BONOS");
        model.addColumn("GRATIFICACIÓN");
        model.addColumn("BASE_IMPONIBLE");
        model.addColumn("NumCargasFam");
        model.addColumn("MONTO_CARGAS_FAMILIARES");
        model.addColumn("MOVILIZACIÓN");
        model.addColumn("COLACIÓN");
        model.addColumn("TOTAL_HABERES");
        model.addColumn("AFP");
        model.addColumn("MONTO_AFP");
        model.addColumn("SALUD");
        model.addColumn("ISAPRE_UF_TRABAJADOR");
        model.addColumn("MONTO_SALUD");
        model.addColumn("EXCEDENTE_SALUD");
        model.addColumn("SEGURO_CESANTIA");
        model.addColumn("SUELDO_LIQUIDO");
        this.tablasueldo.setModel(model);
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

        cmbsueldo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbfiltro = new javax.swing.JComboBox<>();
        txtfiltro = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablasueldo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbsueldo.setText("CONSULTAR SUELDOS");
        cmbsueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsueldoActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("VOLVER AL MENÚ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("FILTRO:");

        jLabel2.setText("BUSQUEDA POR:");

        cbbfiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR:", "RUT", "NOMBRE", "HIJOS", "AFP", "SALUD", "SUELDO LIQUIDO" }));

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

        tablasueldo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RUT", "NOMBRE", "DEPARTAMENTO", "FECHA", "SueldoBase", "NUM_HORAS_EXTRAS", "MONTO_HORAS_EXTRAS", "BONOS", "GRATIFICACIÓN", "BASE_IMPONIBLE", "NumCargasFam", "MONTO_CARGAS_FAMILIARES", "MOVILIZACIÓN", "COLACIÓN", "TOTAL_HABERES", "AFP", "MONTO_AFP", "SALUD", "ISAPRE_UF_TRABAJADOR", "MONTO_SALUD", "EXCEDENTE_SALUD", "SEGURO_CESANTIA", "SUELDO_LIQUIDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tablasueldo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(tablasueldo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 3266, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsueldo)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        model.setRowCount(0);
        cbbfiltro.setSelectedIndex(0);
        txtfiltro.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbsueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsueldoActionPerformed
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
            Logger.getLogger(consultasueldos.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        String query ="";
        query= "select * from TabSue";
        ResultSet res = null;
        
        try {
            res = st.executeQuery(query);            
            while(res.next()){
                //System.out.println(res.getInt("NUMERO")+ " " + res.getString("DESDE") + " " + res.getString("HASTA") + " " + res.getInt("PRECIO") + " " + res.getDate("FECHA"));
                DecimalFormat formatea = new DecimalFormat("###,###.##");//Sirve para sacar los decimales del número en la tabla de consulta
               
                String []agregar=new String[23];
                try {
                    agregar[0]=res.getString(1);
                    agregar[1]=res.getString(2);
                    agregar[2]=res.getString(3);
                    agregar[3]=res.getString(4);
                    agregar[4]=formatea.format(res.getInt(5));//con .format() se hace la conversión
                    agregar[5]=res.getString(6);
                    agregar[6]=formatea.format(res.getInt(7));
                    agregar[7]=formatea.format(res.getInt(8));                    
                    agregar[8]=formatea.format(res.getInt(9));
                    agregar[9]=formatea.format(res.getInt(10));
                    agregar[10]=res.getString(11);
                    agregar[11]=formatea.format(res.getInt(12));
                    agregar[12]=formatea.format(res.getInt(13));
                    agregar[13]=formatea.format(res.getInt(14));
                    agregar[14]=formatea.format(res.getInt(15));
                    agregar[15]=res.getString(16);
                    agregar[16]=formatea.format(res.getInt(17));
                    agregar[17]=res.getString(18);
                    agregar[18]=res.getString(19);
                    agregar[19]=formatea.format(res.getInt(20));
                    agregar[20]=formatea.format(res.getInt(21));
                    agregar[21]=formatea.format(res.getInt(22));
                    agregar[22]=formatea.format(res.getInt(23));
                    model.addRow(agregar);
                } 
                catch (SQLException ex) {
                    Logger.getLogger(consultasueldos.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }            
            st.close();
        } 
        catch (SQLException ex) {
            Logger.getLogger(consultasueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbsueldoActionPerformed

    private void txtfiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltroKeyTyped
        txtfiltro.addKeyListener(new KeyAdapter(){
            public void keyReleased(final KeyEvent e){
                String cadena = (txtfiltro.getText());
                txtfiltro.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(tablasueldo.getModel());
        tablasueldo.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtfiltroKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menuprincipal TR=new menuprincipal();
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtfiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiltroActionPerformed

    public void filtro(){
        int columnaABuscar=0;
        
        if(cbbfiltro.getSelectedItem()=="RUT"){
            columnaABuscar = 0;
        }
        if(cbbfiltro.getSelectedItem()=="NOMBRE"){
            columnaABuscar = 1;
        }
        if(cbbfiltro.getSelectedItem()=="HIJOS"){
            columnaABuscar = 10;
        }
        if(cbbfiltro.getSelectedItem()=="AFP"){
            columnaABuscar = 15;
        }
        if(cbbfiltro.getSelectedItem()=="SALUD"){
            columnaABuscar = 17;
        }
        if(cbbfiltro.getSelectedItem()=="SUELDO LIQUIDO"){
            columnaABuscar = 22;
        }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtfiltro.getText(),columnaABuscar));
    }
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(consultasueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultasueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultasueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultasueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultasueldos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbfiltro;
    private javax.swing.JButton cmbsueldo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablasueldo;
    private javax.swing.JTextField txtfiltro;
    // End of variables declaration//GEN-END:variables
}
