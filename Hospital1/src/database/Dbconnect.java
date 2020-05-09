package database;

import java.sql.*;

public class Dbconnect {
    private Connection con;
    
    public  Dbconnect(String url, String username, String password){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  // fixed deprecation error
            con = DriverManager.getConnection(url, username, password);
        }catch(Exception ex){
            System.out.println("Connection Error:");
            ex.printStackTrace();
        }
    }
    public ResultSet getData(String query)throws SQLException {
        ResultSet res = null;
        Statement stmt = con.createStatement();
        res = stmt.executeQuery(query);
        return res;
    }
}




