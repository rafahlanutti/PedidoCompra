package br.com.exemplo.domain_message;

import java.time.LocalDate;

public abstract class Event extends Message {

    public LocalDate dataHora;

    protected Event() {

        this.dataHora = LocalDate.now();
    }

}
