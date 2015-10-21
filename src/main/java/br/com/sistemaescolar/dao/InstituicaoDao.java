/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author Leonardo Ribeiro
 *
 */
public class InstituicaoDao extends GenericDao {
	
	@Inject
	private EntityManager entityManager;

	public String listarInstituicaoPorNomeFantasia() { 
		Query query = entityManager.createQuery("select i.nomeFantasia from Instituicao i ");
		
		List<String> instituicao = query.getResultList();
		
		return instituicao.get(0);
	}
	


}
