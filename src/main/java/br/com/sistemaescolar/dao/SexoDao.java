/**
 * 
 */
package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.sistemaescolar.modelo.Sexo;

/**
 * @author Daniel Correia
 * @since 12/01/2016
 *
 */
public class SexoDao extends GenericDao{

	@Inject
	private EntityManager entityManager;
	
	public List<Sexo> listar() {
		Query query = entityManager.createQuery(" select s from Sexo s ");

		return query.getResultList();
	}
	
}
