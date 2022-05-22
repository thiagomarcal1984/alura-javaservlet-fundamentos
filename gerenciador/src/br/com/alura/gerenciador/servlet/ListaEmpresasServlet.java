package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/listaEmpresas", loadOnStartup = 1) // For�a a instancia��o do servlet pelo container.
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListaEmpresasServlet() {
		System.out.println("Criando o ListaEmpresasServlet...");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		// Chamar a p�gina JSP
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		
		request.setAttribute("empresas", lista);
		rd.forward(request, response);
	}

}
