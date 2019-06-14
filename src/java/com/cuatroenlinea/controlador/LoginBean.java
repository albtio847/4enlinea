/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuatroenlinea.controlador;

import com.cuatroenlinea.controlador.util.FacesUtils;
import com.cuatroenlinea.controlador.util.JsfUtil;
import com.cuatroenlinea.modelo.Usuario;
import javax.inject.Named;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Laura Orozco
 */
@Named(value = "loginBean")
@ViewScoped
public class LoginBean implements Serializable {

    private Usuario usuario;
    @EJB
    private UsuarioFacade usuarioFacade;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    /**
     * Creates a new instance of loginBean
     */
    public LoginBean() {
    }
    @PostConstruct
    private void inicializar()
    {
       usuario = new Usuario();
    }
    public String ingresar()        
    {
        Usuario usuarioEncontrado=usuarioFacade.obtenerUsuarioxCorreo(usuario.getCorreo());
        if(usuarioEncontrado != null)
        {
            if(usuario.getContrasenia().compareTo(usuarioEncontrado.getContrasenia())==0)
            {
               if(usuario.getContrasenia().compareTo(usuarioEncontrado.getContrasenia())==0)
            {
                Controlador contCuatroenlinea= (Controlador) FacesUtils.getManagedBean("controlador");
                contCuatroenlinea.setUsuario(usuarioEncontrado);
               
                if(usuarioEncontrado.getTipoUsuario().getIdtipoUsuario().equals("2"))
                {
                   return "ingresar";  
                }else {
                    return "jugar";
                }
            }
                return "ingresar";
            }
            JsfUtil.addErrorMessage("Contraseña incorrecta");
        }
        else
        {
            JsfUtil.addErrorMessage("El correo ingresado no existe");
        }
        return null;
    }

    
}
   
    

