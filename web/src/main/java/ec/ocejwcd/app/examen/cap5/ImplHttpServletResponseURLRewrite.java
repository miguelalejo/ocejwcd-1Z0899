package ec.ocejwcd.app.examen.cap5;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Miguel on 22/2/2016.
 */
public class ImplHttpServletResponseURLRewrite extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(ImplHttpServletResponseURLRewrite.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO GET");
        LOGGER.info("CONTEXT PATH:"+httpServletRequest.getContextPath());
        LOGGER.info("PATH INFO:"+httpServletRequest.getPathInfo());
        LOGGER.info("SERVLET PATH:"+httpServletRequest.getServletPath());
        HttpSession httpSession = httpServletRequest.getSession(false);
        if(httpSession!=null){
            LOGGER.info("ATRIBUTO SESION:"+httpSession.getAttribute("valS"));
        }
        String encodeURL = httpServletResponse.encodeURL(httpServletRequest.getContextPath()+"/index.jsp");
        String encodeRedirectURL = httpServletResponse.encodeRedirectURL(httpServletRequest.getContextPath()+"/index.jsp");
        httpServletResponse.setContentType("text/html");
        httpServletResponse.setCharacterEncoding("UTF-8");
        Writer writer = httpServletResponse.getWriter();
        writer.write("<a href='"+encodeURL+"'>encode URL</a>");
        writer.write("<br/>");
        writer.write("<a href='"+encodeRedirectURL+"'>encode Redirect URL</a>");

    }

    public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        LOGGER.info("DO POST");
        HttpSession httpSession=httpServletRequest.getSession();
        httpSession.setAttribute("valS",10);
    }
}
