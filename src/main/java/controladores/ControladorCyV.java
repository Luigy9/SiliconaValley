package controladores;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.CyV;
import entidades.Mensaje;
import entidades.Producto;
import entidades.Usuario;
import repositorios.RepositorioCyV;

@Controller
public class ControladorCyV {
	
	@Autowired
	private RepositorioCyV repositoriocyv;

	@PostMapping("/enviarValoracion")
	public String enviarValoracion(@RequestParam Producto producto,@RequestParam Usuario usuario,@RequestParam String contenido,@RequestParam Date fecha,Model model) {
		
		CyV mensaje = new CyV (producto, usuario, fecha, contenido);
		repositoriocyv.save(mensaje);
		
		return "index";
	}
}
