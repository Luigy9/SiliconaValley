package controladores;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import entidades.Usuario;
import repositorios.RepositorioUsuario;

public class ControladorInicio {

	@Autowired
	private RepositorioUsuario repositoriousuario;

//	@PostConstruct
//	public void init() {
//		Usuario u1 = new Usuario("Luis Asecas","luigys.dad@gmail.com","avenida del pan", 913456755, "LUigyy9",280002,"pa2q34rh1k" );
//		Usuario u2 = new Usuario("Daniel San","Dani@gmail.com","Calle Ramón Pascual", 688756214, "DanySant",28953,"12s3ff4g" );
//		Usuario u3 = new Usuario("Jaime Par","james@hotmail.com","Calle del rosario", 654221478, "Jaopar",28007,"66752d214" );
//		repositoriousuario.save(u1);
//		repositoriousuario.save(u2);
//		repositoriousuario.save(u3);
//		
//	}
	
	@RequestMapping("/index")
	public String index() {
	    return "index";
	}
}
