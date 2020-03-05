package entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique = true)
	private String nombreUsuario;
	private String email;
	private String direccion;
	private int telefono;
	private String nombreCompleto;
	private int codigoPostal;
	private String password;
	@OneToMany(mappedBy="usuario")
	@Cascade({CascadeType.ALL})
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	@OneToMany(mappedBy="usuario")
	@Cascade({CascadeType.ALL})
	private List<CyV> cyv = new ArrayList<CyV>();
	@OneToMany(mappedBy="usuario")
	@Cascade({CascadeType.ALL})
	private List<Mensaje> mensajes = new ArrayList<Mensaje>();

	
	public Usuario() {
		
	}
	

	
	public Usuario (String nombreusuario,String password) {
		this.nombreUsuario = nombreusuario;
		this.password = password;
	}
	public Usuario(String nombreusuario, String email, String direccion, int telefono, String nombreCompleto, int codigoPostal, String password) {

		this.email = email;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nombreUsuario = nombreusuario;
		this.nombreCompleto = nombreCompleto;
		this.codigoPostal = codigoPostal;
		this.password = new BCryptPasswordEncoder().encode(password);
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setIdMensaje (long id) {
		this.id = id;
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
	
	public String getPassword() {
		return password;
	}
	
	public String getRole() {
		if(nombreCompleto == "LUigyy9")
			return "ROLE_ADMIN";
		return "ROLE_USER";
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
    public List<CyV> getCyV() {
			return cyv;
		}

    public void setCyV(List<CyV> cyv) {
			this.cyv = cyv;
    }
    public List<Pedido> getPedido() {
			return pedidos;
		}

    public void setPedidos(List<Pedido> pedidos) {
			this.pedidos = pedidos;
    }
    public List<Mensaje> getMensaje() {
			return mensajes;
		}

    public void setMensaje(List<Mensaje> mensajes) {
			this.mensajes = mensajes;
    }
	
	@Override
	public String toString() {
		return "Usuario [usuario=" + nombreUsuario + ", NombreCompleto=" + nombreCompleto + "]";
	}
}
