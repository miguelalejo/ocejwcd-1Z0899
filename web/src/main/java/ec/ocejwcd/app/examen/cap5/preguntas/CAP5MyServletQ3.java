package ec.ocejwcd.app.examen.cap5.preguntas;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Miguel on 27/2/2016.
 */
public class CAP5MyServletQ3 extends GenericServlet {
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        Integer counter = (Integer)req.getAttribute("hitcounter");
        if(counter==null){
            counter=new Integer(1);
        }else{
            counter = counter.intValue()+1;
        }
        req.setAttribute("hitcounter",counter);
        Writer out = resp.getWriter();
        out.write("Visitor number"+counter);
    }
}
