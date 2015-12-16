/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.AtribuirProfessorTurma;

/**
 * @author Daniel Correia
 *
 */
public class AtribuirProfessorTurmaDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;

	public List<AtribuirProfessorTurma> listarProfessoresDaTurma(Long idTurma) {
		StringBuffer jpql = new StringBuffer();
		
		jpql.append(" select apt from AtribuirProfessorTurma apt ");
		jpql.append(" where apt.turma.id = :idTurma ");
//		jpql.append(" where a.nome = :nome ");
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("idTurma", idTurma);
		
		return query.getResultList();
	}

}
