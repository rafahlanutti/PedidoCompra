package br.com.exemplo.event;

public interface IMediatrHandler<T> {
    /**
     * Interface que dispara o evento
     */
    void publicarEvento(T valor);

}
