package ec.ocejwcd.app.examen.cap5;

import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;


/**
 * Created by Miguel on 14/2/2016.
 */
public class ImpGenericServletParametro extends GenericServlet {

    private static Logger LOGGER = Logger.getLogger(ImpGenericServletParametro.class);
    public void service(ServletRequest servletRequest, ServletResponse servletResponse){
        LOGGER.info("LOG SERVICE");
        LOGGER.info("LISTA PARAMETROS");
        String[] listaParametros = servletRequest.getParameterValues("tipoApp");
        for(String valorParametro :listaParametros) {
            LOGGER.info("tipoApp:" + valorParametro);
        }
        String tipoApp = servletRequest.getParameter("tipoApp");
        LOGGER.info("tipoApp-Parametro:"+tipoApp);
        LOGGER.info("LISTA NOMBRES PARAMETROS");
        Enumeration listaNombresParametros = servletRequest.getParameterNames();
        while(listaNombresParametros.hasMoreElements()){
            String nombreParametro = (String) listaNombresParametros.nextElement();
            String valorParametro = servletRequest.getParameter(nombreParametro);
            LOGGER.info(String.format(Mensaje.MENSAJE_PARAMETRO,nombreParametro,valorParametro));
        }
        Enumeration listaNombresTodosLosParametros = servletRequest.getParameterNames();
        LOGGER.info("LISTA NOMBRES TODOS LOS PARAMETROS");
        while(listaNombresTodosLosParametros.hasMoreElements()){
            String nombreParametro = (String) listaNombresTodosLosParametros.nextElement();
            String[] listaValoresParametro = servletRequest.getParameterValues(nombreParametro);
            for(String parametros: listaValoresParametro){
                LOGGER.info(String.format(Mensaje.MENSAJE_PARAMETRO,nombreParametro,parametros));
            }

        }
        LOGGER.info("MAPA PARAMETROS");
        Map mapaParametros = servletRequest.getParameterMap();
        Set setKey=mapaParametros.keySet();
        for(Object key:setKey){
            LOGGER.info("Valor key:"+mapaParametros.get(key));
        }
    }
}
