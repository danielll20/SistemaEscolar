<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="url" value="${pageContext.request.contextPath}"/>
<!doctype html>
<html>
  <head>
    <title>Lista de Professores</title>
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
			<h4>Professor(es) Cadastrado(s)</h4>  	 
		</div>
		<div class="panel-body">
			<table class="table table-stripped table-hover table-bordered" id="idDataTableBootstrap">		
				<thead>						  
				  <tr>		            
				    <th>Nome</th>		    
				    <th>CPF</th>       
				    <th>Endereço</th>   
				    <th>Ações</th>
				  </tr>
				</thead>
			     
				<tbody>
				  	<c:forEach items="${listaProfessores}" var="professor">
						<tr>		       
							<td>${professor.nome}</td>		      
							<td>${professor.cpf}</td>  
							<td>${professor.endereco.rua}</td>        
							<td>
			  					<a href="${url}/professor/${professor.id}"><img src="${url}/css/images/edit.png" width="16" height="16" title="Alterar professor"/></a>
								<a href="${url}/professor/delete/${professor.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir professor"/></a>			   
								<a href="javascript:carregaModalAtribuirDisciplina(${professor.id});">
									<img src="${url}/css/images/atribuicao.png" width="16" height="16" title="Atribuir disciplina para o professor"
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
		function carregaModalAtribuirDisciplina(id){  
	        var url = "${url}/professor/atribuirDisciplina/"+id;  
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
 