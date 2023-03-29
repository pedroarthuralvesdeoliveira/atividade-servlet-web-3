package pedroarthuralvesdeoliveira.com.github.olamundo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "cabecalhos", value = "/cabecalhos")
public class CabecalhosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Cabeçalhos HTTP</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Cabeçalhos HTTP</h1>");

        out.println("<h2>Host</h2>");
        out.println("<p>" + request.getHeader("Host") + "</p>");

        out.println("<h2>User-Agent</h2>");
        out.println("<p>" + request.getHeader("User-Agent") + "</p>");

        out.println("<h2>Accept-Encoding</h2>");
        out.println("<p>" + request.getHeader("Accept-Encoding") + "</p>");

        out.println("<h2>Accept-Language</h2>");
        Enumeration<String> acceptLanguages = request.getHeaders("Accept-Language");
        while (acceptLanguages.hasMoreElements()) {
            out.println("<p>" + acceptLanguages.nextElement() + "</p>");
        }

        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
