package ar.edu.unju.fi.html.util;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.html.model.Candidato;


@Component
public class ListaCandidato {
	private ArrayList<Candidato> candidatos;

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidato(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
	
	public ListaCandidato() {
		
		candidatos = new ArrayList<Candidato>();
		candidatos.add(new Candidato(12345567,"bobo","cumbia","muy bueno",0));
		candidatos.add(new Candidato(45454324,"ninguno","ninguno","ninguno",0));
	}
	
}
