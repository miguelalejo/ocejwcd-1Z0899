package ec.ocejwcd.app.examen.cap5;

import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImpHttpServletCookie extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(ImpHttpServletCookie.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        LOGGER.info("DO GET");
        RequestDispatcher requestDispatcherCookie = httpServletRequest.getRequestDispatcher("/ImplGenericServletRequestDispatcherCookie");
        Cookie galleta = new Cookie("GALLETA","VALOR GALLETA");
        httpServletResponse.addCookie(galleta);
        Cookie jdk = new Cookie("JDK","1.7");
        httpServletResponse.addCookie(jdk);
        Cookie jdk8 = new Cookie("JDK","1.8");
        httpServletResponse.addCookie(jdk8);
        LOGGER.info("COOKIES");
        requestDispatcherCookie.forward(httpServletRequest,httpServletResponse);
    }
}
