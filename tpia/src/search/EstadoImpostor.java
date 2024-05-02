package search;

import java.util.List;

import dominio.Nodo;
import dominio.Tarea;
import dominio.Tripulante;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

public class EstadoImpostor extends SearchBasedAgentState {
	
	private Nodo ubicacion;
	private Integer energia;
	private Integer energiaInicial;
	private List<Tarea> tareas;
	private Integer tareasPendientes;
	private Integer tripulantesVivos;
	private List<Tripulante> tripulantes;
	

	public Nodo getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Nodo ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}

	public Integer getEnergiaInicial() {
		return energiaInicial;
	}

	public void setEnergiaInicial(Integer energiaInicial) {
		this.energiaInicial = energiaInicial;
	}

	public List<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(List<Tarea> tareas) {
		this.tareas = tareas;
	}

	public Integer getTareasPendientes() {
		return tareasPendientes;
	}

	public void setTareasPendientes(Integer tareasPendientes) {
		this.tareasPendientes = tareasPendientes;
	}

	public Integer getTripulantesVivos() {
		return tripulantesVivos;
	}

	public void setTripulantesVivos(Integer tripulantesVivos) {
		this.tripulantesVivos = tripulantesVivos;
	}

	public List<Tripulante> getTripulantes() {
		return tripulantes;
	}

	public void setTripulantes(List<Tripulante> tripulantes) {
		this.tripulantes = tripulantes;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SearchBasedAgentState clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateState(Perception p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initState() {
		// TODO Auto-generated method stub
		
	}

	
	
}
