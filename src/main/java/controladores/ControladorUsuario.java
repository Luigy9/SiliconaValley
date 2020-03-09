package controladores;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
//		CsrfToken token = (CsrfToken) request.getAttribute("_csrf");
//		 model.addAttribute("token", token.getToken());
		return "login";
	}	
	
    @RequestMapping("/login")
    public String login() {
    	return "indexLogado";
    }
	
	@PostMapping("/agregarUsuario")
	public String agregarUsuario (@RequestParam String nombreusuario,@RequestParam String password,Model model, @RequestParam String direccion, 
			@RequestParam int telefono, @RequestParam int codigoPostal, @RequestParam String email,@RequestParam String nombreCompleto) {
		
		Usuario u = new Usuario (nombreusuario, email, direccion, telefono, nombreCompleto, codigoPostal, password);
		repositoriousuario.save(u);
		
		return "indexLogado";
	}
	
	@RequestMapping("/modificarUsuario")
	public String modificarProducto (Model model,@RequestParam long id) {
		
		model.addAttribute("usuarios", repositoriousuario.findById(id));
		
		return "ModificarUsuario";
	}
	
	@RequestMapping("/modificacionUsuario")
	public String modificarUsuario (Model model, @RequestParam long id,@RequestParam String nombreusuario,@RequestParam String nombreCompleto,@RequestParam String email, @RequestParam String direccion, 
			@RequestParam int telefono, @RequestParam int codigoPostal, @RequestParam String password) {
		
		Usuario usuario = repositoriousuario.findById(id);
		//Si introduces un 0 en el campo correspondiente se indica que ese atributo no se quiere modificar
		
		if(!"0".equalsIgnoreCase(nombreusuario)) {
			usuario.setNombreUsuario(nombreusuario);
		}
		
		if(!"0".equalsIgnoreCase(direccion)) {
			usuario.setDireccion(direccion);
		}
		
		if(telefono!=0) {
			usuario.setTelefono(telefono);
		}
		
		if(codigoPostal!=0) {
			usuario.setCodigoPostal(codigoPostal);
		}
		
		if(!"0".equalsIgnoreCase(password)) {
			usuario.setPassword(password);
		}
		usuario.setEmail(email);
		usuario.setNombreCompleto(nombreCompleto);
		
		repositoriousuario.save(usuario);
		
		
		
		return "index";
	}
	
	@RequestMapping("/eliminarUsuario")
	public String eliminarUsuario (Model model, @RequestParam long id) {
		
		repositoriousuario.deleteById(id);
		
		return "index";
	}
	
	@RequestMapping("/adminUsuario")
	public String adminUsuario(Model model) {
		model.addAttribute("usuarios",repositoriousuario.findAll());
		return "adminUsuario";
	}
	

}
