package repository;

import model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Pedidorepository extends JpaRepository<Pedido, Long> {
}
