<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- 
		Coment�rios em Scriptlet: o comando abaixo tamb�m funciona no form. 
		<form action="<c:url value="/novaEmpresa" />" method="post">
		Mas aninhar tags assim n�o � elegante.
	--%>
	<form action="${ linkServletNovaEmpresa }" method="post">
		Nome: <input type="text" name="nome" />
        <input type="submit" value="Enviar" />
	</form>
</body>
</html>