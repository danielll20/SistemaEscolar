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

<%-- <script type="text/javascript" src="${url}/js/jquery.js" ></script> --%>
<%-- <script type="text/javascript" src="${url}/js/jquery-ui.js"></script> --%>
<%-- <script type="text/javascript" src="${url}/js/calendario-jquery.js"></script>     --%>

<script type="text/javascript">
$(document).ready(function() {
	// desabilitando o campo 
	$('#dataCadastro').prop("disabled", false);
	// mudando a cor do campo
	$('#dataCadastro').css("background-color", "#F5F5F5");	
});
	
function carregaDataAtual(){   
	var d=new Date();  
	var monthname=new Array("01","02","03","04","05","06","07","08","09","10","11","12");  
	var TODAY = d.getDate() + "/" +monthname[d.getMonth()] +  "/" + d.getFullYear();  
	formProfessor.dataCadastro.value = TODAY;    
}
</script>

<title>Cadastro de Professor</title>
</head>

<body class="body" onload="carregaDataAtual()">
	 <jsp:include page="../layout/menu.jsp"></jsp:include>
	 
	 <h3>Cadastro de Professor</h3>
    <br><br>  
	<form name="formProfessor" action="${url}/professor/adiciona" method="post" class="form-horizontal">
		<%@include file="../professor/form-inputs.jsp" %>		
		<div class="botoes">
			<input type="submit" value="Salvar" class="btn btn-primary"/>
			<input type="reset" value="Cancelar" class="btn btn-primary"/>					
		</div>		
	</form>
	<jsp:include page="../layout/footer.jsp"></jsp:include>
</body>
</html>