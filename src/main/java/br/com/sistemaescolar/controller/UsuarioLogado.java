/**
 * 
 */
package br.com.sistemaescolar.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.sistemaescolar.modelo.Usuario;

/**
 * @author Daniel Correia
 * @since 03/12/2015
 * 
 */

@SessionScoped
@Named
public class UsuarioLogado implements Serializable {

	private static final long serialVersionUID = -63770586315195653L;
	
	private Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void logout() {
	    this.usuario = null;
	}
	
}
