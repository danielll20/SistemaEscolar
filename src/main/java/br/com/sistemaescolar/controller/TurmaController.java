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
import br.com.sistemaescolar.modelo.AtribuicaoDisciplina;
import br.com.sistemaescolar.modelo.AtribuirProfessorTurma;
import br.com.sistemaescolar.modelo.Professor;
import br.com.sistemaescolar.modelo.Turma;
import br.com.sistemaescolar.service.AtribuirProfessorTurmaService;
import br.com.sistemaescolar.service.CursoService;
import br.com.sistemaescolar.service.ProfessorService;
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
	private CursoService cursoService;
	
	@Inject
	private ProfessorService professorService;
	
	@Inject
	private AtribuirProfessorTurmaService atribuirProfessorTurmaService;

	@Inject
	private Result result;
	
	@Inject
	private Validator validator;

	@Path("/turma/novo")
	public void novo() {
		carregaCursos();
	}
	
	private void carregaCursos() {
		result.include("cursos", cursoService.listarTodos());
	}

	@Post
	public void adiciona(Turma turma) {
		turmaService.insert(turma);
		result.redirectTo(TurmaController.class).novo();
	}
	
	@Get("/turma/listar")
	public void listar() {
		List<Turma> turmas = turmaService.listarTodas();
		result.include("listaTurmas", turmas);
	}
	
	@Get("/turma/{turma.id}")
	public void atualizarFormulario(Turma turma) {
		result.include("turma", turmaService.buscarPorId(turma.getId()));	
		carregaCursos();
	}
	
	@Post("/turma/{id}")
	@Transactional
	public void atualizar(Long id, @Valid Turma turma) {
		turma.setId(id);
		validator.onErrorForwardTo(this).atualizarFormulario(turma);
		
		turmaService.atualizar(turma);
		result.redirectTo(this).listar();
	}
	
	@Get("/turma/delete/{id}")
	@Transactional
	public void remove(Long id) {
		Turma turma = turmaService.buscarPorId(id);
		turmaService.remove(turma);
		result.redirectTo(this).listar();
	}
	
	@Get("/turma/atribuirProfessorTurma/{turma.id}")
	public void atribuirProfessorTurma(Turma turma) {
		//Busca a turma pelo id selecionada na tabela e exibe
		//seus dados para inseri-la no titulo do modal.
		Turma turmaId = turmaService.buscarPorId(turma.getId());
		result.include("turmaPorId", turmaId);
		
		//Busca todos os professores com suas disciplinas e exibe na dialog
		//atribuirProfesorTurma em forma de checkBox.
		List<AtribuicaoDisciplina> professores = professorService.listarProfessorDisciplina();
		result.include("professores", professores);
				
		List<AtribuirProfessorTurma> professoresDasTurmas = atribuirProfessorTurmaService.listarProfessoresDaTurma(turma.getId());		
		result.include("professoresDasTurmas", professoresDasTurmas);
	}
	
	@Post("/turma/adicionaProfessorTurma/{turmaPorId.id}")	
	public void adicionaProfessorTurma(Turma turmaPorId, List<Professor> professores) {
		for (Professor professor : professores) {
			AtribuirProfessorTurma atribuirProfessorTurma = new AtribuirProfessorTurma();
			atribuirProfessorTurma.setTurma(turmaPorId);
			atribuirProfessorTurma.setProfessor(professor);
			
			atribuirProfessorTurmaService.insert(atribuirProfessorTurma);
		}
		
		result.redirectTo(this).listar();
	}

}
