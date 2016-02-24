/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Alvaro Alexander Agudelo Mora
 */
public interface contratoLdap extends Remote
{
    public String conectar(String nombre,String contra)throws RemoteException;
    public void desconectar(String nombre)throws RemoteException;
    public String registrar(String nombre,String usu,String pass)throws RemoteException;
}
