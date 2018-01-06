package proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;
import java.net.URISyntaxException;

public class sueldos extends javax.swing.JFrame {

    private int n;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private Object instruccion;

    public sueldos() {
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

        spsueldo = new javax.swing.JScrollPane();
        horasextras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        txthoras = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbhoras = new javax.swing.JButton();
        cmblimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bono = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtrut2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmblimpiar2 = new javax.swing.JButton();
        ckcumpleaños = new javax.swing.JCheckBox();
        ckproduccion = new javax.swing.JCheckBox();
        ckfiestas = new javax.swing.JCheckBox();
        cknavidad = new javax.swing.JCheckBox();
        ckventas = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        cmbbono = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        cmbbonofijo = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        gratifiacion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cmbingresar2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtsueldobase = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmblimpiar3 = new javax.swing.JButton();
        prevision = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbtotalhaberes = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtcolacion = new javax.swing.JTextField();
        txtmovilizacion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        cmbcolacion = new javax.swing.JButton();
        cmblimpiar6 = new javax.swing.JButton();
        salud = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtuf = new javax.swing.JTextField();
        jluf = new javax.swing.JLabel();
        cmbisapre = new javax.swing.JButton();
        cmblimpiar4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        cmbsueldototal = new javax.swing.JButton();
        cmbmenu = new javax.swing.JButton();
        cmbsalir = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESO HORAS EXTRAS");

        jLabel2.setText("Ingrese rut sin dígito verificador");

        jLabel3.setText("Ingrese total de horas trabajadas");

        jLabel4.setText(" Hrs.");

        cmbhoras.setText("INGRESAR");
        cmbhoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbhorasActionPerformed(evt);
            }
        });

        cmblimpiar.setText("LIMPIAR");
        cmblimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese rut sin dígito verificador");

        jLabel7.setText("SELECCIONE BONO ADICIONAL");

        cmblimpiar2.setText("LIMPIAR");
        cmblimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblimpiar2ActionPerformed(evt);
            }
        });

        ckcumpleaños.setText("Cumpleaños");

        ckproduccion.setText("Por producción");

        ckfiestas.setText("Fiestras patrias");

        cknavidad.setText("Navidad");

        ckventas.setText("Meta por ventas");

        jLabel5.setText("INGRESO DE BONOS");

        cmbbono.setText("INGRESAR");
        cmbbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbonoActionPerformed(evt);
            }
        });

        jLabel23.setText("Ingreso de bonos fijos");

        cmbbonofijo.setText("INGRESAR");
        cmbbonofijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbonofijoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bonoLayout = new javax.swing.GroupLayout(bono);
        bono.setLayout(bonoLayout);
        bonoLayout.setHorizontalGroup(
            bonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(bonoLayout.createSequentialGroup()
                .addGroup(bonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bonoLayout.createSequentialGroup()
                        .addGroup(bonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bonoLayout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ckfiestas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cknavidad, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bonoLayout.createSequentialGroup()
                                .addComponent(ckventas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckproduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ckcumpleaños, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bonoLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtrut2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbbono, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmblimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbbonofijo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bonoLayout.setVerticalGroup(
            bonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bonoLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGroup(bonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bonoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(bonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckfiestas)
                            .addComponent(cknavidad)
                            .addComponent(jLabel23)
                            .addComponent(cmbbonofijo))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addGroup(bonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtrut2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(bonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckventas)
                            .addComponent(ckproduccion)
                            .addComponent(ckcumpleaños))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bonoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbbono)
                        .addGap(26, 26, 26)
                        .addComponent(cmblimpiar2)
                        .addGap(29, 29, 29)))
                .addGap(18, 18, 18))
        );

        jLabel8.setText("INGRESO DE GRATIFICACION LEGAL");

        cmbingresar2.setText("INGRESAR");
        cmbingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbingresar2ActionPerformed(evt);
            }
        });

        jLabel10.setText("Ingrese sueldo base legal     *");

        jLabel9.setText("* Cálculo obligatorio, el valor tiene que ir sin puntos Ej. 270000");

        jLabel11.setText("CÁLCULO AUTOMÁTICO DEL TOTAL HABERES");

        cmblimpiar3.setText("LIMPIAR");
        cmblimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblimpiar3ActionPerformed(evt);
            }
        });

        prevision.setText("** Si no conoce los valores previsionales, ingrese a www.previred.com");
        prevision.setToolTipText("");

        jLabel12.setText("* Cálculo obligatorio del total haberes");

        cmbtotalhaberes.setText("TOTAL HABERES");
        cmbtotalhaberes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtotalhaberesActionPerformed(evt);
            }
        });

        jLabel13.setText("INGRESO DE COLACIÓN Y MOVILIZACIÓN");

        jLabel14.setText("Colación");

        jLabel15.setText("Movilización");

        cmbcolacion.setText("INGRESAR");
        cmbcolacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcolacionActionPerformed(evt);
            }
        });

        cmblimpiar6.setText("LIMPIAR");
        cmblimpiar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblimpiar6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gratifiacionLayout = new javax.swing.GroupLayout(gratifiacion);
        gratifiacion.setLayout(gratifiacionLayout);
        gratifiacionLayout.setHorizontalGroup(
            gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addComponent(jSeparator7)
            .addGroup(gratifiacionLayout.createSequentialGroup()
                .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(gratifiacionLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmovilizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcolacion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101)
                        .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmblimpiar6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbcolacion, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(gratifiacionLayout.createSequentialGroup()
                .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prevision, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gratifiacionLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbtotalhaberes, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gratifiacionLayout.createSequentialGroup()
                        .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gratifiacionLayout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtsueldobase, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbingresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmblimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        gratifiacionLayout.setVerticalGroup(
            gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gratifiacionLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(31, 31, 31)
                .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtsueldobase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbingresar2))
                .addGap(23, 23, 23)
                .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmblimpiar3))
                .addGap(10, 10, 10)
                .addComponent(prevision)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(36, 36, 36)
                .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtmovilizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbcolacion))
                .addGap(18, 18, 18)
                .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtcolacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmblimpiar6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(33, 33, 33)
                .addGroup(gratifiacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cmbtotalhaberes))
                .addGap(33, 33, 33)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel16.setText("INGRESO DE VALORES EN SALUD");

        jLabel19.setText("ISAPRE");

        jLabel22.setText("Ingrese UF del mes Ej.: 26798.14  NO  26.798,14");

        jluf.setText("** Si no conoce el valor de la UF,  ingrese a www.previred.com");

        cmbisapre.setText("INGRESAR ISAPRE");
        cmbisapre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbisapreActionPerformed(evt);
            }
        });

        cmblimpiar4.setText("LIMPIAR");
        cmblimpiar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmblimpiar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout saludLayout = new javax.swing.GroupLayout(salud);
        salud.setLayout(saludLayout);
        saludLayout.setHorizontalGroup(
            saludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saludLayout.createSequentialGroup()
                .addGroup(saludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(saludLayout.createSequentialGroup()
                        .addGroup(saludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(saludLayout.createSequentialGroup()
                                .addComponent(jluf, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86))
                            .addGroup(saludLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtuf, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(saludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbisapre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmblimpiar4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        saludLayout.setVerticalGroup(
            saludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saludLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addGroup(saludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbisapre))
                .addGap(23, 23, 23)
                .addGroup(saludLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jluf)
                    .addComponent(cmblimpiar4))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel26.setText("CÁLCULO TOTAL DE SUELDOS");

        cmbsueldototal.setText("CALCULAR SUELDO TOTAL");
        cmbsueldototal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsueldototalActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbsueldototal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(cmbmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(cmbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbsueldototal)
                    .addComponent(cmbmenu)
                    .addComponent(cmbsalir))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout horasextrasLayout = new javax.swing.GroupLayout(horasextras);
        horasextras.setLayout(horasextrasLayout);
        horasextrasLayout.setHorizontalGroup(
            horasextrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horasextrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(horasextrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(horasextrasLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(horasextrasLayout.createSequentialGroup()
                        .addGroup(horasextrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gratifiacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(horasextrasLayout.createSequentialGroup()
                                .addGroup(horasextrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(horasextrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(horasextrasLayout.createSequentialGroup()
                                        .addComponent(txthoras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(96, 96, 96)
                                .addGroup(horasextrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbhoras, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmblimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(horasextrasLayout.createSequentialGroup()
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        horasextrasLayout.setVerticalGroup(
            horasextrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(horasextrasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(horasextrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbhoras))
                .addGap(18, 18, 18)
                .addGroup(horasextrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txthoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmblimpiar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gratifiacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        spsueldo.setViewportView(horasextras);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spsueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(spsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmbsalirActionPerformed

    private void cmbmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmenuActionPerformed
        menuprincipal TR=new menuprincipal();
        TR.setVisible(true);
        dispose();
    }//GEN-LAST:event_cmbmenuActionPerformed

    private void cmbsueldototalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsueldototalActionPerformed
        //Calculo de sueldo total
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

        //calculos afp
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
        //Cálculo de seguro de cesantía
        double seguro = 0.6;
        double totalseg = seguro/100;

        base="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cap+" WHERE AFP='CAPITAL'";
        base2="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_cup+" WHERE AFP='CUPRUM'";
        base3="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_hab+" WHERE AFP='HABITAT'";
        base4="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_plan+" WHERE AFP='PLANVITAL'";
        base5="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_pro+" WHERE AFP='PROVIDA'";
        base6="UPDATE TabSue Set MONTO_AFP=BASE_IMPONIBLE*"+porcen_afp_mod+" WHERE AFP='MODELO'";
        base7="UPDATE TabSue Set SEGURO_CESANTIA=BASE_IMPONIBLE*"+totalseg+"";
        base8="UPDATE TabSue Set SUELDO_LIQUIDO=TOTAL_HABERES-(MONTO_AFP+MONTO_SALUD+SEGURO_CESANTIA)";         

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

        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            Statement stingre=connection.createStatement();
            
            stingre.execute(base);
            stingre.execute(base2);
            stingre.execute(base3);
            stingre.execute(base4);
            stingre.execute(base5);
            stingre.execute(base6);
            stingre.execute(base7);
            stingre.execute(base8);    
            JOptionPane.showMessageDialog(null,"Datos actualizados");
        }
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
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
        
        //CREACIÓN DE TABLA
        try{
                Calendar fecha = Calendar.getInstance();
                String fecha2=((fecha.get(Calendar.MONTH) + 1)+"_"+ fecha.get(Calendar.YEAR));
                String fecha3;
                
                fecha3=fecha2+"historico";
                System.out.println(fecha3);               
                
                /*String con=".\\bd\\empleados.accdb";
                Connection db = DriverManager.getConnection ("jdbc:ucanaccess://"+con);
                Statement st = db.createStatement();*/
                String url = "jdbc:mysql://localhost:3306/empleados";
                String user = "root";
                String pass = "";
                Connection connection = DriverManager.getConnection(url, user,pass);
                Statement st4=connection.createStatement();
                //String cons="CREATE TABLE "+fecha3+" (RUT Integer, NOMBRE VARCHAR(30), DEPARTAMENTO VARCHAR(30), FECHA VARCHAR(30), SueldoBase INTEGER, NUM_HORAS_EXTRAS INTEGER, MONTO_HORAS_EXTRAS FLOAT, BONOS INTEGER, GRATIFICACIÓN FLOAT, BASE_IMPONIBLE FLOAT, NumCargasFam INTEGER, MONTO_CARGAS_FAMILIARES INTEGER, MOVILIZACIÓN INTEGER, COLACIÓN INTEGER, TOTAL_HABERES FLOAT, AFP VARCHAR(30), MONTO_AFP FLOAT, SALUD VARCHAR(30), ISAPRE_UF_TRABAJADOR FLOAT, MONTO_SALUD FLOAT, EXCEDENTE_SALUD FLOAT, SEGURO_CESANTIA FLOAT, SUELDO_LIQUIDO FLOAT)";
                st4.execute("CREATE TABLE "+fecha3+" (RUT Integer, NOMBRE VARCHAR(30), DEPARTAMENTO VARCHAR(30), FECHA VARCHAR(30), SueldoBase INTEGER, NUM_HORAS_EXTRAS INTEGER, MONTO_HORAS_EXTRAS FLOAT, BONOS INTEGER, GRATIFICACIÓN FLOAT, BASE_IMPONIBLE FLOAT, NumCargasFam INTEGER, MONTO_CARGAS_FAMILIARES INTEGER, MOVILIZACIÓN INTEGER, COLACIÓN INTEGER, TOTAL_HABERES FLOAT, AFP VARCHAR(30), MONTO_AFP FLOAT, SALUD VARCHAR(30), ISAPRE_UF_TRABAJADOR FLOAT, MONTO_SALUD FLOAT, EXCEDENTE_SALUD FLOAT, SEGURO_CESANTIA FLOAT, SUELDO_LIQUIDO FLOAT)");
                System.out.println("Tabla ha sido creada");
            } 
            catch (SQLException ex) {
            //Logger.getLogger(grafico.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println(ex);
            }
        
        //INGRESO DE DATOS A LA TABLA
        Statement st5 = null;
        Statement st6 = null;
        try {
            /*String con=".\\bd\\empleados.accdb";
            Connection db=DriverManager.getConnection ("jdbc:ucanaccess://"+con);
            intr = db.createStatement();*/
            String url = "jdbc:mysql://localhost:3306/empleados";
            String user = "root";
            String pass = "";
            Connection connection = DriverManager.getConnection(url, user,pass);
            st5=connection.createStatement();
            st6=connection.createStatement();
            
            String query6 ="";
            int sue,sue5,sue6,sue7,sue8,sue9,sue10,sue11,sue12,sue13,sue14,sue15,sue17,sue19,sue20,sue21,sue22,sue23=0;
            String sue2,sue3,sue4,sue16,sue18=""; 
            Calendar fecha = Calendar.getInstance();
            String fecha2=((fecha.get(Calendar.MONTH) + 1)+"_"+ fecha.get(Calendar.YEAR));
            String fecha3;
            fecha3=fecha2+"historico";
            
            query6= "select * from TabSue";
            ResultSet result = null;       
            result = st5.executeQuery(query6);
            
            while(result.next()){
                sue = result.getInt("RUT");
                sue2 = result.getString("NOMBRE");
                sue3 = result.getString("DEPARTAMENTO");
                sue4 = result.getString("FECHA");
                sue5 = result.getInt("SueldoBase");
                sue6 = result.getInt("NUM_HORAS_EXTRAS");
                sue7 = result.getInt("MONTO_HORAS_EXTRAS");
                sue8 = result.getInt("BONOS");
                sue9 = result.getInt("GRATIFICACIÓN");
                sue10 = result.getInt("BASE_IMPONIBLE");
                sue11 = result.getInt("NumCargasFam");
                sue12 = result.getInt("MONTO_CARGAS_FAMILIARES");
                sue13 = result.getInt("MOVILIZACIÓN");
                sue14 = result.getInt("COLACIÓN");
                sue15 = result.getInt("TOTAL_HABERES");
                sue16 = result.getString("AFP");
                sue17 = result.getInt("MONTO_AFP");
                sue18 = result.getString("SALUD");
                sue19 = result.getInt("ISAPRE_UF_TRABAJADOR");
                sue20 = result.getInt("MONTO_SALUD");
                sue21 = result.getInt("EXCEDENTE_SALUD");
                sue22 = result.getInt("SEGURO_CESANTIA");
                sue23 = result.getInt("SUELDO_LIQUIDO");

                String cons3="";
                cons3=("INSERT INTO "+fecha3+" VALUES("+sue+",'"+sue2+"','"+sue3+"','"+sue4+"',"+sue5+","+sue6+","+sue7+","+sue8+","+sue9+","+sue10+","+sue11+","+sue12+","+sue13+","+sue14+","+sue15+",'"+sue16+"',"+sue17+",'"+sue18+"',"+sue19+","+sue20+","+sue21+","+sue22+","+sue23+")");
                System.out.println(cons3);
                st6.execute(cons3);                

                System.out.println("Datos ingresados");                                
            }
            st5.close();
        } 
        catch (SQLException ex) {
            //Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
           
    }//GEN-LAST:event_cmbsueldototalActionPerformed

    private void cmblimpiar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiar4ActionPerformed
        txtuf.setText("");
    }//GEN-LAST:event_cmblimpiar4ActionPerformed

    private void cmbisapreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbisapreActionPerformed
        String base="";
        String base2="";
        String base3="";
        String base4="";
        
        //calculo salud fonasa
        double fon=7;
        double porcen_fonasa=(fon/100);
        //calculo salud isapre        
        String n4 = txtuf.getText();
        double uf = Double.parseDouble(n4);
        int vac = 0;
        
        base="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+""; 
        base2="UPDATE TabSue Set EXCEDENTE_SALUD="+vac+" WHERE SALUD='FONASA'";
        base3="UPDATE TabSue Set MONTO_SALUD=ISAPRE_UF_TRABAJADOR*"+uf+", EXCEDENTE_SALUD="+vac+" WHERE BASE_IMPONIBLE*"+porcen_fonasa+"<ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA'";
        base4="UPDATE TabSue Set MONTO_SALUD=BASE_IMPONIBLE*"+porcen_fonasa+", EXCEDENTE_SALUD=MONTO_SALUD-(ISAPRE_UF_TRABAJADOR*"+uf+") WHERE BASE_IMPONIBLE*"+porcen_fonasa+">ISAPRE_UF_TRABAJADOR*"+uf+" AND SALUD!='FONASA'";

        System.out.println(base);
        System.out.println(base2);
        System.out.println(base3);
        System.out.println(base4);

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
            JOptionPane.showMessageDialog(null,"Datos actualizados, ingrese otro usuario");
        }
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbisapreActionPerformed

    private void cmblimpiar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiar6ActionPerformed
        txtcolacion.setText("");
        txtmovilizacion.setText("");
    }//GEN-LAST:event_cmblimpiar6ActionPerformed

    private void cmbcolacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcolacionActionPerformed
        //Ingreso de valores de colacion y movilización
        String colacion = txtcolacion.getText();
        int col = Integer.parseInt(colacion);
        String movilizacion = txtmovilizacion.getText();
        int mov = Integer.parseInt(movilizacion);

        String base="";
        String base2="";

        base="UPDATE TabSue Set MOVILIZACIÓN="+mov+"";
        base2="UPDATE TabSue Set COLACIÓN="+col+"";

        System.out.println(base);
        System.out.println(base2);

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

            JOptionPane.showMessageDialog(null,"Datos actualizados");
        }
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbcolacionActionPerformed

    private void cmbtotalhaberesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtotalhaberesActionPerformed
        String base="";
        String base2="";
        String base3="";
        String base4="";
        String base5="";

        int num = 11091;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MENOR A 283312
        int num2 = 6806;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 283312 Y MENOR A 413808
        int num3 = 2151;//VALOR DE LA CARGA CORRESPONDIENTE AL SUELDO BASE MAYOR A 413808 Y MENOR A 645400
        int num4 = 0;
        //calcula el total de los haberes
        base="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num+" WHERE BASE_IMPONIBLE<=283312";
        base2="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num2+" WHERE BASE_IMPONIBLE>283312 AND BASE_IMPONIBLE<=413808";
        base3="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num3+" WHERE BASE_IMPONIBLE>413808 AND BASE_IMPONIBLE<=645400";
        base4="UPDATE TabSue Set MONTO_CARGAS_FAMILIARES=NumCargasFam*"+num4+" WHERE BASE_IMPONIBLE>645400";
        base5="UPDATE TabSue Set TOTAL_HABERES=(BASE_IMPONIBLE+MONTO_CARGAS_FAMILIARES+MOVILIZACIÓN+COLACIÓN)";

        System.out.println(base);
        System.out.println(base2);
        System.out.println(base3);
        System.out.println(base4);
        System.out.println(base5);

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

            JOptionPane.showMessageDialog(null,"Datos actualizados");
        }
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbtotalhaberesActionPerformed

    private void cmblimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiar3ActionPerformed
        txtsueldobase.setText("");
    }//GEN-LAST:event_cmblimpiar3ActionPerformed

    private void cmbingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbingresar2ActionPerformed
        //Ingreso y calculos de fecha, gratificacion y sumas de todos los montos legales para calcular el sueldo imponible.
        Calendar fecha = Calendar.getInstance();
        String fecha2=(fecha.get(Calendar.DATE)+ "-"+(fecha.get(Calendar.MONTH) + 1)+ "-"+ fecha.get(Calendar.YEAR));
        String sueldobase = txtsueldobase.getText();
        int gratif = Integer.parseInt(sueldobase);
        double calulograt= (4.75 * gratif)/12;
        String base="";
        String base2="";
        String base3="";
        String base4="";
        String base5="";
        String base6="";
        String base7="";

        base="UPDATE TabSue Set FECHA='"+fecha2+"'";
        base2="UPDATE TabCon Set FECHA='"+fecha2+"'";
        base3="UPDATE TabPro Set FECHA='"+fecha2+"'";
        base4="UPDATE TabVen Set FECHA='"+fecha2+"'";        
        base5="UPDATE TabSue Set GRATIFICACIÓN="+calulograt+" WHERE GRATIFICACIÓN<(SueldoBase*0.25)";
        base6="UPDATE TabSue Set GRATIFICACIÓN=(SueldoBase*0.25) WHERE GRATIFICACIÓN>(SueldoBase*0.25)";
        base7="UPDATE TabSue Set BASE_IMPONIBLE=(SueldoBase+MONTO_HORAS_EXTRAS+BONOS+GRATIFICACIÓN)";

        System.out.println(base);
        System.out.println(base2);
        System.out.println(base3);
        System.out.println(base4);
        System.out.println(base5);
        System.out.println(base6);
        System.out.println(base7);

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

            JOptionPane.showMessageDialog(null,"Datos actualizados");
        }
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbingresar2ActionPerformed

    private void cmbbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbonoActionPerformed
        String base="";
        String base2="";
        String base3="";
        //calculo bono
        String rut = txtrut2.getText();
        int rut2=Integer.parseInt(rut);
        int res=0;
        String res2 ="";
        if(ckcumpleaños.isSelected()){
            int n = 5000;
            String cumpl = "Cumpleaños";
            res=res+n;
            res2 = res2 +" "+ cumpl;
        }
        if(ckproduccion.isSelected()){
            int n2 = 40000;
            String pro = "Producción";
            res=res+n2;
            res2 = res2 +" "+ pro;
        }
        if(ckventas.isSelected()){
            int n3 = 50000;
            String ven = "Ventas";
            res=res+n3;
            res2 = res2 +" "+ ven;
        }
        if(res>0){
            base="UPDATE TabSue Set BONOS=BONOS+"+res+" WHERE RUT="+rut2+"";
            base2="UPDATE TabBono Set MONTO_BONO=MONTO_BONO+"+res+" WHERE RUT="+rut2+"";
            base3="UPDATE TabBono Set TIPO_DE_BONO= CONCAT(TIPO_DE_BONO,'"+res2+"') WHERE RUT="+rut2+"";
            System.out.println(base);
            System.out.println(base2);
            System.out.println(base3);
            System.out.println();
        }
        else{
            n=0;
            n2=0;
            n3=0;
        }

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
            JOptionPane.showMessageDialog(null,"Datos actualizados, ingresar otro usuario");
        }
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbbonoActionPerformed

    private void cmblimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiar2ActionPerformed
        txtrut2.setText("");
        ckcumpleaños.setSelected(false);
        ckproduccion.setSelected(false);
        ckventas.setSelected(false);
        ckfiestas.setSelected(false);
        cknavidad.setSelected(false);
    }//GEN-LAST:event_cmblimpiar2ActionPerformed

    private void cmblimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmblimpiarActionPerformed
        txtrut.setText("");
        txthoras.setText("");
    }//GEN-LAST:event_cmblimpiarActionPerformed

    private void cmbhorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbhorasActionPerformed
        String base="";
        String base2="";
        //calculo horas extras
        String rut = txtrut.getText();
        int rut2=Integer.parseInt(rut);

        String horas = txthoras.getText();
        int hora=Integer.parseInt(horas);
        double factor=0.0077777;

        double total = hora * factor;
        base="UPDATE TabSue Set NUM_HORAS_EXTRAS="+hora+" WHERE RUT="+rut2+"";
        base2="UPDATE TabSue Set MONTO_HORAS_EXTRAS=SueldoBase*"+total+" WHERE RUT="+rut2+"";
        System.out.println(base);
        System.out.println(base2);

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
            JOptionPane.showMessageDialog(null,"Datos actualizados, ingrese otro usuario");
        }
        catch (SQLException ex) {
            Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbhorasActionPerformed

    private void cmbbonofijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbonofijoActionPerformed
        String base="";
        String base2="";
        String base3="";
        //calculo bono
        
        int res=0;
        String res2 ="";
        
        if(ckfiestas.isSelected()){
            int n4 = 50000;
            String fie = "Fiestas Patrias";
            res=n4;
            res2 = res2 +" "+ fie;
        }
        if(cknavidad.isSelected()){
            int n5 = 80000;
            String nav = "Navidad";
            res=n5;
            res2 = res2 +" "+nav;
        }
        if(res>0){
            base="UPDATE TabSue Set BONOS="+res+"";
            base2="UPDATE TabBono Set MONTO_BONO="+res+"";
            base3="UPDATE TabBono Set TIPO_DE_BONO=CONCAT(TIPO_DE_BONO,'"+res2+"')";
            System.out.println(base);
            System.out.println(base2);
            System.out.println(base3);
        }
        else{
            n4=0;
            n5=0;
        }

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
            JOptionPane.showMessageDialog(null,"Datos actualizados, ingresar otro usuario");
        }
        catch (SQLException ex) {
            //Logger.getLogger(sueldos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }//GEN-LAST:event_cmbbonofijoActionPerformed
    
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
            java.util.logging.Logger.getLogger(sueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sueldos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new sueldos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bono;
    private javax.swing.JCheckBox ckcumpleaños;
    private javax.swing.JCheckBox ckfiestas;
    private javax.swing.JCheckBox cknavidad;
    private javax.swing.JCheckBox ckproduccion;
    private javax.swing.JCheckBox ckventas;
    private javax.swing.JButton cmbbono;
    private javax.swing.JButton cmbbonofijo;
    private javax.swing.JButton cmbcolacion;
    private javax.swing.JButton cmbhoras;
    private javax.swing.JButton cmbingresar2;
    private javax.swing.JButton cmbisapre;
    private javax.swing.JButton cmblimpiar;
    private javax.swing.JButton cmblimpiar2;
    private javax.swing.JButton cmblimpiar3;
    private javax.swing.JButton cmblimpiar4;
    private javax.swing.JButton cmblimpiar6;
    private javax.swing.JButton cmbmenu;
    private javax.swing.JButton cmbsalir;
    private javax.swing.JButton cmbsueldototal;
    private javax.swing.JButton cmbtotalhaberes;
    private javax.swing.JPanel gratifiacion;
    private javax.swing.JPanel horasextras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jluf;
    private javax.swing.JLabel prevision;
    private javax.swing.JPanel salud;
    private javax.swing.JScrollPane spsueldo;
    private javax.swing.JTextField txtcolacion;
    private javax.swing.JTextField txthoras;
    private javax.swing.JTextField txtmovilizacion;
    private javax.swing.JTextField txtrut;
    private javax.swing.JTextField txtrut2;
    private javax.swing.JTextField txtsueldobase;
    private javax.swing.JTextField txtuf;
    // End of variables declaration//GEN-END:variables

    private static class URLabel {

        public URLabel() {
        }

        private void setText(JLabel prevision) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void setURL(String httpswwwpreviredcomwebpreviredindicadores) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
