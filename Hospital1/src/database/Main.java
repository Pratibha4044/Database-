//package database;
//import java.sql.*;
//
//public class Main {
//    public static void main(String[] args) {
//        // https://stackoverflow.com/a/27276523
//        String dbname = "jdbc:mysql://localhost:3306/hospital_management_system?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
//        username = "root",
//        password = "";
//        Dbconnect connect = new Dbconnect(dbname, username, password);
//        try {
//            ResultSet res = connect.getData("select  * from doctors");
//            System.out.println("Records from database: ");
//            while (res.next()){ 
//            // checks all the entries from the DB (will not enter while loop if no entries)
//                int Doctor_id= res.getInt("Doctor_id");
//                String Name = res.getString("Name");
//                String Assistant_name = res.getString("Assistant_name");
//                String Specialisation= res.getString("Specialisation");
//                int Contact_no= res.getInt("Contact_no");
//                Date Visiting_hours= res.getDate("Visiting_hours");
//                System.out.printf("Doctor_id : %s\nName: %s\nAssistant_name : %s\nSpecialisation : %s\nContact_no : %s\nVisiting_hours : %s\n",Doctor_id,Name,Assistant_name,Specialisation,Contact_no,Visiting_hours );
//            }
//        } catch (SQLException ex) {
//            System.out.println("Fetching error: ");
//            ex.printStackTrace();
//        }
//    }
//}
//
