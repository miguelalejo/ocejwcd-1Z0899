package ec.ocejwcd.app.examen.cap5;

import ec.ocejwcd.app.examen.entidad.Persona;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Miguel on 14/2/2016.
 */
public class ImpRequestDispatcherAttribute extends GenericServlet {
    private static Logger LOGGER = Logger.getLogger(ImpRequestDispatcherAttribute.class);

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        LOGGER.info("DO GET");
        ServletContext servletContext = getServletContext();
        servletRequest.setAttribute("valor","NombreDato");
        Persona persona = new Persona();
        persona.setNombre("Miguel");
        persona.setEdad(80);
        servletRequest.setAttribute("persona",persona);
        RequestDispatcher requestDispatcher = servletContext.getNamedDispatcher("ImpGenericServletRequestAttribute");
        requestDispatcher.forward(servletRequest,servletResponse);
        LOGGER.info("DISPATCHER");
    }
}