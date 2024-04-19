//Nome: Thiago Gyorgy Teixeira de Castro
//RM: 97136

package br.com.fiap.mp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.mp.model.Pedido;
import br.com.fiap.mp.model.StatusPedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	List<Pedido> findByStatus(StatusPedido status);

}
