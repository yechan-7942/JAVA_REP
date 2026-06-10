package REP12;

class Node3<T> {
    T data;
    Node<T> next;

    Node3(T data) {
        this.data = data;
        this.next = null;
    }
}

public class REP12LinkedQueue3<T> {
    private Node<T> front;
    private Node<T> rear;
    private int count;

    public REP12LinkedQueue3() {
        front = null;
        rear = null;
        count = 0;
    }

    public void addToQueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
    }

    public T removeFromQueue() {
        if (front == null) {
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count--;
        return data;
    }

    public void showQueue() {
        Node<T> current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int length() {
        return count;
    }


    public void clearQueue() {
        while (front != null) {
            removeFromQueue();
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }
}