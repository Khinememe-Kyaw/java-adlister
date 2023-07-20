
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServelt", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        if(name == null){
            out.println("<h>Hello World!</h>");
        }else{
            out.println("<h>Hello, " + name + "!</h>");
        }
    }
}