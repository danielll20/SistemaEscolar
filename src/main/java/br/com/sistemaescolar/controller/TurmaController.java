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
import br.com.sistemaescolar.modelo.Turma;
import br.com.sistemaescolar.service.CursoService;
import br.com.sistemaescolar.service.TurmaService;

/**
 * @author Leonardo Ribeiro
 * @since 16/10/2015
 */
@Controller
public class TurmaController {

	@Inject
	private TurmaService turmaService;
	
	@Inject
	private CursoService cursoService;

	@Inject
	private Result result;
	
	@Inject
	private Validator validator;

	@Path("/turma/novo")
	public void novo() {
		carregaCursos();
	}
	
	private void carregaCursos() {
		result.include("cursos", cursoService.listarTodos());
	}

	@Post
	public void adiciona(Turma turma) {
		turmaService.insert(turma);
		result.redirectTo(TurmaController.class).novo();
	}
	
	@Get("/turma/listar")
	public void listar() {
		List<Turma> turmas = turmaService.listarTodas();
		result.include("listaTurmas", turmas);
	}
	
	@Get("/turma/{turma.id}")
	public void atualizarFormulario(Turma turma) {
		result.include("turma", turmaService.buscarPorId(turma.getId()));	
		carregaCursos();
	}
	
	@Post("/turma/{id}")
	@Transactional
	public void atualizar(Long id, @Valid Turma turma) {
		turma.setId(id);
		validator.onErrorForwardTo(this).atualizarFormulario(turma);
		
		turmaService.atualizar(turma);
		result.redirectTo(this).listar();
	}
	
	@Get("/turma/delete/{id}")
	@Transactional
	public void remove(Long id) {
		Turma turma = turmaService.buscarPorId(id);
		turmaService.remove(turma);
		result.redirectTo(this).listar();
	}

}
