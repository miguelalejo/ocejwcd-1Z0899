package ec.ocejwcd.app.examen.cap3.preguntas;
import org.apache.log4j.Logger;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Writer;
import java.io.IOException;
/**
 * Created by Miguel on 2/2/2016.
 */
public class MyServletQ15 extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(MyServletQ15.class);

   @Override
    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)throws IOException{
        Writer out = httpServletResponse.getWriter();
        out.write("In service method");
    }

    @Override
    public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse)throws IOException{
        Writer out = httpServletResponse.getWriter();
        out.write("In get method");
    }

}