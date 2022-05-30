package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pagina")
public class InicioController {

	@GetMapping("/inicio")
	public String getIncioPage(Model model) {
		return "index";
	}
	@GetMapping("/saludo")
	public String getSaludoPage(Model model) {
		return "saludo";
	}
}
