package ec.ocejwcd.app.examen.cap4;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import org.apache.commons.io.IOUtils;
/**
 * Created by Miguel on 7/2/2016.
 */
public class ContenidoRequestDispatcher extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(ContenidoRequestDispatcher.class);

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO GET");
        InputStream inputStream = getServletContext().getResourceAsStream("/img/icons/common/java.png");
        byte[]imagen=IOUtils.toByteArray(inputStream);
        inputStream.read(imagen);
        OutputStream outputStream = httpServletResponse.getOutputStream();
        httpServletResponse.setContentType("image/png");
        httpServletResponse.setContentLength(imagen.length);
        outputStream.write(imagen);
    }
}
