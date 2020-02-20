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
import repositorios.RepositorioUsuario;
import repositorios.RepositorioProducto;

@Controller
public class ControladorCyV {
	
	@Autowired
	private RepositorioCyV repositoriocyv;
	@Autowired
	private RepositorioUsuario repositoriousuario;
	@Autowired
	private RepositorioProducto repositorioproducto;

	@PostMapping("/enviarValoracion")
	public String enviarValoracion(@RequestParam long idProducto,@RequestParam long id,@RequestParam String contenido,@RequestParam Date fecha,Model model) {
		
		Usuario usuario = repositoriousuario.findById(id);
		Producto producto = repositorioproducto.findByIdProducto(idProducto);
		CyV mensaje = new CyV (producto, usuario, fecha, contenido);
		repositoriocyv.save(mensaje);
		usuario.getCyV().add(mensaje);
		producto.getCyV().add(mensaje);
		
		return "index";
	}
}
