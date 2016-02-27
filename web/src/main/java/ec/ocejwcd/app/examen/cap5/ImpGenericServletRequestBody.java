package ec.ocejwcd.app.examen.cap5;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImpGenericServletRequestBody extends GenericServlet {
    private static final Logger LOGGER = Logger.getLogger(ImpGenericServletRequestBody.class);
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        LOGGER.info("SERVICE");
        ServletInputStream inputStream = servletRequest.getInputStream();
        byte[]imagen= IOUtils.toByteArray(inputStream);
        inputStream.read(imagen);
        OutputStream outputStream=servletResponse.getOutputStream();
        servletResponse.setContentType("image/jpg");
        servletResponse.setContentLength(imagen.length);
        outputStream.write(imagen);
    }
}
