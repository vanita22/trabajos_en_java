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

public class graficosalud extends JFrame{
    JPanel panel;
    public graficosalud(){
        setTitle("Gráfico por previsión de salud");
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
            Logger.getLogger(graficosalud.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        String query ="";
        query= "select * from TabSue WHERE SALUD='FONASA'";
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
            Logger.getLogger(graficosalud.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query2 ="";
        query2= "select * from TabSue WHERE SALUD='ISAPRE BANMEDICA'";
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
            Logger.getLogger(graficosalud.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query3 ="";
        query3= "select * from TabSue WHERE SALUD='ISAPRE COLMENA'";
        ResultSet res3 = null;        
        int cont3=0;
        try {
            res3 = st.executeQuery(query3);  
            
            while(res3.next()){               
                cont3=cont2+1;             
            } 
            System.out.println(cont3);
        }
         catch (SQLException ex) { 
            Logger.getLogger(graficosalud.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query4 ="";
        query4= "select * from TabSue WHERE SALUD='ISAPRE CONSALUD'";
        ResultSet res4 = null;        
        int cont4=0;
        try {
            res4 = st.executeQuery(query4);  
            
            while(res4.next()){               
                cont4=cont2+1;             
            } 
            System.out.println(cont4);
        }
         catch (SQLException ex) { 
            Logger.getLogger(graficosalud.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query5 ="";
        query5= "select * from TabSue WHERE SALUD='ISAPRE CRUZ BLANCA'";
        ResultSet res5 = null;        
        int cont5=0;
        try {
            res5 = st.executeQuery(query5);  
            
            while(res5.next()){               
                cont5=cont2+1;             
            } 
            System.out.println(cont5);
        }
         catch (SQLException ex) { 
            Logger.getLogger(graficosalud.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String query6 ="";
        query6= "select * from TabSue WHERE SALUD='ISAPRE VIDA TRES'";
        ResultSet res6 = null;      
        int cont6=0;
        try {
            res6 = st.executeQuery(query6);
            
            while(res6.next()){               
                cont6=cont2+1;             
            } 
            System.out.println(cont6);
        }
         catch (SQLException ex) { 
            Logger.getLogger(graficosalud.class.getName()).log(Level.SEVERE, null, ex);
        }
                
       
        panel= new JPanel();
        getContentPane().add(panel);
        //Fuente de datos
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("FONASA", cont);
        data.setValue("ISAPRE BANMEDICA", cont2);
        data.setValue("ISAPRE COLMENA", cont3);
        data.setValue("ISAPRE CONSALUD", cont4);
        data.setValue("ISAPRE CRUZ BLANCA", cont5);
        data.setValue("ISAPRE VIDA TRES", cont6);
        
        //creando el grafico
        JFreeChart chart = ChartFactory.createPieChart(
            "Gráfico por previsión de salud",
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
       new graficosalud().setVisible(true);
    }
}
