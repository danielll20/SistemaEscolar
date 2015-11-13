<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="panel panel-default">
  <div class="panel-heading">
  	<h4>Disciplina(s) cadastradas</h4>  	 
  </div>   
  
  <div class="panel-body">
  	<table class="table table-striped table-bordered" id="lista-disciplinas" cellspacing="0" width="100%">		
		<thead>						  
		  <tr>		    
		  	<th>Disciplina(s)</th> 
		  	<th>Ações</th>       		    
		  </tr>
		</thead>
      
		<tbody>
		  	<c:forEach items="${disciplinasPorProfessor}" var="disciplina">
		     <tr>		       
		 	   <td>${disciplina.nome}</td>
		 	 	       
		       <td>
		         <a href="${url}/aluno/${aluno.id}"><img src="${url}/css/images/edit.png" width="16" height="16" title="Alterar aluno"/></a>
		         <a href="${url}/aluno/delete/${aluno.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir aluno"/></a>
		       </td>
		     </tr>
		   </c:forEach>
		</tbody>
	</table>
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