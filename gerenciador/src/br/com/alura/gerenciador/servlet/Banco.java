package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List; // Use a lista do package java.util.

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static { // Bloco de inicialização do atributo de classe "list".
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		lista.add(empresa);

		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
}
