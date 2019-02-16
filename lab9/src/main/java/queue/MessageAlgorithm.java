package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class MessageAlgorithm {

    private BlockingQueue<String> queue;

    private static MessageAlgorithm instance;

    public MessageAlgorithm() {
        queue = new LinkedBlockingDeque();
    }

    public static MessageAlgorithm getInstance() {
        if (instance == null) {
            instance = new MessageAlgorithm();
        }
        return instance;
    }

    public void add(String message) {
        try {
            queue.put(message);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String poll() {
        return queue.poll();
    }

}
