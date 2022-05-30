package ar.edu.unju.fi.html.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.html.model.Usuario;
import ar.edu.unju.fi.html.service.IUsuarioService;
import ar.edu.unju.fi.html.util.ListaUsuario;


@Service("UsuarioServiceImpList")
public class UsuarioServiceImp implements IUsuarioService {
	
	
	@Autowired
	private ListaUsuario listausuario;
	
	@Override
	public Usuario getUsuario() {
		// TODO Auto-generated method stub
		return new Usuario();
	}

	@Override
	public boolean guardarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return listausuario.getUsuarios().add(usuario);
	}

	@Override
	public void modificarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarUsuario(int dni) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ListaUsuario getListaUsuario() {
		// TODO Auto-generated method stub
		return listausuario;
	}

	
	
	
	

}
