package br.com.exemplo;

import br.com.exemplo.domain_event.OrdemServicoEventHandler;
import br.com.exemplo.domain_event.PedidoCompraEventHandler;
import br.com.exemplo.event.MediatrHandler;

public class Main {

    public static void main(String[] args) {

        var pedidoCompra = 123;
        var quantidadeCompra = 10;
        var ordemServico = "Manutenção de computador";

        MediatrHandler handlerPedido = new MediatrHandler(new PedidoCompraEventHandler());
        MediatrHandler handlerOrdemDeServico = new MediatrHandler(new OrdemServicoEventHandler());

        CompraService compraService = new CompraService(handlerPedido, handlerOrdemDeServico);

        compraService.compraRealizada(pedidoCompra, quantidadeCompra);
        compraService.realizarOrdemDeServico(pedidoCompra, ordemServico);

    }
}
