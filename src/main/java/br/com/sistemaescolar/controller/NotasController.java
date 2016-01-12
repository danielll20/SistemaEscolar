package br.com.sistemaescolar.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.AtribuirProfessorTurma;
import br.com.sistemaescolar.service.AtribuirProfessorTurmaService;

/**
 * @author Daniel Freitas
 * @since 02/12/2015
 */
@Controller
public class NotasController {

	@Inject
	private Result result;			
		
	@Inject
	private AtribuirProfessorTurmaService atribuirProfessorTurmaService;
	
	@Inject
	private UsuarioLogado usuarioLogado;
	
	@Get
	@Path("/notas/lancar")	
	public void lancar() {	
		//Obs: Criar outro método para listar todas as Turmas 
		//de acordo com o professor logado.
		//result.include("turmas", turmaService.listarTodas());
		List<AtribuirProfessorTurma> professorTurmas = atribuirProfessorTurmaService.listarTurmasPorUsuario(usuarioLogado.getUsuario().getId());
		result.include("turmas", professorTurmas);
	}
	
	@Get("/notas/disciplina/pesquisar")
	public void listarDisciplinasPorCursoTurma(Long id) {
//		List<AtribuirProfessorTurma> disciplinasPorTurmas = notasService.listarDisciplinasPorCursoTurma(id);
//		List<Disciplina> frequenciaAlunos = frequenciaService.listarAlunosPorCursoTurma(id);
//		result.include("disciplinasPorTurma", frequenciaAlunos);
//		result.redirectTo(this).lancar();
	}
}
