
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name ="HelloWorldServlet", urlPatterns="/hello")
public class HelloWorldServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        if(name== null){
            out.println("Hello World!");
        }else{
            out.println("Hello " + name + " !");
        }
    }
}