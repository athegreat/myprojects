/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author alexander
 */
public class Usuario 
{
    private String user, pass;

    public String getUser() 
    {
        return user;
    }

    public void setUser(String user) 
    {
        this.user = user;
    }

    public String getPass() 
    {
        return pass;
    }

    public void setPass(String pass) 
    {
        this.pass = pass;
    }
    
    public Usuario()
    {
        
    }
    public Usuario(String user, String pass)
    {
        this.user = user;
        this.pass = pass;
    }
    
    
}
