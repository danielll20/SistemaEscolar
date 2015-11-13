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
<link rel="stylesheet" href="${url}/css/dataTables.bootstrap.min.css"/>
<title>Matrícula de Alunos</title>

</head>
<body class="body" onload="carregaDataAtual()">
<jsp:include page="../layout/menu.jsp"></jsp:include>
<h3>Matrícula de Alunos</h3>
<div id="mensagem">${mensagem}</div>
<br><br>
	<form name="formMatricula" action="${url}/matricula/adiciona" method="post" class="form-horizontal">
		<%@include file="../matricula/form-inputs.jsp" %>			
		<div class="botoes">
			<input type="submit" value="Salvar" class="btn btn-primary"/>
			<input type="reset" value="Cancelar" class="btn btn-primary"/>					
		</div>	
	</form>
	
<br><br>
<div class="panel panel-default">
  <div class="panel-heading">
  	<h4>Alunos Matriculados</h4>
  	<button type="submit" style="margin-left: 230px; margin-top: -40px;" class="btn btn-primary" 
  			data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">
  			+ Novo Aluno
  	</button>  	
  </div>   
  
  <div class="panel-body">
  	<table class="table table-striped table-bordered" id="lista-matriculas" cellspacing="0" width="100%">		
		<thead>						  
		  <tr>		    
		  	<th>Aluno</th> 
		  	<th>Data da Matrícula</th>       
		    <th>Ano</th>
		    <th>Situação</th>		             
		    <th>Curso</th>
		    <th>Turma</th>
		    <th>Turno</th>
		    <th>Entrada</th>
		    <th>Saída</th>
		  </tr>
		</thead>
      
		<tbody>
		  	<c:forEach items="${matriculas}" var="matricula">
		     <tr>		       
		 	   <td>${matricula.aluno.nome}</td>		       
		       <td><fmt:formatDate value="${matricula.dataMatricula}" /></td>		       
		       <td><fmt:formatDate value="${matricula.dataMatricula}" pattern="yyyy"/></td> 
		       <td>${matricula.situacao.descricao}</td>  		       
		       <td>${matricula.turma.curso.nome}</td>
		       <td>${matricula.turma.nome}</td>
		       <td>${matricula.turma.turno}</td>
		       <td>${matricula.turma.horarioEntrada}</td>
		       <td>${matricula.turma.horarioSaida}</td>                   
<!-- 		       <td> -->
<%-- 		         <a href="${url}/aluno/${aluno.id}"><img src="${url}/css/images/edit.png" width="16" height="16" title="Alterar aluno"/></a> --%>
<%-- 		         <a href="${url}/aluno/delete/${aluno.id}"><img src="${url}/css/images/delete.png" width="16" height="16" title="Excluir aluno"/></a> --%>
<!-- 		       </td> -->
		     </tr>
		   </c:forEach>
		</tbody>
	</table>
  </div>
</div>

<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="exampleModalLabel">Cadastro de Alunos</h4>
				</div>
				<div class="modal-body">
					<form id="cadastrarAluno" method="post">
						<div class="form-group">
							<label for="nome" class="control-label">Nome:</label>
							<input type="text" class="form-control" id="nome" name="aluno.nome">
						</div>
						
						<div class="form-group">
							<label for="endereco" class="control-label">Endereço:</label>
							<input type="text" class="form-control" id="endereco" name="aluno.endereco.rua">
						</div>
						
						<div class="form-group">
							<label for="numero" class="control-label">Número:</label>
							<input type="text" class="form-control" id="numero" name="aluno.endereco.numero">
						</div>
						
						<div class="form-group">
							<label for="complemento" class="control-label">Complemento:</label>
							<input type="text" class="form-control" id="complemento" name="aluno.endereco.complemento">
						</div>
						
						<div class="form-group">
							<label for="bairro" class="control-label">Bairro:</label>
							<input type="text" class="form-control" id="bairro" name="aluno.endereco.bairro">
						</div>
						
						<div class="form-group">
							<label for="cidade" class="control-label">Cidade:</label>
							<input type="text" class="form-control" id="cidade" name="aluno.endereco.cidade.nome">
						</div>
						
						<div class="form-group">
							<label for="uf" class="control-label">UF:</label>
							<input type="text" class="form-control" id="uf" name="aluno.endereco.uf.nome">
						</div>
						
						<div class="form-group">
							<label for="cep" class="control-label">CEP:</label>
							<input type="text" class="form-control" id="cep" name="aluno.endereco.cep.numero">
						</div>
						
						<div class="form-group">
							<label for="nomeMae" class="control-label">Nome da Mãe:</label>
							<input type="text" class="form-control" id="nomeMae" name="aluno.nomeMae">
						</div>
						
						<div class="form-group">
							<label for="nomePai" class="control-label">Nome do Pai:</label>
							<input type="text" class="form-control" id="nomePai" name="aluno.nomePai">
						</div>
						
						<div class="form-group">
							<label for="dataNascimento" class="control-label">Data de Nascimento:</label>
							<input type="text" class="form-control" id="dataNascimento" name="aluno.dataNascimento">
						</div>
						
						<div class="form-group">
							<label for="dataCadastro" class="control-label">Data de Cadastro:</label>
							<input type="text" class="form-control" id="dataCadastro" name="aluno.dataCadastro">
						</div>											
						
						<div class="form-group">
							<label for="cpf" class="control-label">CPF:</label>
							<input type="text" class="form-control" id="cpf" name="aluno.cpf">
						</div>
						
						<div class="form-group">
							<label for="rg" class="control-label">RG:</label>
							<input type="text" class="form-control" id="rg" name="aluno.rg">
						</div>
						
						<div class="form-group">
							<label for="ufRG" class="control-label">UF RG:</label>
							<input type="text" class="form-control" id="ufRG" name="aluno.ufRG">
						</div>
						
						<div class="form-group">
							<label for="telefone" class="control-label">Telefone Residêncial:</label>
							<input type="text" class="form-control" id="telefone" name="aluno.telefone">
						</div>
						
						<div class="form-group">
							<label for="celular" class="control-label">Telefone Celular:</label>
							<input type="text" class="form-control" id="celular" name="aluno.celular">
						</div>
						
						<div class="modal-footer">
							<button type="reset" class="btn btn-default" data-dismiss="modal">Cancelar</button>
							<button type="submit" class="btn btn-primary">Salvar</button>
						</div>
					</form>
				</div>
				
			</div>
		</div>
	</div>	
	
	<div id="dialog-message" title="Download complete" >
  		<p>
    		<span class="ui-icon ui-icon-circle-check" style="float:left; margin:0 7px 50px 0;"></span>
    			Your files have downloaded successfully into the My Downloads folder.
  		</p>
  		<p>
    		Currently using <b>36% of your storage space</b>.
  		</p>
	</div>
	
<script type="text/javascript" src="${url}/js/jquery.js" ></script>	
<script type="text/javascript" src="${url}/js/jquery-ui.js" ></script>
<script type="text/javascript" src="${url}/js/jquery-1.11.3.min.js" ></script>
<script type="text/javascript" src="${url}/js/jquery.dataTables.min.js" ></script>
<script type="text/javascript" src="${url}/js/dataTables.bootstrap.min.js" ></script>
<script type="text/javascript">
	$(document).ready(function() {
		// desabilitando o campo 
		$('#dataMatricula').prop("disabled", false);
		// mudando a cor do campo
		$('#dataMatricula').css("background-color", "#F5F5F5"); 
		
		$('#lista-matriculas').dataTable({
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
	
	function carregaDataAtual(){   
		var d=new Date();  
		var monthname=new Array("01","02","03","04","05","06","07","08","09","10","11","12");  
		var TODAY = d.getDate() + "/" +monthname[d.getMonth()] +  "/" + d.getFullYear();  
		formMatricula.dataMatricula.value = TODAY;    
	}
	
// 	$.ajax({      
// 	    type: "POST",      
// 	    dataType:"html",    
// 	    url: "<c:url value="/matricula/novoAluno"/>",    	      
// 	    success: function(data) {    
// 	        alert("Teste");
	    	
// 	    	$( "#dialog-message" ).dialog({
// 	    	      modal: true,
// 	    	      buttons: {
// 	    	        Ok: function() {
// 	    	          $( this ).dialog( "close" );
// 	    	        }
// 	    	      }
// 	    	  }).show();	    		            	                         
// 	    }    
// 	}); 

$('#cadastrarAluno').on('submit', function(event){    
	$.ajax({    
    	type : 'post',    
        url : '${url}/matricula/novoAluno',    
        dataType : 'text',    
        data : {    
        	 'aluno.nome' : $("#nome").val(),    
             'aluno.endereco.rua' : $("#endereco").val()        
        },    
      	success: function(retorno){    
// 			alert("Aluno cadastrado com sucesso!");
			$( "#dialog-message" ).dialog({
	  	      	modal: true,
	  	      	buttons: {
	  	        Ok: function() {
	  	          $( this ).dialog( "close" );
	  	        }
	  	      	}
  	 		});
        }    
	});    
    event.stopPropagation();  
    event.preventDefault();  
    return false;    
});  
	   
</script>			
</body>
</html>