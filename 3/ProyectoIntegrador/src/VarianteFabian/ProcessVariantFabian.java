/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VarianteFabian;

import Global.VariableGlobal;
import cripto.DES;
import cripto.Key;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

/**
 *
 * @author 
 */
public class ProcessVariantFabian 
{
    public static void cifrado(JTextArea jtextArea, JPasswordField jpasswordfield)
    {
        try 
        {
            char[] t = jpasswordfield.getPassword();
            String tc = new String(t).trim();
            byte[] llave = tc.getBytes();
            long numLlave = 0;
            for (byte b : llave)
            {
                numLlave += b;
            }
            Key llaveDes = new Key(numLlave);
            byte[] texto = jtextArea.getText().getBytes();
            DES des = new DES(llaveDes, 144);
            ArrayList<Long> ListCipher = new ArrayList<>();
            double t1 = System.nanoTime();
            for(byte caracter : texto)
            {
                Long temp = des.encryptBlock(caracter);
                ListCipher.add(temp);
            }
            double t2 = System.nanoTime(); 
            double tr2 = (t2 - t1) * Math.pow(10, -9);
            System.out.println("Tiempo Estimado Cifrado Variante Fabian: " + tr2 + " segundos");
            VariableGlobal.salida.println("Tiempo Estimado Cifrado Variante Fabian: " + tr2 + " segundos");
            VariableGlobal.salida.flush();
            VariableGlobal.salida.close();
            jtextArea.setText("");
            for (Long l : ListCipher) 
            {
                jtextArea.append(l + "\n");
            }
            jpasswordfield.setText("");

        } 
        catch (Exception ex) 
        {
            Logger.getLogger(ProcessVariantFabian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void descifrado (JTextArea jtextArea, JPasswordField jpasswordfield)
    {
        try
        {
            char[] t = jpasswordfield.getPassword();
            String tc = new String(t).trim();
            byte[] llave = tc.getBytes();
            long numLlave = 0;
            for (byte b : llave)
            {
                numLlave += b;
            }
            Key llaveDes = new Key(numLlave);
            String[] temp = jtextArea.getText().split("\n");
            DES des = new DES(llaveDes, 144);
            ArrayList<String> listaD = new ArrayList<>();
            double t1 = System.nanoTime();
            for (String string : temp) 
            {
                char ch = (char)des.decryptBlock(Long.parseLong(string));
                listaD.add(String.valueOf(ch));
            }
            double t2 = System.nanoTime(); 
            double tr2 = (t2 - t1) * Math.pow(10, -9);
            System.out.println("Tiempo Estimado Descifrado Variante Fabian: " + tr2 + " segundos");
            VariableGlobal.salida.println("Tiempo Estimado Descifrado Variante Fabian: " + tr2 + " segundos");
            VariableGlobal.salida.flush();
            VariableGlobal.salida.close();
            jtextArea.setText("");
            for (String string : listaD) 
            {
                jtextArea.append(string);
            }
            jpasswordfield.setText("");
        }
        catch (Exception ex)
        {
                System.out.println(ex);
        }
    }
}
