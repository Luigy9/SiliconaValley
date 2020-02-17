package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import repositorios.RepositorioMensaje;


@Controller
public class ControladorMensaje {
	
	@Autowired
	private RepositorioMensaje repositoriomensaje;
	
	@RequestMapping("/accederContacto")
	public String accederContacto() {
		
		return "contact";
	}
	

}
