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
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("idTurma", idTurma);
		
		return query.getResultList();
	}

	public List<AtribuirProfessorTurma> listarTurmasPorUsuario(Long idUsuario) {
		StringBuffer jpql = new StringBuffer();
		
		jpql.append(" select apt from AtribuirProfessorTurma apt ");
		jpql.append(" inner join apt.professor p ");
		jpql.append(" inner join apt.turma t ");
		jpql.append(" where apt.professor.usuario.id = :idUsuario ");
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("idUsuario", idUsuario);
		
		return query.getResultList();
	}

}
