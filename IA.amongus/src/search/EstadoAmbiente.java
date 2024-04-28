package search;

import dominio.Nodo;
import estructuras.Grafo;
import frsf.cidisi.faia.state.EnvironmentState;

public class EstadoAmbiente extends EnvironmentState {
	private Grafo grafo;
	private Nodo ubicacion;

	public EstadoAmbiente(){
		grafo = new Grafo();
		Nodo inicial = new Nodo();
		this.initState();
	}

	@Override
	public void initState() {
		// Completar
	}

	public Grafo getGrafo() {
		return grafo;
	}

	public void setGrafo(Grafo grafo) {
		this.grafo = grafo;
	}

	public Nodo getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Nodo ubicacion) {
		this.ubicacion = ubicacion;
	}

}
