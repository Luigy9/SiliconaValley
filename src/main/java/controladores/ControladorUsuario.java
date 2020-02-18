package controladores;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.Usuario;
import repositorios.RepositorioUsuario;

@Controller
public class ControladorUsuario {
	
	@Autowired
	private RepositorioUsuario repositoriousuario;

	
	@RequestMapping("/controladorRegistro")
	public String controladorRegistro () {
		
		return "register";
	}
	@RequestMapping("/controladorLogin")
	public String controladorLogin () {
		
		return "login";
	}	
	
	
	@PostMapping("/agregarUsuario")
	public String agregarUsuario (@RequestParam String nombreUsuario,@RequestParam String password,Model model) {
		
		Usuario u = new Usuario (nombreUsuario,password);
		repositoriousuario.save(u);
		
		return "index";
	}
	
	@RequestMapping("/modificarUsuario")
	public String modificarUsuario (Model model) {
		
		return "";
	}
	
	@RequestMapping("/borrarUsuario")
	public String borrarUsuario (Model model) {
		
		return "";
	}
	

}
