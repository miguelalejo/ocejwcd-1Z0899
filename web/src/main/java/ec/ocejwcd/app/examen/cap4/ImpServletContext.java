package ec.ocejwcd.app.examen.cap4;

import javax.servlet.*;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Set;

/**
 * Created by Miguel on 2/2/2016.
 */
public class ImpServletContext implements ServletContext {

    public String getContextPath(){
        return null;
    }

    public ServletContext getContext(String context){
        return null;
    }

    public int getMajorVersion(){
        return 0;
    }

    public int getMinorVersion(){
        return 0;
    }

    public String getMimeType(String type){
        return null;
    }

    public Set getResourcePaths(String path){
        return null;
    }

    public URL getResource(String url){
        return null;
    }

    public InputStream getResourceAsStream(String path){
        return null;
    }

    public RequestDispatcher getRequestDispatcher(String path){
        return null;
    }

    public RequestDispatcher getNamedDispatcher(String  nombre){
        return null;
    }

    public String getRealPath(String path){
        return null;
    }

    public String getServerInfo(){
        return null;
    }

    public String getInitParameter(String nombre){
        return null;
    }

    public Enumeration getInitParameterNames(){
        return null;
    }

    public Object getAttribute(String nombre){
        return null;
    }

    public void setAttribute(String nombre, Object valor){

    }

    public void removeAttribute(String nombre){

    }

    public Enumeration getAttributeNames(){
        return null;
    }

    public String getServletContextName(){
        return null;
    }

    public Servlet getServlet(String s) throws ServletException {
        return null;
    }

    public Enumeration getServlets() {
        return null;
    }

    public Enumeration getServletNames() {
        return null;
    }

    public void log(String s) {

    }

    public void log(Exception e, String s) {

    }

    public void log(String s, Throwable throwable) {

    }
}
