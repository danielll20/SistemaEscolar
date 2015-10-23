package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Curso;

/**
 * Classe de acesso aos métodos de persistência.
 * 
 * @author Daniel Correia
 * @since 22-10-2015
 *
 */
public class CursoDao extends GenericDao {

	@Inject
	private EntityManager entityManager;
	
	public List<Curso> listarTodos() {
		Query query = entityManager.createQuery("select c from Curso c ");

		return query.getResultList();
	}
	
	public Curso buscarPorId(Long id) {
		return entityManager.find(Curso.class, id);
	}
}
