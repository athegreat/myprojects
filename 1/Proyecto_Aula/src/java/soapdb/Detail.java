package soapdb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
/**
 *
 * @author diego
 */
public class Detail {
     public String endpoint = "http://10.154.12.201/soap_db/db-appserver.php?wsdl";
     public ArrayList<String> datos = new ArrayList<>();
     
     
     
     public ArrayList<String> conect_db(String id){
         try
        {
            //conectar
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            SOAPMessage soapResponse = soapConnection.call(createSoapMessage(id), endpoint);
            System.out.println("Response SOAP Message");

            //Respuesta
            SOAPBody responseBody = soapResponse.getSOAPBody();
            SOAPBodyElement responseElement = (SOAPBodyElement)responseBody.getChildElements().next();
            SOAPElement returnElement;
            QName hijos;
            hijos = new QName("id_registro");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("id_usuario");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("fecha");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("nombre");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("descripcion");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("estado");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("nodos_solicitados");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("nodos_utilizados");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("codigo_mpi");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("argumentos");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("errores");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("tiempo_ejecucion");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            hijos = new QName("resultados");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            datos.add(returnElement.getValue());
            //System.out.println(returnElement.getValue());
            
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }
         return datos;
     }
     public static SOAPMessage createSoapMessage(String id)
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
            SOAPElement soapBodyElem = soapBody.addChildElement("consultar_detalle");
            SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("id_registro");
            soapBodyElem1.addTextNode(id);
            MimeHeaders headers = soapMessage.getMimeHeaders();
            soapMessage.saveChanges();
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
