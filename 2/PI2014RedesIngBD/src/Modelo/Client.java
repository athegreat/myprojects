/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.awt.HeadlessException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AlvaroAlexander
 */
public class Client 
{
    
    private static String tipoUsuario = "";
    private static int userS;

    public static String getTipoUsuario() {
        return tipoUsuario;
    }
    private static int active = 0;
    static Contrato service = null;
    
    public Client()
    {
        try
        {
            service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
        }
        catch (MalformedURLException | NotBoundException | RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
  
    public String consultarSucursal(String data)
    {
        try
        {
            return service.ventasxSucursal(data, userS);
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
    
    
    public String consultarEmpleado(String data)
    {
        try 
        {
            return service.empleadoConsulta(data, userS);
        } 
        catch (RemoteException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
            return "";
        }
    }
    
    public String connect(String user, String Password)
    {
        try
        {
            //Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            String[] temp = service.sesion(user, Password).split(";");
            tipoUsuario = temp[0];
            userS = Integer.parseInt(temp[1]);
            active = Integer.parseInt(temp[2]);
        }
        catch (NumberFormatException | RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        finally
        {
            return tipoUsuario + ";" + active;
        }
    }
    
    public ArrayList<ArrayList<String>> carga()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.carga();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    
    public ArrayList<String> cargaEmpleado()
    {
        try
        {
            //Contrato service = (Contrato) Naming.lookup("rmi://Redes-PC:1802/service");
            return service.cargaEmpleados();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
        public ArrayList<String> cargaCiudad()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaCiudad();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public ArrayList<String> cargaProducto()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaProducto();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
        public ArrayList<String> cargaTipoPago()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaTipoPago();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
            public ArrayList<String> cargaFactura()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaFactura();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    
    public ArrayList<String> cargaSucursal()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaSucursal();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public ArrayList<String> cargaCliente()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaCliente();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public ArrayList<String> cargaCargo()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaCargo();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public ArrayList<String> cargaTipoCargo()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaTipoCargo();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public ArrayList<String> cargaCostoProducto()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaCostoProducto();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    public ArrayList<String> cargaUsuarioC()
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            return service.cargaUsuariosC();
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
    }
    
    
    public void insertarVenta(String data)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.ventasAgragr(data, userS);
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public String consultaGeneralCiudad(String data)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            String respuesta = service.ventasxciudadConsulta(data, userS);
            return respuesta;
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
    
    public void cerrarSesion()
    {
        try
        {
            //Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.cerrarSesion(userS);
            JOptionPane.showMessageDialog(null, "Cerrada Sesion del usuario");
        }
        catch (HeadlessException | RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public String consultaGeneralCliente(String data)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            String respuesta = service.ventasxcliente(data, userS);
            return respuesta;
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
    
    public void insertarAbono(String data)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.cuentasAgragr(data, userS);
            JOptionPane.showMessageDialog(null, "Abono Insertado");
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public String consultarCuentas(String data)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            String respuesta = service.cuentasConsulta(data, userS);
            return respuesta;
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return null;
    }
    
    public void insertarUsuario(String data)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.usuarioAgregar(data, userS);
            
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void modificarUsuario(String data, String future)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.clientesModi(data, future, userS);
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void eliminarUsuario(String data)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.clientesElimar(data, userS);
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void agregarEmpleado(String data)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.empleadoCAgregar(data, userS);
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void modificarEmpleado(String data, String future)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.empleadoModi(data, future, userS);
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void eliminarEmpleado(String data)
    {
        try
        {
//            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.empleadoEliminar(data, userS);
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void agregarCliente(String data)
    {
        try
        {
            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.clientesAgragr(data, userS);
        }
        catch (MalformedURLException | NotBoundException | RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void modificarCliente(String data, String future)
    {
        try
        {
            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.clientesModi(data, future, userS);
        }
        catch (MalformedURLException | NotBoundException | RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void eliminarCliente(String data)
    {
        try
        {
            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
            service.clientesElimar(data, userS);
        }
        catch (MalformedURLException | NotBoundException | RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void listaUsuarios()
    {
        try
        {
            Contrato service = (Contrato) Naming.lookup("rmi://127.0.0.1:1802/service");
        }
        catch (NotBoundException | MalformedURLException | RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void insertarProducto(String data)
    {
        try
        {
            service.ingresarProducto(data, userS);
        }
        catch (RemoteException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
