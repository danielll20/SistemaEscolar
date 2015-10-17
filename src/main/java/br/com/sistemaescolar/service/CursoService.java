package br.com.sistemaescolar.service;

import java.util.List;

import javax.inject.Inject;

import br.com.sistemaescolar.dao.CursoDao;
import br.com.sistemaescolar.modelo.Curso;

/**
 * Classe que trata as regras de négocio do curso.
 * 
 * @author Daniel Freitas
 * @since 17/10/2015
 */
public class CursoService {

	@Inject
	private CursoDao cursoDao;	
	
	public List<Curso> listarTodos() {
		return cursoDao.listarTodos();
	}
}
