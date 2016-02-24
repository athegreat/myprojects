/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author AlvaroAlexander
 */
public interface Contrato extends Remote
{
//    public String enviar(String name) throws RemoteException;
//    public void sesionDB(String user, String Password) throws RemoteException;
    public String sesion(String usuario, String Contr)throws RemoteException;
    public String ventasxciudadConsulta(String consulta, int usuario, String ciudad)throws RemoteException;
    public String ventasxSucursal(String consulta, int usuario, String ciudad)throws RemoteException;
    public String ventasxcliente(String consulta, int usuario, String ciudad)throws RemoteException;
    public String ventasxfacturaxcliente(String consulta, int usuario, String ciudad)throws RemoteException;
    public String ventasModi(String presente, String futuro, int usuario, String ciudad)throws RemoteException;
    public String ventasElimar(String dato, int usuario, String ciudad)throws RemoteException;
    public String ventasAgragr(String data, int usuario, String ciudad)throws RemoteException;
    public String cuentasConsulta(String consulta, int usuario, String ciudad)throws RemoteException;
    public String cuentasModi(String presente, String futuro, int usuario, String ciudad)throws RemoteException;
    public String cuentasElimar(String dato, int usuario, String ciudad)throws RemoteException;
    public String cuentasAgragr(String data, int usuario, String ciudad)throws RemoteException;
    public String clientesConsulta(String consulta, int usuario, String ciudad)throws RemoteException;
    public String clientesModi(String presente, String futuro, int usuario, String ciudad)throws RemoteException;
    public String clientesElimar(String dato, int usuario, String ciudad)throws RemoteException;
    public String clientesAgragr(String data, int usuario, String ciudad)throws RemoteException;
    public String empleadoConsulta(String data, int usuario, String ciudad) throws RemoteException;
    public String empleadoModi(String presente, String futuro, int usuario, String ciudad) throws RemoteException;
    public String empleadoEliminar(String data, int usuario, String ciudad) throws RemoteException;
    public String empleadoCAgregar(String data, int usuario, String ciudad) throws RemoteException;
    public ArrayList<ArrayList<String>> carga() throws RemoteException;
    public void cerrarSesion(int usuario) throws RemoteException;
    public void usuarioAgregar(String data, int user, String ciudad) throws RemoteException;
    public void usuarioModificar(String user, int userM, String ciudad) throws RemoteException;
    public void usuarioEliminar(String user, int userM, String ciudad) throws RemoteException;
    //-----------------------------------------------------------------------//
    public ArrayList<String> cargaEmpleados() throws RemoteException;
    public ArrayList<String> cargaCiudad() throws RemoteException;
    public ArrayList<String> cargaProducto() throws RemoteException;
    public ArrayList<String> cargaSucursal() throws RemoteException;
    public ArrayList<String> cargaCliente() throws RemoteException;
    public ArrayList<String> cargaCargo() throws RemoteException;
    public ArrayList<String> cargaTipoPago() throws RemoteException;
    public ArrayList<String> cargaTipoCargo() throws RemoteException;
    public ArrayList<String> cargaCostoProducto() throws RemoteException;
    public ArrayList<String> cargaUsuariosC() throws RemoteException;
    public ArrayList<String> cargaFactura() throws RemoteException;
    //---------------------------------------------------------------------//
    public void ingresarProducto(String data, int User, String ciudad) throws RemoteException;
    public void consultarProducto(String data, int User, String ciudad) throws RemoteException;
    public void modificarProducto(String data, int usuario, String ciudad) throws RemoteException;
    public void eliminarProducto(String data, int usuario, String ciudad) throws RemoteException;
}
