package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import repositorios.RepositorioMensaje;
import repositorios.RepositorioUsuario;


@Controller
public class ControladorMensaje {
	
	@Autowired
	private RepositorioMensaje repositoriomensaje;
	private RepositorioUsuario repositorioUsuario;
	
	@RequestMapping("/accederContacto")
	public String accederContacto(Model model) {
		
		model.addAttribute("usuarios",repositorioUsuario.findAll());
		
		return "contact";
	}
	
	

}
