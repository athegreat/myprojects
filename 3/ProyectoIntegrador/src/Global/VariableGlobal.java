/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author Alexander Agudelo Mora
 * @author Alejandra Escobar Rios
 */
public class VariableGlobal 
{
    private static ArrayList<Long> listaEncriptada = new ArrayList<>();
    private static ArrayList<Long> lista = new ArrayList<>(); //donde se almacenara el texto cifrado
    private static ArrayList<String> listaDesencriptada = new ArrayList<>(); //donde se almacenara el texto descifrado
    public static PrintWriter salida;
    private static Pattern patron = Pattern.compile("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%/]).{8,30}");

    public static Pattern getPatron() 
    {
        return patron;
    }

    public static void setPatron(Pattern patron) 
    {
        VariableGlobal.patron = patron;
    }

    public static ArrayList<String> getListaDesencriptada() 
    {
        return listaDesencriptada;
    }

    public static void setListaDesencriptada(ArrayList<String> listaDesencriptada) 
    {
        VariableGlobal.listaDesencriptada = listaDesencriptada;
    }

    public static ArrayList<Long> getLista() 
    {
        return lista;
    }

    public static void setLista(ArrayList<Long> lista) 
    {
        VariableGlobal.lista = lista;
    }

    public static ArrayList<Long> getListaEncriptada() 
    {
        return listaEncriptada;
    }

    public static void setListaEncriptada(ArrayList<Long> listaEncriptada) 
    {
        VariableGlobal.listaEncriptada = listaEncriptada;
    }
    
    public static long valorKey(byte[] k) //obtiene la sumatoria de la llave para empezar el proceso de cifrado
    {
        long l = 0;
        for (byte b : k) //recorre el arreglo de bytes
        {
            l += b; //va acumulando ese valor
        }
        return l; //retorna la sumatoria total de el arreglo de bytes
    }
    
}
