package proyecto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import static org.omg.CORBA.ORB.init;

public class grafdepart extends JFrame{
    JPanel panel;
    public grafdepart(){
        setTitle("Grafico por departamento PRODUCCION, VENTA y CONTABILIDAD");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init();
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
    
    private void init(){
        /*try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }*/
        
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
            Logger.getLogger(grafdepart.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        String query ="";
        query= "select * from TabSue WHERE DEPARTAMENTO='PRODUCCION'";
        ResultSet res = null;        
        int cont=0;
        try {
            res = st.executeQuery(query);  
            
            while(res.next()){               
                cont=cont+1;             
            } 
            System.out.println(cont);
        }
         catch (SQLException ex) { 
            Logger.getLogger(grafdepart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query2 ="";
        query2= "select * from TabSue WHERE DEPARTAMENTO='VENTAS'";
        ResultSet res2 = null;        
        int cont2=0;
        try {
            res2 = st.executeQuery(query2);  
            
            while(res2.next()){               
                cont2=cont2+1;             
            } 
            System.out.println(cont2);
        }
         catch (SQLException ex) { 
            Logger.getLogger(grafdepart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query3 ="";
        query3= "select * from TabSue WHERE DEPARTAMENTO='CONTABILIDAD'";
        ResultSet res3 = null;        
        int cont3=0;
        try {
            res3 = st.executeQuery(query3);  
            
            while(res3.next()){               
                cont3=cont3+1;             
            } 
            System.out.println(cont3);
        }
         catch (SQLException ex) { 
            Logger.getLogger(grafdepart.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        panel= new JPanel();
        getContentPane().add(panel);
        //Fuente de datos
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("PRODUCCION", cont);
        data.setValue("VENTAS", cont2);
        data.setValue("CONTABILIDAD", cont3);
        
        //creando el grafico
        JFreeChart chart = ChartFactory.createPieChart(
            "Grafico por departamento PRODUCCION, VENTA y CONTABILIDAD",
            data,
            true,
            true,
            false);
        
        //crear el panel del grafico con ChartPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
        
        db.close();
    }
    
    public static void main(String args[]){
       new grafdepart().setVisible(true);
    }
}

