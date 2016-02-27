package ec.ocejwcd.app.examen.cap5;

import ec.ocejwcd.app.examen.comun.Mensaje;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.Cookie;

/**
 * Created by Miguel on 22/2/2016.
 */
public class ImplHttpServletResponseCookie extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(ImplHttpServletResponseCookie.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO GET");
        Cookie cookie = new Cookie("cookie","valor");
        httpServletResponse.addCookie(cookie);
    }

    public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        LOGGER.info("DO POST");
        Cookie[] listaCookies = httpServletRequest.getCookies();
        for(Cookie cookie:listaCookies){
            LOGGER.info(String.format(Mensaje.INFO_COOKIE,cookie.getName(),cookie.getValue(),cookie.getPath()));
        }
    }

}
