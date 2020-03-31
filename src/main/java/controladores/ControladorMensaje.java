package controladores;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.Mensaje;
import entidades.Usuario;
import repositorios.RepositorioMensaje;
import repositorios.RepositorioUsuario;


@Controller
public class ControladorMensaje {
	
	@Autowired
	private RepositorioMensaje repositoriomensaje;
	@Autowired
	private RepositorioUsuario repositorioUsuario;
	
	@RequestMapping("/accederContacto")
	public String accederContacto(Model model, HttpServletRequest request) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken());
		model.addAttribute("usuarios",repositorioUsuario.findAll());
		
		return "contact";
	}
	
	@PostMapping("/enviarMensaje")
	public String enviarMensaje(@RequestParam Usuario usuario,@RequestParam String email,@RequestParam String comentario,@RequestParam Date fechacomentario,Model model, HttpServletRequest request) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken()); 
		Mensaje mensaje = new Mensaje (fechacomentario, email, comentario, usuario);
		repositoriomensaje.save(mensaje);
		
		return "index";
	}
	

}
