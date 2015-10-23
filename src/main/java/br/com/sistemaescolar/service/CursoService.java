package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.CursoDao;
import br.com.sistemaescolar.modelo.Curso;

/**
 * Classe que trata as regras de négocio do curso.
 * 
 * @author Daniel Freitas
 * @since 22/10/2015
 */
public class CursoService {

	@Inject
	private CursoDao cursoDao;	
	
	public void insert(Curso curso) {
		cursoDao.insert(curso);		
	}
	
	public List<Curso> listarTodos() {
		return cursoDao.listarTodos();
	}
	
	public Curso buscarPorId(Long id) {
		return cursoDao.buscarPorId(id);
	}
	
	public void atualizar(Curso curso) {
		cursoDao.update(curso);
	}
	
	public void remove(Curso curso) {
		cursoDao.delete(curso);
	}
	
	
}
