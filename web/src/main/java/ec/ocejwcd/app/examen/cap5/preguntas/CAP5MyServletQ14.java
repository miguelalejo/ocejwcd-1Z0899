package ec.ocejwcd.app.examen.cap5.preguntas;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Created by Miguel on 27/2/2016.
 */
public class CAP5MyServletQ14 extends GenericServlet {
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        InputStream srm=getServletContext().getResourceAsStream("/myfile.txt");
        PrintWriter out = resp.getWriter();
        out.println("<h3> Expert from file </h3><div>");
        if(srm!=null){
            ServletOutputStream outBin = resp.getOutputStream();
            for(int i=srm.read();i>=0;i=srm.read()){
                outBin.write(i);
            }
        }else{
            out.println("No file available");
        }
        out.println("</div>");
    }
}
