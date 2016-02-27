package ec.ocejwcd.app.examen.cap5;

import org.apache.log4j.Logger;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImpGenericServletResponseProtocol extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(ImpGenericServletResponseProtocol.class);

    @Override
    public void doGet(HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException {
        LOGGER.info("DO SERVICE");
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.setContentType("image/jpg");
        Locale locale = Locale.FRANCE;
        servletResponse.setLocale(locale);
        Writer  writer = servletResponse.getWriter();
        writer.write("SALUDOS TÍO");
        LOGGER.info("ENCONDING:"+servletResponse.getCharacterEncoding());
        LOGGER.info("CONTENT TYPE:"+servletResponse.getContentType());
        LOGGER.info("SET LOCALE:"+servletResponse.getLocale());


    }
}
