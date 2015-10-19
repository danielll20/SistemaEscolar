/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.Funcionario;
import br.com.sistemaescolar.service.FuncionarioService;

/**
 * @author Leonardo Ribeiro
 * @since 19/10/2015
 */
@Controller
public class FuncionarioController {
	
	@Inject
	private FuncionarioService funcionarioService;
	
	@Inject
	private Result result;
	
	@Path("/funcionario/novo")
    public void novo() {        
    }
	
	@Post
	public void adiciona(Funcionario funcionario) {
		funcionarioService.insert(funcionario);
		result.redirectTo(FuncionarioController.class).novo();
	}

}
