package ec.ocejwcd.app.examen.cap4.preguntas;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Miguel on 8/2/2016.
 */
public class CP4MyServletQ16 extends GenericServlet {
    public void service(ServletRequest req, ServletResponse resp) throws IOException {
        String lang = null;
        lang = getServletContext().getInitParameter("language");
        resp.getWriter().println("LANG:" + lang);
    }
}
