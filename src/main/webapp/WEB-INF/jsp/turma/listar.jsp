<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="url" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
  <head>
    <title>Lista de Turmas</title>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
    <link rel="stylesheet" href="${url}/css/style.css"/>
	<link rel="stylesheet" href="${url}/css/jquery-ui.css"/>
	<link rel="stylesheet" href="${url}/css/bootstrap.css"/>
	<link rel="stylesheet" href="${url}/css/dataTables.bootstrap.min.css"/>
    		
  </head>
  <body class="body">
    <jsp:include page="../layout/menu.jsp"></jsp:include>
        
	<div class="panel panel-default">
	    <div class="panel-heading">
			<h4>Curso(s) Cadastrado(s)</h4> 
		</div>
		<div class="panel-body">
			<table class="table table-stripped table-hover table-bordered" id="idDataTableBootstrap">		
				<thead>						  
				  <tr>		            				    
				    <th>Curso</th>
				    <th>Turma</th>
				    <th>Turno</th>
				    <th>Ações</th>		    
				  </tr>
				</thead>
		      
				<tbody>
				  	<c:forEach items="${listaTurmas}" var="turma">
				     <tr>		       				 	   
				       <td>${turma.curso.nome}</td>	
				       <td>${turma.nome}</td>
				        <td>${turma.turno}</td>	              
				       <td>
				         <a href="${url}/turma/${turma.id}"><img src="${url}/css/images/edit.png" width="16" height="16" title="Alterar turma"/></a>
				         <a href="${url}/turma/delete/${turma.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir turma"/></a>
				         <a href="javascript:carregaModalAtribuirProfessorTurma(${turma.id});">
							<img src="${url}/css/images/atribuicao.png" width="16" height="16" title="Atribuir professor para a turma"
			       			data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo"/>
			     		 </a>
				       </td>
				     </tr>
				   </c:forEach>
				</tbody>
			</table>
		</div>
	</div>	
	
	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
	</div>
	       
	<script type="text/javascript" src="${url}/js/jquery.js" ></script>	
	<script type="text/javascript" src="${url}/js/jquery-ui.js" ></script>
	<script type="text/javascript" src="${url}/js/jquery-1.11.3.min.js" ></script>
	<script type="text/javascript" src="${url}/js/jquery.dataTables.min.js" ></script>
	<script type="text/javascript" src="${url}/js/dataTables.bootstrap.min.js" ></script>
	<script type="text/javascript" src="${url}/js/configuracaoDataTableBootstrap.js" ></script> 
	<script type="text/javascript">			
		function carregaModalAtribuirProfessorTurma(id){  
	        var url = "${url}/turma/atribuirProfessorTurma/"+id;  
	        $.ajax({  
	            type: 'GET',  
	            url: url,  
	            dataType: 'text',  
	            cache: 'false',  
	            success: function(data){                	
	            	$('#exampleModal').html(data);             
	            }   
	        });  
	     }  					
	</script>    
   </body>      
</html>