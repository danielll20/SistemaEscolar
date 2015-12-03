package br.com.sistemaescolar.controller;

import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.Matricula;
import br.com.sistemaescolar.service.FrequenciaService;
import br.com.sistemaescolar.service.TurmaService;

/**
 * @author Daniel Freitas
 * @since 02/12/2015
 */
@Controller
public class NotasController {

	@Inject
	private Result result;
	
	@Inject
	private FrequenciaService frequenciaService;			
	
	@Inject
	private TurmaService turmaService;	
	
	@Get
	@Path("/notas/lancar")	
	public void lancar() {	
		//Obs: Criar outro método para listar todas as Turmas 
		//de acordo com o professor logado.
		result.include("turmas", turmaService.listarTodas());
	}
	
	@Get("/notas/aluno/pesquisar")
	public void listarAlunosPorCursoTurma(Long id) {
		List<Matricula> frequenciaAlunos = frequenciaService.listarAlunosPorCursoTurma(id);
		result.include("alunosPorCursoTurma", frequenciaAlunos);
		result.redirectTo(this).lancar();
	}
}
