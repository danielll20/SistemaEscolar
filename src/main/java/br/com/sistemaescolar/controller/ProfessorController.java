/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.Professor;
import br.com.sistemaescolar.service.ProfessorService;

/**
 * @author Leonardo Ribeiro 
 * @since 15/10/2015
 */
@Controller
public class ProfessorController {

	@Inject
	private ProfessorService professorService;

	@Inject
	private Result result;

	@Path("/professor/novo")
	public void novo() {

	}

	@Post
	public void adiciona(Professor professor) {
		professorService.insert(professor);
		result.redirectTo(ProfessorController.class).novo();

	}

}
