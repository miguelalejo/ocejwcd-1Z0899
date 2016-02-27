package ec.ocejwcd.app.examen.cap5;

import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Enumeration;

/**
 * Created by Miguel on 14/2/2016.
 */
public class ImpGenericServletRequestAttribute extends GenericServlet {

    private static final Logger LOGGER = Logger.getLogger(ImpGenericServletRequestAttribute.class);
    public void service(ServletRequest req, ServletResponse res){
        LOGGER.info("DO SERVICE");
        String valor = (String)req.getAttribute("valor");
        LOGGER.info("VALOR:"+valor);
        Enumeration listaNombreAtributos = req.getAttributeNames();
        while(listaNombreAtributos.hasMoreElements()){
            String nombre = (String) listaNombreAtributos.nextElement();
            Object atributo = req.getAttribute(nombre);
            LOGGER.info(String.format(Mensaje.MENSAJE_PARAMETRO,nombre,atributo));
        }
        req.removeAttribute("valor");

    }
}
