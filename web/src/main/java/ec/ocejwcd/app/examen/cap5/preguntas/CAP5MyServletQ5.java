package ec.ocejwcd.app.examen.cap5.preguntas;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;

/**
 * Created by Miguel on 27/2/2016.
 */
public class CAP5MyServletQ5 extends GenericServlet {
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        Enumeration attrNames = null;
        resp.setContentType("text/plain");
        Writer out = resp.getWriter();
        attrNames = req.getAttributeNames();
        while(attrNames.hasMoreElements()){
            String name = (String) attrNames.nextElement();
            Object value = null;
            value = req.getAttribute(name);
            out.write(name+":"+value+"\n");
        }
    }
}
