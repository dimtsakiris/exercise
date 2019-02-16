package queue;

public class Main {
    public static void main(String[] args) {

//        final QueueMessageAlgorithm instance = QueueMessageAlgorithm.getInstance();
        final StackMessageAlgorithm instance = StackMessageAlgorithm.getInstance();
        Producer producer = new Producer(instance);
        Consumer consumer = new Consumer(instance);

        producer.send("code1");
        producer.send("code2");
        producer.send("code3");
        producer.send("code4");

        consumer.consume();
        consumer.consume();
        consumer.consume();
        consumer.consume();
        producer.send("code5");
    }

}
