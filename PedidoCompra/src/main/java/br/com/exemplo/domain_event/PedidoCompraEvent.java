package br.com.exemplo.domain_event;

import br.com.exemplo.domain_message.DomainEvent;

public class PedidoCompraEvent extends DomainEvent {

    private int quantidadeCompra;

    public PedidoCompraEvent(int ordemPedido, int quantidadeCompra) {
        super(ordemPedido);
        this.quantidadeCompra = quantidadeCompra;
    }

    public String obterOrdemPedidoEQuantidade() {

        return this.getOrdemPedido() + " :" + this.quantidadeCompra;

    }

}
