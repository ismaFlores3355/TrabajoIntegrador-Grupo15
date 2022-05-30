package ar.edu.unju.fi.html.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ar.edu.unju.fi.html.model.Candidato;
import ar.edu.unju.fi.html.service.ICandidatoService;

import ar.edu.unju.fi.html.util.ListaCandidato;



@Service("CandidatoServiceImpList")
public class CandidatoServiceImp implements ICandidatoService {
  
	
	@Autowired
	private ListaCandidato listaCandidato;
	
	
	
	@Override
	public Candidato getCandidato() {
		// TODO Auto-generated method stub
		return new Candidato();
	}

	@Override
	public boolean guardarCandidato(Candidato candidato) {
		// TODO Auto-generated method stub
		return listaCandidato.getCandidatos().add(candidato);
	}

	@Override
	public void modificarCandidato(Candidato candidato) {
		for(Candidato can : listaCandidato.getCandidatos()) {
			if(can.getCodigo() == candidato.getCodigo()) {
				can.setDetalle(candidato.getDetalle());
			    can.setGenero(candidato.getGenero());
			    can.setNombre(candidato.getNombre());
			}
		}
		
	}
 /*
	@Override
	public void eliminarCandidato(int codigo) {
		// TODO Auto-generated method stub
		
	}
*/
	@Override
	public ListaCandidato getListaCandidato() {
		// TODO Auto-generated method stub
		return listaCandidato;
	}

	@Override
	public Candidato buscarCandidato(int codigo) {
		// TODO Auto-generated method stu
		Optional<Candidato> candidato = listaCandidato.getCandidatos().stream().filter(a -> a.getCodigo()== codigo).findFirst();
		return candidato.get();
		
	}
	
	public Candidato votarCandidato(int codigo) {
		// TODO Auto-generated method stu
		Optional<Candidato> candidato = listaCandidato.getCandidatos().stream().filter(a -> a.getCodigo()== codigo).findFirst();
		
		
		
		for(Candidato can : listaCandidato.getCandidatos()) {
			if(can.getCodigo() == codigo) {
			    can.setVotos(candidato.get().getVotos()+1);
			}
		}
		return candidato.get();
		
	}

	public void eliminarCandidato(int codigo) {
		Optional<Candidato> candidato = listaCandidato.getCandidatos().stream().filter(a -> a.getCodigo()== codigo).findFirst();
		for(int i=0; i<listaCandidato.getCandidatos().size();i++) {
			if(listaCandidato.getCandidatos().get(i).getCodigo() == codigo) {
			    listaCandidato.getCandidatos().remove(i);
			}
		}
	}
	
	public void totalCandidato(int total) {
		// TODO Auto-generated method stu
		//Optional<Candidato> candidato = listaCandidato.getCandidatos().stream().filter(a -> a.getCodigo()== codigo).findFirst();
		 total=0;
		for(Candidato can : listaCandidato.getCandidatos()) {
			total=can.getCodigo()+total;
		}
		
	}

	
	
}
