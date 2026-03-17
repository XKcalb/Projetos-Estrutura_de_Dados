package controller;

import model.estrutura.*;

public class ListaEncadeadaDuplaController<T>{
	public ListaEncadeadaDuplaController() {
		super();
	}
	
	public String teste() throws Exception {
		ListaEncadeadaDupla lista = new ListaEncadeadaDupla();
		
		lista.append(1);
		lista.append(2);
		lista.append(3);
		lista.insert(1, 0);
		
		No<T> no = lista.get(1);
		
		return no.getValor().toString();
	}
}