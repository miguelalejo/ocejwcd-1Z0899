package ec.ocejwcd.app.examen.cap4;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Miguel on 7/2/2016.
 */
public class ConfiguracionServlet extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(ConfiguracionServlet.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO GET");
        PrintWriter writer = httpServletResponse.getWriter();
        String nombreServlet = getServletName();
        writer.println("Nombre Servlet:" + nombreServlet);
        ServletContext servletContext = getServletContext();
        writer.println("Nombre Server:" + servletContext.getServerInfo());
        writer.println("Contexto Servlet:" + servletContext.getContextPath());

    }
}
