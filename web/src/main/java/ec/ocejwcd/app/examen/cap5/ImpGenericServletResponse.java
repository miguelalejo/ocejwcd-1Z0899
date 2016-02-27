package ec.ocejwcd.app.examen.cap5;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;

import javax.servlet.*;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImpGenericServletResponse extends GenericServlet {
    private static final Logger LOGGER = Logger.getLogger(ImpGenericServletResponse.class);
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        LOGGER.info("DO SERVICE");
        ServletOutputStream servletOutputStream = servletResponse.getOutputStream();
        ServletContext servletContext = getServletContext();
        InputStream servletInputStream =  servletContext.getResourceAsStream("/img/ocejwcd.jpg");
        byte []imagen= IOUtils.toByteArray(servletInputStream);
        servletResponse.setContentType("image/jpg");
        servletResponse.setContentLength(imagen.length);
        servletInputStream.read(imagen);
        servletOutputStream.write(imagen);
        servletOutputStream.flush();
        LOGGER.info("DO OUT PUT");

    }
}
