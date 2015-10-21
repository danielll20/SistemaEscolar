/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Turma;

/**
 * @author Leonardo Ribeiro
 * @since 16/10/2015
 */
public class TurmaDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;

	public List<Turma> listarTodas() {
		Query query = entityManager.createQuery("select t from Turma t ");

		return query.getResultList();		
	}

}
