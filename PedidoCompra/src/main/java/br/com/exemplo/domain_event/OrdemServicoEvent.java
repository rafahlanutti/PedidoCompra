package br.com.exemplo.domain_event;

import br.com.exemplo.domain_message.DomainEvent;

public class OrdemServicoEvent extends DomainEvent {

    private String motivoOrdemServico;

    public OrdemServicoEvent(int ordemPedido, String motivoOrdemServico) {
        super(ordemPedido);
        this.motivoOrdemServico = motivoOrdemServico;
    }

    public String getMotivoOrdemServico() {
        return motivoOrdemServico;
    }

}
