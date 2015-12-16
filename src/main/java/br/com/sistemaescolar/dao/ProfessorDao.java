/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.AtribuicaoDisciplina;
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

	public List<AtribuicaoDisciplina> listarProfessorDisciplina() {
		StringBuffer jpql = new StringBuffer();
		
		jpql.append(" select ad from AtribuicaoDisciplina ad ");
		jpql.append(" inner join ad.disciplina d ");
		jpql.append(" inner join ad.professor p ");
		
		Query query = entityManager.createQuery(jpql.toString());
		
		return query.getResultList();
	}

}
