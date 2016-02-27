package ec.ocejwcd.app.examen.cap5;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImpGenericServletResponseWriter extends GenericServlet {
    private static final Logger LOGGER = Logger.getLogger(ImpGenericServletResponseWriter.class);
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        LOGGER.info("DO SERVICE");
        Writer writer = servletResponse.getWriter();
        writer.write("HOLA MUNDO");
        LOGGER.info("IS COMMITTED ANTES BUFFER:"+servletResponse.isCommitted());
        servletResponse.flushBuffer();
        //IllegalStateException despues de commit servletResponse.resetBuffer();
        //IllegalStateException despues de commit servletResponse.reset();
        LOGGER.info("IS COMMITTED DESPUES BUFFER:"+servletResponse.isCommitted());
        writer.write("SALUDO");
        LOGGER.info("DO OUT PUT");

    }
}
