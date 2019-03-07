

import model.StudentModel;
import java.io.IOException;//dari JDK
import java.io.PrintWriter;//dari JDK
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; // dari JAR file
import javax.servlet.annotation.WebServlet; // dari JAR file
import javax.servlet.http.HttpServlet; // dari JAR file
import javax.servlet.http.HttpServletRequest; // dari JAR file
import javax.servlet.http.HttpServletResponse; // dari JAR file
import model.StudentModel;


@WebServlet(urlPatterns = {"/student"})
public class StudentController extends HttpServlet {
    
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
    ServletException,IOException
    {
        //Set response content type
        response.setContentType("text/html");
        //Actual logic goes here
        PrintWriter out=response.getWriter();
        int studId = Integer.parseInt(request.getParameter("id"));
        StudentModel stud = new StudentModel().getOne(studId);
        //out.println("<h1>"+this.message+nama+"</h1>");
        request.setAttribute("studId", stud);// forward to JSP
        RequestDispatcher dispatch = request.getRequestDispatcher("student_details.jsp");
        request.setAttribute("stud", stud);
        dispatch.forward(request, response);
    }
    
    
}
