package ar.edu.unju.fi.html.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Candidato {
    
	@Min(value=1000000,message="El DNI debe ser mayor o igual a 1.000.000")
	private int codigo;
	
	@Size(min=3, max=100, message="El nombre debe tener entre 3 a 100 caracteres")
	@NotEmpty(message="El nombre del alumno no puede ser vacío")
	
	private String nombre;
	@NotBlank(message="El genero no puede ser blanco")
	
	private String genero;
	@NotEmpty(message="El detalle no puede ser vacío")
	
	private String detalle;
	//@Min(value=1,message="El voto debe ser mayor o igual a 1")
	
	private int votos;
	
	
	public Candidato() {
		super();
	}
	public Candidato(@Min(value = 1000000, message = "El DNI debe ser mayor o igual a 1.000.000") int codigo,
			@Size(min = 3, max = 100, message = "El nombre debe tener entre 3 a 100 caracteres") @NotEmpty(message = "El nombre del alumno no puede ser vacío") String nombre,
			@NotBlank(message = "El genero no puede ser blanco") String genero,
			@NotEmpty(message = "El detalle no puede ser vacío") String detalle, int votos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.genero = genero;
		this.detalle = detalle;
		this.votos = votos;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public int getVotos() {
		return votos;
	}
	public void setVotos(int votos) {
		this.votos = votos;
	}

}
