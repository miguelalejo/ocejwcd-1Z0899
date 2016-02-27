package ec.ocejwcd.app.examen.cap5;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Miguel on 16/2/2016.
 */
public class ImpHttpServletSessionManagment extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(ImpHttpServletSessionManagment.class);

    public void doPost(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        LOGGER.info("DO POST");
        LOGGER.info("Requestes Session Id:"+httpServletRequest.getRequestedSessionId());
        HttpSession httpSession = httpServletRequest.getSession();
        if(httpSession.isNew()){
            LOGGER.info("SESSION NUEVA");
        }
    }

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        LOGGER.info("DO GET");
        if(httpServletRequest.isRequestedSessionIdFromCookie()){
            LOGGER.info("isRequestedSessionIdFromCookie");
        }
        if(httpServletRequest.isRequestedSessionIdFromURL()){
            LOGGER.info("isRequestedSessionIdFromURL");
        }
        if(httpServletRequest.isRequestedSessionIdValid()){
            LOGGER.info("isRequestedSessionIdValid");
        }
    }

    public void doPut(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        LOGGER.info("DO PUT");
        HttpSession httpSession = httpServletRequest.getSession(false);
        if(httpSession == null){
            LOGGER.info("NO SE HA CREADO LA SESSION");
        }
        else{
            LOGGER.info("Session Id:"+httpServletRequest.getRequestedSessionId());
        }
    }

}
