package ar.edu.unju.fi.html.service;


import ar.edu.unju.fi.html.model.Candidato;
import ar.edu.unju.fi.html.util.ListaCandidato;

public interface ICandidatoService {

	public Candidato getCandidato();
	public boolean guardarCandidato(Candidato candidato);
	public void modificarCandidato(Candidato candidato);
	public ListaCandidato getListaCandidato();
	public Candidato buscarCandidato(int codigo);	
	public Candidato votarCandidato(int codigo);
	public void eliminarCandidato(int codigo); 
	public void totalCandidato(int total); 
	
}
