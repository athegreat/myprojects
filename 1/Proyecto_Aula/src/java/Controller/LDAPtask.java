package Controller;



import RMI.contratoLdap;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AlvaroAlexander
 */
public class LDAPtask
{
    
    static contratoLdap service = null;
    
    public static String user = "", pass = "";
    
    private static String url;

    public static void establecerConex(String url)
    {
        try
        {
            LDAPtask.url = url;
            
            service = (contratoLdap) Naming.lookup("rmi://"+ url +":1803/service");
        }
        catch (MalformedURLException | NotBoundException | RemoteException ex)
        {
            System.out.println(ex);
        }
    }
    
    public static String login(String user, String pass)
    {
        try
        {
            //service = (contratoLdap) Naming.lookup("rmi://"+ url +":1802/service");
            String u = user, p = pass;
            String s = service.conectar(user, pass);
            System.out.println(s);
            return s;
        }
        catch (Exception e)
        {
            
            return "-2";
        }
    }
    
    public static String register(String name, String user, String pass)
    {
        try
        {
            return service.registrar(name, user, pass);
        }
        catch (Exception e)
        {
            return "";
        }
    }
}
