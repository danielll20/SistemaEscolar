package br.com.sistemaescolar.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Classe gen�rica de acesso aos m�todos de persist�ncia.
 * @author Daniel Correia
 * @since 31-08-2015
 * 
 *
 */
public class GenericDao {

	@Inject
	private EntityManager entityManager;
	
	/**
	 * M�todo gen�rico para inser��o de objetos.
	 * 
	 * @author Daniel Correia
	 * @param objeto
	 * @since 31-08-2015
	 *
	 */
	public <E> void insert(E objeto) {
		entityManager.persist(objeto);
		entityManager.flush();					
	}
	
	/**
	 * M�todo gen�rico para atualizar um objeto.
	 * 
	 * @author Daniel Correia
	 * @param objeto
	 * @since 31-08-2015
	 *
	 */
	public <E> void update(E objeto) {
		entityManager.merge(objeto);
		entityManager.flush();					
	}
	
	/**
	 * M�todo gen�rico para deletar um objeto.
	 * 
	 * @author Daniel Correia
	 * @param objeto
	 * @since 31-08-2015
	 *
	 */
	public <E> void delete(E objeto) {
		entityManager.remove(objeto);
		entityManager.flush();					
	}
	
	/**
	 * M�todo gen�rico para bscar todos os objeto.
	 * 
	 * @author Daniel Correia
	 * @param objeto
	 * @since 31-08-2015
	 *
	 */
	@SuppressWarnings("unchecked")
	public <E> List<E> findAll(E objeto) {
		Query query = entityManager.createQuery("select g from "+objeto.getClass().getName()+ "g");
		
		return query.getResultList();
	}
	
	
}
