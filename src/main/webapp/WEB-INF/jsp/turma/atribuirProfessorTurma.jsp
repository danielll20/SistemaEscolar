<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<c:set var="url" value="${pageContext.request.contextPath}"/>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="${url}/css/style.css"/>
<link rel="stylesheet" href="${url}/css/jquery-ui.css"/>
<link rel="stylesheet" href="${url}/css/dataTables.bootstrap.min.css"/>
<title>Insert title here</title>
</head>
<body>

<div class="modal-dialog" role="document">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
			<h4 class="modal-title" id="exampleModalLabel">Atribuir professor a ${turmaPorId.curso.nome} ${turmaPorId.nome} ${turmaPorId.turno}</h4>
		</div>
		
		<div class="modal-body">
			<form id="cadastrarAluno" action="${url}/turma/adicionaProfessorTurma/${turmaPorId.id}" method="post">					
				<div class="form-group">
					<label class="col-sm-0 control-label" for="professor">Professor(es):</label><br>						
					<c:forEach items='${professores}' var='professorDisciplina' varStatus="s"> 
						<label class="checkbox-inline" style="margin-left: 0px;">
						<input type="checkbox" name="professores[${s.index}].id" value='${professorDisciplina.professor.id}'>${professorDisciplina.professor.nome} - (${professorDisciplina.disciplina.nome})
						</label>
					</c:forEach>
				</div>
						
				<!-- -------------------------TABELA PARA LISTAR DISCIPLINAS DOS PROFESSORES----------------------------------------------- -->						
				
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>Professor(es) cadastrado(s)</h4>	 
					</div>   
				  
				    <div class="panel-body">
					  	<table class="table table-striped table-bordered" id="lista-disciplinas" cellspacing="0" width="100%">		
							<thead>						  
								<tr>		    
							  		<th>Professor</th>
							  		<th>Disciplina</th>
							  		<th>Id Turma</th>  
							  		<th>Ações</th>       		    
								</tr>
							</thead>
					      
							<tbody>
							  	<c:forEach items="${professoresDasTurmas}" var="professorTurma" varStatus="s">
								    <tr>		       
										<td>
											${professorTurma.professor.nome}											
										</td>
<%-- 										<td>${professorTurma.turma.curso.disciplinas[s.index].nome}</td> --%>
										<td>${professorTurma.professor.disciplinas[s.index].nome}</td>
										<td>${professorTurma.turma.id}</td>
								
								      	<td>
								        	<a href="${url}/professor/atribuicaoProfessor/delete/${disciplinasPorProfessor.disciplina.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir aluno"/></a>
								      	</td>
								    </tr>
					  			</c:forEach>
							</tbody>
						</table>
				    </div>
				</div>																								
				<!-- -------------------------TABELA PARA LISTAR DISCIPLINAS DOS PROFESSORES----------------------------------------------- -->
							
				<div class="form-group">							
					<input type="hidden" class="form-control" id="nome" name="atribuicaoDisciplina.professor.id" value="${professorPorId.id}">
				</div>											
																																
				<div class="modal-footer">
					<button type="reset" class="btn btn-default" data-dismiss="modal">Cancelar</button>
					<button type="submit" class="btn btn-primary">Enviar</button>
				</div>
			</form>
		</div>				
	</div>
</div>
	
	
<script type="text/javascript" src="${url}/js/jquery.js" ></script>	
<script type="text/javascript" src="${url}/js/jquery-ui.js" ></script>
<script type="text/javascript" src="${url}/js/jquery-1.11.3.min.js" ></script>
<script type="text/javascript" src="${url}/js/jquery.dataTables.min.js" ></script>
<script type="text/javascript" src="${url}/js/dataTables.bootstrap.min.js" ></script>
<script type="text/javascript">
	$(document).ready(function() {
		//Id da tabela
		$('#lista-disciplinas').dataTable({
			language: {
				"sEmptyTable": "Nenhum registro encontrado",
			    "sInfo": "Mostrando de _START_ até _END_ de _TOTAL_ registros",
			    "sInfoEmpty": "Mostrando 0 até 0 de 0 registros",
			    "sInfoFiltered": "(Filtrados de _MAX_ registros)",
			    "sInfoPostFix": "",
			    "sInfoThousands": ".",
			    "sLengthMenu": "_MENU_ resultados por página",
			    "sLoadingRecords": "Carregando...",
			    "sProcessing": "Processando...",
			    "sZeroRecords": "Nenhum registro encontrado",
			    "sSearch": "Pesquisar",
			    "oPaginate": {
			        "sNext": "Próximo",
			        "sPrevious": "Anterior",
			        "sFirst": "Primeiro",
			        "sLast": "Último"
				}
			},
			
			"oAria": {
		        "sSortAscending": ": Ordenar colunas de forma ascendente",
		        "sSortDescending": ": Ordenar colunas de forma descendente"
		    }
		});
	});
</script>
</body>
</html>