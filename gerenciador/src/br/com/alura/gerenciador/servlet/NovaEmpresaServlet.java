package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Cadastrando nova empresa.");
		PrintWriter out = response.getWriter();
		
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		out.println("<html><body>Empresa " + empresa.getNome() + " cadastrada com sucesso!</body></html>");
	}
}
