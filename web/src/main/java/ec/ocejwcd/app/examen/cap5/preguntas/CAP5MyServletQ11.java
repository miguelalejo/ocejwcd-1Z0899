package ec.ocejwcd.app.examen.cap5.preguntas;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Miguel on 27/2/2016.
 */
public class CAP5MyServletQ11 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lang=req.getHeader("accept-languaje");
        if(lang==null){
            lang = "en";
        }
        StringBuffer output = new StringBuffer();
        if(lang.startsWith("fr")){
            output.append("Bonjour");
        }else if(lang.startsWith("de")){
            output.append("Gut morgan");
        }else if(lang.startsWith("en-au")){
            output.append("G' day mate");
        }else{
            output.append("Welcome");
        }
        resp.getWriter().write(output.toString());
        resp.flushBuffer();
        resp.setHeader("Content-Language",lang);
        return;
    }
}
