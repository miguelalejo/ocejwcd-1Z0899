package ec.ocejwcd.app.examen.cap4;
import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by Miguel on 7/2/2016.
 */
public class PametroInicioContexto extends HttpServlet {
    private static Logger LOGGER = Logger.getLogger(PametroInicioContexto.class);
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException{
        LOGGER.info("SERVICE");
        ServletContext servletContext = getServletContext();
        Enumeration enumeracionParametros = servletContext.getInitParameterNames();
        while(enumeracionParametros.hasMoreElements()){
            String nombreParametro = (String)enumeracionParametros.nextElement();
            String valorParametro = servletContext.getInitParameter(nombreParametro);
            httpServletResponse.getWriter().println(String.format(Mensaje.MENSAJE_PARAMETRO,nombreParametro,valorParametro));
        }
    }
}
