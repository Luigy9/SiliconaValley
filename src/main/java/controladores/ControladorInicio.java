package controladores;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import entidades.Usuario;
import repositorios.RepositorioUsuario;

public class ControladorInicio {

	@Autowired
	private RepositorioUsuario repositoriousuario;


	@RequestMapping("/index")
	public String index() {
	    return "index";
	}
}
