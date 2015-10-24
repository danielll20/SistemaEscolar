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
import br.com.sistemaescolar.modelo.Instituicao;
import br.com.sistemaescolar.service.InstituicaoService;

/**
 * @author Leonardo Ribeiro
 * @since 24/10/2015
 */
@Controller
public class InstituicaoController {
	
	@Inject 
	private InstituicaoService instituicaoService;
	
	@Inject 
	private Result result;
	
	@Inject
	private Validator validator;
	
	@Path("/instituicao/novo")
    public void novo() {        
    }
	
	@Post
	public void adiciona(Instituicao instituicao) {
		instituicaoService.insert(instituicao);
		result.redirectTo(InstituicaoController.class).novo();
	}
	
	@Get("/instituicao/listar")
	public void listar() {
		List<Instituicao> instituicoes = instituicaoService.listarTodos();
		result.include("listaInstituicoes", instituicoes);
	}
	
	@Get("/instituicao/{instituicao.id}")
	public void atualizarFormulario(Instituicao instituicao) {
		result.include("instituicao", instituicaoService.buscaPorId(instituicao.getId()));
	}
	
	@Post("/instituicao/{id}")
	@Transactional
	public void atualizar(Long id, @Valid Instituicao instituicao) {
		instituicao.setId(id);
		validator.onErrorForwardTo(this).atualizarFormulario(instituicao);
		
		instituicaoService.atualizar(instituicao);
		result.redirectTo(this).listar();
	}
	
	@Get("/instituicao/delete/{id}")
	@Transactional
	public void remove(Long id) {
		Instituicao instituicao = instituicaoService.buscaPorId(id);
		instituicaoService.remove(instituicao);
		result.redirectTo(this).listar();
	}

}
