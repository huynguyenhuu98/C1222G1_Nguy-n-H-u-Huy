package ss11_stack_queue.queue_list;

public class Solution {
    private Queue front;
    private Queue rear;

    public void enQueue(int data) {
        Queue node = new Queue(data);

        if (this.front == null) {
            this.front = node;
            this.rear = node;
            this.rear.next = this.front;
        } else {
            this.rear.next = node;
            this.rear = node;
            this.rear.next = this.front;
        }
    }

    public int deQueue() {
        if (this.front == null) {
            return -1;
        } else {
            int data = this.front.data;

            if (this.front == this.rear) {
                this.front = null;
                this.rear = null;
            } else {
                this.front = this.front.next;
                this.rear.next = this.front;
            }

            return data;
        }
    }
}
