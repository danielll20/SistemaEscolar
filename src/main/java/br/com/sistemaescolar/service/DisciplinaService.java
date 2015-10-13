/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.DisciplinaDao;
import br.com.sistemaescolar.modelo.Disciplina;

/**
 * @author Leonardo Ribeiro
 *
 */
public class DisciplinaService {
	
	@Inject
	private DisciplinaDao disciplinaDao;
	
	public void insert(Disciplina disciplina) {
		disciplinaDao.insert(disciplina);
	}

}
