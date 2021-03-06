/**
 * 
 */
package br.com.sistemaescolar.controller;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.sistemaescolar.modelo.AtribuirProfessorTurma;
import br.com.sistemaescolar.modelo.Curso;
import br.com.sistemaescolar.modelo.Frequencia;
import br.com.sistemaescolar.modelo.Matricula;
import br.com.sistemaescolar.service.AtribuirProfessorTurmaService;
import br.com.sistemaescolar.service.FrequenciaService;
import br.com.sistemaescolar.service.TurmaService;

/**
 * @author Daniel Correia
 * @since 16/11/2015
 *
 */
@Controller
public class FrequenciaController {
	
	@Inject
	private Result result;
	
	@Inject
	private FrequenciaService frequenciaService;		
	
	@Inject
	private AtribuirProfessorTurmaService atribuirProfessorTurmaService;
	
	@Inject
	private UsuarioLogado usuarioLogado;
	
	@Inject
	private TurmaService turmaService;
	
	@Path("/frequencia/novo")
	public void novo() {	
		//Obs: Criar outro m�todo para listar todas as Turmas 
		//de acordo com o professor logado.
//		result.include("turmas", turmaService.listarTodas());
		List<AtribuirProfessorTurma> professorTurmas = atribuirProfessorTurmaService.listarTurmasPorUsuario(usuarioLogado.getUsuario().getId());
		result.include("turmas", professorTurmas);
	}

	@Get("/frequencia/aluno/pesquisar")
	public void listarAlunosPorCursoTurma(Long id) {
		List<Matricula> frequenciaAlunos = frequenciaService.listarAlunosPorCursoTurma(id);
		result.include("alunosPorCursoTurma", frequenciaAlunos);
		result.redirectTo(this).novo();
	}
	
	@Post("/frequencia/adicionaFrequencia")
	public void adicionaFrequencia(List<Matricula> alunosPorCursoTurma, Date dataAtual, Long idCurso) {
	
		for (Matricula matricula : alunosPorCursoTurma) {
			Curso curso = new Curso();
			curso.setId(idCurso);
			
			Frequencia frequencia = new Frequencia();
			frequencia.setData(dataAtual);
			frequencia.setPresente("F");
			frequencia.setMatricula(matricula);
			frequencia.setCurso(curso);			
			
			frequenciaService.insert(frequencia);			
		}
		
		result.redirectTo(this).novo();
	}
}
