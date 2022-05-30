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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import ar.edu.unju.fi.html.model.Usuario;

import ar.edu.unju.fi.html.service.IUsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	@Qualifier("UsuarioServiceImpList")
	private IUsuarioService usuarioService;
	
	private static final Log LOGGER = LogFactory.getLog(UsuarioController.class);
	
	@GetMapping("/nuevo")
	public String getFormNuevoUsuarioPage(Model model) {
		model.addAttribute("usuario", usuarioService.getUsuario());
		return "nuevo_usuario";
	 }
	
	@PostMapping("/guardar")
	public ModelAndView getListaUsuariosPage(@Validated @ModelAttribute("usuario")Usuario usuario,
			BindingResult bindingResult) {
		//@Validated proviene de Spring Framework Validation
		//el objeto bindingResult contiene el resultado de la validación, 
		//(los errores que pueden haber ocurrido).
		if(bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView("nuevo_usuario");
			mav.addObject("usuario", usuario);
			return mav;
		}
		ModelAndView mav = new ModelAndView("redirect:/usuario/listaUsuarios");
		
		//agrego un objeto alumno a la lista
		if(usuarioService.guardarUsuario(usuario)) {
			LOGGER.info("Se agregó un objeto al arrayList de usuarios");
		}
		return mav;
	}
	
	@GetMapping("/listaUsuarios")
	public ModelAndView getListaUsuariosPage() {
		ModelAndView mav = new ModelAndView("lista_usuarios");
		mav.addObject("usuarios",usuarioService.getListaUsuario().getUsuarios());
		return mav;
	}
}
