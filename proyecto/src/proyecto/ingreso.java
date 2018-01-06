package proyecto;
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.substring;
import static net.ucanaccess.converters.Functions.string;

public class ingreso extends javax.swing.JFrame {

    public ingreso() {
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

        txtdigito = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        verificador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbbdepto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtnumcargas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsueldobase = new javax.swing.JTextField();
        cmbingresar = new javax.swing.JButton();
        cmblimpiar = new javax.swing.JButton();
        cmbmenu = new javax.swing.JButton();
        cmbsalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbbafp = new javax.swing.JComboBox<>();
        cbbsalud = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtufisapre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtdigito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdigitoKeyTyped(evt);
            }
        });

        jLabel1.setText(" -");

        verificador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verificadorKeyTyped(evt);
            }
        });

        jLabel2.setText("RUT");

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Cargo");

        txtcargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcargoKeyTyped(evt);
            }
        });

        jLabel5.setText("Departamento");

        cbbdepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Producción", "Ventas", "Contabilidad" }));

        jLabel6.setText("Número de cargas");

        txtnumcargas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumcargasKeyTyped(evt);
            }
        });

        jLabel7.setText("Sueldo Base");

        txtsueldobase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsueldobaseKeyTyped(evt);
            }
        });

        cmbingresar.setText("INGRESAR");
        cmbingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbingresarActionPerformed(evt);
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

        jLabel8.setText("AFP");

        cbbafp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "CAPITAL", "CUPRUM", "HABITAT", "PLANVITAL", "PROVIDA\t", "MODELO" }));

        cbbsalud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "FONASA", "ISAPRE BANMEDICA", "ISAPRE COLMENA", "ISAPRE CONSALUD", "ISAPRE CRUZ BLANCA", "ISAPRE VIDA TRES" }));

        jLabel9.setText("Salud");

        jLabel10.setText("Ingrese UF plan del trabajador Isapre ");

        jLabel11.setText("UF");

        jLabel12.setText("** SI ES FONASA INGRESE $0.-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbbafp, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtsueldobase, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtdigito, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(verificador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbbdepto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcargo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbsalud, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtnumcargas, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtufisapre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdigito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(verificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbingresar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmblimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbmenu))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbdepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbsalir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumcargas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsueldobase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbbafp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbsalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtufisapre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbingresarActionPerformed
        String num = txtdigito.getText();
        String num2 = verificador.getText().toUpperCase();
        int x=1,i=0, suma=0,aux2=0,resto=0,rest=0,sw=0;
        i=num.length();
        String aux="", dv=""; 
        
        do{
            x++;
            aux = substring(num,i,i-1);
            aux2=Integer.parseInt(aux)*x;
            if (x==7){
                x=1;
            }
            suma=suma + aux2; 
            aux2=0;
            i--;
        } while(i != 0); 
               resto=suma%11;
               rest=11-resto;
               
               if(String.valueOf(rest).equals(num2)){                  
                    conexion();
               }else if(rest==11){                    
                    dv = "0";
                    if(dv.equals(num2)){
                       conexion();
                    }
               }else if(rest==10){
                    dv="K";
                    if(dv.equals(num2)){
                        conexion();
                    }                   
               }else{
                   JOptionPane.showMessageDialog(null,"Rut incorrecto");
               }      
    }//GEN-LAST:event_cmbingresarActionPerformed
   public void conexion(){
        String A="";   
        String B=""; 
        String C=""; 
        String D=""; 
        String E=""; 
        String F=""; 
        String G=""; 
        String num = txtdigito.getText();
        int a=Integer.parseInt(num);
        int rut=a;
        String nombre=txtnombre.getText().toUpperCase();
        String cargo=txtcargo.getText().toUpperCase();        
        String carga=txtnumcargas.getText();
        int cargas=Integer.parseInt(carga);
        String sueldo= txtsueldobase.getText();
        int sueldobase=Integer.parseInt(sueldo);
        String afp="";
        if(cbbafp.getSelectedItem()=="CAPITAL"){
            afp="CAPITAL";
        }
        if(cbbafp.getSelectedItem()=="CUPRUM"){
            afp="CUPRUM";
        }
        if(cbbafp.getSelectedItem()=="HABITAT"){
            afp="HABITAT";
        }
        if(cbbafp.getSelectedItem()=="PLANVITAL"){
            afp="PLANVITAL";
        }
        if(cbbafp.getSelectedItem()=="PROVIDA"){
            afp="PROVIDA";
        }
        if(cbbafp.getSelectedItem()=="MODELO"){
            afp="MODELO";
        }
        String ufisapre = txtufisapre.getText();
        int ufisap = Integer.parseInt(ufisapre);
        String salud="";
        if(cbbsalud.getSelectedItem()=="FONASA"){
            salud="FONASA";
        }
        if(cbbsalud.getSelectedItem()=="ISAPRE BANMEDICA"){
            salud="ISAPRE BANMEDICA";
        }
        if(cbbsalud.getSelectedItem()=="ISAPRE COLMENA"){
            salud="ISAPRE COLMENA";
        }
        if(cbbsalud.getSelectedItem()=="ISAPRE CONSALUD"){
            salud="ISAPRE CONSALUD";
        }
        if(cbbsalud.getSelectedItem()=="ISAPRE CRUZ BLANCA"){
            salud="ISAPRE CRUZ BLANCA";
        }
        if(cbbsalud.getSelectedItem()=="ISAPRE VIDA TRES"){
            salud="ISAPRE VIDA TRES";
        }        
        String depto="";
        String depto1="";
        String depto2="";
        String depto3="";
        if(cbbdepto.getSelectedItem()=="Producción"){
            depto="PRODUCCION";
            depto1="PRODUCCION";            
        }
        if(cbbdepto.getSelectedItem()=="Ventas"){
            depto="VENTAS";
            depto2="VENTAS";
        }
        if(cbbdepto.getSelectedItem()=="Contabilidad"){
            depto="CONTABILIDAD"; 
            depto3="CONTABILIDAD";             
        }
        String vacio="";
        int vac=0;
        
        A="INSERT INTO TabFicha(RUT,NOMBRE,CARGO,DEPARTAMENTO,NumCargasFam,SueldoBase,AFP,SALUD,PLAN_ISAPRE_TRABAJADOR_UF) values ("+rut+",'"+nombre+"','"+cargo+"','"+depto+"',"+cargas+","+sueldobase+",'"+afp+"','"+salud+"',"+ufisap+")";
        B="INSERT INTO TabBono(RUT,NOMBRE,TIPO_DE_BONO,MONTO_BONO) values ("+rut+",'"+nombre+"','"+vacio+"',"+vac+")";        
        C="INSERT INTO TabRenta(RUT,NOMBRE,DEPARTAMENTO,SueldoBase,NUEVO_SUELDO_BASE) values ("+rut+",'"+nombre+"','"+depto+"',"+sueldobase+","+vac+")";
        D="INSERT INTO TabSue(RUT,NOMBRE,DEPARTAMENTO,FECHA,SueldoBase,NUM_HORAS_EXTRAS,MONTO_HORAS_EXTRAS,BONOS,GRATIFICACIÓN,BASE_IMPONIBLE,NumCargasFam,MONTO_CARGAS_FAMILIARES,MOVILIZACIÓN,COLACIÓN,TOTAL_HABERES,AFP,MONTO_AFP,SALUD,ISAPRE_UF_TRABAJADOR,MONTO_SALUD,EXCEDENTE_SALUD,SEGURO_CESANTIA,SUELDO_LIQUIDO) values ("+rut+",'"+nombre+"','"+depto+"','"+vacio+"',"+sueldobase+","+vac+","+vac+","+vac+","+vac+","+vac+","+cargas+","+vac+","+vac+","+vac+","+vac+",'"+afp+"',"+vac+",'"+salud+"',"+ufisap+","+vac+","+vac+","+vac+","+vac+")";
        E="INSERT INTO TabPro (RUT,NOMBRE,DEPARTAMENTO,FECHA,SUELDO_LIQUIDO2) values ("+rut+",'"+nombre+"','"+depto1+"','"+vacio+"',"+vac+")";        
        F="INSERT INTO TabVen (RUT,NOMBRE,DEPARTAMENTO,FECHA,SUELDO_LIQUIDO3) values ("+rut+",'"+nombre+"','"+depto2+"','"+vacio+"',"+vac+")";
        G="INSERT INTO TabCon (RUT,NOMBRE,DEPARTAMENTO,FECHA,SUELDO_LIQUIDO1) values ("+rut+",'"+nombre+"','"+depto3+"','"+vacio+"',"+vac+")";
        
        String query="";
        String query2="";
        String query3="";
        
        query="DELETE FROM TabPro WHERE DEPARTAMENTO=''";
        query2="DELETE FROM TabVen WHERE DEPARTAMENTO=''";
        query3="DELETE FROM TabCon WHERE DEPARTAMENTO=''";
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);
        System.out.println(query);
        System.out.println(query2);
        System.out.println(query3);
        try {
           /* String con=".\\bd\\empleados.accdb";
            Connection dbingre = DriverManager.getConnection("jdbc:ucanaccess://"+con);*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            Statement stingre=connection.createStatement();
            stingre.execute(A);
            stingre.execute(B);
            stingre.execute(C);
            stingre.execute(D);
            stingre.execute(E);
            stingre.execute(F);
            stingre.execute(G);
            stingre.execute(query);
            stingre.execute(query2);
            stingre.execute(query3);
            
            JOptionPane.showMessageDialog(null,"Datos agregado correctamente");     
        }
        catch(SQLException e) {
            System.out.println(e);
        }           
    }
    
    private void txtdigitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdigitoKeyTyped
      
    }//GEN-LAST:event_txtdigitoKeyTyped

    private void verificadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verificadorKeyTyped
  
    }//GEN-LAST:event_verificadorKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char c=evt.getKeyChar();
        if ((c <'a' || c > 'z') && (c <'A' || c > 'Z' ) && (c!=' ') )
        evt.consume();
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtcargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcargoKeyTyped
        char c=evt.getKeyChar();
        if ((c <'a' || c > 'z') && (c <'A' || c > 'Z' ) && (c!=' ') )
        evt.consume();
    }//GEN-LAST:event_txtcargoKeyTyped

    private void txtnumcargasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumcargasKeyTyped
        char c=evt.getKeyChar();
        if (c<'0' || c>'9') 
        evt.consume();
    }//GEN-LAST:event_txtnumcargasKeyTyped

    private void txtsueldobaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsueldobaseKeyTyped
        char c=evt.getKeyChar();
        if (c<'0' || c>'9') 
        evt.consume();
    }//GEN-LAST:event_txtsueldobaseKeyTyped

    private void cmblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiarActionPerformed
        txtdigito.setText("");
        verificador.setText("");
        txtnombre.setText("");
        txtcargo.setText("");
        cbbdepto.setSelectedIndex(0);
        txtnumcargas.setText("");
        txtsueldobase.setText("");
        txtufisapre.setText("");
        cbbafp.setSelectedIndex(0);
        cbbsalud.setSelectedIndex(0);
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
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbafp;
    private javax.swing.JComboBox<String> cbbdepto;
    private javax.swing.JComboBox<String> cbbsalud;
    private javax.swing.JButton cmbingresar;
    private javax.swing.JButton cmblimpiar;
    private javax.swing.JButton cmbmenu;
    private javax.swing.JButton cmbsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JTextField txtdigito;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumcargas;
    private javax.swing.JTextField txtsueldobase;
    private javax.swing.JTextField txtufisapre;
    private javax.swing.JTextField verificador;
    // End of variables declaration//GEN-END:variables
}
