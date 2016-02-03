package ec.ocejwcd.app.examen.cap4;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Miguel on 2/2/2016.
 */
public class ContextInformation extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(ContextInformation.class);

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("DO GET");
        ServletContext servletContext = getServletContext();
        LOGGER.info("Servlet Context Name: "+servletContext.getServletContextName());
        LOGGER.info("Real Path: "+servletContext.getRealPath("index.jsp"));
        Set listaDirectorios = servletContext.getResourcePaths("./img");
        Iterator iterator = listaDirectorios.iterator();
        while(iterator.hasNext()){
            String ruta = (String)iterator.next();
            LOGGER.info("ruta:"+ruta);
        }
    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("DO POST HERE");
        ServletContext servletContext = getServletContext();
        LOGGER.info("DO POST CONTEXT");
        ServletContext extServletContext =  servletContext.getContext("/webModule");
        LOGGER.info("Servlet Context Name: "+extServletContext.getServletContextName());
        LOGGER.info("Real Path: "+extServletContext.getRealPath("index.jsp"));
        Set listaDirectorios = extServletContext.getResourcePaths("img");
        Iterator iterator = listaDirectorios.iterator();
        while(iterator.hasNext()){
            String ruta = (String)iterator.next();
            LOGGER.info("ruta:"+ruta);
            LOGGER.info("rutaReal:"+extServletContext.getRealPath(ruta));
        }

    }
}
