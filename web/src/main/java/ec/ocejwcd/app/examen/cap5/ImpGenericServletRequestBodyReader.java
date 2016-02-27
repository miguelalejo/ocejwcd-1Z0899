package ec.ocejwcd.app.examen.cap5;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import javax.servlet.GenericServlet;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.*;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImpGenericServletRequestBodyReader extends GenericServlet {
    private static final Logger LOGGER = Logger.getLogger(ImpGenericServletRequestBodyReader.class);
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        LOGGER.info("SERVICE");
        Reader reader = servletRequest.getReader();
        Writer writer = servletResponse.getWriter();
        int caracter= 0;
        while((caracter = reader.read())!=-1){
            char c = (char)caracter;
            writer.write(c);
            LOGGER.info("TEXTO:"+c);
        }
        writer.close();
    }
}
