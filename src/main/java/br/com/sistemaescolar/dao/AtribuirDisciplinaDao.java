/**
 * 
 */
package br.com.sistemaescolar.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.AtribuicaoDisciplina;

/**
 * @author Daniel Correia
 * @since 13/11/2015
 */
public class AtribuirDisciplinaDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;

	public AtribuicaoDisciplina buscaPorId(Long id) {
		
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select ad from AtribuicaoDisciplina ad");
		jpql.append(" where ad.disciplina.id = :id");
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("id", id);
					
		return (AtribuicaoDisciplina) query.getSingleResult();
	}
	
	public AtribuicaoDisciplina verificaAtribuicaoDisciplina(Long idDisciplina, Long idProfessor) throws NoResultException {
		StringBuffer jpql = new StringBuffer();
		jpql.append(" select ad from AtribuicaoDisciplina ad ");
		jpql.append(" where ad.disciplina.id = :idDisciplina ");
		jpql.append(" and ad.professor.id = :idProfessor ");
		
		Query query = entityManager.createQuery(jpql.toString());
		query.setParameter("idDisciplina", idDisciplina);
		query.setParameter("idProfessor", idProfessor);
					
		return (AtribuicaoDisciplina) query.getSingleResult();
	}

}
