package controladores;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import entidades.Usuario;
import repositorios.RepositorioUsuario;

public class ControladorInicio {

	@Autowired
	private RepositorioUsuario repositoriousuario;

	@PostConstruct
	public void init() {
		
		Usuario usuario1 = new Usuario("Luis Riaño", "luigys.dad@gmail.com","avenida del tulipan", 913456767, "LUigyy9", 280123, "password");
		repositoriousuario.save(usuario1);
	}
	
	@RequestMapping("/index")
	public String index() {
	    return "index";
	}
}
