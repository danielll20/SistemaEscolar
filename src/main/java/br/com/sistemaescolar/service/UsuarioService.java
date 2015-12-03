/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;
import javax.persistence.NoResultException;

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
	
	public Usuario existe(Usuario usuario) {
		Usuario verificaUsuarioExistente = null;
		try {
			verificaUsuarioExistente = usuarioDao.existe(usuario);
		} catch (NoResultException nr) {			
		}
		
		return verificaUsuarioExistente;
	}
}
