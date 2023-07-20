import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PageViewCounter", urlPatterns = "/count")
public class PageViewCounterServlet extends HttpServlet {
    private int count =0;
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException , IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String reset = req.getParameter("reset");
        if(reset == null){
            count++;
            out.print("<h1> Page View Counting : "+ count+ "</h1>");
        }else{
            count =0;
            out.print("<h1> Page View Counting : "+ count+ "</h1>");
        }
    }
}
