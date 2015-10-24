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
import br.com.sistemaescolar.modelo.Professor;
import br.com.sistemaescolar.service.ProfessorService;

/**
 * @author Leonardo Ribeiro
 * @since 24/10/2015
 */
@Controller
public class ProfessorController {

	@Inject
	private ProfessorService professorService;

	@Inject
	private Result result;

	@Inject
	private Validator validator;

	@Path("/professor/novo")
	public void novo() {

	}

	@Post
	public void adiciona(Professor professor) {
		professorService.insert(professor);
		result.redirectTo(ProfessorController.class).novo();
	}
	
	@Get("/professor/listar")
	public void listar() {
		List<Professor> professores = professorService.listarTodos();
		result.include("listaProfessores", professores);
	}
	
	@Get("/professor/{professor.id}")
	public void atualizarFormulario(Professor professor) {
		result.include("professor", professorService.buscarPorId(professor.getId()));
	}
	
	@Post("/professor/{id}")
	@Transactional
	public void atualizar(Long id, @Valid Professor professor) {
		professor.setId(id);
		validator.onErrorForwardTo(this).atualizarFormulario(professor);
		
		professorService.atualizar(professor);
		result.redirectTo(this).listar();
	}
	
	@Get("/professor/delete/{id}")
	@Transactional
	public void remove(Long id) {
		Professor professor = professorService.buscarPorId(id);
		professorService.remove(professor);
		result.redirectTo(this).listar();
	}

}
