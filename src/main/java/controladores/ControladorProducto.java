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
		
		//Portatiles
		Producto p1 = new Producto ("MSI GP65 Leopard 9SD-013ES,","Portatil", "Intel Core i7, 16GB RAM, Nvidia GTX1660Ti 6GB", 1799);
		repositorioproducto.save(p1);
		
		Producto p2 = new Producto ("ALIENWARE M15 R2","Portatil", "Intel Core i7, 8GB RAM, Nvidia RTX2060 6GB", 1949);
		repositorioproducto.save(p2);
		
		Producto p3 = new Producto ("OMEN BY HP 15-DC1035NS", "Portatil", "Intel Core i7, 16GB RAM, Nvidia GTX1650 4GB", 1299);
		repositorioproducto.save(p3);
		
		Producto p4 = new Producto ("ASUS ROG STRIX SCAR III G731GU-EV044", "Portatil", "Intel Core i7, 8GB RAM, Nvidia GTX 1660Ti 6GB", 1365);
		repositorioproducto.save(p4);
		
		
		//Sobremesa
		
		Producto s1 = new Producto ("MSI TRIDENT X PLUS 9SE-088EU","Sobremesa","Intel Core i7, 16GB RAM, RTX2080 (GB",2499);
		repositorioproducto.save(s1);
		Producto s2 = new Producto ("HP OMEN 875-1011NS","Sobremesa","Intel Core i7, 16GB RAM, RTX2080",2064);
		repositorioproducto.save(s2);
		Producto s3 = new Producto ("ASUS G20CB-FR019T","Sobremesa","Intel Core i7, 8GB RAM, GTX960",950);
		repositorioproducto.save(s3);
		Producto s4 = new Producto ("HP PAVILION GAMING TG01-0017NS","Sobremesa","Intel Core i5, 8GB RAM, GTX1660",799);
		repositorioproducto.save(s4);
		
		//Monitores
		
		Producto m1 = new Producto ("MSI Optix MAG321CURV 31,5\" ","Monitor","Monitor Curvo LED 4K HDR",499);
		repositorioproducto.save(m1);
		Producto m2 = new Producto ("Dell Alienware AW3420DW 34\" ","Monitor","Monitor Curvo LED WQHD 120Hz G-Sync",1046);
		repositorioproducto.save(m2);
		Producto m3 = new Producto ("Asus ROG Swift PG279QE 27\" ","Monitor","Monitor LED IPS Wide QuadHD 165Hz G-Sync",657);
		repositorioproducto.save(m3);
		Producto m4 = new Producto ("HP 34f 34\" ","Monitor","Monitor Curvo LED IPS UltraWide QuadHD FreeSync",579);
		repositorioproducto.save(m4);
		
		//Hardware
		
		Producto h1 = new Producto ("NEWSKILL Eos","Raton","Raton Gaming",49);
		repositorioproducto.save(h1);
		Producto h2 = new Producto ("NEWSKILL Suiko","Teclado","Teclado Mecanico",69);
		repositorioproducto.save(h2);
		Producto h3 = new Producto ("Razer BlackWindow 2019","Teclado","Teclado Mecanico",129);
		repositorioproducto.save(h3);
		Producto h4 = new Producto ("Razer Basilisk","Raton","Raton Gaming",56);
		repositorioproducto.save(h4);
		
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
