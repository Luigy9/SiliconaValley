package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import repositorios.RepositorioProducto;

public class ControladorProducto {
	
	@Autowired
	private RepositorioProducto repositorioproducto;

	@RequestMapping("")//Añadir html donde va 
	public String agregarProducto (Model model) {
	
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String agregarCarrito( Model model) {
	
		return "";		
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String modificarProducto (Model model) {
		
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String modificarCarrito (Model model) {
		
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String buscarCategoriaAsc (Model model) {
		
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String buscarCategoriaDesc (Model model) {
		
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String buscarPrecioAsc (Model model) {
		
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String buscarPrecioDesc (Model model) {
		
		return "";
	}
	@RequestMapping("")//Añadir html donde va 
	public String buscarValoracionAsc (Model model) {
		
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String buscarValoracionDesc (Model model) {
		return "";
	}
	
	
}
