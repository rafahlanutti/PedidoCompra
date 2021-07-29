package br.com.exemplo.domain_event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.exemplo.domain_message.Event;
import br.com.exemplo.event.IMediator;

public class PedidoCompraEventHandler implements IMediator {

    private static final Logger LOGGER = LoggerFactory.getLogger(PedidoCompraEventHandler.class);

    @Override
    public void publicar(Event mensagem) {

        var evento = (PedidoCompraEvent) mensagem;
        LOGGER.info("Escutando evento passar no PedidoCompraEventHandler...");
        LOGGER.info("disparado por:{}  data:{}", evento.messageType, evento.dataHora);
        LOGGER.info("PedidoCompraEventHandler ordem pedido:{}", evento.getOrdemPedido());

    }

}
