package ec.ocejwcd.app.examen.cap4.preguntas;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Miguel on 8/2/2016.
 */
public class CP4MyServletQ9 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        String title = getServletConfig().getInitParameter("apptitle");
        resp.getWriter().write(title);
    }
}
