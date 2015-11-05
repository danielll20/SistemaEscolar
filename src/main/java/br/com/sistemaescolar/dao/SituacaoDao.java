/**
 * 
 */
package br.com.sistemaescolar.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author Daniel Correia
 * @since 03/11/2015
 *
 */
public class SituacaoDao extends GenericDao {

	@Inject
	private EntityManager entityManager;

	public Long listarSituacao() {		
		Query query = entityManager.createQuery("select s.id from Situacao s where s.descricao = 'MATRICULADO' ");
		
		return (Long) query.getSingleResult();
	}
}
