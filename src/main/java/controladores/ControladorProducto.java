package controladores;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import entidades.Producto;
import entidades.Usuario;
import repositorios.RepositorioProducto;
import repositorios.RepositorioUsuario;
@Controller
public class ControladorProducto {
	
	@Autowired
	private RepositorioProducto repositorioproducto;
	@Autowired
	private RepositorioUsuario repositoriousuario;
		
	
	@RequestMapping("/accederProducto")
	public String accederProducto(Model model, HttpServletRequest request) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken());
    	
		model.addAttribute("productos",repositorioproducto.findAll());
		
		return "adminProducto";
	}
	
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
	public String detallesProducto(Model model,HttpServletRequest request ,@RequestParam long id) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken()); 
		Producto producto = repositorioproducto.findByIdProducto(id);
		model.addAttribute("producto", producto);
        model.addAttribute("usuarios", repositoriousuario.findAll());
        model.addAttribute("cyv", producto.getCyV());
        
		
		
		return "product";
	}
	
	@RequestMapping("/agregarProducto")
	public String  agregarProducto(Model model,HttpServletRequest request) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken());
		return "agregarProducto";
	}
	
	@RequestMapping("/agregacionProducto")
	public String agregacionProducto (Model model,HttpServletRequest request,@RequestParam String nombre, @RequestParam String categoria, 
			@RequestParam String descripcion, @RequestParam String urlImagen,@RequestParam int precio) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken());
		Producto producto = new Producto (nombre,categoria,descripcion,urlImagen,precio);
		repositorioproducto.save(producto);
	
		return "/";
	}

	
	
	@RequestMapping("/modificarProducto")
	public String modificarProducto (Model model,HttpServletRequest request,@RequestParam long idProducto) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken()); 
		
		model.addAttribute("producto", repositorioproducto.findByIdProducto(idProducto));
		
		return "ModificarProducto";
	}
	
	@RequestMapping("/modificacionProducto")//modprodpeticion
	public String modificarProductoPeticion (Model model,HttpServletRequest request ,@RequestParam long idProducto,@RequestParam String nombre, @RequestParam String categoria,
			@RequestParam String descripcion, @RequestParam int precio, @RequestParam String urlImagen) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken()); 
		Producto producto = repositorioproducto.findByIdProducto(idProducto);
		producto.setNombre(nombre);
		producto.setCategoria(categoria);
		producto.setDescripcion(descripcion);
		producto.setPrecio(precio);
		producto.setUrlImagen(urlImagen);

		repositorioproducto.save(producto);
		
		return "index";
	}
	
	@RequestMapping("/adminProducto")
	public String adminProducto(Model model, HttpServletRequest request) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken());
		model.addAttribute("productos",repositorioproducto.findAll());
		return "adminProducto";
	}
	
	@RequestMapping("/eliminarProducto")
	public String eliminarProducto (Model model,HttpServletRequest request ,@RequestParam long idProducto) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken()); 
		Producto producto = repositorioproducto.findByIdProducto(idProducto);
		repositorioproducto.delete(producto);
		
		return "index";
	}
	
	/*@RequestMapping("/buscarPrecio")
	public String buscarPorPrecio(Model model, @RequestParam String orden) {
		
		List<Producto> productos;
		
		if(orden.equalsIgnoreCase("buscar por precio ascendente")) {
			productos = repositorioproducto.findByPrecioAsc();
		}else {
			productos = repositorioproducto.findByPrecioDesc();
		}
		
		model.addAttribute("productos", productos);
		return "shop";
		
	}*/
	
	@RequestMapping("/buscarNombre")
	public String buscarPorNombre(Model model, @RequestParam String nombre) {
		
		List<Producto> productos = repositorioproducto.findByNombre(nombre);
		model.addAttribute("productos", productos);
		return "shop";
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
	
	@RequestMapping("/buscarCategoriaSobremesaLogado")
	public String buscarCategoriaSobremesaLogado (Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Sobremesa");
		model.addAttribute("productos", productos);
		return "shop logado";
	}
	
	@RequestMapping("/buscarCategoriaPortatilesLogado")
	public String buscarCategoriaPortatilGamingLogado (Model model) {
		
		List<Producto> productos = repositorioproducto.findByCategoria("Portatil");
		model.addAttribute("productos", productos);
		
		return "shop logado";
	}
	
	@RequestMapping("/buscarCategoriaRatonesLogado")
	public String buscarCategoriaRatonesLogado(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Raton");
		model.addAttribute("productos", productos);
		return "shop logado";
	}
	@RequestMapping("/buscarCategoriaTecladosLogado")
	public String buscarCategoriaTecladosLogado(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Teclado");
		model.addAttribute("productos", productos);
		return "shop logado";
	}
	@RequestMapping("/buscarCategoriaMonitoresLogado")
	public String buscarCategoriaMonitoresLogado(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Monitor");
		model.addAttribute("productos", productos);
		return "shop logado";
	}
	@RequestMapping("/buscarCategoriaAudioLogado")
	public String buscarCategoriaAudioLogado(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Audio");
		model.addAttribute("productos", productos);
		return "shop logado";
	}
	@RequestMapping("/buscarCategoriaConsolasLogado")
	public String buscarCategoriaConsolasLogado(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Consola");
		model.addAttribute("productos", productos);
		return "shop logado";
	}
	@RequestMapping("/buscarCategoriaJuegosLogado")
	public String buscarCategoriaJuegosLogado(Model model) {
		List<Producto> productos = repositorioproducto.findByCategoria("Juegos");
		model.addAttribute("productos", productos);
		return "shop logado";
	}
	
	@RequestMapping("/buscarCategoriaJuegosPs4Logado")
	public String buscarCategoriaJuegosPs4Logado(Model model) {
		List<Producto> productos = repositorioproducto.findByDescripcion("Juego PS4");
		model.addAttribute("productos", productos);
		return "shop logado";
	}
	@RequestMapping("/buscarCategoriaJuegosXboxLogado")
	public String buscarCategoriaJuegosXboxLogado(Model model) {
		List<Producto> productos = repositorioproducto.findByDescripcion("Juego Xbox");
		model.addAttribute("productos", productos);
		
		return "shop logado";
	}
	
	@RequestMapping("/buscarCategoriaJuegosNintendoLogado")
	public String buscarCategoriaJuegosNintendoLogado(Model model) {
		List<Producto> productos = repositorioproducto.findByDescripcion("Juego Nintendo");
		model.addAttribute("productos", productos);
		return "shop logado";
	}	
	@RequestMapping("/detallesProductoLogado")
	public String detallesProductoLogado(Model model,HttpServletRequest request ,@RequestParam long id) {
		CsrfToken token = (CsrfToken) request.getAttribute("_csrf"); 
    	model.addAttribute("token", token.getToken());
		Producto producto = repositorioproducto.findByIdProducto(id);
		model.addAttribute("producto", producto);
        model.addAttribute("usuarios", repositoriousuario.findAll());
        model.addAttribute("cyv", producto.getCyV());
        
		
		
		return "product logado";
	}
}
