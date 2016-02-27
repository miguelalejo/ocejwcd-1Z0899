package ec.ocejwcd.app.examen.cap5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * Created by Miguel on 14/2/2016.
 */
public class ImpServletRequest implements ServletRequest {
    public Object getAttribute(String nombre){
        return null;
    }

    public void setAttribute(String nombre,Object valor){

    }

    public void removeAttribute(String nombre){

    }

    public Locale getLocale() {
        return null;
    }

    public Enumeration getLocales() {
        return null;
    }

    public boolean isSecure() {
        return false;
    }

    public Enumeration getAttributeNames(){
        return null;
    }

    public String getCharacterEncoding() {
        return null;
    }

    public void setCharacterEncoding(String s) throws UnsupportedEncodingException {

    }

    public int getContentLength() {
        return 0;
    }

    public String getContentType() {
        return null;
    }

    public String[] getParameterValues(String parametro){
        return null;
    }

    public String getParameter(String parametro){
        return null;
    }

    public Enumeration getParameterNames(){
        return null;
    }

    public Map getParameterMap(){
        return null;
    }

    public String getProtocol() {
        return null;
    }

    public String getScheme() {
        return null;
    }

    public String getServerName() {
        return null;
    }

    public int getServerPort() {
        return 0;
    }

    public ServletInputStream getInputStream(){
        /*Sirve para obetener datos largos tipo byte*/
        return null;
    }

    public BufferedReader getReader(){
        /*Lee tipos de datos textuales en la carga*/
        return null;
    }

    public String getRemoteAddr() {
        return null;
    }

    public String getRemoteHost() {
        return null;
    }

    public RequestDispatcher getRequestDispatcher(String ruta){
        return null;
    }

    public String getRealPath(String s) {
        return null;
    }

    public int getRemotePort() {
        return 0;
    }

    public String getLocalName() {
        return null;
    }

    public String getLocalAddr() {
        return null;
    }

    public int getLocalPort() {
        return 0;
    }
}