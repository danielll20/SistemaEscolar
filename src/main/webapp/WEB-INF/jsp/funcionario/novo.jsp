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
<form action="<c:url value='/funcionario/adiciona'/>" method="post">
		<label for="cpf">CPF:</label>
		<input type="text" id="cpf" name="funcionario.cpf" /><br />
		
		<label for="rg">RG:</label>
		<input type="text" id="rg" name="funcionario.rg" /><br />
		
		<label for="ufRG">UF do RG:</label>
		<input type="text" id="ufRG" name="funcionario.ufRG" /><br />
		
		<label for="rua">Rua:</label>
		<input type="text" id="rua" name="funcionario.endereco.rua" /><br />
		
		<label for="numero">Número:</label>
		<input type="text" id="numero" name="funcionario.endereco.numero" /><br />
		
		<label for="complemento">Complemento:</label>
		<input type="text" id="complemento" name="funcionario.endereco.complemento" /><br />
		
		<label for="bairro">Bairro:</label>
		<input type="text" id="bairro" name="funcionario.endereco.bairro" /><br />
		
		<label for="telefone">Telefone:</label>
		<input type="text" id="telefone" name="funcionario.telefone" /><br />
		
		<label for="celular">Celular:</label>
		<input type="text" id="celular" name="funcionario.celular" /><br />
		
		<label for="nomeBanco">Nome da Instituição Bancária:</label>
		<input type="text" id="nomeBanco" name="funcionairo.nomeBanco" /><br />
		
		<label for="conta">Conta:</label>
		<input type="text" id="conta" name="funcionario.conta" /><br />
		
		<label for="agencia">Agência:</label>
		<input type="text" id="agencia" name="funcionario.agencia" /><br />
		
		<label for="cargo">Cargo:</label>
		<input type="text" id="cargo" name="funcionario.cargo" /><br />
		
		<label for="valorSalario">Salário:</label>
		<input type="text" id="valorSalario" name="funcionario.valorSalario" /><br />
		
		<input type="submit" value="Salvar" />
	</form>

</body>
</html>