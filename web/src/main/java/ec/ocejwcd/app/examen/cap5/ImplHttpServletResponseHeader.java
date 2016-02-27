package ec.ocejwcd.app.examen.cap5;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Enumeration;

/**
 * Created by Miguel on 22/2/2016.
 */
public class ImplHttpServletResponseHeader extends HttpServlet {
    private static final Logger LOGGER =Logger.getLogger(ImplHttpServletResponseHeader.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("DO GET");
        httpServletResponse.addHeader("cabceraA","valorA");
        httpServletResponse.addHeader("cabceraB","valorB");
        httpServletResponse.setHeader("cabeceraC","cabeceraC");
        httpServletResponse.setHeader("cabeceraD","15"+20);
        httpServletResponse.setHeader("cabeceraCliente","cliente");
        httpServletResponse.addIntHeader("cabeceraEntera",10);
        httpServletResponse.setIntHeader("cabeceraEnteraDigito",10);
        httpServletResponse.addDateHeader("cabeceraFecha",new Date().getTime());
        httpServletResponse.setDateHeader("cabeceraFechaNueva",new Date().getTime());
        httpServletResponse.addHeader("cabceraDuplicada","dupA");
        httpServletResponse.addHeader("cabceraDuplicada","dupB");
        httpServletResponse.addHeader("cabceraDuplicada","dupC");
    }

    public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        LOGGER.info("DO POST");
        if(httpServletResponse.containsHeader("cabeceraA")){
            LOGGER.info(httpServletRequest.getHeader("cabeceraA"));
        }
        if(httpServletResponse.containsHeader("cabeceraB")){
            LOGGER.info(httpServletRequest.getHeader("cabeceraB"));
        }
        if(httpServletResponse.containsHeader("cabeceraEntera")){
            LOGGER.info(httpServletRequest.getIntHeader("cabeceraEntera"));
        }
        if(httpServletResponse.containsHeader("cabeceraFecha")){
            LOGGER.info(httpServletRequest.getDateHeader("cabeceraFecha"));
        }
        if(httpServletResponse.containsHeader("cabeceraCliente")){
            LOGGER.info(httpServletRequest.getHeader("cabeceraCliente"));
        }
    }

    public void doDelete(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        LOGGER.info("DO DELETE");
        httpServletResponse.setHeader("cabeceraA",null);
        httpServletResponse.setHeader("cabeceraB",null);
    }

    public void doPut(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        LOGGER.info("DO PUT");
        Enumeration listaNombresCabeceras = httpServletRequest.getHeaderNames();
        while(listaNombresCabeceras.hasMoreElements()){
            String header = (String) listaNombresCabeceras.nextElement();
            Enumeration listaCabeceras = httpServletRequest.getHeaders(header);
            while(listaCabeceras.hasMoreElements()){
                LOGGER.info("CABECERAS:"+listaCabeceras.nextElement());
            }
        }
    }
}