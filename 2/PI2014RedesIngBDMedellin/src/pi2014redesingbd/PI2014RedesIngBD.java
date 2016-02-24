/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi2014redesingbd;

import Modelo.Client;
import Vista.Login;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author AlvaroAlexander
 */
public class PI2014RedesIngBD 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            String city = JOptionPane.showInputDialog("Ingrese la direccion de la base de datos: ");
            switch (city) 
            {
                case "bucaramanga":
                {
                    connect("localhost", "bucaramanga");
                    break;
                }
                case "cali":
                {
                    connect("localhost", "cali");
                    break;
                }
                case "medellin":
                {
                    connect("localhost", "cali");
                    break;
                }
                default:
                {
                    break;
                }
            }
            
            
            
//            
//            Client client = new Client();
//            client.prueba();
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public static void connect(String url, String city)
    {
        Client.setCity(city);
        Client client = new Client(url);
            
        Login login = new Login();
        login.setTitle("Inicio de Sesion");
        login.setVisible(true);
    }
    
}
