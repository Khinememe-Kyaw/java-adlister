import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

//A user goes to /pizza-order and sees a pizza order form. This form features choices to select the crust type, sauce type,
// size type (use select inputs), toppings (checkboxes), and delivery address (text input). Use System.out.println to output
// the values submitted by the user.
//
//use a POST request on the form
//use one JSP and one servlet
//don't worry about styling

@WebServlet(name = "PizzaServlet", urlPatterns = "/pizza-order")
public class PizzaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza.jsp").forward(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("/pizza.jsp").forward(request, response);
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        String[] toppings = request.getParameterValues("toppings");
        String address = request.getParameter("address");

        System.out.println(String.format("Deliver to: %s.%n%s size.%n%s pizza.%n%s sauce.%nTopped with %s.%n", address, size, crust, sauce, Arrays.toString(toppings)));

    }
}
