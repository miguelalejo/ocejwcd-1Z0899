package ec.ocejwcd.app.examen.cap4;

import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by Miguel on 7/2/2016.
 */
public class ParametroInicioServlet extends HttpServlet {
    private static Logger LOGGER = Logger.getLogger(ParametroInicioServlet.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO GET");
        PrintWriter writer = httpServletResponse.getWriter();
        Enumeration parametros = getInitParameterNames();
        while(parametros.hasMoreElements()){
            String nombre = (String) parametros.nextElement();
            String valor = getInitParameter(nombre);
            writer.println(String.format(Mensaje.MENSAJE_PARAMETRO,nombre,valor));
        }
    }

    public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO POST");
        PrintWriter writer = httpServletResponse.getWriter();
        Enumeration parametros = getServletConfig().getInitParameterNames();
        while(parametros.hasMoreElements()){
            String nombre = (String)parametros.nextElement();
            String valor = getServletConfig().getInitParameter(nombre);
            writer.println(String.format(Mensaje.MENSAJE_PARAMETRO,nombre,valor));
        }
    }



}
