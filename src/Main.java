class StackFullException extends Exception {}

class StackEmptyException extends Exception {}

public class Main {
    public static void main(String[] agrs) {
        myQueue<String> queue = new myQueue<>(2);
        try {
            queue.enqueue("Hello");
            queue.enqueue("World");
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }
    }
}