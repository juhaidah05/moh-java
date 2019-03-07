package model;


import java.sql.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class Model {
    public Statement getStmt(){
    Connection con = null;
    Statement stmt = null;
  
         try{
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "");
         stmt = con.createStatement();
        
        
     } catch (Exception e) {
         System.out.println("Berlaku Error");
         System.out.println(e.getMessage());
         e.printStackTrace();
     } 
        return stmt;
    
    } 
}
