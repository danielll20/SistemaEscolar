/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Matricula;

/**
 * Classe de acesso aos métodos de persistência.
 * 
 * @author Daniel Correia
 * @since  21/10/2015
 *
 */
public class MatriculaDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;

	public List<Matricula> listarMatriculas() {		
		Query query = entityManager.createQuery("select m from Matricula m ");

		return query.getResultList();
	}

}
