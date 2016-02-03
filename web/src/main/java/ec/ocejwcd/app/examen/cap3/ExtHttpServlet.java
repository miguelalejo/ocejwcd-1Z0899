package ec.ocejwcd.app.examen.cap3;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.UnavailableException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ExtHttpServlet extends HttpServlet {

    public void init() throws ServletException,UnavailableException {
        super.init();
        throw new UnavailableException("Error Unavailable Exception");
    }

    public void service(ServletRequest servletRequest,ServletResponse servletResponse) throws ErrorServletConfig {
        throw new ErrorServletConfig("");
    }

    public void service(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

    public void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

    public void doHead(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

    public void doTrace(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

    public void doPut(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

    public void doDelete(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

    public void doOptions(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){

    }

}
