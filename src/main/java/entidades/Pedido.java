package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idPedido;
	private String direccion;
	private double precioTotal;
	@ManyToOne
	@Cascade({CascadeType.SAVE_UPDATE})
    @JoinColumn(name="usuario")
	private Usuario usuario;
	
	public Pedido() {
		
	}
	
	public Pedido (long idPedido, String direccion, double precioTotal) {
		
		this.idPedido = idPedido;
		this.direccion = direccion;
		this.precioTotal = precioTotal;
		
	}
	
	public long getIdPedido() {
		return idPedido;
	}
	
	public void setIdPedido(long idPedido) {
		this.idPedido=idPedido;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public double getPrecioTotal () {
		return precioTotal;
	}
	
	public void setPrecioTotal (double precioTotal) {
		
		this.precioTotal = precioTotal;
	}
	
	public Usuario getUsuario () {
		return usuario;
	}
	
	public void setUsuario (Usuario usuario) {
		
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", Direccion=" + direccion + ", Precio total=" + precioTotal +"]";
	}
}
