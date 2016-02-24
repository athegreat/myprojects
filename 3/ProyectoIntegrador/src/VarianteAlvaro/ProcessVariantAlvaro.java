/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VarianteAlvaro;

import Global.VariableGlobal;
import cripto.*;
import javax.swing.JTextArea;

/**
 *
 * @author Alexander Agudelo Mora
 */
public class ProcessVariantAlvaro 
{
    private static DES des;

    public static DES getDes() 
    {
        return des;
    }
    public static void setDes(DES des) 
    {
        ProcessVariantAlvaro.des = des;
    }
    
    public static void cifrado(JTextArea jtextArea)
    {
        double t1 = System.nanoTime();
        des.encrytBlock(jtextArea.getText().getBytes());
        double t2 = System.nanoTime();
        double tr1 = (t2 - t1) * Math.pow(10, -9);
        System.out.println("Tiempo Estimado Cifrado Variante Alvaro: " + tr1 + " segundos");
        VariableGlobal.salida.println("Tiempo Estimado Cifrado Variante Alvaro: " + tr1 + " segundos");
        VariableGlobal.salida.flush();
        VariableGlobal.salida.close();
        jtextArea.setText("");
        for (long l : VariableGlobal.getListaEncriptada())
        {
            jtextArea.append(l + "\n");
        }
        VariableGlobal.getLista().clear();
        VariableGlobal.getListaEncriptada().clear();
        VariableGlobal.getListaDesencriptada().clear();
    }
    
    public static void descifrado(JTextArea jtextArea)
    {
        double t1 = System.nanoTime();
        des.decryptBlock(jtextArea.getText().split("\n"));
        double t2 = System.nanoTime();
        double tr1 = (t2 - t1) * Math.pow(10, -9);
        System.out.println("Tiempo Estimado Descifrado Variante Alvaro: " + tr1 + " segundos");
        VariableGlobal.salida.println("Tiempo Estimado Descifrado Variante Alvaro: " + tr1 + " segundos");
        VariableGlobal.salida.flush();
        VariableGlobal.salida.close();
        jtextArea.setText("");
        for (String string : VariableGlobal.getListaDesencriptada())
        {
            jtextArea.append(string);
        }
        VariableGlobal.getListaDesencriptada().clear();
        VariableGlobal.getLista().clear();
        VariableGlobal.getListaEncriptada().clear();
    }
    
}
