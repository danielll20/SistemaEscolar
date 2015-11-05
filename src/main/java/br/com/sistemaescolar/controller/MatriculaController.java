/**
 * 
 */
package br.com.sistemaescolar.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.Matricula;
import br.com.sistemaescolar.service.AlunoService;
import br.com.sistemaescolar.service.MatriculaService;
import br.com.sistemaescolar.service.SituacaoService;
import br.com.sistemaescolar.service.TurmaService;

/**
 * @author Daniel Correia
 * @since  21/10/2015
 *
 */
@Controller
public class MatriculaController {

	@Inject
	private Result result;
	
	@Inject
	private AlunoService alunoService;
	
	@Inject
	private TurmaService turmaService;
	
	@Inject
	private MatriculaService matriculaService;
	
	@Inject
	private SituacaoService situacaoService;
	
	@Path("/matricula/novo")
	public void novo() {	
		result.include("alunos", alunoService.listarTodos());
		result.include("turmas", turmaService.listarTodas());
		result.include("matriculas", matriculaService.listarMatriculas());
		result.include("situacaoPadrao", situacaoService.listarSituacao());		
	}
	
	@Post("/matricula/adiciona")
	public void adiciona(Matricula matricula) {
		matriculaService.insert(matricula);
		result.redirectTo(this).novo();
	}		
			
}
