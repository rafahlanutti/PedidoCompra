package br.com.exemplo.event;

import br.com.exemplo.domain_message.Event;

public interface IMediator {

    /**
     * Interface que "escuta" o evento
     */

    void publicar(Event evento);

}
