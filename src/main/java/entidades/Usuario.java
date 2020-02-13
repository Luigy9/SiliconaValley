package entidades;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nombreUsuario;
	private String email;
	private String direccion;
	private int telefono;
	private String nombreCompleto;
	private int codigoPostal;
	private String contrasena;
	@OneToMany(mappedBy="pedido")
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	@OneToMany(mappedBy="cyv")
	private ArrayList<CyV> cyv = new ArrayList<CyV>();
	@OneToMany(mappedBy="mensaje")
	private ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();

	public Usuario() {
		
	}
	
	public Usuario(String nombreusuario, String email, String direccion, int telefono, String nombreCompleto, int codigoPostal, String contrasena) {

		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombreUsuario = nombreusuario;
		this.nombreCompleto = nombreCompleto;
		this.codigoPostal = codigoPostal;
		this.contrasena = contrasena;
		
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombre) {
		this.nombreCompleto = nombre;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	
	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	@Override
	public String toString() {
		return "Exemplar [usuario=" + nombreUsuario + ", NombreCompleto=" + nombreCompleto + "]";
	}
}
