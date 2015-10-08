/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.Aluno;
import br.com.sistemaescolar.service.AlunoService;

/**
 * @author Daniel Correia
 * @since  08/10/2015
 *
 */
@Controller
public class AlunoController {

	@Inject 
	private AlunoService alunoService;
	
	@Inject 
	private Result result;
	
	@Path("/aluno/novo")
    public void novo() {        
    }
	
	@Post
	public void adiciona(Aluno aluno) {
		alunoService.insert(aluno);
		result.redirectTo(AlunoController.class).novo();
	}
}
