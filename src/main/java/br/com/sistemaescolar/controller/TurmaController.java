/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.Turma;
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
	private Result result;
	
	@Path("/turma/novo")
    public void novo() {        
    }
	
	@Post
	public void adiciona(Turma turma) {
		turmaService.insert(turma);
		result.redirectTo(TurmaController.class).novo();
	}

}
