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
		Producto p1 = new Producto ("MSI GP65 Leopard 9SD-013ES,","Portatil", "Intel Core i7, 16GB RAM, Nvidia GTX1660Ti 6GB","", 1799);
		repositorioproducto.save(p1);
		
		Producto p2 = new Producto ("ALIENWARE M15 R2","Portatil", "Intel Core i7, 8GB RAM, Nvidia RTX2060 6GB","", 1949);
		repositorioproducto.save(p2);
		
		Producto p3 = new Producto ("OMEN BY HP 15-DC1035NS", "Portatil", "Intel Core i7, 16GB RAM, Nvidia GTX1650 4GB","", 1299);
		repositorioproducto.save(p3);
		
		Producto p4 = new Producto ("ASUS ROG STRIX SCAR III G731GU-EV044", "Portatil", "Intel Core i7, 8GB RAM, Nvidia GTX 1660Ti 6GB","", 1365);
		repositorioproducto.save(p4);
		
		
		//Sobremesa
		
		Producto s1 = new Producto ("MSI TRIDENT X PLUS 9SE-088EU","Sobremesa","Intel Core i7, 16GB RAM, RTX2080 8GB", "",2499);
		repositorioproducto.save(s1);
		Producto s2 = new Producto ("HP OMEN 875-1011NS","Sobremesa","Intel Core i7, 16GB RAM, RTX2080","",2064);
		repositorioproducto.save(s2);
		Producto s3 = new Producto ("ASUS G20CB-FR019T","Sobremesa","Intel Core i7, 8GB RAM, GTX960","",950);
		repositorioproducto.save(s3);
		Producto s4 = new Producto ("HP PAVILION GAMING TG01-0017NS","Sobremesa","Intel Core i5, 8GB RAM, GTX1660","",799);
		repositorioproducto.save(s4);
		
		//Monitores
		
		Producto m1 = new Producto ("MSI Optix MAG321CURV 31,5\" ","Monitor","Monitor Curvo LED 4K HDR","",499);
		repositorioproducto.save(m1);
		Producto m2 = new Producto ("Dell Alienware AW3420DW 34\" ","Monitor","Monitor Curvo LED WQHD 120Hz G-Sync","img/dell-alienware-aw3420dw-341-led-wqhd-120hz-g-sync-curvo",1046);
		repositorioproducto.save(m2);
		Producto m3 = new Producto ("Asus ROG Swift PG279QE 27\" ","Monitor","Monitor LED IPS Wide QuadHD 165Hz G-Sync","",657);
		repositorioproducto.save(m3);
		Producto m4 = new Producto ("HP 34f 34\" ","Monitor","Monitor Curvo LED IPS UltraWide QuadHD FreeSync","",579);
		repositorioproducto.save(m4);
		
		
		//Consolas
		Producto c1= new Producto("PS4","Consola","Videoconsola de Sony","",240);
		repositorioproducto.save(c1);
		Producto c2= new Producto("Xbox One","Consola","Videoconsola de Microsoft","",200);
		repositorioproducto.save(c2);
		Producto c3= new Producto("Nintendo Switch","Consola","Videoconsola portatil de Nintendo","",320);
		repositorioproducto.save(c3);
		
		//Hardware
		
		Producto h1 = new Producto ("NEWSKILL Eos","Raton","Raton Gaming","",49);
		repositorioproducto.save(h1);
		Producto h2 = new Producto ("NEWSKILL Suiko","Teclado","Teclado Mecanico","",69);
		repositorioproducto.save(h2);
		Producto h3 = new Producto ("Razer BlackWindow 2019","Teclado","Teclado Mecanico","",129);
		repositorioproducto.save(h3);
		Producto h4 = new Producto ("Razer Basilisk","Raton","Raton Gaming","",56);
		repositorioproducto.save(h4);
		
		
		
		//Juegos
		//Juegos PS4
		
		Producto JP1 = new Producto ("Gran Turismo Sport PS4","Juegos","Juego PS4","",30);
		repositorioproducto.save(JP1);
		Producto JP2 = new Producto ("Death Stranding","Juegos","Juego PS4","",60);
		repositorioproducto.save(JP2);
		Producto JP3 = new Producto ("NBA 2K20","Juegos","Juego PS4","",35);
		repositorioproducto.save(JP3);

		
		//Juegos Xbox
		
		Producto JX1 = new Producto("Halo 3 Xbox One","Juegos","Juego Xbox","",40);
		repositorioproducto.save(JX1);
		Producto JX2 = new Producto("Gears of War 5","Juegos","Juego Xbox","",50);
		repositorioproducto.save(JX2);
		Producto JX3 = new Producto("NBA 2K20","Juegos","Juego Xbox","",35);
		repositorioproducto.save(JX3);
		
		//Juegos Nintendo
		
		Producto JN1 = new Producto("Pokemon Espada Nintendo Switch","Juegos","Juego Nintendo","",45);
		repositorioproducto.save(JN1); 
		Producto JN2 = new Producto("Zelda Breath of the Wild","Juegos","Juego Nintendo","",65);
		repositorioproducto.save(JN2);
		Producto JN3 = new Producto("NBA 2K20","Juegos","Juego Nintendo","",30);
		repositorioproducto.save(JN3);

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
