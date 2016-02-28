package ec.ocejwcd.app.examen.cap5;


import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestListener;
import javax.servlet.ServletRequestEvent;
/**
 * Created by Miguel on 27/2/2016.
 */
public class ImplServletRequestListener implements ServletRequestListener {
    private static final Logger LOGGER = Logger.getLogger(ImplServletRequestListener.class);
    public void requestInitialized(ServletRequestEvent servletRequestEvent){
        LOGGER.info("REQUEST INITIALIZED");
        ServletRequest request=servletRequestEvent.getServletRequest();
        LOGGER.info("LOCAL NAME:"+request.getLocalName());
        ServletContext servletContext = servletRequestEvent.getServletContext();
        LOGGER.info("CONTEXT PATH:"+servletContext.getContextPath());
    }

    public void requestDestroyed(ServletRequestEvent servletRequestEvent){
        LOGGER.info("REQUEST DESTROYED");
        ServletRequest request = servletRequestEvent.getServletRequest();
        LOGGER.info("LOCAL NAME:"+request.getLocalName());
        ServletContext servletContext = servletRequestEvent.getServletContext();
        LOGGER.info("CONTEXT PATH:"+servletContext.getContextPath());
    }

}
