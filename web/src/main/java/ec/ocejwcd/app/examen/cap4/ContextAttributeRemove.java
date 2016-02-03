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
public class ContextAttributeRemove extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(ContextAttributeRemove.class);


    public void doDelete(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        LOGGER.info("DO DELETE");
        ServletContext servletContext = getServletContext();
        servletContext.removeAttribute("SALUDO");
        Persona persona = (Persona) servletContext.getAttribute("persona");
        if (persona != null) {
            LOGGER.info(persona.toString());
        }
        servletContext.removeAttribute("persona");
        Persona personaAtributo = (Persona) servletContext.getAttribute("persona");
        if (personaAtributo != null) {
            LOGGER.info(personaAtributo.toString());
        }
    }


}