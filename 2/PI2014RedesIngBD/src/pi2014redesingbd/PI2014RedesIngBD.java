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
            Login login = new Login();
            login.setTitle("Inicio de Sesion");
            login.setVisible(true);
            Client client = new Client();
//            
//            Client client = new Client();
//            client.prueba();
        } 
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
