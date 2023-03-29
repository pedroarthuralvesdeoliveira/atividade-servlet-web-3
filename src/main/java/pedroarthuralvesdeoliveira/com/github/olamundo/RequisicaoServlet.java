package pedroarthuralvesdeoliveira.com.github.olamundo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "requisicao", value = "/requisicao")
public class RequisicaoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String protocol = request.getProtocol();
        String remoteAddress = request.getRemoteAddr();

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Informações da requisição</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Método: " + method + "</p>");
        out.println("<p>URI: " + uri + "</p>");
        out.println("<p>Protocolo: " + protocol + "</p>");
        out.println("<p>Endereço remoto: " + remoteAddress + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
