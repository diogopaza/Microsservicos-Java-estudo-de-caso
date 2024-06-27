package service;

import dto.PedidoRequest.PedidoRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import model.Pedido;
import org.springframework.stereotype.Service;
import repository.Pedidorepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
@Slf4j
public class PedidoService {

    private final Pedidorepository pedidorepository;

    public void newPedido(PedidoRequest pedidoRequest) {
        //map PedidoRequest para Pedido
        var pedido = Pedido.builder()
                .numeroPedido(UUID.randomUUID().toString())
                .codigo(pedidoRequest.codigo())
                .preco(pedidoRequest.preco())
                .quantidade(pedidoRequest.preco())
                .build();
        pedidorepository.save(pedido);
        log.info("Pedido salvo com sucesso");
    }
}
