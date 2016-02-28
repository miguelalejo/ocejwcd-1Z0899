package ec.ocejwcd.app.examen.cap5.preguntas;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Enumeration;

/**
 * Created by Miguel on 27/2/2016.
 */
public class CAP5MyServletQ6 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("<p>Welcome "+ name +"</p>");
        resp.setContentType("text/html");
        out.flush();
        resp.sendRedirect("/ImplHttpServletResponseCookie");
    }
}
