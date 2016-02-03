package ec.ocejwcd.app.examen.cap3.preguntas;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Miguel on 2/2/2016.
 */
public class MyServletQ16 extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(MyServletQ16.class);

    public void init(){
        LOGGER.debug("In init");
    }

  /* @Override
    public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse)throws ServletException{
     ERROR ESTA LINEA   Writer out = httpServletResponse.getWriter();
        out.write("In get method");
    }*/

}