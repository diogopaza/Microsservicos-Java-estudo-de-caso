package controller;

import dto.PedidoRequest.PedidoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.PedidoService;

@RestController
@RequestMapping("/pedido")
@RequiredArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;

    /*@PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String newPedido(@RequestBody PedidoRequest pedidoRequest){
        //pedidoService.newPedido(pedidoRequest);
        return "Novo pedido criado com sucesso";
    }*/

    @GetMapping
    public String allPedidos(){
        return "Pedidos";
    }
}
