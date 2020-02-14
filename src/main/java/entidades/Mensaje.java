package entidades;

import java.util.Date;

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
	private int valoracion;
	@ManyToOne
	@Cascade({CascadeType.SAVE_UPDATE})
	@JoinColumn(name = "usuario")
	private Usuario usuario;
	
	
	public Mensaje () {
		
	}
	
	public Mensaje (String comentario, Date fechaComentario, int valoracion, Usuario usuario) {
		
		this.comentario = comentario;
		this.fechaComentario = fechaComentario;
		this.valoracion = valoracion;
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
	
	public int getValoracion() {
		return valoracion;
	}
	
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return "Mensaje [Usuario=" + usuario + ", comentario=" + comentario + ", fecha=" + fechaComentario + ", valoracion=" + valoracion +"]";
	}
}


