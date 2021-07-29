package br.com.exemplo.domain_event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.exemplo.domain_message.Event;
import br.com.exemplo.event.IMediator;

public class OrdemServicoEventHandler implements IMediator {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrdemServicoEventHandler.class);

    @Override
    public void publicar(Event mensagem) {
        var evento = (OrdemServicoEvent) mensagem;
       
        LOGGER.info("Escutando evento passar no OrdemServicoEventHandler.....");
        LOGGER.info(" Disparado por:{}  data:{}", evento.messageType, evento.dataHora);
        LOGGER.info("OrdemServicoEventHandler ordem pedido:{}", evento.getOrdemPedido());
        LOGGER.info("Motivo da ordem pedido:{}", evento.getMotivoOrdemServico());

    }

}
