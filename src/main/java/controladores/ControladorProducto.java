package controladores;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entidades.Producto;
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
	public String detallesProducto() {
		return "product";
	}
//	@RequestMapping("")//Añadir html donde va 
//	public String agregarProducto (Model model) {
//	
//		return "";
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String agregarCarrito( Model model) {
//	
//		return "";		
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String modificarProducto (Model model) {
//		
//		return "";
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String modificarCarrito (Model model) {
//		
//		return "";
//	}
//	
//	@RequestMapping("/buscarCategoriaAsc")//Añadir html donde va 
//	public String buscarCategoriaAsc () {
//		
//		return "shop";
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String buscarCategoriaDesc (Model model) {
//		
//		return "";
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String buscarPrecioAsc (Model model) {
//		
//		return "";
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String buscarPrecioDesc (Model model) {
//		
//		return "";
//	}
//	@RequestMapping("")//Añadir html donde va 
//	public String buscarValoracionAsc (Model model) {
//		
//		return "";
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String buscarValoracionDesc (Model model) {
//		return "";
//	}
	
	
}
