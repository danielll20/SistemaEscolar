<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="<c:url value="/css/style.css"/>">
<link rel="stylesheet" href="<c:url value="/css/jquery-ui.css"/>">
<link rel="stylesheet" href="<c:url value="/css/bootstrap.css"/>">  
<script type="text/javascript" src="<c:url value="/js/jquery.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/jquery-ui.js"/>" ></script>  
<script>
  
$(document).ready(function() {
    
});
  
$(function(){
	$("#dataNascimento, #dataCadastro").datepicker({
	    dateFormat: 'dd/mm/yy',
	    dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'
	        ],
	    dayNamesMin: [
	    'D','S','T','Q','Q','S','S','D'
	    ],
	    dayNamesShort: [
	    'Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'
	    ],
	    monthNames: [  'Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro',
	    'Outubro','Novembro','Dezembro'
	    ],
	    monthNamesShort: [
	    'Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set',
	    'Out','Nov','Dez'
	    ],
	    nextText: 'Próximo',
	    prevText: 'Anterior'	    	    	    		   
	    });
	});
  
  </script>

<title>Cadastro de Alunos</title>
</head>
<body class="body">
	<jsp:include page="../layout/menu.jsp"></jsp:include>
	<div class="tituloCadastro">
          <h3 class="page-header">Cadastro de Alunos</h3>
    </div>      
	<form action="<c:url value='/aluno/adiciona'/>" method="post" class="form-horizontal">
		<div class="form-group">			
			<label class="col-sm-2 control-label" for="nome">Nome:</label>	
			<div class="col-sm-5">		
				<input class="form-control" type="text" id="nome" name="aluno.nome" />
			</div>	
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="rua">Endereço:</label>
			<div class="col-sm-5">	
				<input class="form-control" type="text" id="rua" name="aluno.endereco.rua" />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="numero">Número:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="numero" name="aluno.endereco.numero" />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="complemento">Complemento:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="complemento" name="aluno.endereco.complemento" />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="bairro">Bairro:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="bairro" name=aluno.endereco.bairro />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="nomeMae">Nome da mãe:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="nomeMae" name=aluno.nomeMae />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="nomePai">Nome do pai:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="nomePai" name=aluno.nomePai />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="dataNascimento">Data de nascimento:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="dataNascimento" name=aluno.dataNascimento />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="dataCadastro">Data do cadastro:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="dataCadastro" name=aluno.dataCadastro />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="sexo">Sexo:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="sexo" name=aluno.sexo />
			</div>
		</div>
			
		<div class="form-group">
			<label class="col-sm-2 control-label" for="cpf">CPF:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="cpf" name=aluno.cpf />
			</div>
		</div>											
			
		<div class="form-group">
			<label class="col-sm-2 control-label" for="rg">RG:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="rg" name=aluno.rg />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="ufRg">UF RG:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="ufRg" name=aluno.ufRG />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="telResidencial">Tel residêncial:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="telResidencial" name=aluno.telefone />
			</div>
		</div>
		
		<div class="form-group">
			<label class="col-sm-2 control-label" for="celular">Tel celular:</label>
			<div class="col-sm-5">
				<input class="form-control" type="text" id="celular" name=aluno.celular />
			</div>
		</div>	
				
		<div class="botoes">
			<input type="submit" value="Salvar" class="btn btn-primary"/>
			<input type="reset" value="Cancelar" class="btn btn-primary"/>					
		</div>		
	</form>
	<jsp:include page="../layout/footer.jsp"></jsp:include>
</body>
</html>