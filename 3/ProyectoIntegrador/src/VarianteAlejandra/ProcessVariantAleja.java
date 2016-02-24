/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VarianteAlejandra;

import Global.VariableGlobal;
import java.math.BigInteger;
import javax.swing.JTextArea;

/**
 *
 * @author Alejandra Escobar Rios
 */
public class ProcessVariantAleja 
{
    private static DESAlejandra varAleja;

    public static DESAlejandra getVarAleja() 
    {
        return varAleja;
    }

    public static void setVarAleja(DESAlejandra varAleja) 
    {
        ProcessVariantAleja.varAleja = varAleja;
    }
    
    public static void cifrado(JTextArea jtextArea)
    {
        double tiempoInicial = System.nanoTime();
        for (byte b : ProcessVariantAleja.caracteresEspeciales(jtextArea)) //como existen letras que no tienen representacion ASCII, se asignan unas posiciones para ciertos caracteres sin representacion y se guarda todo en un arreglo de bytes
        {
            long temp = varAleja.encryptBlock(b); //cifra el texto
            VariableGlobal.getLista().add(temp); //agrega a la lista
        }
        double tiempoFinal = System.nanoTime();
        double resultado = (tiempoFinal - tiempoInicial) * Math.pow(10, -9);
        System.out.println("Tiempo Estimado Cifrado Variante Alejandra: " + resultado + " segundos");
        VariableGlobal.salida.println("Tiempo Estimado Cifrado Variante Alejandra: " + resultado + " segundos");
        VariableGlobal.salida.flush();
        VariableGlobal.salida.close();
        jtextArea.setText("");
        for (Long l : VariableGlobal.getLista())
        {
            jtextArea.append(Long.toHexString(l) + "\n"); //se convierte el numero entero largo a hexadecimal
        }
        VariableGlobal.getLista().clear();
        VariableGlobal.getListaEncriptada().clear();
        VariableGlobal.getListaDesencriptada().clear();
    }
    
    public static void descifrado(JTextArea jtextArea)
    {
        double tiempoInicial = System.nanoTime();
        for (String string : jtextArea.getText().split("\n"))
        {
            VariableGlobal.getListaDesencriptada().add(caracteresEspDescifrado(string)); //como se tiene q tener en cuenta los caracteres especiales, se trata cada letra verificando esa condicion y la procesa para su correspondiente descifrado
        }
        double tiempoFinal = System.nanoTime();
        double resultado = (tiempoFinal - tiempoInicial) * Math.pow(10, -9);
        System.out.println("Tiempo Estimado Descifrado Variante Alejandra: " + resultado + " segundos");
        VariableGlobal.salida.println("Tiempo Estimado Descifrado Variante Alejandra: " + resultado + " segundos");
        VariableGlobal.salida.flush();
        VariableGlobal.salida.close();
        jtextArea.setText("");
        for (String s : VariableGlobal.getListaDesencriptada())
        {
            jtextArea.append(s); //se imprime el texto original
        }
        VariableGlobal.getLista().clear();
        VariableGlobal.getListaDesencriptada().clear();
        VariableGlobal.getListaEncriptada().clear();
    }
    
    private static String caracteresEspDescifrado(String s)
    {
        String resultado = "";
//        String temporal = String.valueOf((char)(varAleja.decryptBlock(new BigInteger(s, 16).longValue())));
        long temp = varAleja.decryptBlock(new BigInteger(s, 16).longValue()); //se realiza el descifrado de manera normal.
        
        if (temp >= 0 && temp <= 7) //si esta dentro del rango de 0 a 7, que es el rango q asignamos para los caracteres especiales, se procede de una manera diferente
        {
            resultado = String.valueOf(DESAlejandra.letters.get((int) temp)); //se busca a lo que equivale dentro del rango de posiciones, es decir, se busca en el arreglo cual caracter se esta apuntando.
        }
        else //en caso de que no sea un caracter especial, se procede a la manera tradicional.
        {
            resultado = String.valueOf((char)(temp)); //si no es un caracter, se procede de la manera tradicional.
        }
        return resultado; //se retorna el valor de ese caracter, ya sea especial o no.
    }
    
    private static byte[] caracteresEspeciales(JTextArea jtextArea) //tiene su equivalencia con obtener los bytes de un string, sino que en este caso obtiene la representacion de los bytes de los caracteres especiales
    {
        byte resultado[] = new byte[jtextArea.getText().length()];
        char cad[] = jtextArea.getText().toCharArray(); //se convierte todo a un arreglo de chars
        for (int i = 0; i < resultado.length; i++) 
        {
            int pos = DESAlejandra.letters.indexOf(cad[i]); //si el caracter es especial, se obtendra la posicion para trabajar sobre ese valor
            if(pos == -1)
            {
                resultado[i] = (byte)(cad[i]); //si no es un caracter, se procesa normal.
            }
            else
            {
                resultado[i] = DESAlejandra.values.get(pos).byteValue(); //al obtener la posicion del arreglo en donde se encuentra el caracter especial, se usa otro arreglo para obtener el valor de ese caracter
            }
        }
        return resultado; //se obtiene el arreglo convertido a codigo ASCII y con caracteres especiales.
    }
    public static void checkPassword(String password)
    {
        
    }
}
