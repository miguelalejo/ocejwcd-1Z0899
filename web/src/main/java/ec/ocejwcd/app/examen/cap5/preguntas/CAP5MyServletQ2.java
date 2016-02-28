package ec.ocejwcd.app.examen.cap5.preguntas;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by Miguel on 27/2/2016.
 */
public class CAP5MyServletQ2 extends GenericServlet {
    public void service(ServletRequest req, ServletResponse resp) throws ServletException {
        String lang=null;
        lang = (String)req.getAttribute("languaje");
        if(lang!=null&&lang.equals("en")){
            throw new ServletException("Unsupported Languaje");
        }
    }
}
