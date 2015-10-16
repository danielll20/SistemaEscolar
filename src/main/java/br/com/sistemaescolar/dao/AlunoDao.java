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
 * Classe de acesso aos métodos de persistência.
 * 
 * @author Daniel Correia
 * @since 31-08-2015
 *
 */
public class AlunoDao extends GenericDao {

	@Inject
	private EntityManager entityManager;

	public List<Aluno> listarTodos() {
		Query query = entityManager.createQuery("select a from Aluno a ");

		return query.getResultList();
	}

	public Aluno buscarPorId(Long id) {
		return entityManager.find(Aluno.class, id);
	}
}
