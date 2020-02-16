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
	
	@PostConstruct
	public void init() {
		
		Producto p1 = new Producto ("MSI GP65 Leopard 9SD-013ES,","Portatil", "Intel Core i7, 16GB RAM, Nvidia GTX1660Ti 6GB", 1799);
		repositorioproducto.save(p1);
		Producto p2 = new Producto ("MSI GP75 Leopard 9SD-015ES,","Portatil", "Intel Core i7, 16GB RAM, Nvidia GTX1700Ti 8GB", 2199);
		repositorioproducto.save(p2);
		Producto p3 = new Producto ("MSI GP85 Leopard 9SD-013ES,","Portatil", "Intel Core i7, 16GB RAM, Nvidia GTX1800Ti 6GB", 2399);
		repositorioproducto.save(p3);
		Producto p4 = new Producto ("MSI GP95 Leopard 9SD-015ES,","Portatil", "Intel Core i7, 16GB RAM, Nvidia GTX2000Ti 8GB", 2599);
		repositorioproducto.save(p4);
	}
	
	@RequestMapping("/buscarCategoriaSobremesa")
	public String buscarCategoriaSobremesa () {
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaPortatiles")
	public String buscarCategoriaPortatilGaming (Model model) {
		
		List<Producto> productos = repositorioproducto.findByCategoria("Portatil");
		model.addAttribute("productos", productos);
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaRatones")
	public String buscarCategoriaRatones() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaTeclados")
	public String buscarCategoriaTeclados() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaMonitores")
	public String buscarCategoriaMonitores() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaAudio")
	public String buscarCategoriaAudio() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaConsolas")
	public String buscarCategoriaConsolas() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaJuegos")
	public String buscarCategoriaJuegos() {
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaJuegosPs4")
	public String buscarCategoriaJuegosPs4() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaJuegosXbox")
	public String buscarCategoriaJuegosXbox() {
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaJuegosNintendo")
	public String buscarCategoriaJuegosNintendo() {
		
		return "shop";
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
