
import java.io.IOException;//dari JDK
import java.io.PrintWriter;//dari JDK
import javax.servlet.ServletException; // dari JAR file
import javax.servlet.annotation.WebServlet; // dari JAR file
import javax.servlet.http.HttpServlet; // dari JAR file
import javax.servlet.http.HttpServletRequest; // dari JAR file
import javax.servlet.http.HttpServletResponse; // dari JAR file


@WebServlet(urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {
    private String message;
    

    public void init() throws ServletException{
       //Do required initialization
       message = "Hello World..";
    }

 
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
    ServletException,IOException
    {
        //Set response content type
        response.setContentType("text/html");
        //Actual logic goes here
        PrintWriter out=response.getWriter();
        String nama = request.getParameter("nama");
        out.println("<h1>"+this.message+nama+"</h1>");
    }
    
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws 
    ServletException,IOException
    {
       
        String nama = request.getParameter("nama");
        int umur = Integer.parseInt(request.getParameter("umur"));
        PrintWriter out = response.getWriter();
        out.println("<h1>"+nama+" "+umur+"</h1>");
    }
}
