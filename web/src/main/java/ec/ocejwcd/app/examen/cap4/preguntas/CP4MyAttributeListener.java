package ec.ocejwcd.app.examen.cap4.preguntas;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletException;

/**
 * Created by Miguel on 8/2/2016.
 */
public class CP4MyAttributeListener implements ServletContextAttributeListener {
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    public void attributeReplaced(ServletContextAttributeEvent scae) /*throws ServletException*/{
        ServletContext context = scae.getServletContext();
        if(scae.getName().equals("important")){
            context.setAttribute(scae.getName(),scae.getValue());
        }
    }
}
