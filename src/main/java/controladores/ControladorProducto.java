package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import repositorios.RepositorioProducto;
@Controller
public class ControladorProducto {
	
	@Autowired
	private RepositorioProducto repositorioproducto;
	
	@RequestMapping("/buscarCategoriaSobremesa")//Añadir html donde va 
	public String buscarCategoriaSobremesa () {
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaPortatiles")//Añadir html donde va 
	public String buscarCategoriaPortatilGaming () {
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaRatones")//Añadir html donde va 
	public String buscarCategoriaRatones() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaTeclados")//Añadir html donde va 
	public String buscarCategoriaTeclados() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaMonitores")//Añadir html donde va 
	public String buscarCategoriaMonitores() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaAudio")//Añadir html donde va 
	public String buscarCategoriaAudio() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaConsolas")//Añadir html donde va 
	public String buscarCategoriaConsolas() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaJuegos")//Añadir html donde va 
	public String buscarCategoriaJuegos() {
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaJuegosPs4")//Añadir html donde va 
	public String buscarCategoriaJuegosPs4() {
		
		return "shop";
	}
	@RequestMapping("/buscarCategoriaJuegosXbox")//Añadir html donde va 
	public String buscarCategoriaJuegosXbox() {
		
		return "shop";
	}
	
	@RequestMapping("/buscarCategoriaJuegosNintendo")//Añadir html donde va 
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
