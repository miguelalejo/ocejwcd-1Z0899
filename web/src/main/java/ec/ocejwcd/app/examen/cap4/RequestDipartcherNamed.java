package ec.ocejwcd.app.examen.cap4;

import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Miguel on 7/2/2016.
 */
public class RequestDipartcherNamed extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(RequestDipartcherNamed.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        LOGGER.info("DO GET");
        ServletContext servletContext = getServletContext();
        RequestDispatcher requestDispatcher = servletContext.getNamedDispatcher("ContenidoRequestDispatcher");
        requestDispatcher.include(httpServletRequest,httpServletResponse);
        LOGGER.info("FORWARD");
    }
}
