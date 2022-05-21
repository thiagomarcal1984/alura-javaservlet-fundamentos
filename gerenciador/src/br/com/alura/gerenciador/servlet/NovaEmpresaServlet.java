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
		String empresa = request.getParameter("nome");
		empresa = empresa == null ? "N�O INFORMADA" : empresa;
		out.println("<html><body>Empresa " + empresa + " cadastrada com sucesso!</body></html>");
	}
}
