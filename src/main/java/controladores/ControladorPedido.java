package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import repositorios.RepositorioPedido;

public class ControladorPedido {
	
	@Autowired
	private RepositorioPedido repositoriopedido;

	@RequestMapping("")//Añadir html donde va 
	public String eliminarProductoCarrito (Model model) {
		
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String añadirProductoCarrito (Model model) {
		
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String sumarProductoCarrito (Model model) {
		
		return "";
	}
	
	@RequestMapping("")//Añadir html donde va 
	public String guardarCarrito (Model model) {
		
		return "";
	}
	
}
