package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idProducto;
	private long categoria;
	private String descripcion;
	private int precio;
	
	public Producto() {
		
	}
	
	public Producto(long categoria, String descripcion, int precio) {
		this.categoria=categoria;
		this.descripcion=descripcion;
		this.precio=precio;
	}
	
	public long getIdProducto() {
		return idProducto;
	}
	
	public void setIdProducto(long idProducto) {
		this.idProducto=idProducto;
	}
	
	public long getCategoria() {
		return categoria;
	}
	
	public void setCategoria(long categoria) {
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
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	@Override
	public String toString() {
		return "Exemplar [categoria=" + categoria + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}
