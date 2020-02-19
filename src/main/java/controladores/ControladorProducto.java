package controladores;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.Producto;
import entidades.Usuario;
import repositorios.RepositorioProducto;
@Controller
public class ControladorProducto {
	
	@Autowired
	private RepositorioProducto repositorioproducto;
	
	
	
	@RequestMapping("/buscarCategoriaSobremesa")
	public String buscarCategoriaSobremesa (Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Sobremesa");
		model.addAttribute("productos", productos);
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaPortatiles")
	public String buscarCategoriaPortatilGaming (Model model) {
		
		List<Producto> productos = repositorioproducto.findByCategoria("Portatil");
		model.addAttribute("productos", productos);
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaRatones")
	public String buscarCategoriaRatones(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Raton");
		model.addAttribute("productos", productos);
		return "shop";
	}
	@RequestMapping("/buscarCategoriaTeclados")
	public String buscarCategoriaTeclados(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Teclado");
		model.addAttribute("productos", productos);
		return "shop";
	}
	@RequestMapping("/buscarCategoriaMonitores")
	public String buscarCategoriaMonitores(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Monitor");
		model.addAttribute("productos", productos);
		return "shop";
	}
	@RequestMapping("/buscarCategoriaAudio")
	public String buscarCategoriaAudio(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Audio");
		model.addAttribute("productos", productos);
		return "shop";
	}
	@RequestMapping("/buscarCategoriaConsolas")
	public String buscarCategoriaConsolas(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Consola");
		model.addAttribute("productos", productos);
		return "shop";
	}
	@RequestMapping("/buscarCategoriaJuegos")
	public String buscarCategoriaJuegos(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Juegos");
		model.addAttribute("productos", productos);
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaJuegosPs4")
	public String buscarCategoriaJuegosPs4(Model model) {
		List<Producto> productos = repositorioproducto.findByDescripcion("Juego PS4");
		model.addAttribute("productos", productos);
		return "shop";
	}
	@RequestMapping("/buscarCategoriaJuegosXbox")
	public String buscarCategoriaJuegosXbox(Model model) {
		List<Producto> productos = repositorioproducto.findByDescripcion("Juego Xbox");
		model.addAttribute("productos", productos);
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaJuegosNintendo")
	public String buscarCategoriaJuegosNintendo(Model model) {
		List<Producto> productos = repositorioproducto.findByDescripcion("Juego Nintendo");
		model.addAttribute("productos", productos);
		return "shop";
	}

	@RequestMapping("/detallesProducto")
	public String detallesProducto(Model model, @RequestParam long id) {
		
		model.addAttribute("producto", repositorioproducto.findByIdProducto(id));
		
		
		return "product";
	}
	
	
	@RequestMapping("/controlWeb")
	public String agregarProducto (Model model,@RequestParam String nombre, @RequestParam String categoria, 
			@RequestParam String descripcion, @RequestParam String urlImagen,@RequestParam int precio) {
	
		Producto producto = new Producto (nombre,categoria,descripcion,urlImagen,precio);
		repositorioproducto.save(producto);
	
		return "controlWeb";
	}

	
	
	@RequestMapping("/modificarProducto")
	public String modificarProducto (Model model, @RequestParam Producto producto ,@RequestParam String categoria, @RequestParam int precio) {
		
		//Si introduces un 0 en el campo correspondiente se indica que ese atributo no se quiere modificar
		if(!"0".equalsIgnoreCase(categoria)) {
			producto.setCategoria(categoria);
		}
		
		if(precio!=0) {
			producto.setPrecio(precio);
		}
		
		repositorioproducto.save(producto);
		
		return "product";
	}
	
	@RequestMapping("/eliminarProducto")
	public String eliminarProducto (Model model, @RequestParam Producto producto) {
		
		repositorioproducto.delete(producto);
		
		return "product";
	}
	
	
	/*@RequestMapping("") 
	public String agregarCarrito( Model model) {
	
		return "";		
	}*/
	
//	@RequestMapping("")//Añadir html donde va 
//	public String modificarCarrito (Model model) {
//		
//		return "";
//	}
	
	//@RequestMapping("")//Añadir html donde va 
//	public String eliminarCarrito (Model model) {
//		
//		return "";
//	}
	
	
	
}
