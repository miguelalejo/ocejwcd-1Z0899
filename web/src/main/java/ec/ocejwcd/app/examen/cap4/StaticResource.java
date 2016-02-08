package ec.ocejwcd.app.examen.cap4;

import ec.ocejwcd.app.examen.entidad.Persona;
import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Miguel on 3/2/2016.
 */
public class StaticResource extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(StaticResource.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("DO GET");
        ServletContext servletContext = getServletContext();
        try {
            URL url = servletContext.getResource("/img/icons/jsp.jpg");
            String file = url.getFile().substring(1);
            Path path = Paths.get(file);
            byte[] data = Files.readAllBytes(path);
            httpServletResponse.setContentType("image/jpeg");
            httpServletResponse.setContentLength(data.length);
            httpServletResponse.getOutputStream().write(data);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
