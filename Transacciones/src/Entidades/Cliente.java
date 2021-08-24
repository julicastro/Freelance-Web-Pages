package Entidades;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

	private String nombre;
	private Integer dni;
	private Set <Tarjeta> tarjetas = new HashSet <>();
		
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Set <Tarjeta> getTarjetas() {
		return tarjetas;
	}
	public void setTarjetas(Set <Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	
	
	
	
}
