package ec.ocejwcd.app.examen.cap5;
import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
/**
 * Created by Miguel on 27/2/2016.
 */
public class ImplServletRequestAttributeListener implements ServletRequestAttributeListener {
    private static final Logger LOGGER = Logger.getLogger(ImplServletRequestAttributeListener.class);
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent){
        LOGGER.info("ATTRIBUTE ADDED");
        LOGGER.info(String.format(Mensaje.MENSAJE_ATRIBUTO,servletRequestAttributeEvent.getName(),servletRequestAttributeEvent.getValue()));
    }

    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent){
        LOGGER.info("ATTRIBUTE REPLACED");
        LOGGER.info(String.format(Mensaje.MENSAJE_ATRIBUTO,servletRequestAttributeEvent.getName(),servletRequestAttributeEvent.getValue()));
    }

    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent){
        LOGGER.info("ATTRIBUTE REMOVED");
        LOGGER.info(String.format(Mensaje.MENSAJE_ATRIBUTO,servletRequestAttributeEvent.getName(),servletRequestAttributeEvent.getValue()));
    }
}
