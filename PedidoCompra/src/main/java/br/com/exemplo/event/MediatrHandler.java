package br.com.exemplo.event;

import br.com.exemplo.domain_message.Event;

public class MediatrHandler implements IMediatrHandler<Event> {

    private IMediator mediator;

    public MediatrHandler(IMediator mediator) {

        this.mediator = mediator;

    }

    @Override
    public void publicarEvento(Event evento) {

        this.mediator.publicar(evento);

    }

}
