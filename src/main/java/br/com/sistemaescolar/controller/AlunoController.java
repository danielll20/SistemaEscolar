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
import br.com.caelum.vraptor.validator.SimpleMessage;
import br.com.caelum.vraptor.validator.Validator;
import br.com.sistemaescolar.modelo.Aluno;
import br.com.sistemaescolar.service.AlunoService;
import br.com.sistemaescolar.service.SexoService;

/**
 * @author Daniel Correia
 * @since 08/10/2015
 *
 */
@Controller
public class AlunoController {

	@Inject
	private AlunoService alunoService;

	@Inject
	private Result result;

	@Inject
	private Validator validator;
	
	@Inject
	private SexoService sexoService;

	@Path("/aluno/novo")
	public void novo() {
		carregaSexo(); 
	}
	
	private void carregaSexo() {
		result.include("carregaSexo", sexoService.listar());
	}

	@Post
	public void adiciona(final Aluno aluno) {
		validator.addIf(aluno.getNome() == null, new SimpleMessage(null, "- Campo nome obrigatório."));
		validator.addIf(aluno.getDataNascimento() == null, new SimpleMessage(null, "- Campo data de nascimento obrigatório."));
		validator.onErrorUsePageOf(this).novo();
		alunoService.insert(aluno);
		result.redirectTo(AlunoController.class).novo();
	}

	@Get("/aluno/listar")
	public void listar() {
		List<Aluno> alunos = alunoService.listarTodos();
		result.include("listaAlunos", alunos);
	}

	@Get("/aluno/{aluno.id}")
	public void atualizarFormulario(Aluno aluno) {
		Aluno alunoS = alunoService.buscarPorId(aluno.getId());
		carregaSexo();
		result.include("aluno", alunoS);		
	}

	@Post("/aluno/{id}")
	@Transactional
	public void atualizar(Long id, @Valid Aluno aluno) {
		aluno.setId(id);
		validator.onErrorForwardTo(this).atualizarFormulario(aluno);

		alunoService.atualizar(aluno);
		result.redirectTo(this).listar();
	}

	@Get("/aluno/delete/{id}")
	@Transactional
	public void remove(Long id) {
		Aluno aluno = alunoService.buscarPorId(id);
		alunoService.remove(aluno);
		result.redirectTo(this).listar();
	}

}