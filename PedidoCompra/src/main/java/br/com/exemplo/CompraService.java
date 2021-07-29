package br.com.exemplo;

import br.com.exemplo.domain_event.OrdemServicoEvent;
import br.com.exemplo.domain_event.PedidoCompraEvent;
import br.com.exemplo.domain_message.Event;
import br.com.exemplo.event.IMediatrHandler;

public class CompraService {

    private IMediatrHandler<Event> eventPedido;
    private IMediatrHandler<Event> eventOrdemDeServico;

    public CompraService(IMediatrHandler<Event> eventPedido, IMediatrHandler<Event> eventOrdemDeServico) {
        this.eventPedido = eventPedido;
        this.eventOrdemDeServico = eventOrdemDeServico;
    }

    public void compraRealizada(int pedido, int quantidade) {

        eventPedido.publicarEvento(new PedidoCompraEvent(pedido, quantidade));

    }

    public void realizarOrdemDeServico(int pedido, String motivo) {
        eventOrdemDeServico.publicarEvento(new OrdemServicoEvent(pedido, motivo));

    }

}
