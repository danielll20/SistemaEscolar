/**
 * 
 */
package br.com.sistemaescolar.controller;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.Valid;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.validator.Validator;
import br.com.sistemaescolar.modelo.Curso;
import br.com.sistemaescolar.service.CursoService;

/**
 * @author Daniel Correia
 * @since  22/10/2015
 *
 */
@Controller
public class CursoController {

	@Inject
	private Result result;
	
	@Inject
	private Validator validator;
	
	@Inject
	private CursoService cursoService;
	
	@Path("/curso/novo")
	public void novo() {
	}

	@Post
	public void adiciona(Curso curso) {
		cursoService.insert(curso);
		result.redirectTo(this).novo();
	}
	
	@Get("/curso/listar")
	public void listar() {
		List<Curso> cursos = cursoService.listarTodos();
		result.include("listaCursos", cursos);
	}
	
	@Get("/curso/{curso.id}")
	public void atualizarFormulario(Curso curso) {
		result.include("curso", cursoService.buscarPorId(curso.getId()));		
	}
	
	@Post("/curso/{id}")
	@Transactional
	public void atualizar(Long id, @Valid Curso curso) {
		curso.setId(id);
		validator.onErrorForwardTo(this).atualizarFormulario(curso);
		
		cursoService.atualizar(curso);
		result.redirectTo(this).listar();
	}
	
	@Get("/curso/delete/{id}")
	@Transactional
	public void remove(Long id) {
		Curso curso = cursoService.buscarPorId(id);
		cursoService.remove(curso);
		result.redirectTo(this).listar();
	}

}
