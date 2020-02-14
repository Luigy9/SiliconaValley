package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Mensaje;

public interface RepositorioMensaje extends JpaRepository<Mensaje, Long>{
	
	Mensaje findByIdMensaje(long idMensaje);

}