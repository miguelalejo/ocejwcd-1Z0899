package ec.ocejwcd.app.examen.cap4;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;
/**
 * Created by Miguel on 8/2/2016.
 */
public class ServletContextListenerImp implements ServletContextListener {
    private static final Logger LOGGER = Logger.getLogger(ServletContextListenerImp.class);
    public void contextInitialized(ServletContextEvent servletContextEvent){
        LOGGER.info("CONTEXTO INICALIZADO");
        ServletContext servletContext = servletContextEvent.getServletContext();
        LOGGER.info("Nombre Contexto Servlet:"+servletContext.getServletContextName());
        servletContext.setAttribute("ATTR_CONTEXTO","WEB");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent){
        LOGGER.info("CONTEXTO DESTRUIDO");
        ServletContext servletContext = servletContextEvent.getServletContext();
        LOGGER.info("ATRIBTUO:"+servletContext.getAttribute("ATTR_CONTEXTO"));
    }
}
