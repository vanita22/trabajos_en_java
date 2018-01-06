package proyecto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class actualizacionsueldobase extends javax.swing.JFrame {

    public actualizacionsueldobase() {
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

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbdepto = new javax.swing.JComboBox<>();
        txtdepto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        txtporcenrut = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbaumentar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbbdepto2 = new javax.swing.JComboBox<>();
        txtdepto2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbdisminuir = new javax.swing.JButton();
        cmbingresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtdisrut = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ACTUALIZACIÓN POR DEPARTAMENTO:");

        cbdepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR:", "PRODUCCION", "VENTAS", "CONTABILIDAD" }));
        cbdepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdeptoActionPerformed(evt);
            }
        });

        jLabel2.setText("%");

        jLabel3.setText("ACTUALIZACIÓN POR RUT:");

        jLabel5.setText("%");

        cmbaumentar.setText("INGRESAR");
        cmbaumentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbaumentarActionPerformed(evt);
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

        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Aumentar Sueldo");

        jLabel7.setText("Disminuir Sueldo");

        cbbdepto2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONARr:", "PRODUCCION", "VENTAS", "CONTABILIDAD" }));

        jLabel8.setText("%");

        cmbdisminuir.setText("INGRESAR");
        cmbdisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdisminuirActionPerformed(evt);
            }
        });

        cmbingresar.setText("INGRESAR");
        cmbingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbingresarActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingrese RUT sin dígito verificador");

        jLabel9.setText("Aumentar Sueldo");

        jLabel10.setText("Disminuir Sueldo");

        txtdisrut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdisrutActionPerformed(evt);
            }
        });

        jLabel11.setText("%");

        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbdepto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdepto, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbaumentar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbdepto2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdepto2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbdisminuir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtdisrut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtporcenrut, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbdepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbaumentar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbdisminuir)
                    .addComponent(jLabel8)
                    .addComponent(txtdepto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbdepto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtporcenrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbingresar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtdisrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbaumentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbaumentarActionPerformed
        Calendar fecha = Calendar.getInstance();
        String fecha2=(fecha.get(Calendar.DATE)+ "-"+(fecha.get(Calendar.MONTH) + 1)+ "-"+ fecha.get(Calendar.YEAR));
        String c = txtdepto.getText();
        Double c2=Double.parseDouble(c);					
        Double porcen=((c2/100)+1);
        double factor=0.0077777;
        int gratif = 270000;
        double calulograt= (4.75 * gratif)/12;
        int num = 11091;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MENOR A 283312
        int num2 = 6806;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 283312 Y MENOR A 413808
        int num3 = 2151;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 413808 Y MENOR A 645400
        int num4 = 0;
        double porc=12.85;//Porcentaje de AFP capital
        double porcen_afp_cap=(porc/100);
        double porc2=12.89;//Porcentaje de AFP cupum
        double porcen_afp_cup=(porc2/100);
        double porc3=12.68;//Porcentaje de AFP habitat
        double porcen_afp_hab=(porc3/100);
        double porc4=11.82;//Porcentaje de AFP plan vital
        double porcen_afp_plan=(porc4/100);
        double porc5=12.86;//Porcentaje de AFP provida
        double porcen_afp_pro=(porc5/100);
        double porc6=12.18;//Porcentaje de AFP modelo
        double porcen_afp_mod=(porc6/100);
        //calculo salud fonasa
        double fon=7;
        double porcen_fonasa=(fon/100);
        //calculo isapre
        double uf = 26798.14;
        int vac = 0;
        //Cálculo de seguro de cesantía
        double seguro = 0.6;
        double totalseg = seguro/100;      
        
        String basef="";
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
        String base16="";
        String base17="";
        String base18="";
        String base19="";
        String base20="";
        String base21="";
        String base22="";        
        
        basef="UPDATE TabSue Set FECHA='"+fecha2+"'WHERE DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base="UPDATE TabSue Set SueldoBase=SueldoBase*"+porcen+" WHERE DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";  //gon getSelectedItem() se ve el contenido en palabras del combobox y con el getSelectedIndex() se ve el indice del contenido
        base2="UPDATE TabSue Set MONTO_HORAS_EXTRAS=SueldoBase*(NUM_HORAS_EXTRAS*"+factor+") WHERE DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base3="UPDATE TabSue Set GRATIFICACIÓN="+calulograt+" WHERE GRATIFICACIÓN<(SueldoBase*0.25) AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base4="UPDATE TabSue Set GRATIFICACIÓN=(SueldoBase*0.25) WHERE GRATIFICACIÓN>(SueldoBase*0.25) AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base5="UPDATE TabSue Set BASE_IMPONIBLE=(SueldoBase+MONTO_HORAS_EXTRAS+BONOS+GRATIFICACIÓN) WHERE DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base6="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num+" WHERE BASE_IMPONIBLE<=283312 AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base7="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num2+" WHERE BASE_IMPONIBLE>283312 AND BASE_IMPONIBLE<=413808 AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base8="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num3+" WHERE BASE_IMPONIBLE>413808 AND BASE_IMPONIBLE<=645400 AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base9="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num4+" WHERE BASE_IMPONIBLE>645400 AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base10="UPDATE TabSue Set TOTAL_HABERES=(BASE_IMPONIBLE+MONTO_CARGAS_FAMILIARES+MOVILIZACIÓN+COLACIÓN) WHERE DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base11="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cap+" WHERE AFP='CAPITAL' AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base12="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cup+" WHERE AFP='CUPRUM' AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base13="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_hab+" WHERE AFP='HABITAT' AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base14="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_plan+" WHERE AFP='PLANVITAL' AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base15="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_pro+" WHERE AFP='PROVIDA' AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base16="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_mod+" WHERE AFP='MODELO' AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base17="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+" WHERE DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'"; 
        base18="UPDATE TabSue Set EXCEDENTE_SALUD="+vac+" WHERE SALUD='FONASA' AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base19="UPDATE TabSue Set MONTO_SALUD=ISAPRE_UF_TRABAJADOR*"+uf+", EXCEDENTE_SALUD="+vac+" WHERE BASE_IMPONIBLE*"+porcen_fonasa+"<ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA' AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base20="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+", EXCEDENTE_SALUD=MONTO_SALUD-(ISAPRE_UF_TRABAJADOR*"+uf+") WHERE BASE_IMPONIBLE*"+porcen_fonasa+">ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA' AND DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base21="UPDATE TabSue Set SEGURO_CESANTIA=BASE_IMPONIBLE*"+totalseg+" WHERE DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        base22="UPDATE TabSue Set SUELDO_LIQUIDO=TOTAL_HABERES-(MONTO_AFP+MONTO_SALUD+SEGURO_CESANTIA) WHERE DEPARTAMENTO='"+cbdepto.getSelectedItem()+"'";
        
        System.out.println(basef);
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
        System.out.println(base16);
        System.out.println(base17);
        System.out.println(base18);
        System.out.println(base19);
        System.out.println(base20);
        System.out.println(base21);
        System.out.println(base22);
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            Statement st=db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            Statement st=connection.createStatement();
            st.execute(basef);
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
            st.execute(base16);
            st.execute(base17);
            st.execute(base18);
            st.execute(base19);
            st.execute(base20);
            st.execute(base21);
            st.execute(base22);
            //System.out.println("campo modificado");
            JOptionPane.showMessageDialog(null,"Datos actualizados");
            db.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        //ingreso de sueldo liquido a la tabla ventas
        Statement st = null;        
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query ="";
        query= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='VENTAS'";
        ResultSet res = null; 
        int pre2=0;
        int rut=0;
        try {
            res = st.executeQuery(query);  
           
            while(res.next()){               
                 pre2 = res.getInt("SUELDO_LIQUIDO");
                 rut = res.getInt("RUT");
                 String cons=""; 
                 cons="UPDATE TabVen Set SUELDO_LIQUIDO3="+pre2+" WHERE RUT="+rut+"";
                 st.execute(cons);
                 System.out.println(pre2);
                 System.out.println(rut);
            }         
            
        }
         catch (SQLException ex) { 
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ingreso de sueldo liquido a la tabla produccion
        Statement st2 = null; 
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion2 = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st2=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query2 ="";
        query2= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='PRODUCCION'";
        ResultSet res2 = null; 
        int pre3=0;
        int rut2=0;
        try {
            res2 = st2.executeQuery(query2);  
           
            while(res2.next()){               
                 pre3 = res2.getInt("SUELDO_LIQUIDO"); 
                 rut2 = res2.getInt("RUT");
                 String cons2="";
                 cons2="UPDATE TabPro Set SUELDO_LIQUIDO2="+pre3+" WHERE RUT="+rut2+"";
                 st2.execute(cons2);
                 System.out.println(pre3);
                 System.out.println(rut2);
            }           
        }
         catch (SQLException ex) { 
            Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ingreso de sueldo liquido a la tabla contabilidad
        Statement st3 = null;
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion3 = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st3=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query3 ="";
        query3= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='CONTABILIDAD'";
        ResultSet res3 = null; 
        int pre4=0;
        int rut3=0;
        try {
            res3 = st3.executeQuery(query3);  
           
            while(res3.next()){               
                pre4 = res3.getInt("SUELDO_LIQUIDO");
                rut3 = res3.getInt("RUT");
                String cons3="";
                cons3="UPDATE TabCon Set SUELDO_LIQUIDO1="+pre4+" WHERE RUT="+rut3+"";
                st3.execute(cons3);
                System.out.println(pre4);
                System.out.println(rut3);
            }            
        }
         catch (SQLException ex) { 
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbaumentarActionPerformed

    private void txtdisrutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdisrutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdisrutActionPerformed

    private void cmbdisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdisminuirActionPerformed
        Calendar fecha = Calendar.getInstance();
        String fecha2=(fecha.get(Calendar.DATE)+ "-"+(fecha.get(Calendar.MONTH) + 1)+ "-"+ fecha.get(Calendar.YEAR));
        String c = txtdepto2.getText();
        Double c2=Double.parseDouble(c);					
        Double porcen=((c2/100)+1);
        double factor=0.0077777;
        int gratif = 270000;
        double calulograt= (4.75 * gratif)/12;
        int num = 11091;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MENOR A 283312
        int num2 = 6806;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 283312 Y MENOR A 413808
        int num3 = 2151;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 413808 Y MENOR A 645400
        int num4 = 0;
        double porc=12.85;//Porcentaje de AFP capital
        double porcen_afp_cap=(porc/100);
        double porc2=12.89;//Porcentaje de AFP cupum
        double porcen_afp_cup=(porc2/100);
        double porc3=12.68;//Porcentaje de AFP habitat
        double porcen_afp_hab=(porc3/100);
        double porc4=11.82;//Porcentaje de AFP plan vital
        double porcen_afp_plan=(porc4/100);
        double porc5=12.86;//Porcentaje de AFP provida
        double porcen_afp_pro=(porc5/100);
        double porc6=12.18;//Porcentaje de AFP modelo
        double porcen_afp_mod=(porc6/100);
         //calculo salud fonasa
        double fon=7;
        double porcen_fonasa=(fon/100);
        //calculo isapre
        double uf = 26798.14;
        int vac = 0;
        //Cálculo de seguro de cesantía
        double seguro = 0.6;
        double totalseg = seguro/100;      
        
        String basef="";
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
        String base16="";
        String base17="";
        String base18="";
        String base19="";
        String base20="";
        String base21="";
        String base22="";
        
        basef="UPDATE TabSue Set FECHA='"+fecha2+"' WHERE DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base="UPDATE TabSue Set SueldoBase=SueldoBase/"+porcen+" WHERE DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";  //gon getSelectedItem() se ve el contenido en palabras del combobox y con el getSelectedIndex() se ve el indice del contenido
        base2="UPDATE TabSue Set MONTO_HORAS_EXTRAS=SueldoBase*(NUM_HORAS_EXTRAS*"+factor+") WHERE DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base3="UPDATE TabSue Set GRATIFICACIÓN="+calulograt+" WHERE GRATIFICACIÓN<(SueldoBase*0.25) AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base4="UPDATE TabSue Set GRATIFICACIÓN=(SueldoBase*0.25) WHERE GRATIFICACIÓN>(SueldoBase*0.25) AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base5="UPDATE TabSue Set BASE_IMPONIBLE=(SueldoBase+MONTO_HORAS_EXTRAS+BONOS+GRATIFICACIÓN) WHERE DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base6="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num+" WHERE BASE_IMPONIBLE<=283312 AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base7="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num2+" WHERE BASE_IMPONIBLE>283312 AND BASE_IMPONIBLE<=413808 AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base8="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num3+" WHERE BASE_IMPONIBLE>413808 AND BASE_IMPONIBLE<=645400 AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base9="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num4+" WHERE BASE_IMPONIBLE>645400 AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base10="UPDATE TabSue Set TOTAL_HABERES=(BASE_IMPONIBLE+MONTO_CARGAS_FAMILIARES+MOVILIZACIÓN+COLACIÓN) WHERE DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base11="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cap+" WHERE AFP='CAPITAL' AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base12="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cup+" WHERE AFP='CUPRUM' AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base13="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_hab+" WHERE AFP='HABITAT' AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base14="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_plan+" WHERE AFP='PLANVITAL' AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base15="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_pro+" WHERE AFP='PROVIDA' AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base16="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_mod+" WHERE AFP='MODELO' AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base17="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+" WHERE DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'"; 
        base18="UPDATE TabSue Set EXCEDENTE_SALUD="+vac+" WHERE SALUD='FONASA' AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base19="UPDATE TabSue Set MONTO_SALUD=ISAPRE_UF_TRABAJADOR*"+uf+", EXCEDENTE_SALUD="+vac+" WHERE BASE_IMPONIBLE*"+porcen_fonasa+"<ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA' AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base20="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+", EXCEDENTE_SALUD=MONTO_SALUD-(ISAPRE_UF_TRABAJADOR*"+uf+") WHERE BASE_IMPONIBLE*"+porcen_fonasa+">ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA' AND DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base21="UPDATE TabSue Set SEGURO_CESANTIA=BASE_IMPONIBLE*"+totalseg+" WHERE DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        base22="UPDATE TabSue Set SUELDO_LIQUIDO=TOTAL_HABERES-(MONTO_AFP+MONTO_SALUD+SEGURO_CESANTIA) WHERE DEPARTAMENTO='"+cbbdepto2.getSelectedItem()+"'";
        
        System.out.println(basef);
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
        System.out.println(base16);
        System.out.println(base17);
        System.out.println(base18);
        System.out.println(base19);
        System.out.println(base20);
        System.out.println(base21);
        System.out.println(base22);
        
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            Statement st=db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            Statement st=connection.createStatement();
            st.execute(basef);
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
            st.execute(base16);
            st.execute(base17);
            st.execute(base18);
            st.execute(base19);
            st.execute(base20);
            st.execute(base21);
            st.execute(base22);
            //System.out.println("campo modificado");
            JOptionPane.showMessageDialog(null,"Datos actualizados");
            db.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        //ingreso de sueldo liquido a la tabla ventas
        Statement st = null;        
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query ="";
        query= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='VENTAS'";
        ResultSet res = null; 
        int pre2=0;
        int rut=0;
        try {
            res = st.executeQuery(query);  
           
            while(res.next()){               
                 pre2 = res.getInt("SUELDO_LIQUIDO");
                 rut = res.getInt("RUT");
                 String cons=""; 
                 cons="UPDATE TabVen Set SUELDO_LIQUIDO3="+pre2+" WHERE RUT="+rut+"";
                 st.execute(cons);
                 System.out.println(pre2);
                 System.out.println(rut);
            }         
            
        }
         catch (SQLException ex) { 
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ingreso de sueldo liquido a la tabla produccion
        Statement st2 = null; 
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion2 = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st2=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query2 ="";
        query2= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='PRODUCCION'";
        ResultSet res2 = null; 
        int pre3=0;
        int rut2=0;
        try {
            res2 = st2.executeQuery(query2);  
           
            while(res2.next()){               
                 pre3 = res2.getInt("SUELDO_LIQUIDO"); 
                 rut2 = res2.getInt("RUT");
                 String cons2="";
                 cons2="UPDATE TabPro Set SUELDO_LIQUIDO2="+pre3+" WHERE RUT="+rut2+"";
                 st2.execute(cons2);
                 System.out.println(pre3);
                 System.out.println(rut2);
            }           
        }
         catch (SQLException ex) { 
            Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ingreso de sueldo liquido a la tabla contabilidad
        Statement st3 = null;
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion3 = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st3=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query3 ="";
        query3= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='CONTABILIDAD'";
        ResultSet res3 = null; 
        int pre4=0;
        int rut3=0;
        try {
            res3 = st3.executeQuery(query3);  
           
            while(res3.next()){               
                pre4 = res3.getInt("SUELDO_LIQUIDO");
                rut3 = res3.getInt("RUT");
                String cons3="";
                cons3="UPDATE TabCon Set SUELDO_LIQUIDO1="+pre4+" WHERE RUT="+rut3+"";
                st3.execute(cons3);
                System.out.println(pre4);
                System.out.println(rut3);
            }            
        }
         catch (SQLException ex) { 
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbdisminuirActionPerformed

    private void cmbingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbingresarActionPerformed
        Calendar fecha = Calendar.getInstance();
        String fecha2=(fecha.get(Calendar.DATE)+ "-"+(fecha.get(Calendar.MONTH) + 1)+ "-"+ fecha.get(Calendar.YEAR));
        String rut = txtrut.getText();
        int rut2 = Integer.parseInt(rut);
        String c = txtporcenrut.getText();
        Double c2=Double.parseDouble(c);					
        Double porcen=((c2/100)+1);
        double factor=0.0077777;
        int gratif = 270000;
        double calulograt= (4.75 * gratif)/12;
        int num = 11091;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MENOR A 283312
        int num2 = 6806;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 283312 Y MENOR A 413808
        int num3 = 2151;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 413808 Y MENOR A 645400
        int num4 = 0;
        double porc=12.85;//Porcentaje de AFP capital
        double porcen_afp_cap=(porc/100);
        double porc2=12.89;//Porcentaje de AFP cupum
        double porcen_afp_cup=(porc2/100);
        double porc3=12.68;//Porcentaje de AFP habitat
        double porcen_afp_hab=(porc3/100);
        double porc4=11.82;//Porcentaje de AFP plan vital
        double porcen_afp_plan=(porc4/100);
        double porc5=12.86;//Porcentaje de AFP provida
        double porcen_afp_pro=(porc5/100);
        double porc6=12.18;//Porcentaje de AFP modelo
        double porcen_afp_mod=(porc6/100);
        //calculo salud fonasa
        double fon=7;
        double porcen_fonasa=(fon/100);
        //calculo isapre
        double uf = 26798.14;
        int vac = 0;
        //Cálculo de seguro de cesantía
        double seguro = 0.6;
        double totalseg = seguro/100;      
        
        String basef="";
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
        String base16="";
        String base17="";
        String base18="";
        String base19="";
        String base20="";
        String base21="";
        String base22="";
        
        basef="UPDATE TabSue Set FECHA='"+fecha2+"' WHERE RUT="+rut2+"";
        base="UPDATE TabSue Set SueldoBase=SueldoBase*"+porcen+" WHERE RUT="+rut2+"";  
        base2="UPDATE TabSue Set MONTO_HORAS_EXTRAS=SueldoBase*(NUM_HORAS_EXTRAS*"+factor+") WHERE RUT="+rut2+"";
        base3="UPDATE TabSue Set GRATIFICACIÓN="+calulograt+" WHERE GRATIFICACIÓN<(SueldoBase*0.25) AND RUT="+rut2+"";
        base4="UPDATE TabSue Set GRATIFICACIÓN=(SueldoBase*0.25) WHERE GRATIFICACIÓN>(SueldoBase*0.25) AND RUT="+rut2+"";
        base5="UPDATE TabSue Set BASE_IMPONIBLE=(SueldoBase+MONTO_HORAS_EXTRAS+BONOS+GRATIFICACIÓN) WHERE RUT="+rut2+"";
        base6="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num+" WHERE BASE_IMPONIBLE<=283312 AND RUT="+rut2+"";
        base7="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num2+" WHERE BASE_IMPONIBLE>283312 AND BASE_IMPONIBLE<=413808 AND RUT="+rut2+"";
        base8="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num3+" WHERE BASE_IMPONIBLE>413808 AND BASE_IMPONIBLE<=645400 AND RUT="+rut2+"";
        base9="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num4+" WHERE BASE_IMPONIBLE>645400 AND RUT="+rut2+"";
        base10="UPDATE TabSue Set TOTAL_HABERES=(BASE_IMPONIBLE+MONTO_CARGAS_FAMILIARES+MOVILIZACIÓN+COLACIÓN) WHERE RUT="+rut2+"";
        base11="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cap+" WHERE AFP='CAPITAL' AND RUT="+rut2+"";
        base12="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cup+" WHERE AFP='CUPRUM' AND RUT="+rut2+"";
        base13="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_hab+" WHERE AFP='HABITAT' AND RUT="+rut2+"";
        base14="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_plan+" WHERE AFP='PLANVITAL' AND RUT="+rut2+"";
        base15="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_pro+" WHERE AFP='PROVIDA' AND RUT="+rut2+"";
        base16="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_mod+" WHERE AFP='MODELO' AND RUT="+rut2+"";
        base17="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+" WHERE RUT="+rut2+""; 
        base18="UPDATE TabSue Set EXCEDENTE_SALUD="+vac+" WHERE SALUD='FONASA' AND RUT="+rut2+"";
        base19="UPDATE TabSue Set MONTO_SALUD=ISAPRE_UF_TRABAJADOR*"+uf+", EXCEDENTE_SALUD="+vac+" WHERE BASE_IMPONIBLE*"+porcen_fonasa+"<ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA' AND RUT="+rut2+"";
        base20="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+", EXCEDENTE_SALUD=MONTO_SALUD-(ISAPRE_UF_TRABAJADOR*"+uf+") WHERE BASE_IMPONIBLE*"+porcen_fonasa+">ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA' AND RUT="+rut2+"";
        base21="UPDATE TabSue Set SEGURO_CESANTIA=BASE_IMPONIBLE*"+totalseg+" WHERE RUT="+rut2+"";
        base22="UPDATE TabSue Set SUELDO_LIQUIDO=TOTAL_HABERES-(MONTO_AFP+MONTO_SALUD+SEGURO_CESANTIA) WHERE RUT="+rut2+"";
        
        System.out.println(basef);
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
        System.out.println(base16);
        System.out.println(base17);
        System.out.println(base18);
        System.out.println(base19);
        System.out.println(base20);
        System.out.println(base21);
        System.out.println(base22);
        
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            Statement st=db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            Statement st=connection.createStatement();
            st.execute(basef);
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
            st.execute(base16);
            st.execute(base17);
            st.execute(base18);
            st.execute(base19);
            st.execute(base20);
            st.execute(base21);
            st.execute(base22);
            //System.out.println("campo modificado");
            JOptionPane.showMessageDialog(null,"Datos actualizados");
            db.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        //ingreso de sueldo liquido a la tabla ventas
        Statement st = null;        
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query ="";
        query= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='VENTAS'";
        ResultSet res = null; 
        int pre2=0;
        int rut3=0;
        try {
            res = st.executeQuery(query);  
           
            while(res.next()){               
                 pre2 = res.getInt("SUELDO_LIQUIDO");
                 rut3 = res.getInt("RUT");
                 String cons=""; 
                 cons="UPDATE TabVen Set SUELDO_LIQUIDO3="+pre2+" WHERE RUT="+rut3+"";
                 st.execute(cons);
                 System.out.println(pre2);
                 System.out.println(rut3);
            }         
            
        }
         catch (SQLException ex) { 
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ingreso de sueldo liquido a la tabla produccion
        Statement st2 = null; 
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion2 = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st2=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query2 ="";
        query2= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='PRODUCCION'";
        ResultSet res2 = null; 
        int pre3=0;
        int rut4=0;
        try {
            res2 = st2.executeQuery(query2);  
           
            while(res2.next()){               
                 pre3 = res2.getInt("SUELDO_LIQUIDO"); 
                 rut4 = res2.getInt("RUT");
                 String cons2="";
                 cons2="UPDATE TabPro Set SUELDO_LIQUIDO2="+pre3+" WHERE RUT="+rut4+"";
                 st2.execute(cons2);
                 System.out.println(pre3);
                 System.out.println(rut4);
            }           
        }
         catch (SQLException ex) { 
            Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ingreso de sueldo liquido a la tabla contabilidad
        Statement st3 = null;
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion3 = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st3=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query3 ="";
        query3= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='CONTABILIDAD'";
        ResultSet res3 = null; 
        int pre4=0;
        int rut5=0;
        try {
            res3 = st3.executeQuery(query3);  
           
            while(res3.next()){               
                pre4 = res3.getInt("SUELDO_LIQUIDO");
                rut5 = res3.getInt("RUT");
                String cons3="";
                cons3="UPDATE TabCon Set SUELDO_LIQUIDO1="+pre4+" WHERE RUT="+rut5+"";
                st3.execute(cons3);
                System.out.println(pre4);
                System.out.println(rut5);
            }            
        }
         catch (SQLException ex) { 
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbingresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Calendar fecha = Calendar.getInstance();
        String fecha2=(fecha.get(Calendar.DATE)+ "-"+(fecha.get(Calendar.MONTH) + 1)+ "-"+ fecha.get(Calendar.YEAR));
        String rut = txtrut.getText();
        int rut2 = Integer.parseInt(rut);
        String c = txtdisrut.getText();
        Double c2=Double.parseDouble(c);					
        Double porcen=((c2/100)+1);
        double factor=0.0077777;
        int gratif = 270000;
        double calulograt= (4.75 * gratif)/12;
        int num = 11091;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MENOR A 283312
        int num2 = 6806;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 283312 Y MENOR A 413808
        int num3 = 2151;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 413808 Y MENOR A 645400
        int num4 = 0;
        double porc=12.85;//Porcentaje de AFP capital
        double porcen_afp_cap=(porc/100);
        double porc2=12.89;//Porcentaje de AFP cupum
        double porcen_afp_cup=(porc2/100);
        double porc3=12.68;//Porcentaje de AFP habitat
        double porcen_afp_hab=(porc3/100);
        double porc4=11.82;//Porcentaje de AFP plan vital
        double porcen_afp_plan=(porc4/100);
        double porc5=12.86;//Porcentaje de AFP provida
        double porcen_afp_pro=(porc5/100);
        double porc6=12.18;//Porcentaje de AFP modelo
        double porcen_afp_mod=(porc6/100);
        //calculo salud fonasa
        double fon=7;
        double porcen_fonasa=(fon/100);
        //calculo isapre
        double uf = 26798.14;
        int vac = 0;
        //Cálculo de seguro de cesantía
        double seguro = 0.6;
        double totalseg = seguro/100;      
        
        String basef="";
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
        String base16="";
        String base17="";
        String base18="";
        String base19="";
        String base20="";
        String base21="";
        String base22="";
        
        basef="UPDATE TabSue Set FECHA='"+fecha2+"' WHERE RUT="+rut2+"";
        base="UPDATE TabSue Set SueldoBase=SueldoBase*"+porcen+" WHERE RUT="+rut2+"";  
        base2="UPDATE TabSue Set MONTO_HORAS_EXTRAS=SueldoBase*(NUM_HORAS_EXTRAS*"+factor+") WHERE RUT="+rut2+"";
        base3="UPDATE TabSue Set GRATIFICACIÓN="+calulograt+" WHERE GRATIFICACIÓN<(SueldoBase*0.25) AND RUT="+rut2+"";
        base4="UPDATE TabSue Set GRATIFICACIÓN=(SueldoBase*0.25) WHERE GRATIFICACIÓN>(SueldoBase*0.25) AND RUT="+rut2+"";
        base5="UPDATE TabSue Set BASE_IMPONIBLE=(SueldoBase+MONTO_HORAS_EXTRAS+BONOS+GRATIFICACIÓN) WHERE RUT="+rut2+"";
        base6="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num+" WHERE BASE_IMPONIBLE<=283312 AND RUT="+rut2+"";
        base7="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num2+" WHERE BASE_IMPONIBLE>283312 AND BASE_IMPONIBLE<=413808 AND RUT="+rut2+"";
        base8="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num3+" WHERE BASE_IMPONIBLE>413808 AND BASE_IMPONIBLE<=645400 AND RUT="+rut2+"";
        base9="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num4+" WHERE BASE_IMPONIBLE>645400 AND RUT="+rut2+"";
        base10="UPDATE TabSue Set TOTAL_HABERES=(BASE_IMPONIBLE+MONTO_CARGAS_FAMILIARES+MOVILIZACIÓN+COLACIÓN) WHERE RUT="+rut2+"";
        base11="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cap+" WHERE AFP='CAPITAL' AND RUT="+rut2+"";
        base12="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cup+" WHERE AFP='CUPRUM' AND RUT="+rut2+"";
        base13="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_hab+" WHERE AFP='HABITAT' AND RUT="+rut2+"";
        base14="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_plan+" WHERE AFP='PLANVITAL' AND RUT="+rut2+"";
        base15="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_pro+" WHERE AFP='PROVIDA' AND RUT="+rut2+"";
        base16="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_mod+" WHERE AFP='MODELO' AND RUT="+rut2+"";
        base17="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+" WHERE RUT="+rut2+""; 
        base18="UPDATE TabSue Set EXCEDENTE_SALUD="+vac+" WHERE SALUD='FONASA' AND RUT="+rut2+"";
        base19="UPDATE TabSue Set MONTO_SALUD=ISAPRE_UF_TRABAJADOR*"+uf+", EXCEDENTE_SALUD="+vac+" WHERE BASE_IMPONIBLE*"+porcen_fonasa+"<ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA' AND RUT="+rut2+"";
        base20="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+", EXCEDENTE_SALUD=MONTO_SALUD-(ISAPRE_UF_TRABAJADOR*"+uf+") WHERE BASE_IMPONIBLE*"+porcen_fonasa+">ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA' AND RUT="+rut2+"";
        base21="UPDATE TabSue Set SEGURO_CESANTIA=BASE_IMPONIBLE*"+totalseg+" WHERE RUT="+rut2+"";
        base22="UPDATE TabSue Set SUELDO_LIQUIDO=TOTAL_HABERES-(MONTO_AFP+MONTO_SALUD+SEGURO_CESANTIA) WHERE RUT="+rut2+"";
        
        System.out.println(basef);
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
        System.out.println(base16);
        System.out.println(base17);
        System.out.println(base18);
        System.out.println(base19);
        System.out.println(base20);
        System.out.println(base21);
        System.out.println(base22);
        
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            Statement st=db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            Statement st=connection.createStatement();
            st.execute(basef);
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
            st.execute(base16);
            st.execute(base17);
            st.execute(base18);
            st.execute(base19);
            st.execute(base20);
            st.execute(base21);
            st.execute(base22);
            //System.out.println("campo modificado");
            JOptionPane.showMessageDialog(null,"Datos actualizados");
            db.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        //ingreso de sueldo liquido a la tabla ventas
        Statement st = null;        
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query ="";
        query= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='VENTAS'";
        ResultSet res = null; 
        int pre2=0;
        int rut3=0;
        try {
            res = st.executeQuery(query);  
           
            while(res.next()){               
                 pre2 = res.getInt("SUELDO_LIQUIDO");
                 rut3 = res.getInt("RUT");
                 String cons=""; 
                 cons="UPDATE TabVen Set SUELDO_LIQUIDO3="+pre2+" WHERE RUT="+rut3+"";
                 st.execute(cons);
                 System.out.println(pre2);
                 System.out.println(rut3);
            }         
            
        }
         catch (SQLException ex) { 
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ingreso de sueldo liquido a la tabla produccion
        Statement st2 = null; 
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion2 = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st2=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
        }
        String query2 ="";
        query2= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='PRODUCCION'";
        ResultSet res2 = null; 
        int pre3=0;
        int rut4=0;
        try {
            res2 = st2.executeQuery(query2);  
           
            while(res2.next()){               
                 pre3 = res2.getInt("SUELDO_LIQUIDO"); 
                 rut4 = res2.getInt("RUT");
                 String cons2="";
                 cons2="UPDATE TabPro Set SUELDO_LIQUIDO2="+pre3+" WHERE RUT="+rut4+"";
                 st2.execute(cons2);
                 System.out.println(pre3);
                 System.out.println(rut4);
            }           
        }
         catch (SQLException ex) { 
            Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //ingreso de sueldo liquido a la tabla contabilidad
        Statement st3 = null;
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            instruccion3 = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st3=connection.createStatement();
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query3 ="";
        query3= "select RUT,SUELDO_LIQUIDO from TabSue WHERE DEPARTAMENTO='CONTABILIDAD'";
        ResultSet res3 = null; 
        int pre4=0;
        int rut5=0;
        try {
            res3 = st3.executeQuery(query3);  
           
            while(res3.next()){               
                pre4 = res3.getInt("SUELDO_LIQUIDO");
                rut5 = res3.getInt("RUT");
                String cons3="";
                cons3="UPDATE TabCon Set SUELDO_LIQUIDO1="+pre4+" WHERE RUT="+rut5+"";
                st3.execute(cons3);
                System.out.println(pre4);
                System.out.println(rut5);
            }            
        }
         catch (SQLException ex) { 
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbdeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbdeptoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cbdepto.setSelectedIndex(0);
        cbbdepto2.setSelectedIndex(0);
        txtdepto.setText("");
        txtdepto2.setText("");
        txtrut.setText("");
        txtporcenrut.setText("");
        txtdisrut.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        menuprincipal TR=new menuprincipal();        
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(actualizacionsueldobase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(actualizacionsueldobase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(actualizacionsueldobase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(actualizacionsueldobase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new actualizacionsueldobase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbdepto2;
    private javax.swing.JComboBox<String> cbdepto;
    private javax.swing.JButton cmbaumentar;
    private javax.swing.JButton cmbdisminuir;
    private javax.swing.JButton cmbingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtdepto;
    private javax.swing.JTextField txtdepto2;
    private javax.swing.JTextField txtdisrut;
    private javax.swing.JTextField txtporcenrut;
    private javax.swing.JTextField txtrut;
    // End of variables declaration//GEN-END:variables
}
