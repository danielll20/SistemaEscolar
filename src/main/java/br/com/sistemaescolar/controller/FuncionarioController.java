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
import br.com.sistemaescolar.modelo.Funcionario;
import br.com.sistemaescolar.service.FuncionarioService;
import br.com.sistemaescolar.service.SexoService;

/**
 * @author Leonardo Ribeiro
 * @since 24/10/2015
 */
@Controller
public class FuncionarioController {

	@Inject
	private FuncionarioService funcionarioService;

	@Inject
	private Result result;

	@Inject
	private Validator validator;
	
	@Inject
	private SexoService sexoService;	

	@Path("/funcionario/novo")
	public void novo() {
		carregaSexo();
	}
	
	private void carregaSexo() {
		result.include("carregaSexo", sexoService.listar());
	}

	@Post
	public void adiciona(Funcionario funcionario) {
		funcionarioService.insert(funcionario);
		result.redirectTo(FuncionarioController.class).novo();
	}

	@Get("/funcionario/listar")
	public void listar() {
		List<Funcionario> funcionarios = funcionarioService.listarTodos();
		result.include("listaFuncionarios", funcionarios);
	}

	@Get("/funcionario/{funcionario.id}")
	public void atualizarFormulario(Funcionario funcionario) {
		result.include("funcionario", funcionarioService.buscarPorId(funcionario.getId()));
		carregaSexo();
	}

	@Post("/funcionario/{id}")
	@Transactional
	public void atualizar(Long id, @Valid Funcionario funcionario) {
		funcionario.setId(id);
		validator.onErrorForwardTo(this).atualizarFormulario(funcionario);

		funcionarioService.atualizar(funcionario);
		result.redirectTo(this).listar();
	}

	@Get("/funcionario/delete/{id}")
	@Transactional
	public void remove(Long id) {
		Funcionario funcionario = funcionarioService.buscarPorId(id);
		funcionarioService.remove(funcionario);
		result.redirectTo(this).listar();
	}

}
