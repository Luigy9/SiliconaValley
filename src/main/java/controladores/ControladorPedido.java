package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import repositorios.RepositorioPedido;

@Controller
public class ControladorPedido {
	
	@Autowired
	private RepositorioPedido repositoriopedido;
	
	@RequestMapping("/carritoDetalles")//Añadir html donde va 
	public String carritoDetalles (Model model) {
		
		return "/shopping-cart";
	}
	
	@RequestMapping("/carritoPagar")//Añadir html donde va 
	public String carritoPagar (Model model) {
		
		return "/check-out";
	}

//	@RequestMapping("")//Añadir html donde va 
//	public String eliminarProductoCarrito (Model model) {
//		
//		return "";
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String añadirProductoCarrito (Model model) {
//		
//		return "";
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String sumarProductoCarrito (Model model) {
//		
//		return "";
//	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String guardarCarrito (Model model) {
//		
//		return "";
//	}
	
}
