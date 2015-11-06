/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Matricula;

/**
 * Classe de acesso aos métodos de persistência.
 * 
 * @author Daniel Correia
 * @since  21/10/2015
 *
 */
public class MatriculaDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;

	public List<Matricula> listarMatriculas() {		
		Query query = entityManager.createQuery("select m from Matricula m ");

		return query.getResultList();
	}

//	public List<Matricula> buscaPorNome(String nome) {
//		
//		StringBuffer jpql = new StringBuffer();
//		jpql.append(" select a.nome from Matricula m ");
//		jpql.append(" inner join m.aluno a ");
//		jpql.append(" where a.nome = :nome ");
//		
//		Query query = entityManager.createQuery(jpql.toString());
//		query.setParameter("nome", nome);
//		
//		return query.getResultList();
//	}

}
