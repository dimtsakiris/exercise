package queue;

public class Consumer {

    public void consume() {
        final String poll = MessageAlgorithm.getInstance().poll();
        System.out.println("Message consumed: " + poll);
    }
}
