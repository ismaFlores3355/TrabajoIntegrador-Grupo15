package ar.edu.unju.fi.html.util;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.html.model.Usuario;


@Component
public class ListaUsuario {
  
	private ArrayList<Usuario> usuarios;

	public ListaUsuario() {
		// crear el arrayList
		usuarios = new ArrayList<Usuario>();
		//precargar el arraylist de alumnos
		usuarios.add(new Usuario("leo","messi@hotmail.com","12345678",LocalDate.of(2010, 3, 3)));
		
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
}
