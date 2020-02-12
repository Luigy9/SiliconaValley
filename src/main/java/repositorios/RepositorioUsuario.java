package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
	Usuario findById(long id);

}
