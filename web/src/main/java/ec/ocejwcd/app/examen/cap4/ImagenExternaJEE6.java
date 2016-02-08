package ec.ocejwcd.app.examen.cap4;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Miguel on 5/2/2016.
 */
public class ImagenExternaJEE6 extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(ImagenExternaJEE6.class);
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("SERVICE");
        ServletContext servletContext = getServletContext().getContext("/webModule");
        try {
            URL url = servletContext.getResource("/img/javaee6.png");
            String file = url.getFile().substring(1);
            Path path = Paths.get(file);
            byte[]imagen = Files.readAllBytes(path);
            httpServletResponse.setContentType("image/jpg");
            httpServletResponse.setContentLength(imagen.length);
            httpServletResponse.getOutputStream().write(imagen);
        } catch (MalformedURLException e) {
            LOGGER.error(e);
        }
    }
}
