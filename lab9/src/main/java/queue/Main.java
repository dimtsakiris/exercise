package queue;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

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
