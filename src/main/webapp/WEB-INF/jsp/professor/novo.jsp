<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../layout/menu.jsp"></jsp:include>
<form action="<c:url value='/professor/adiciona'/>" method="post">
		<label for="nome">Nome:</label>
		<input type="text" id="nome" name="professor.nome" /><br />
		
		<label for="cpf">CPF:</label>
		<input type="text" id="cpf" name="professor.cpf" /><br />
		
		<label for="rg">RG:</label>
		<input type="text" id="rg" name="professor.rg" /><br />	
		
		<label for="rua">Rua:</label>
		<input type="text" id="rua" name="professor.endereco.rua" /><br />
		
		<label for="numero">Número:</label>
		<input type="text" id="numero" name="professor.endereco.numero" /><br />
		
		<label for="complemento">Complemento:</label>
		<input type="text" id="complemento" name="professor.endereco.complemento" /><br />
		
		<label for="bairro">Bairro:</label>
		<input type="text" id="bairro" name="professor.endereco.bairro" /><br />
		
		<label for="telefone">Telefone:</label>
		<input type="text" id="telefone" name="professor.telefone" /><br />
		
		<label for="celular">Celular:</label>
		<input type="text" id="celular" name="professor.celular" /><br />
		
		<label for="nomeBanco">Nome da Instituição Bancária:</label>
		<input type="text" id="nomeBanco" name="professor.nomeBanco" /><br />
		
		<label for="conta">Conta:</label>
		<input type="text" id="conta" name="professor.conta" /><br />
		
		<label for="agencia">Agência:</label>
		<input type="text" id="agencia" name="professor.agencia" /><br />
		
		<label for="sexo">Sexo:</label>
		<input type="text" id="sexo" name="professor.sexo" /><br />
		
		<label for="valorSalario">Salário:</label>
		<input type="text" id="valorSalario" name="professor.valorSalario" /><br />
		
		<label for="qntMeses">Quantidade de Meses:</label>
		<input type="text" id="qntMeses" name="professor.qntMeses" /><br />
		
		<label for="valorTotal">Valor Total:</label>
		<input type="text" id="valorTotal" name="professor.valorTotal" /><br />
		
		<select name ="disciplina.professores"size ="1">
		<option value ="">Professor desta disciplina</option>
		</select>		
					
		<input type="submit" value="Salvar" />
	</form>

</body>
</html>