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
 * @author Daniel Correia
 * @since 16/11/2015
 *
 */
public class FrequenciaDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;
	
	public List<Matricula> listarAlunosPorCursoTurma(Long id) {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select m from Matricula m ");
		jpql.append(" inner join fetch m.aluno a ");
		jpql.append(" inner join fetch m.turma t ");
		jpql.append(" where t.id = :id ");
//		jpql.append(" inner join t.curso c ");
//		jpql.append(" where c.id = :id ");
				
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("id", id);
					
		return query.getResultList();
	}
}
