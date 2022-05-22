package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa.");
		
		String nomeEmpresa = request.getParameter("nome");
		String paramDataEmpresa = request.getParameter("data");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataAbertura = null;
		try {
			dataAbertura = sdf.parse(paramDataEmpresa);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		// O RequestDispatcher pode chamar qualquer recurso (servlet, HTML, JSP etc.):
// Ctrl+Shift+C no Eclipse transforma a seleção em comentários.
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		
		request.setAttribute("empresa", empresa.getNome()); // Esta linha não influencia no redirecionamento client-side.
//		rd.forward(request, response);

		// Perceba que o request.setAttribute não influencia a requisição client-side.
		response.sendRedirect("listaEmpresas");
	}
}
