/**
 * 
 */
package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.DisciplinaDao;
import br.com.sistemaescolar.modelo.Disciplina;

/**
 * @author Leonardo Ribeiro
 * @since 21/10/2015
 */
public class DisciplinaService {
	
	@Inject
	private DisciplinaDao disciplinaDao;
	
	public void insert(Disciplina disciplina) {
		disciplinaDao.insert(disciplina);
	}
	
	public List<Disciplina> listarTodos() {
		return disciplinaDao.listarTodos();
	}
	
	public Disciplina buscaPorId(Long id) {
		return disciplinaDao.buscarPorId(id);
	}
	
	public void atualizar(Disciplina disciplina) {
		disciplinaDao.update(disciplina);
	}
	
	public void remove(Disciplina disciplina) {
		disciplinaDao.delete(disciplina);
	}

	public List<Disciplina> listaDisciplinaPorProfessor(Long idProfessor) {
		return disciplinaDao.listaDisciplinasPorProfessor(idProfessor);
		
	}

}
