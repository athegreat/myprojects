/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Alexander
 */
public class Welcome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException
    {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        InicioPI ini = new InicioPI();
        ini.setTitle("Crypto");
        ini.setVisible(true);
    }
}
