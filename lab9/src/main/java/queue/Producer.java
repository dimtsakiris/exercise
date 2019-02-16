package queue;

public class Producer {

    public void send(String message) {
        MessageAlgorithm.getInstance().add(message);
    }
}
