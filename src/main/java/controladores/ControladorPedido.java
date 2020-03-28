package controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

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
        model.addAttribute("usuarios", repositoriousuario.findAll());
		model.addAttribute("lista", pedido.getListaProductos());
		return "/shopping-cart";
	}
	
	@RequestMapping("/carritoPagar")//Añadir html donde va 
	public String carritoPagar (Model model, HttpServletRequest request) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken()); 
		return "/check-out";
	}

	@RequestMapping("/eliminarProductoCarrito")//Añadir html donde va 
	public String eliminarProductoCarrito (Model model, @RequestParam long idProducto) {
		
		Producto producto = repositorioproducto.findByIdProducto(idProducto);
		Pedido pedido = repositoriopedido.findByIdPedido(1);
		producto.setPedido(null);
		pedido.getListaProductos().remove(producto);
		repositoriopedido.save(pedido);
		
		return "/carritoDetalles";
	}
	
	@RequestMapping("/añadirProductoCarrito")
	public String añadirProductoCarrito (Model model, HttpServletRequest request,@RequestParam long idProducto) {
		Producto producto = repositorioproducto.findByIdProducto(idProducto);
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken());
		Pedido pedido = repositoriopedido.findByIdPedido(1);
		producto.setPedido(pedido);
		pedido.getListaProductos().add(producto);
		repositoriopedido.save(pedido);
		
		
		model.addAttribute("producto", producto);
        model.addAttribute("usuarios", repositoriousuario.findAll());
        model.addAttribute("cyv", producto.getCyV());
		
		return "product logado";
	}
	
	@RequestMapping("/correopdf")
	public String ImprimirCarrito (Model model) {
		
		Pedido pedido = repositoriopedido.findByIdPedido(1);
		pedido.getListaProductos();
		
		String urlCorreo="http://localhost:8088/correopdf";
		RestTemplate rest=new RestTemplate();
		rest.postForObject(urlCorreo,pedido.toString(),Pedido.class);
		
		
		return "index";
	}
//	
//	@RequestMapping("")//Añadir html donde va 
//	public String sumarProductoCarrito (Model model) {
//		
//		return "";
//	}
//	

	
}
