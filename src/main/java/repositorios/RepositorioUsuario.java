package repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
	Usuario findById(long id);
	Usuario findByNombreUsuario(String nombreUsuario);

	
	//List<Usuario> findAll();
}
