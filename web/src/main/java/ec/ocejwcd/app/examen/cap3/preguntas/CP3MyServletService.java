package ec.ocejwcd.app.examen.cap3.preguntas;
import org.apache.log4j.Logger;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Miguel on 2/2/2016.
 */
public class CP3MyServletService extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(CP3MyServletService.class);

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse){
        String protocolo = servletRequest.getProtocol();
        LOGGER.info("SERVICE");
        LOGGER.info(protocolo);
    }

    @Override
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String metodo=httpServletRequest.getMethod();
        LOGGER.info("SERVICE HTTP");
        LOGGER.info(metodo);
    }
}
