package br.com.exemplo.domain_message;

public class DomainEvent extends Event {
/**
 * Classe para mapear o evento com o que será necessario.
 */
    private int ordemPedido;

    public DomainEvent(int ordemPedido) {
        this.ordemPedido = ordemPedido;
    }

    public int getOrdemPedido() {
        return ordemPedido;
    }
}
