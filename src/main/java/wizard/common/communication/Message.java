package wizard.common.communication;

import java.io.Serializable;

public abstract class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private MessageType type;
    private Object content;

    public Message(final MessageType type, final Object content) {
        this.type = type;
        this.content = content;
    }

    public MessageType getType() {
        return type;
    }

    public Object getContent() {
        return content;
    }
}
