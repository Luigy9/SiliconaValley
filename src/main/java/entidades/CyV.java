package entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CyV {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idCyV;
	private Date fecha;
	private String contenido;
	@ManyToOne
    @JoinColumn(name="usuario")
	private Usuario usuario;
	@ManyToOne
    @JoinColumn(name="producto")
	private Producto producto;
	
	public CyV() {
		
	}
	
	public CyV(Producto producto, Usuario usuario, Date fecha, String contenido ) {
		this.producto=producto;
		this.usuario=usuario;
		this.fecha=fecha;
		this.contenido=contenido;
	}
	
	public Producto getProducto() {
		return producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto=producto;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario=usuario;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha=fecha;
	}
	
	public String getContenido() {
		return contenido;
	}
	
	public void setContenido(String contenido) {
		this.contenido=contenido;
	}
	
	@Override
	public String toString() {
		return "CyV [Usuario=" + usuario + ", producto=" + producto + ", fecha=" + fecha + ", contenido=" + contenido +"]";
	}
	
}
