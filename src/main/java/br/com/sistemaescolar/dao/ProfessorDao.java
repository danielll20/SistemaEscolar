/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.com.sistemaescolar.modelo.Professor;

/**
 * @author Leonardo Ribeiro
 * @since  24/10/2015
 */
public class ProfessorDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;
	
	public List<Professor> listarTodos() {
		Query query = entityManager.createQuery("select p from Professor p");

		return query.getResultList();
	}
	
	public Professor buscaPorId(Long id) {
		return entityManager.find(Professor.class, id);
	}

}
