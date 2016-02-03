package ec.ocejwcd.app.examen.cap3;

import javax.servlet.UnavailableException;

/**
 * Created by Miguel on 31/1/2016.
 */
public class ErrorServletConfig extends UnavailableException {
    public ErrorServletConfig(String mensaje){
        super(mensaje);
    }
}
