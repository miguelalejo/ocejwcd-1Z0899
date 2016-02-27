package ec.ocejwcd.app.examen.cap5;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

/**
 * Created by Miguel on 22/2/2016.
 */
public class ImplHttpServletResponseRedirect extends HttpServlet {
    private static Logger LOGGGER = Logger.getLogger(ImplHttpServletResponseRedirect.class);
    private static final Logger LOGGER =Logger.getLogger(ImplHttpServletResponseRedirect.class);
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO GET");
        //httpServletResponse.setStatus(404);
        //httpServletResponse.sendRedirect("error/erro307.jsp");
        // httpServletResponse.sendError(307);
        //httpServletResponse.sendError(404,"OPPS error");
    }

    public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO POST");
        httpServletResponse.sendError(307);
    }

    public void doPut(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO PUT");
        httpServletResponse.sendError(404,"OPPS error");
    }

    public void doDelete(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws IOException {
        LOGGER.info("DO DELETE");
        httpServletResponse.sendRedirect("/error/erro307.jsp");
    }
}