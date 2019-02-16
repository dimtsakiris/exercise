package queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class QueueMessageAlgorithm implements MessageAlgorithm {

    private BlockingQueue<String> queue;

    private static QueueMessageAlgorithm instance;

    public QueueMessageAlgorithm() {
        queue = new LinkedBlockingDeque();
    }

    public static QueueMessageAlgorithm getInstance() {
        if (instance == null) {
            instance = new QueueMessageAlgorithm();
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
