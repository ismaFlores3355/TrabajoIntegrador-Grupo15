package ar.edu.unju.fi.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.html.model.Candidato;
import ar.edu.unju.fi.html.service.ICandidatoService;

@Controller
@RequestMapping("/candidato")
public class CandidatoController {
	
	@Autowired
	@Qualifier("CandidatoServiceImpList")

	private ICandidatoService candidatoService;
	
	private static final Log LOGGER = LogFactory.getLog(CandidatoController.class);
	
	@GetMapping("/nuevo")
	public String getFormNuevoCandidatoPage(Model model) {
		
		model.addAttribute("candidato", candidatoService.getCandidato());
		
		return "nuevo_candidato";
	}
	
	
	@PostMapping("/guardar")
	public ModelAndView getListaCandidatosPage(@Validated @ModelAttribute("candidato")Candidato candidato,
			BindingResult bindingResult) {
		//@Validated proviene de Spring Framework Validation
		//el objeto bindingResult contiene el resultado de la validación, 
		//(los errores que pueden haber ocurrido).
		if(bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView("nuevo_candidato");
			mav.addObject("candidato", candidato);
			return mav;
		}
		ModelAndView mav = new ModelAndView("redirect:/candidato/listaCandidatos");
		
		//agrego un objeto alumno a la lista
		if(candidatoService.guardarCandidato(candidato)) {
			LOGGER.info("Se agregó un objeto al arrayList de candidatos");
		}
		return mav;
	}
	
	
	@GetMapping("/listaCandidatos")
	public ModelAndView getListaCandidatosPage() {
		ModelAndView mav = new ModelAndView("lista_candidatos");
		mav.addObject("candidatos",candidatoService.getListaCandidato().getCandidatos());
		return mav;
	}
	
	@GetMapping("/editar/{codigo}")
	public ModelAndView getEditarAlumnoPage(@PathVariable(value="codigo")int codigo) {
		ModelAndView mav = new ModelAndView("edicion_candidato");
		Candidato candidato = candidatoService.buscarCandidato(codigo);
		mav.addObject("candidato", candidato);
		return mav;
		
	}
	
	@PostMapping("/modificar")
	public ModelAndView editarDatosCandidato(@Validated @ModelAttribute("candidato") Candidato candidato, BindingResult bindingResult ) {
		if(bindingResult.hasErrors()) {
			LOGGER.info("ocurrió un error "+candidato);
			ModelAndView mav = new ModelAndView("edicion_candidato");
			mav.addObject("candidato", candidato);
			return mav;
		}
		
		ModelAndView mav = new ModelAndView("redirect:/candidato/listaCandidatos");
		candidatoService.modificarCandidato(candidato);
		return mav;
		
	}
	
	@GetMapping("/eliminar/{codigo}")
	public ModelAndView eliminarAlumno(@PathVariable("codigo")int codigo) {
		ModelAndView mav = new ModelAndView("redirect:/candidato/listaCandidatos");
		
		return mav;
		
	}
	
	@GetMapping("/votar/{codigo}")
	public ModelAndView getVotarCandidatoPage(@PathVariable(value="codigo")int codigo) {
		candidatoService.votarCandidato(codigo);
		ModelAndView mav = new ModelAndView("lista_candidatos");
		mav.addObject("candidatos",candidatoService.getListaCandidato().getCandidatos());
		return mav;
		
	}
	
	@GetMapping("/eliminarr/{codigo}")
	public ModelAndView getEliminarCandidatoPage(@PathVariable(value="codigo")int codigo) {
		candidatoService.eliminarCandidato(codigo);
		ModelAndView mav = new ModelAndView("lista_candidatos");
		mav.addObject("candidatos",candidatoService.getListaCandidato().getCandidatos());
		return mav;
		
	}
	
}
