/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Instituicao;

/**
 * @author Leonardo Ribeiro
 * @since 24/10/2015
 */
public class InstituicaoDao extends GenericDao {

	@Inject
	private EntityManager entityManager;

	public Instituicao listarInstituicaoPorNomeFantasia() throws NoResultException {
		Query query = entityManager.createQuery("select i from Instituicao i");
		query.setMaxResults(1);

		return (Instituicao) query.getSingleResult();
	}

	public List<Instituicao> lstarTodos() {
		Query query = entityManager.createQuery("select i from Instituicao i");

		return query.getResultList();
	}

	public Instituicao buscarPorId(Long id) {
		return entityManager.find(Instituicao.class, id);
	}

}
