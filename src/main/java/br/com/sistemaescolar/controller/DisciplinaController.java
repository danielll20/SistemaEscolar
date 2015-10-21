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
import br.com.sistemaescolar.modelo.Disciplina;
import br.com.sistemaescolar.service.DisciplinaService;

/**
 * @author Leonardo Ribeiro
 * @since 21/10/2015
 */
@Controller
public class DisciplinaController {
	
	@Inject
	private DisciplinaService disciplinaService;
	
	@Inject
	private Result result;
	
	@Inject
	private Validator validator;
	
	@Path("/disciplina/novo")
    public void novo() {        
    }
	
	@Post
	public void adiciona(Disciplina disciplina) {
		disciplinaService.insert(disciplina);
		result.redirectTo(DisciplinaController.class).novo();
	}
	
	@Get("/disciplina/listar")
	public void listar() {
		List<Disciplina> disciplinas = disciplinaService.listarTodos();
		result.include("listaDisciplinas", disciplinas);
	}
	
	@Get("/disciplina/{disciplina.id}")
	public void atualizarFormulario(Disciplina disciplina) {
		result.include("disciplina", disciplinaService.buscaPorId(disciplina.getId()));
	}
	
	@Post("/disciplina/{id}")
	@Transactional
	public void atualizar(Long id, @Valid Disciplina disciplina) {
		disciplina.setId(id);
		validator.onErrorForwardTo(this).atualizarFormulario(disciplina);
		
		disciplinaService.atualizar(disciplina);
		result.redirectTo(this).listar();
	}
	
	@Get("/disciplina/delete/{id}")
	@Transactional
	public void remove(Long id) {
		Disciplina disciplina = disciplinaService.buscaPorId(id);
		disciplinaService.remove(disciplina);
		result.redirectTo(this).listar();
	}

}
