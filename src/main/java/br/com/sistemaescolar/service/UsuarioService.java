/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.UsuarioDao;
import br.com.sistemaescolar.modelo.Usuario;

/**
 * @author Daniel Correia
 * @since 03/12/2015
 *
 */
public class UsuarioService {

	@Inject
	private UsuarioDao usuarioDao;
	
	public boolean existe(Usuario usuario) {
		return usuarioDao.existe(usuario);
	}
}
