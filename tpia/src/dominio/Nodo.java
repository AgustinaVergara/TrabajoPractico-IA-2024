package dominio;

import java.util.List;

public class Nodo {

	private Integer id;
	private String nombre;
	private Integer cantTripulantes;
	private List<Tripulante> tripulantes;
	private Boolean hayMaquina;
	private List<Nodo> adyacentes;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantTripulantes() {
		return cantTripulantes;
	}
	public void setCantTripulantes(Integer cantTripulantes) {
		this.cantTripulantes = cantTripulantes;
	}
	public List<Tripulante> getTripulantes() {
		return tripulantes;
	}
	public void setTripulantes(List<Tripulante> tripulantes) {
		this.tripulantes = tripulantes;
	}
	public Boolean getHayMaquina() {
		return hayMaquina;
	}
	public void setHayMaquina(Boolean hayMaquina) {
		this.hayMaquina = hayMaquina;
	}
	
	public List<Nodo> getAdyacentes() {
		return adyacentes;
	}
	public void setAdyacentes(List<Nodo> adyacentes) {
		this.adyacentes = adyacentes;
	}
	
	
	
	
}
