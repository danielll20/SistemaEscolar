/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.ProfessorDao;
import br.com.sistemaescolar.modelo.Professor;

/**
 * @author Leonardo Ribeiro
 * @since  24/10/2015
 */
public class ProfessorService {
	
	@Inject
	private ProfessorDao professorDao;
	
	public void insert(Professor professor) {
		professorDao.insert(professor);
	}
	
	public List<Professor> listarTodos() {
		return professorDao.listarTodos();
	}
	
	public Professor buscarPorId(Long id) {
		return professorDao.buscaPorId(id);
	}
	
	public void remove(Professor professor) {
		professorDao.delete(professor);
	}
	
	public void atualizar(Professor professor) {
		professorDao.update(professor);
	}

}
