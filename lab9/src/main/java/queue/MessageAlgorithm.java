package queue;

public interface MessageAlgorithm {

    void add(String message);

    String poll();
}
