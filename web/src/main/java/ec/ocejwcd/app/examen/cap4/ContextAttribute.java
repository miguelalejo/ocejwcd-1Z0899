package ec.ocejwcd.app.examen.cap4;

import ec.ocejwcd.app.examen.entidad.Persona;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * Created by Miguel on 2/2/2016.
 */
public class ContextAttribute extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(ContextAttribute.class);

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("DO GET");
        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("SALUDO","HOLA MUNDO");
        servletContext.setAttribute("ATT","ATRIBUTO");
        Persona persona = new Persona();
        persona.setEdad(10);
        persona.setNombre("JOSE");
        servletContext.setAttribute("persona",persona);
    }

    public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        LOGGER.info("DO POST");
        ServletContext servletContext = getServletContext();
        String saludo=(String)servletContext.getAttribute("SALUDO");
        if(saludo!=null){
            LOGGER.info(saludo);
        }
        Persona persona=(Persona)servletContext.getAttribute("persona");
        if(persona!=null){
            LOGGER.info(persona.toString());
        }
        String atributo = (String)servletContext.getAttribute("atributo");
        if (atributo!=null){
            LOGGER.info(atributo);
        }

    }

    public void doOptions(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        LOGGER.info("OPTIONS");
        Enumeration listaAtributos = getServletContext().getAttributeNames();
        while(listaAtributos.hasMoreElements()){
            String nombre = (String)listaAtributos.nextElement();
            LOGGER.info("Nombre:"+nombre);
        }
    }
}
