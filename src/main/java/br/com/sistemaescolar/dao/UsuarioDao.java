/**
 * 
 */
package br.com.sistemaescolar.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
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
	
	public boolean existe(Usuario usuario) {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select u from Usuario u ");
		jpql.append(" where u.email = :email ");
		jpql.append(" and u.senha = :senha ");
				
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("email", usuario.getEmail());
		query.setParameter("senha", usuario.getSenha());
					
		return !query.getResultList().isEmpty();
	}
}
