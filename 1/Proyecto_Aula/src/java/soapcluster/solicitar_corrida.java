package soapcluster;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.xml.namespace.QName;
import javax.xml.soap.*;
/**
 *
 * @author diego
 */
public class solicitar_corrida {
    private static final String endpoint = "http://10.152.164.140/soap_cluster_mpi/cluster_mpi.php?wsdl";
    
    public String sol_corrida(String idu,String nom,String des,String cod,String arg,String nod)
    {
        try
        {
            //Conexion
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();

            SOAPConnection soapConnection = soapConnectionFactory.createConnection();
            //Envio Peticion
            SOAPMessage soapResponse = soapConnection.call(createSoapMessage(idu,nom,des,cod,arg,nod), endpoint);




            SOAPBody responseBody = soapResponse.getSOAPBody();

            SOAPBodyElement responseElement = (SOAPBodyElement)responseBody.getChildElements().next();
            SOAPElement returnElement;
            QName hijos;
            hijos = new QName("estado");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            System.out.println(returnElement.getValue());

            return returnElement.getValue();

        }
        catch (Exception ex)
        {
            return ex.toString();
        }
    }
    private static SOAPMessage createSoapMessage(String idu,String nom,String des,String cod,String arg,String nod)
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

            //SOAPElement soapBodyElem = soapBody.addChildElement("consultar_nodos_disponibles");

            SOAPElement soapBodyElem = soapBody.addChildElement("solicitar_corrida");
            //soapBodyElem.addTextNode("1");
            SOAPElement soapBodyElem1 = soapBodyElem.addChildElement("id_usuario");
            soapBodyElem1.addTextNode(idu);

            SOAPElement soapBodyElem2 = soapBodyElem.addChildElement("nombre");
            soapBodyElem2.addTextNode(nom);

            SOAPElement soapBodyElem3 = soapBodyElem.addChildElement("descripcion");
            soapBodyElem3.addTextNode(des);

            SOAPElement soapBodyElem4 = soapBodyElem.addChildElement("codigo_mpi");
            soapBodyElem4.addTextNode(cod);

            SOAPElement soapBodyElem5 = soapBodyElem.addChildElement("argumentos");
            soapBodyElem5.addTextNode(arg);

            SOAPElement soapBodyElem6 = soapBodyElem.addChildElement("nodos");
            soapBodyElem6.addTextNode(nod);

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
