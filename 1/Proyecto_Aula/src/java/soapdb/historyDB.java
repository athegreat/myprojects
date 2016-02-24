package soapdb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.util.Iterator;

public class historyDB 
{
    private static final String endpoint = "http://10.154.12.201/soap_db/db-appserver.php?wsdl";
    public static ArrayList<String> id_registro = new ArrayList<>();
    public static ArrayList<String> id_usuario = new ArrayList<>();
    public static ArrayList<String> fecha = new ArrayList<>();
    public static ArrayList<String> nombre = new ArrayList<>();
    public static ArrayList<String> descripcion = new ArrayList<>();
    public static ArrayList<String> estado = new ArrayList<>();
    public static ArrayList<ArrayList> historico = new ArrayList<>();
    
    public ArrayList getHistorial(String idusu,String numreg,String fe,String est)
    {
        try
        {
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            SOAPMessage soapResponse = soapConnection.call(createSoapMessage(idusu,numreg,fe,est), endpoint);
            System.out.println("Response SOAP Message");
            
            SOAPBody responseBody = soapResponse.getSOAPBody();
            SOAPBodyElement responseElement = (SOAPBodyElement)responseBody.getChildElements().next();
            SOAPElement returnElement = (SOAPElement) responseElement.getChildElements().next();
            SOAPElement respuesta;
            QName hijos;
            hijos = new QName("id_registro");            
            Iterator<SOAPElement> se = returnElement.getChildElements();
            while (se.hasNext())
            {
                respuesta = (SOAPElement) se.next().getChildElements(hijos).next();
                id_registro.add(respuesta.getValue());
                //System.out.println(respuesta.getValue());
            }
            historico.add(id_registro);
            hijos = new QName("id_usuario"); 
            Iterator<SOAPElement> se1 = returnElement.getChildElements();
            while (se1.hasNext())
            {
                respuesta = (SOAPElement) se1.next().getChildElements(hijos).next();
                id_usuario.add(respuesta.getValue());
            } 
            historico.add(id_usuario);
            hijos = new QName("fecha");
            Iterator<SOAPElement> se8 = returnElement.getChildElements();
            while (se8.hasNext())
            {
                respuesta = (SOAPElement) se8.next().getChildElements(hijos).next();
                fecha.add(respuesta.getValue());
            } 
            historico.add(fecha);
            hijos = new QName("nombre"); 
            Iterator<SOAPElement> se2 = returnElement.getChildElements();
            while (se2.hasNext())
            {
                respuesta = (SOAPElement) se2.next().getChildElements(hijos).next();
                nombre.add(respuesta.getValue());
            } 
            historico.add(nombre);
            hijos = new QName("descripcion"); 
            Iterator<SOAPElement> se3 = returnElement.getChildElements();
            while (se3.hasNext())
            {
                respuesta = (SOAPElement) se3.next().getChildElements(hijos).next();
                descripcion.add(respuesta.getValue());
            }     
            historico.add(descripcion);
            hijos = new QName("estado"); 
            Iterator<SOAPElement> se4 = returnElement.getChildElements();
            while (se4.hasNext())
            {
                respuesta = (SOAPElement) se4.next().getChildElements(hijos).next();
                estado.add(respuesta.getValue());
            } 
            historico.add(estado);
            
            return historico;
        }
        catch (Exception ex)
        {
            System.out.println(ex);
            return null;
        }
        
    }
    private static SOAPMessage createSoapMessage(String idusu,String numreg,String fecha,String estado)
    {
        try
        {
            MessageFactory messageFactory = MessageFactory.newInstance();
            SOAPMessage soapMessage = messageFactory.createMessage();
            SOAPPart soapPart = soapMessage.getSOAPPart();
            String serverURI = "http://ws.cdyne.com/";

            // SOAP Envelope
            SOAPEnvelope envelope = soapPart.getEnvelope();
            envelope.addNamespaceDeclaration("example", serverURI);
            // SOAP Body
            SOAPBody soapBody = envelope.getBody();
            SOAPElement soapBodyElem = soapBody.addChildElement("consultar_historial");
            //soapBodyElem.addTextNode("1");
            SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("id_usuario");
            soapBodyElem1.addTextNode(idusu);
            SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("numero_registros");
            soapBodyElem2.addTextNode(numreg);
            SOAPElement soapBodyElem3 = soapBodyElem.addChildElement("fecha");
            soapBodyElem3.addTextNode(fecha);
            SOAPElement soapBodyElem4 = soapBodyElem.addChildElement("estado");
            soapBodyElem4.addTextNode(estado);
            //MimeHeaders headers = soapMessage.getMimeHeaders();
            //headers.addHeader("SOAPAction", serverURI  + "VerifyEmail");
            soapMessage.saveChanges();
        /* Print the request message */
            System.out.print("Request SOAP Message:");
            soapMessage.writeTo(System.out);
            System.out.println();
            return soapMessage;
        }
        catch (Exception ex)
        {
            return null;
        }
    }
     
    
}
