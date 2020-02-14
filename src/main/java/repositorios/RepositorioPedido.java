package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.Pedido;

public interface RepositorioPedido extends JpaRepository<Pedido, Long>{
	
	Pedido findByIdPedido(long idPedido);

}

