package ec.ocejwcd.app.examen.cap4;

import org.apache.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Miguel on 7/2/2016.
 */
public class RequestDispatcherExterno extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(RequestDispatcherExterno.class);
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        ServletContext contextoExterno = servletContext.getContext("/webModule");
        RequestDispatcher requestDispatcherInfo = contextoExterno.getNamedDispatcher("RequestContextInfo");
        requestDispatcherInfo.include(httpServletRequest,httpServletResponse);
    }
}
