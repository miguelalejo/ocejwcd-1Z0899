package ec.ocejwcd.app.examen.cap3.preguntas;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServlet;

/**
 * Created by Miguel on 2/2/2016.
 */
public class CP3MyServletQ16 extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(CP3MyServletQ16.class);

    public void init(){
        LOGGER.debug("In init");
    }

  /* @Override
    public void doGet(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse)throws ServletException{
     ERROR ESTA LINEA   Writer out = httpServletResponse.getWriter();
        out.write("In get method");
    }*/

}