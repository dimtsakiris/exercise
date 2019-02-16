package queue;

import java.util.Stack;

public class StackMessageAlgorithm implements MessageAlgorithm {

    private Stack<String> stack;

    private static StackMessageAlgorithm instance;

    public StackMessageAlgorithm() {
        stack = new Stack<>();
    }

    public static StackMessageAlgorithm getInstance() {
        if (instance == null) {
            instance = new StackMessageAlgorithm();
        }
        return instance;
    }

    public void add(String message) {
        stack.push(message);
    }

    public String poll() {
        return stack.pop();
    }

}
