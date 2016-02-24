package soapcluster;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.xml.namespace.QName;
import javax.xml.soap.*;

public class consulta_Nodo {
    private static final String endpoint = "http://10.152.164.140/soap_cluster_mpi/cluster_mpi.php?wsdl";
    
    public String con_dis_nod()
    {
        
    try
        {
            //Conexion
            SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
            SOAPConnection soapConnection = soapConnectionFactory.createConnection();            //Envio Peticion
            SOAPMessage soapResponse = soapConnection.call(createSoapMessage(), endpoint);
            System.out.println("Response SOAP Message");

            //soapResponse.writeTo(System.out);


            SOAPBody responseBody = soapResponse.getSOAPBody();
            SOAPBodyElement responseElement = (SOAPBodyElement)responseBody.getChildElements().next();
            SOAPElement returnElement;
            QName hijos;
            hijos = new QName("nodos");
            returnElement = (SOAPElement)responseElement.getChildElements(hijos).next();
            System.out.println(returnElement.getValue());
            
            return returnElement.getValue();

        }
        catch (SOAPException | UnsupportedOperationException ex)
        {
            System.out.println(ex);
            return ex.toString();
            
        }
    }

    private static SOAPMessage createSoapMessage()
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

            SOAPElement soapBodyElem = soapBody.addChildElement("consultar_nodos_disponibles");
            MimeHeaders headers = soapMessage.getMimeHeaders();
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
