package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Producto;

public interface RepositorioProducto extends JpaRepository<Producto, Long>{
	
	Producto findById(long id);

}

