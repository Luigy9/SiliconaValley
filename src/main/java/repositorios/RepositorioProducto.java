package repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Producto;

public interface RepositorioProducto extends JpaRepository<Producto, Long>{
	
	Producto findByIdProducto(long idProducto);
	
	List<Producto> findByCategoria(String categoria);
	
	List<Producto> findByDescripcion (String decripcion);
	
	List<Producto> findByPrecio (int precio);
	
	List<Producto> findByNombre (String nombre);
	
	List<Producto> findByPrecioAsc ();
	
	List<Producto> findByPrecioDesc ();

}

