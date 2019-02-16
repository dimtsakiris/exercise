package queue;

public class Producer {

    private MessageAlgorithm messageAlgorithm;

    public Producer(MessageAlgorithm messageAlgorithm) {
        this.messageAlgorithm = messageAlgorithm;
    }

    public void send(String message) {
        messageAlgorithm.add(message);
    }
}
