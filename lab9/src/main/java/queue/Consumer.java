package queue;

public class Consumer {

    private MessageAlgorithm messageAlgorithm;

    public Consumer(MessageAlgorithm messageAlgorithm) {
        this.messageAlgorithm = messageAlgorithm;
    }

    public void consume() {
        final String poll = messageAlgorithm.poll();
        System.out.println("Message consumed: " + poll);
    }
}
