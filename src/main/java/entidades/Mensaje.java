package entidades;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Mensaje {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idMensaje;
	private String comentario;
	private Date fechaComentario;
	private String email;
	@ManyToOne
	@Cascade({CascadeType.SAVE_UPDATE})
	@JoinColumn(name = "usuario")
	private Usuario usuario;
	
	
	public Mensaje () {
		
	}
	
	public Mensaje (Date fechaComentario, String comentario, String email, Usuario usuario) {
				
		this.fechaComentario = fechaComentario;
		this.comentario = comentario;
		this.email = email;
		this.usuario = usuario;
	}
	
	public long getIdMensaje() {
		return idMensaje;
	}
	
	public void setIdMensaje (long idMensaje) {
		this.idMensaje = idMensaje;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public Date getFechaComentario () {
		return fechaComentario;
	}
	
	public void setFechaComentario(Date fechaComentario) {
		this.fechaComentario = fechaComentario;
	}
	
	public String getValoracion() {
		return email;
	}
	
	public void setValoracion(String email) {
		this.email = email;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return "Mensaje [Usuario=" + usuario + ", comentario=" + comentario + ", fecha=" + fechaComentario + ", email=" + email +"]";
	}
}


