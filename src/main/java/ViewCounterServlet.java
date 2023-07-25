
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name="ViewCounterServlet", urlPatterns = "/count")
public class ViewCounterServlet extends HttpServlet {
    private int count =0;
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String reset = request.getParameter("reset");
        if(reset == null){
            count++;
        }else{
            count =0;
        }
        out.println("<html><body>");
        out.println("<h1>View Count is " + count + "<h1>");
        out.println("</body></html>");
    }
}
