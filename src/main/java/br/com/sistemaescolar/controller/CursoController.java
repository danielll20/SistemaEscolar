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
import br.com.sistemaescolar.modelo.AtribuirDisciplinaCurso;
import br.com.sistemaescolar.modelo.Curso;
import br.com.sistemaescolar.modelo.Disciplina;
import br.com.sistemaescolar.service.AtribuirDisciplinaCursoService;
import br.com.sistemaescolar.service.CursoService;
import br.com.sistemaescolar.service.DisciplinaService;

/**
 * @author Daniel Correia
 * @since  22/10/2015
 *
 */
@Controller
public class CursoController {

	@Inject
	private Result result;
	
	@Inject
	private Validator validator;
	
	@Inject
	private CursoService cursoService;
	
	@Inject
	private DisciplinaService disciplinaService;
	
	@Inject
	private AtribuirDisciplinaCursoService atribuirDisciplinaCursoService;
	
	@Path("/curso/novo")
	public void novo() {
	}

	@Post
	public void adiciona(Curso curso) {
		cursoService.insert(curso);
		result.redirectTo(this).novo();
	}
	
	@Get("/curso/listar")
	public void listar() {
		List<Curso> cursos = cursoService.listarTodos();
		result.include("listaCursos", cursos);
	}
	
	@Get("/curso/{curso.id}")
	public void atualizarFormulario(Curso curso) {
		result.include("curso", cursoService.buscarPorId(curso.getId()));		
	}
	
	@Post("/curso/{id}")
	@Transactional
	public void atualizar(Long id, @Valid Curso curso) {
		curso.setId(id);
		validator.onErrorForwardTo(this).atualizarFormulario(curso);
		
		cursoService.atualizar(curso);
		result.redirectTo(this).listar();
	}
	
	@Get("/curso/delete/{id}")
	@Transactional
	public void remove(Long id) {
		Curso curso = cursoService.buscarPorId(id);
		cursoService.remove(curso);
		result.redirectTo(this).listar();
	}
	
	@Get("/curso/atribuirDisciplinaCurso/{curso.id}")
	public void atribuirDisciplinaCurso(Curso curso) {
		//Busca todos os cursos pelo id que vem da url.
		Curso cursoId = cursoService.buscarPorId(curso.getId());		
		result.include("cursoPorId", cursoId);
		
		//Lista todas as disciplinas para serem populadas no modal atribuirDisciplinaCurso.
		List<Disciplina> disciplinas = disciplinaService.listarTodos();
		result.include("disciplinas", disciplinas);
		
		//Lista todas as disciplinas de acordo com o id do curso selecionado para popular a tabela
		//no modal atribuirDisciplinaCurso.
		List<Disciplina> disciplinasPorCurso =  disciplinaService.listaDisciplinaPorCurso(curso.getId());
		result.include("disciplinasPorCurso", disciplinasPorCurso);
	}
	
	@Post("/curso/adicionaDisciplinaCurso/{curso.id}")
	public void adicionaDisciplinaCurso(Curso curso, List<Disciplina> disciplinas) {
		
		for (Disciplina disciplina : disciplinas) {			
			AtribuirDisciplinaCurso atribuirDisciplinaCurso = new AtribuirDisciplinaCurso();
			atribuirDisciplinaCurso.setCurso(curso);
			atribuirDisciplinaCurso.setDisciplina(disciplina);
			
			AtribuirDisciplinaCurso verificaAtribuicaoDisciplina = atribuirDisciplinaCursoService
					.verificaAtribuicaoDisciplinaCurso(atribuirDisciplinaCurso
							.getDisciplina().getId(), atribuirDisciplinaCurso
							.getCurso().getId());
			 
			if(verificaAtribuicaoDisciplina == null) {
				atribuirDisciplinaCursoService.atribuirDisciplinaCurso(atribuirDisciplinaCurso);
			}else{
				result.include("disciplinaAtribuida","A disciplina selecionada ja está atribuida ao curso");
			}
					
		}
				
		result.redirectTo(this).listar();
	}
	
	@Get("/curso/atribuirDisciplinaCurso/delete/{id}")
	@Transactional
	public void removeDisciplinaCurso(Long id) {		
		AtribuirDisciplinaCurso atribuirDisciplinaCurso = atribuirDisciplinaCursoService.buscaPorId(id);
		atribuirDisciplinaCursoService.remove(atribuirDisciplinaCurso);
		result.redirectTo(this).listar();
	}

}
