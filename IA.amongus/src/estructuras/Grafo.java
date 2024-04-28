package estructuras;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dominio.Nodo;

public class Grafo {

	private Map<Nodo, List<Nodo>> mapa;
	
	public Grafo() {
		mapa = new HashMap<>();
	}

	public Grafo(Map<Nodo, List<Nodo>> mapa) {
		super();
		this.mapa = mapa;
	}
	
	public void agregarArista(Nodo nodo1, Nodo nodo2) {
		mapa.get(nodo1).add(nodo2);
		mapa.get(nodo2).add(nodo1);
	}
	
	public void agregarNodo(Nodo nodo1) {
		mapa.put(nodo1, new ArrayList<>());
	}
	
	public List<Nodo> getVecinos(Nodo nodo1){
		return mapa.get(nodo1);
	}
	
}
