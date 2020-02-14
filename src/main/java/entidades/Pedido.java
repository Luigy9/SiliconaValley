package entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idPedido;
	private ArrayList <String> pedido = new ArrayList<String>();
	private String direccion;
	private double precioTotal;
	@ManyToOne  
    @JoinColumn(name="usuario")
	private Usuario usuario;
	
	public Pedido() {
		
	}
	
	public Pedido (long idPedido, ArrayList<String> pedido, String direccion, double precioTotal) {
		
		this.idPedido = idPedido;
		this.pedido = pedido;
		this.direccion = direccion;
		this.precioTotal = precioTotal;
		
	}
	
	public long getIdPedido() {
		return idPedido;
	}
	
	public void setIdPedido(long idPedido) {
		this.idPedido=idPedido;
	}
	
	public ArrayList<String> getPedido(){
		return pedido;
	}
	
	public void setPedido (ArrayList<String> pedido) {
		this.pedido = pedido;
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
	
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", Pedido=" + pedido + ", Direccion=" + direccion + ", Precio total=" + precioTotal +"]";
	}
}
