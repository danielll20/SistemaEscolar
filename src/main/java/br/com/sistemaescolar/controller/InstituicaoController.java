/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.Instituicao;
import br.com.sistemaescolar.service.InstituicaoService;

/**
 * @author Leonardo Ribeiro
 * @since 10/10/2015
 */
@Controller
public class InstituicaoController {
	
	@Inject 
	private InstituicaoService instituicaoService;
	
	@Inject 
	private Result result;
	
	@Path("/instituicao/novo")
    public void novo() {        
    }
	
	@Post
	public void adiciona(Instituicao instituicao) {
		instituicaoService.insert(instituicao);
		result.redirectTo(InstituicaoController.class).novo();
	}

}
