/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Funcionario;

/**
 * @author Leonardo Ribeiro 
 * @since 24/10/2015
 */
public class FuncionarioDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;
	
	public List<Funcionario> listarTodos() {
		Query query = entityManager.createQuery("select f from Funcionario f");
		
		return query.getResultList();
	}
	
	public Funcionario buscarPorId(Long id) {
		return entityManager.find(Funcionario.class, id);
	}

}
