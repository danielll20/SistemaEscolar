/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.Curso;
import br.com.sistemaescolar.service.CursoService;

/**
 * @author Daniel Correia
 * @since  20/10/2015
 *
 */
@Controller
public class CursoController {

	@Inject
	private Result result;
	
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

}
