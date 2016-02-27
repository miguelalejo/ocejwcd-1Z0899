package ec.ocejwcd.app.examen.cap5;

import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImplGenericServletRequestDispatcher extends GenericServlet {
    private static final Logger LOGGER = Logger.getLogger(ImpGenericServletRequestBodyReader.class);
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        LOGGER.info("SERVICE");
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("img/banner/images.png");
        /*Ruta relativa al contexto del SERVLET`*/
        requestDispatcher.forward(servletRequest,servletResponse);
        LOGGER.info("BEFORE FORWARD");
    }
}
