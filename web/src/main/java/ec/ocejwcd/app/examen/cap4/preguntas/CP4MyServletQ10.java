package ec.ocejwcd.app.examen.cap4.preguntas;

import org.apache.log4j.Logger;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

/**
 * Created by Miguel on 8/2/2016.
 */
public class CP4MyServletQ10 extends GenericServlet{
    private static final Logger LOGGER = Logger.getLogger(CP4MyServletQ10.class);
    public void service(ServletRequest req, ServletResponse resp) throws IOException {
        LOGGER.info("SERVICE");
        Writer out = resp.getWriter();
        Enumeration enume = null;
        enume = getServletConfig().getInitParameterNames();
        /*enume = getInitParameterNames(); */
        while(enume.hasMoreElements()){
            String name = (String)enume.nextElement();
            String value = null;
            value = getInitParameter(name);
            /*value = getServletConfig().getInitParameter(name);*/
            out.write(value+"\n");
            LOGGER.info(value+"\n");
        }
    }
}
