package ec.ocejwcd.app.examen.cap4;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Miguel on 7/2/2016.
 */
public class RequestContextInfo extends HttpServlet {

    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        PrintWriter printWriter = httpServletResponse.getWriter();
        ServletContext servletContext = getServletContext();
        printWriter.write("Servlet Name:"+servletContext.getServletContextName());
        printWriter.println();
        printWriter.write("Context Path:"+servletContext.getContextPath());
        printWriter.println();
        printWriter.write("Server Info:"+servletContext.getServerInfo());
    }
}
