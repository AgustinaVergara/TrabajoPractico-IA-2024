package search;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class Objetivo extends GoalTest {
	@Override
	public boolean isGoalState(AgentState agentState) {
		if(((EstadoImpostor) agentState).getTripulantesVivos()==0 || (((EstadoImpostor) agentState).getTareasPendientes() == 0)) {
			if(((EstadoImpostor) agentState).getEnergia()>=0) {
				return true;
			}
		}
		return false;
	}
}
