package ss11_stack_queue.queue_list;

public class Queue {
    public Queue next;
    public int data;
    private Node front;
    private Node rear;

    public Queue(int data) {
        this.front = null;
        this.rear = null;
    }
}
