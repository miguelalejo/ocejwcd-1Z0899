package ec.ocejwcd.app.examen.cap4;
import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextAttributeEvent;
/**
 * Created by Miguel on 8/2/2016.
 */
public class ServletContextAttributeListenerImp implements ServletContextAttributeListener {
    private static final Logger LOGGER = Logger.getLogger(ServletContextListenerImp.class);
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent){
        LOGGER.info("ATRIBUTO AGREGADO");
        String nombre = servletContextAttributeEvent.getName();
        Object valor = servletContextAttributeEvent.getValue();
        LOGGER.info(String.format(Mensaje.MENSAJE_PARAMETRO,nombre,valor));
    }

    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent){
        LOGGER.info("ATRIBUTO REEMPLAZADO");
        String nombre = servletContextAttributeEvent.getName();
        Object valor = servletContextAttributeEvent.getValue();
        LOGGER.info(String.format(Mensaje.MENSAJE_PARAMETRO,nombre,valor));
    }

    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent){
        LOGGER.info("ATRIBUTO ELIMINADO");
        String nombre = servletContextAttributeEvent.getName();
        Object valor = servletContextAttributeEvent.getValue();
        LOGGER.info(String.format(Mensaje.MENSAJE_PARAMETRO,nombre,valor));
    }
}
