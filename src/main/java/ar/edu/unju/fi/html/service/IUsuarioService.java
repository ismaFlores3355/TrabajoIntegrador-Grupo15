package ar.edu.unju.fi.html.service;


import ar.edu.unju.fi.html.model.Usuario;
import ar.edu.unju.fi.html.util.ListaUsuario;

public interface IUsuarioService {
  
	public Usuario getUsuario();
	public boolean guardarUsuario(Usuario usuario);
	public void modificarUsuario(Usuario usuario);
	public void eliminarUsuario(int dni);
	public ListaUsuario getListaUsuario();
	

}
