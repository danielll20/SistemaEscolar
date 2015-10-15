/**
 * 
 */
package br.com.sistemaescolar.service;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.ProfessorDao;
import br.com.sistemaescolar.modelo.Professor;

/**
 * @author Leonardo Ribeiro
 * @since  15/10/2015
 */
public class ProfessorService {
	
	@Inject
	private ProfessorDao professorDao;
	
	public void insert(Professor professor) {
		professorDao.insert(professor);
	}

}
