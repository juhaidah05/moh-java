/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pengguna PC 15
 */
@WebServlet(urlPatterns = {"/film"})
public class FilmServlet extends HttpServlet {

  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        // connect to MySQL database
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PrintWriter out = response.getWriter();
        //list all film title and descr
        //try..catch = exception/err handling
        // code berada dlm try, catch bila berlaku error
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "");
         stmt = con.createStatement();
         String sql = "SELECT * FROM film";
         rs = stmt.executeQuery(sql);
         out.print("<table border='1'>");
         out.print("<tr>");
         out.print("<td>ID</td>");
         out.print("<td>Title</td>");
         out.print("</tr>");
         out.print("<tr>"); 
         while(rs.next()){
             int id = rs.getInt("film_id");
             out.print("<tr>");
             out.print("<td>" + id + "</td>");
             out.print("<td>" + rs.getString("title") + "</td>");
             out.println("</tr>");
             //out.print(rs.getString("title")+ "\t\t");
             //out.println(rs.getString("description"));
         }
         out.print("</table>");
     } catch (Exception e) {
         System.out.println("Berlaku Error");
         System.out.println(e.getMessage());
     } 
        
    }
}
