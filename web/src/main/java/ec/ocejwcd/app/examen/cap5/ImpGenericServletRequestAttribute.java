package ec.ocejwcd.app.examen.cap5;

import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * Created by Miguel on 14/2/2016.
 */
public class ImpGenericServletRequestAttribute extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(ImpGenericServletRequestAttribute.class);
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        LOGGER.info("DO GET");
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

    public void doPost(HttpServletRequest req, HttpServletResponse res){
        LOGGER.info("DO POST");
        req.setAttribute("ATTRIBUTO",10);
        req.removeAttribute("ATRIBUTO");
        req.setAttribute("ATRIBUTO 2",100);
        req.setAttribute("ATRIBUTO 2",888);
        req.setAttribute("ATRIBUTO 2",null);
        req.removeAttribute("valor");

    }
}
