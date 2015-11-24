/**
 * 
 */
package br.com.sistemaescolar.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.AtribuirDisciplinaCurso;

/**
 * @author Daniel Correia
 * @since 19/11/2015
 *
 */
public class AtribuirDisciplinaCursoDao extends GenericDao {

	@Inject
	private EntityManager entityManager;
	
	public AtribuirDisciplinaCurso verificaAtribuicaoDisciplinaCurso(Long idDisciplina, Long idCurso) throws NoResultException {
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select adc from AtribuirDisciplinaCurso adc ");
		jpql.append(" where adc.disciplina.id = :idDisciplina ");
		jpql.append(" and adc.curso.id = :idCurso ");
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("idDisciplina", idDisciplina);
		query.setParameter("idCurso", idCurso);
					
		return (AtribuirDisciplinaCurso) query.getSingleResult();
	}
	
	public AtribuirDisciplinaCurso buscaPorId(Long id) {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select adc from AtribuirDisciplinaCurso adc");
		jpql.append(" where adc.disciplina.id = :id");
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("id", id);
					
		return (AtribuirDisciplinaCurso) query.getSingleResult();
	}
	
}
