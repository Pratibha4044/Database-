package database;
import java.sql.*;

public class Dbconnect {
    
private String dbname, username, password;
    private Connection con;
    private Statement stmt;
    private ResultSet res;
    
    public  Dbconnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  // fixed deprecation error
            dbname = "jdbc:mysql://localhost:3306/hospital_management_system"; 
            username = "root";
            password = "";
            con = DriverManager.getConnection(dbname, username, password);
        }catch(Exception ex){
            System.out.println("Connection Error:");
            ex.printStackTrace();
        }
    }
    public void getData(){
        try{
            stmt = con.createStatement();
            String query = "select  * from doctors";
            res = stmt.executeQuery(query);
            System.out.println("Records from database");
            while (res.next()){ 
            // checks all the entries from the DB (will not enter while loop if no entries)
                int Doctor_id= res.getInt("Doctor_id");
                String Name = res.getString("Name");
                 String Assistant_name = res.getString("Assistant_name");
                  String Specialisation= res.getString("Specialisation");
                int Contact_no= res.getInt("Contact_no");
                int Visiting_hours= res.getInt("Visiting_hours");
              System.out.printf("Doctor_id : %s\nName: %s\nAssistant_name : %s\nSpecialisation : %s\nContact_no : %s\nVisiting_hours : %s\n",Doctor_id,Name,Assistant_name,Specialisation,Contact_no,Visiting_hours );
            }
        }catch (Exception ex){
            System.out.println("Fetching Error:");
            ex.printStackTrace();
        }
    }
}




