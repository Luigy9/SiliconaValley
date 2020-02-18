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
	public String modificarUsuario (Model model, @RequestParam Usuario usuario,@RequestParam String nombreusuario, @RequestParam String direccion, 
			@RequestParam int telefono, @RequestParam int codigoPostal, @RequestParam String password) {
		
		//Si introduces un 0 en el campo correspondiente se indica que ese atributo no se quiere modificar
		
		if("0".equalsIgnoreCase(nombreusuario)) {
			usuario.setNombreUsuario(nombreusuario);
		}
		
		if("0".equalsIgnoreCase(direccion)) {
			usuario.setDireccion(direccion);
		}
		
		if(telefono!=0) {
			usuario.setTelefono(telefono);
		}
		
		if(codigoPostal!=0) {
			usuario.setCodigoPostal(codigoPostal);
		}
		
		if("0".equalsIgnoreCase(password)) {
			usuario.setPassword(password);
		}
		
		repositoriousuario.save(usuario);
		
		
		
		return "";
	}
	
	@RequestMapping("/borrarUsuario")
	public String borrarUsuario (Model model, @RequestParam Usuario usuario) {
		
		repositoriousuario.delete(usuario);
		
		return "";
	}
	

}
