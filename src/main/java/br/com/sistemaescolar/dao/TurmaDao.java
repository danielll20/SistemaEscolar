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
	
	public List<Turma> listarTodos() {
		Query query = entityManager.createQuery("select a from Turma a ");
		
		return query.getResultList();
	}
	
	public Turma buscarPorId(Long id) {
		return entityManager.find(Turma.class, id);
	}

}
