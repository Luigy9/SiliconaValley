package repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import entidades.CyV;


public interface RepositorioCyV extends JpaRepository<CyV, Long>{

	CyV findByIdCyV(long idCyV);
}
