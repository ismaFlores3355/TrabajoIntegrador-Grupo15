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
		candidatos.add(new Candidato(1,"Shakira","pop","muy bueno",0));
		candidatos.add(new Candidato(2,"Ed Sheeran","pop","regular",0));
		candidatos.add(new Candidato(3,"Ariana Grande","pop","regular",0));
		candidatos.add(new Candidato(4,"Ninguno","-","-",0));
	}
	
}
