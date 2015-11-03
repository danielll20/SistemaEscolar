/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Situacao;

/**
 * @author Daniel Correia
 * @since 03/11/2015
 *
 */
public class SituacaoDao extends GenericDao {

	@Inject
	private EntityManager entityManager;

	public List<Situacao> listarTodos() {
		Query query = entityManager.createQuery("select s from Situacao s ");

		return query.getResultList();
	}
}
