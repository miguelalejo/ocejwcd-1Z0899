package ec.ocejwcd.app.examen.cap4.preguntas;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Miguel on 8/2/2016.
 */
public class CP4MyServletQ15 extends GenericServlet {
    public void service(ServletRequest req, ServletResponse resp) throws IOException {
        ServletContext context = getServletContext();
        Integer counter = (Integer) context.getAttribute("hitcounter");
        if(counter == null){
            counter = new Integer(1);
        }else{
            counter = new Integer(counter.intValue()+1);
        }
        context.setAttribute("hitcounter",counter);
        Writer writer = resp.getWriter();
        writer.write("Visitor number:"+counter);
    }
}
