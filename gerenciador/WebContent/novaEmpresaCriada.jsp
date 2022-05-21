<%
	String titulo = "Introdução ao JSP";
	String nomeEmpresa = "Alura";
    System.out.println(nomeEmpresa); // Esta saÃ­da vai para o log do Tomcat.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página JSP</title>
</head>
<body>
	<h1><%= titulo %></h1>
    Empresa <% out.print(nomeEmpresa); %> cadastrada com sucesso!
</body>
</html>