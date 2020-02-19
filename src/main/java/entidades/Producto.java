package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idProducto;
	private String nombre;
	private String categoria;
	private String descripcion;
	private int precio;
	private String urlImagen;
	@OneToMany(mappedBy="producto")
	@Cascade({CascadeType.ALL})
	private List<CyV> cyv = new ArrayList<CyV>();
	@ManyToOne
	@Cascade({CascadeType.SAVE_UPDATE})
	@JoinColumn(name = "pedido")
	private Pedido pedido;

	
	public Producto() {
		
	}
	
	public Producto(String nombre, String categoria, String descripcion, String urlImagen,int precio) {
		this.nombre = nombre;
		this.categoria=categoria;
		this.descripcion=descripcion;
		this.urlImagen = urlImagen;
		this.precio=precio;
	}
	
	public long getIdProducto() {
		return idProducto;
	}
	
	public void setIdProducto(long idProducto) {
		this.idProducto=idProducto;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria=categoria;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public String getUrlImagen() {
		return urlImagen;
	}
	
	public void setUrlImagen(String urlImagen) {
		this.urlImagen=urlImagen;
	}
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
    public List<CyV> getCyV() {
			return cyv;
		}

    public void setCyV(List<CyV> cyv) {
			this.cyv = cyv;
    }
	
	@Override
	public String toString() {
		return "Producto [categoria=" + categoria + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}
