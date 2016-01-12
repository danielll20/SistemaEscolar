<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<script type="text/javascript" src="${url}/js/jquery.js" ></script>
<script type="text/javascript" src="${url}/js/jquery-ui.js"></script>
<script type="text/javascript" src="${url}/js/calendario-jquery.js"></script>

<div class="form-group">
	<label class="col-sm-2 control-label" for="nome">Nome:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="nome" name="aluno.nome" value="${aluno.nome}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="rua">Endere�o:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="rua"
			name="aluno.endereco.rua" value="${aluno.endereco.rua}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="numero">N�mero:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="numero"
			name="aluno.endereco.numero" value="${aluno.endereco.numero}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="complemento">Complemento:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="complemento"
			name="aluno.endereco.complemento" value="${aluno.endereco.complemento}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="bairro">Bairro:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="bairro"
			name="aluno.endereco.bairro" value="${aluno.endereco.bairro}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="cidade">Cidade:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="cidade" name="aluno.endereco.cidade.nome" value="${aluno.endereco.cidade.nome}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="uf">UF:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="uf" name="aluno.endereco.uf.nome" value="${aluno.endereco.uf.nome}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="cep">CEP:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="cep" name="aluno.endereco.cep.numero" value="${aluno.endereco.cep.numero}"/>
	</div>
</div>


<div class="form-group">
	<label class="col-sm-2 control-label" for="nomeMae">Nome da
		m�e:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="nomeMae"
			name="aluno.nomeMae" value="${aluno.nomeMae}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="nomePai">Nome do
		pai:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="nomePai"
			name="aluno.nomePai" value="${aluno.nomePai}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="dataNascimento">Data
		de nascimento:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="dataNascimento"
			name="aluno.dataNascimento" value="<fmt:formatDate value="${aluno.dataNascimento}" dateStyle="medium" /> "/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="sexo">Sexo:</label>
	<div class="col-sm-5">
		<select class="selectBox" name='aluno.sexo.id' id='sexo'>
			<option id="select">Selecione um sexo</option>
			
			<c:forEach items="${carregaSexo}" var="sexo">  
                <option value='${sexo.id}'
					${sexo.id == aluno.sexo.id ? 'selected' : ''}>${sexo.descricao}</option> 
            </c:forEach>
		</select>
	</div>
</div>


<div class="form-group">
	<label class="col-sm-2 control-label" for="cpf">CPF:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="cpf" name="aluno.cpf" value="${aluno.cpf}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="rg">RG:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="rg" name="aluno.rg" value="${aluno.rg}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="ufRg">UF RG:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="ufRg" name="aluno.ufRG" value="${aluno.ufRG}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="telResidencial">Tel
		resid�ncial:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="telResidencial"
			name="aluno.telefone" value="${aluno.telefone}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="celular">Tel
		celular:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="celular"
			name="aluno.celular" value="${aluno.celular}"/>
	</div>
</div>

<div class="form-group">
	<label class="col-sm-2 control-label" for="dataCadastro">Data do Cadastro:</label>
	<div class="col-sm-5">
		<input class="form-control" type="text" id="dataCadastro"
			name="aluno.dataCadastro" value="<fmt:formatDate value="${aluno.dataCadastro}" dateStyle="medium" /> " readonly="true"/>
	</div>
</div>
