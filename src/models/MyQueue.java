package models;

public class MyQueue<T> {
    private MyArrayList<T> al;

    // Constructor to initialize the queue with an empty ArrayList
    public MyQueue() {
        al = new MyArrayList<>();
    }

    // Insert the specified element into this queue and return true upon success.
    public boolean add(T item) {
        al.add(item);
        return true;
    }

    // Insert the specified element into this queue.
    public void offer(T item) {
        al.add(item);
    }

    // Retrieves and removes the head of this queue.
    public T remove() {
        T a = al.getFirst();
        al.removeFirst();
        return a;
    }

    // Retrieves and removes the head of this queue, or returns null if this queue is empty.
    public T poll() {
        if (empty()) {
            return null;
        }
        return remove();
    }

    // Retrieves, but does not remove, the head of this queue.
    public T element() {
        return al.getFirst();
    }

    // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    public T peek() {
        if (empty()) {
            return null;
        }
        return al.getFirst();
    }

    // Checks is the queue is empty
    public boolean empty() {
        return al.size() <= 0;
    }
}
