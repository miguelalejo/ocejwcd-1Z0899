package ec.ocejwcd.app.examen.cap3.preguntas;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Miguel on 2/2/2016.
 */
public class MyServletMethods extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(MyServletMethods.class);

   @Override
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String metodo=httpServletRequest.getMethod();
        LOGGER.info("SERVICE HTTP");
        LOGGER.info("METODO:"+metodo);
    }

    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("DO GET");
    }

    @Override
    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("DO POST");
    }

    @Override
    public void doPut(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("DO PUT");
    }
}