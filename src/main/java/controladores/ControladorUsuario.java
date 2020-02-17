package controladores;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entidades.Usuario;
import repositorios.RepositorioUsuario;

@Controller
public class ControladorUsuario {
	
	@Autowired
	private RepositorioUsuario repositoriousuario;

	@PostConstruct
	public void init() {
		
		Usuario usuario1 = new Usuario ("Luis Riaño", "luigys.dad@gmail.com","avenida del tulipan", 913456767, "LUigyy9", 280123, "pa2q34rh1k");
		Usuario usuario2 = new Usuario ("Daniel Santiago", "Dani@gmail.com", "Calle Ramón Pascual", 688756214, "DanySant", 28953, "12s3ff4g");
		Usuario usuario3 = new Usuario ("Jaime Pardo", "james@hotmail.com", "Calle del rosario", 654221478, "Jaopar", 28007, "66752d214");
		repositoriousuario.save(usuario1);
		repositoriousuario.save(usuario2);
		repositoriousuario.save(usuario3);

	}
	
	@RequestMapping("/controladorRegistro")
	public String controladorRegistro () {
		
		return "register";
	}
	@RequestMapping("/controladorLogin")
	public String controladorLogin () {
		
		return "login";
	}	
	@RequestMapping("/agregarUsuario")
	public String agregarUsuario (Model model) {
		
		return "";
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
