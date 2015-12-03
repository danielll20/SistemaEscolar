<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="url" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${url}/css/style.css"/>
<link rel="stylesheet" href="${url}/css/jquery-ui.css"/>
<link rel="stylesheet" href="${url}/css/bootstrap.css"/>
<title>Lançar Notas dos Alunos</title>
</head>
<body class="body" onload="carregaDataAtual()">
<jsp:include page="../layout/menu.jsp"></jsp:include>

<div class="panel panel-default">
	<div class="panel-heading">
		<h4>Lançar Notas</h4>  	 
	</div>
	<br>
	<div class="form-group">
		<form name="formFrequencia" action="${url}/notas/aluno/pesquisar" method="get">
			<label class="col-sm-1 control-label" for="turma">Curso/Turma:</label>
			<div class="col-sm-3">
				<select class="selectBox" name="id" id='matricula.turma.id'>
					<option id="curso">Selecione o Curso/Turma</option>
					<c:forEach items='${turmas}' var='turma'>
						<option value='${turma.id}'
							${turma.id == matricula.turma.id ? 'selected' : ''}>${turma.curso.nome} - ${turma.nome} - ${turma.turno}</option>
					</c:forEach>
				</select>
			</div>
			
				<button type="submit" class="btn btn-primary">Pesquisar</button>
	   </form>
   </div>
	
	
	
	<div class="panel-body">
	<form name="formFrequenciaAdiciona" action="${url}/frequencia/adicionaFrequencia" method="post">
		<table class="table table-stripped table-hover table-bordered" id="idDataTableBootstrap">		
			<thead>						  
			  <tr>	
			  	<th>Aluno</th>	  
			  	<th>Faltas</th>			  	       
			  </tr>
			</thead>
	      
			<tbody>			
			  	<c:forEach items="${alunosPorCursoTurma}" var="alunosCurso">
			     <tr>		       
			 	   <td style="width: 500px;">${alunosCurso.aluno.nome}</td>
			 	   <td><input type="checkbox" name="alunosPorCursoTurma[${s.index}].id" value='${alunosCurso.aluno.id}'></td>	
			 	   <td style="width: 500px; display: none;"><input type="hidden" name="idCurso" value="${alunosCurso.turma.curso.id}"></td>		 	   
			     </tr>			     			     			     
			   </c:forEach>			   			   				   	
			</tbody>
		</table>
		<input class="form-control" name="dataAtual" type="hidden" id="data" readonly="true"/>
		
		<div class="botoes" style="margin-left: 0px;">
			<input type="submit" value="Enviar" class="btn btn-primary" />
		</div>
		
	</form>
	</div>
</div>

<script type="text/javascript" src="${url}/js/jquery.js" ></script>
<script type="text/javascript" src="${url}/js/jquery-ui.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	// desabilitando o campo 
	$('#data').prop("disabled", false);
	// mudando a cor do campo
	$('#data').css("background-color", "#F5F5F5");	
});
	
function carregaDataAtual(){   
	var d=new Date();  
	var monthname=new Array("01","02","03","04","05","06","07","08","09","10","11","12");  
	var TODAY = d.getDate() + "/" +monthname[d.getMonth()] +  "/" + d.getFullYear();  
	formFrequencia.data.value = TODAY;   
	formFrequenciaAdiciona.data.value = TODAY;
}
</script>
</body>
</html>