package ec.ocejwcd.app.examen.cap4;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Miguel on 7/2/2016.
 */
public class MimeType extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(MimeType.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO GET");
        ServletContext servletContext = getServletContext();
        String pdf = servletContext.getMimeType("/pdf/pearson-vue.pdf");
        String txt = servletContext.getMimeType("/txt/texto.txt");
        String jpg = servletContext.getMimeType("/img/icons/jsf.jpg");
        String noExisteArchivo = servletContext.getMimeType("/img/noExisteArchivo.tbl");
        String noExisteArchivoFormatoConocido = servletContext.getMimeType("/img/noExisteArchivo.html");
        PrintWriter writer = httpServletResponse.getWriter();
        writer.write("PDF:"+pdf);
        writer.println();
        writer.write("TXT:"+txt);
        writer.println();
        writer.write("JPG:"+jpg);
        writer.println();
        writer.write("N/A:"+noExisteArchivo);
        writer.println();
        writer.write("N/A:"+noExisteArchivoFormatoConocido);
    }
}
