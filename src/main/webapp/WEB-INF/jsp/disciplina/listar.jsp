<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="url" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
  <head>
    <title>Lista de Disciplinas</title>
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
			<h4>Disciplina(s) Cadastrada(s)</h4>  	 
		</div>
		<div class="panel-body">
			<table class="table table-stripped table-hover table-bordered" id="idDataTableBootstrap">		
				<thead>						  
				  <tr>		            
				    <th>Nome</th>
				    <th>Carga Horária</th>
				    <th>Ações</th>		    
				  </tr>
				</thead>
		      
				<tbody>
				  	<c:forEach items="${listaDisciplinas}" var="disciplina">
				     <tr>		       
				 	   <td>${disciplina.nome}</td>
				       <td>${disciplina.cargaHoraria}</td>		              
				       <td>
				         <a href="${url}/disciplina/${disciplina.id}"><img src="${url}/css/images/edit.png" width="16" height="16" title="Alterar disciplina"/></a>
				         <a href="${url}/disciplina/delete/${disciplina.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir disciplina"/></a>
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
	<script type="text/javascript" src="${url}/js/configuracaoDataTableBootstrap.js" ></script>	         
   </body>      
</html>
 