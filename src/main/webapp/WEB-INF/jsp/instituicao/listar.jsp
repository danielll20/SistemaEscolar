<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="url" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
  <head>
    <title>Lista de Institui��es</title>
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
			<h4>Institui��o Cadastrada</h4> 
		</div>
		<div class="panel-body">
			<table class="table table-stripped table-hover table-bordered" id="idDataTableBootstrap">		
				<thead>						  
				  <tr>		            
				    <th>Raz�o Social</th>		    
				    <th>Nome Fantasia</th>       
				    <th>CNPJ</th>   
				    <th>A��es</th>
				  </tr>
				</thead>
		      
				<tbody>
				  	<c:forEach items="${listaInstituicoes}" var="instituicao">
				     <tr>		       
				 	   <td>${instituicao.razaoSocial}</td>		      
				       <td>${instituicao.nomeFantasia}</td>  
				        <td>${instituicao.cnpj}</td>        
				       <td>
				         <a href="${url}/instituicao/${instituicao.id}"><img src="${url}/css/images/edit.png" width="16" height="16" title="Alterar institui��o"/></a>
				         <a href="${url}/instituicao/delete/${instituicao.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir institui��o"/></a>
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
 