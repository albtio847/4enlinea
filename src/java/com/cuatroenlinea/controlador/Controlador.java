/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cuatroenlinea.controlador;



import com.cuatroenlinea.controlador.util.JsfUtil;
import com.cuatroenlinea.modelo.Usuario;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;

/**
 *
 * @author Laura Orozco
 */
@Named(value = "controlador")
@SessionScoped
public class Controlador implements Serializable {

    /**
     * Creates a new instance of controlador
     */
    public Controlador() {
    }
    private Usuario usuario;
    @EJB
    private UsuarioFacade usuarioFacade;
    

    /**
     * Creates a new instance of ControladorJuegoCuatroenlinea
     */
    
    @PostConstruct
    private void inicializar()
    {
       usuario = new Usuario();
    }
   

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
            
}

