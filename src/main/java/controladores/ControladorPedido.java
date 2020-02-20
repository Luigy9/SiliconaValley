package controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.Pedido;
import entidades.Producto;
import repositorios.RepositorioPedido;
import repositorios.RepositorioProducto;
import repositorios.RepositorioUsuario;

@Controller
public class ControladorPedido {
	
	@Autowired
	private RepositorioPedido repositoriopedido;
	@Autowired
	private RepositorioProducto repositorioproducto;
	@Autowired
	private RepositorioUsuario repositoriousuario;
	
	@RequestMapping("/carritoDetalles")//Añadir html donde va 
	public String carritoDetalles (Model model) {
		
		Pedido pedido = repositoriopedido.findByIdPedido(1);
		model.addAttribute("pedido", pedido);
		model.addAttribute("lista", pedido.getListaProductos());
		return "/shopping-cart";
	}
	
	@RequestMapping("/carritoPagar")//Añadir html donde va 
	public String carritoPagar (Model model) {
		
		return "/check-out";
	}

	@RequestMapping("/eliminarProductoCarrito")//Añadir html donde va 
	public String eliminarProductoCarrito (Model model, @RequestParam long idProducto) {
		
		Producto producto = repositorioproducto.findByIdProducto(idProducto);
		Pedido pedido = repositoriopedido.findByIdPedido(1);
		producto.setPedido(null);
		pedido.getListaProductos().remove(producto);
		repositoriopedido.save(pedido);
		
		return "/";
	}
	
	@RequestMapping("/añadirProductoCarrito")
	public String añadirProductoCarrito (Model model, @RequestParam long idProducto) {
		Producto producto = repositorioproducto.findByIdProducto(idProducto);
		
		Pedido pedido = repositoriopedido.findByIdPedido(1);
		producto.setPedido(pedido);
		pedido.getListaProductos().add(producto);
		repositoriopedido.save(pedido);
		
		
		model.addAttribute("producto", producto);
        model.addAttribute("usuarios", repositoriousuario.findAll());
        model.addAttribute("cyv", producto.getCyV());
		
		return "product";
	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String sumarProductoCarrito (Model model) {
//		
//		return "";
//	}
//	

	
}
