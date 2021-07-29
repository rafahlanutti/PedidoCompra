package br.com.exemplo.domain_message;

public abstract class Message {

    public String messageType;

    protected Message() {
        this.messageType = this.getClass()
                               .getName();
    }

}
