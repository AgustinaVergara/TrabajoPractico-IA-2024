package search;

import java.util.List;

import dominio.Tarea;
import dominio.Tripulante;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.agent.search.SearchBasedAgent;

public class Impostor extends SearchBasedAgent {
	
	private Nodo ubicacion;
	private Integer energia;
	private Integer energiaInicial;
	private List<Tarea> tareas;
	private Integer tareasPendientes;
	private Integer tripulantesVivos;
	private List<Tripulante> tripulantes;
	

	public Impostor() {
		//Completar
	}

	@Override
    public void see(Perception p) {
        this.getAgentState().updateState(p);
    }

	@Override
	public Action selectAction() {
		// completar
		return null;
	}
	
}
