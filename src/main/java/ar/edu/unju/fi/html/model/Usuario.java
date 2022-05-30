package ar.edu.unju.fi.html.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Usuario {
	
	@Size(min=3, max=100, message="El nombre debe tener entre 3 a 100 caracteres")
	@NotEmpty(message="El nombre del alumno no puede ser vacío")
	private String nombre;
	@NotEmpty @Email
	private String email;
	//@NotEmpty(message="El teléfono no puede ser vacío")
	private String telefono;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fechanacim;
	
	public Usuario(
			@Size(min = 3, max = 100, message = "El nombre debe tener entre 3 a 100 caracteres") @NotEmpty(message = "El nombre del alumno no puede ser vacío") String nombre,
			@NotEmpty @Email String email, @NotEmpty(message = "El teléfono no puede ser vacío") String telefono,
			LocalDate fechanacim) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.fechanacim = fechanacim;
	}	
	
	public Usuario() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public LocalDate getFechanacim() {
		return fechanacim;
			
		
	}
	public void setFechanacim(LocalDate fechanacim) {
		this.fechanacim = fechanacim;
		 
	}
	
	
	public int convert() {
	   int edadd;
	   Period edad = Period.between(fechanacim, LocalDate.now());
		  edadd=edad.getYears();
		return edadd;
		//return localDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
	  }
	 
	public String getete(String nombre) {
		return nombre;
	}
  
	 





}
	
	
