/**
 * 
 */
package br.com.sistemaescolar.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Usuario;

/**
 * @author Daniel Correia
 * @since 03/12/2015
 *
 */
public class UsuarioDao {

	@Inject
	private EntityManager entityManager;
	
	public Usuario existe(Usuario usuario) throws NoResultException {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select u from Usuario u ");
		jpql.append(" where u.email = :email ");
		jpql.append(" and u.senha = :senha ");
				
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("email", usuario.getEmail());
		query.setParameter("senha", usuario.getSenha());
		
		Usuario retornoUsuario = (Usuario) query.getSingleResult();
					
		return retornoUsuario;
	}
}
