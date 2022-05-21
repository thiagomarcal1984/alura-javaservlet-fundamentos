package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List; // Use a lista do package java.util.

public class Banco {

	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
}
