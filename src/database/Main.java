package database;
import java.sql.*;

public class Main {
public static void main(String[] args) {
        String dbname = "jdbc:mysql://localhost:3306/hospital_management_system",
        username = "root",
        password = "";
        Dbconnect connect = new Dbconnect(dbname, username, password);
        try {
            ResultSet res = connect.getData("select  * from doctors");
            System.out.println("Records from database: ");
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
        } catch (SQLException ex) {
            System.out.println("Fetching error: ");
            ex.printStackTrace();
        }
        }
    }
}

