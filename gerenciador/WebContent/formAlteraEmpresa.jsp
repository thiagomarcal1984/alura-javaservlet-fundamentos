<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/alteraEmpresa" var="linkServletAlteraEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		Comentários em Scriptlet: o comando abaixo também funciona no form. 
		<form action="<c:url value="/novaEmpresa" />" method="post">
		Mas aninhar tags assim não é elegante.
	--%>
	<form action="${ linkServletAlteraEmpresa }" method="post">
		Nome: <input type="text" name="nome" value="${ empresa.nome }" />
		<fmt:formatDate pattern="dd/MM/yyyy" value="${ empresa.dataAbertura }" var="dataAbertura"/>
		Data Abertura: <input type="text" name="data" value="${ dataAbertura }" />
		<input type="hidden" name="id" value="${ empresa.id }" />
        <input type="submit" value="Enviar" />
	</form>
</body>
</html>