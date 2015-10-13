/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.Disciplina;
import br.com.sistemaescolar.service.DisciplinaService;

/**
 * @author Leonardo Ribeiro
 *
 */
@Controller
public class DisciplinaController {
	
	@Inject
	private DisciplinaService disciplinaService;
	
	@Inject
	private Result result;
	
	@Path("/disciplina/novo")
    public void novo() {        
    }
	
	@Post
	public void adiciona(Disciplina disciplina) {
		disciplinaService.insert(disciplina);
		result.redirectTo(DisciplinaController.class).novo();
	}

}
