/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Aluno;

/**
 * @author Daniel Correia
 * @since 16/11/2015
 *
 */
public class FrequenciaDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;
	
	public List<Aluno> listarAlunosPorCursoTurma(Long id) {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select a from Matricula m ");
		jpql.append(" inner join m.aluno a ");
		jpql.append(" inner join m.turma t ");
		jpql.append(" inner join t.curso c ");
		jpql.append(" where c.id = :id ");
				
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("id", id);
					
		return query.getResultList();
	}
}
