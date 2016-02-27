package ec.ocejwcd.app.examen.cap5;

import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.GenericServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImplGenericServletRequestDispatcherCookie extends HttpServlet {
    private static final Logger LOGGER =Logger.getLogger(ImplGenericServletRequestDispatcherCookie.class);
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("SERVICE");
        Cookie[] listaCookies = httpServletRequest.getCookies();
        for(Cookie cookie : listaCookies){
            LOGGER.info(String.format(Mensaje.INFO_COOKIE,cookie.getName(),cookie.getValue(),cookie.getPath()));
        }
    }
}
