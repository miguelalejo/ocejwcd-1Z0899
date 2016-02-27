package ec.ocejwcd.app.examen.cap5;

import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Enumeration;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImpHttpServletRequestHeader extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(ImpHttpServletRequestHeader.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String nombreCabeceraLenguaje = "LENGUAJE";
        String cabeceraLenguaje = httpServletRequest.getHeader(nombreCabeceraLenguaje);
        LOGGER.info("CABECERA LENGUAJE:"+cabeceraLenguaje);
        String nombreSinCabercera = "SINCABECERA";
        String sinCabecera = httpServletRequest.getHeader(nombreSinCabercera);
        LOGGER.info("SIN CABECERA:"+sinCabecera);
        Enumeration listaValoresCabecera = httpServletRequest.getHeaders("CODIFICACION");
        while(listaValoresCabecera.hasMoreElements()){
            LOGGER.info("VALORES CODIFICAION:"+listaValoresCabecera.nextElement());
        }
        Enumeration listaNombresCabecera = httpServletRequest.getHeaderNames();
        while(listaNombresCabecera.hasMoreElements()){
            String nombreCabecera = (String) listaNombresCabecera.nextElement();
            Enumeration listaValoresCab = httpServletRequest.getHeaders(nombreCabecera);
            while(listaValoresCab.hasMoreElements()){
                LOGGER.info(String.format(Mensaje.MENSAJE_CABECERA_VALOR,nombreCabecera,listaValoresCab.nextElement()));
            }
        }
        String nombreCabeceraEntera = "ENTERO";
        int numero = httpServletRequest.getIntHeader(nombreCabeceraEntera);
        LOGGER.info("ENTERO:"+numero);
        String nombreCabeceraFecha = "FECHA";
        long fecha = httpServletRequest.getDateHeader(nombreCabeceraFecha);
        LOGGER.info("FECHA:"+new Date(fecha));
    }
}
