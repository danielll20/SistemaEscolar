/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Disciplina;

/**
 * @author Leonardo Ribeiro
 * @since 21/10/2015
 */
public class DisciplinaDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;
	
	public List<Disciplina> listarTodos() {
		Query query = entityManager.createQuery("select a from Disciplina a ");
		
		return query.getResultList();
	}
	
	public Disciplina buscarPorId(Long id) {
		return entityManager.find(Disciplina.class, id);
	}
	
	public List<Disciplina> listaDisciplinasPorProfessor(Long idProfessor) {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select ad from AtribuicaoDisciplina ad ");
		jpql.append(" inner join ad.disciplina d ");
		jpql.append(" inner join ad.professor p ");
		jpql.append(" where ad.professor.id = :idProfessor ");
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("idProfessor", idProfessor);
					
		return query.getResultList();
	}
	
	public List<Disciplina> listaDisciplinasPorCurso(Long idCurso) {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select adc from AtribuirDisciplinaCurso adc ");
		jpql.append(" inner join adc.disciplina d ");
		jpql.append(" inner join adc.curso c ");
		jpql.append(" where adc.curso.id = :idCurso ");
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("idCurso", idCurso);
					
		return query.getResultList();
	}

}
