package controller;

import model.estrutura.*;

public class CircularDuplaController{
	public CircularDuplaController() {
		super();
	}
	
	public String teste() throws Exception{
		CircularDupla lista = new CircularDupla();
		
		lista.append(1);
		lista.append(2);
		lista.append(3);
		
		lista.remove(lista.getLast().getProximo());
		
		return lista.toString();
	}
}