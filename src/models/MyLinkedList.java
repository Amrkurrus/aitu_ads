package models;

import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    // Fields to maintain the head, tail, and size of the linked list
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    // Method to add an item to the end of the linked list
    @Override
    public void add(T item) {
        addLast(item);
    }

    // Method to set the value of an item at a specific index in the linked list
    @Override
    public void set(int index, T item) {
        checkIndex(index);
        MyNode<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setValue(item);
    }

    // Method to add an item at a specific index in the linked list
    @Override
    public void add(int index, T item) {
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
            // Inserting the item at the specified index
            MyNode<T> nodeToInsert = new MyNode<>(item);
            MyNode<T> currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            MyNode<T> prevNode = currentNode.getPrev();

            prevNode.setNext(nodeToInsert);
            nodeToInsert.setPrev(prevNode);

            nodeToInsert.setNext(currentNode);
            currentNode.setPrev(nodeToInsert);
            size++;
        }
    }

    // Method to add an item at the beginning of the linked list
    @Override
    public void addFirst(T item) {
        MyNode<T> node = new MyNode<T>(item);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            MyNode<T> prevHead = head;
            node.setNext(prevHead);
            head.setPrev(node);
            head = head.getPrev();
        }
        size++;
    }

    // Method to add an item at the end of the linked list
    @Override
    public void addLast(T item) {
        if (head == null) {
            addFirst(item);
        } else {
            MyNode<T> nodeToInsert = new MyNode<>(item);
            tail.setNext(nodeToInsert);
            nodeToInsert.setPrev(tail);
            tail = nodeToInsert;
            size++;
        }
    }

    // Method to get the item at a specific index in the linked list
    @Override
    public T get(int index) {
        return null; // Not implemented yet
    }

    // Method to get the first item in the linked list
    @Override
    public T getFirst() {
        checkIndex(0);
        return head.getValue();
    }

    // Method to get the last item in the linked list
    @Override
    public T getLast() {
        checkIndex(size - 1);
        return tail.getValue();
    }

    // Method to remove an item at a specific index in the linked list
    @Override
    public void remove(int index) {
        checkIndex(index);
        MyNode<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        MyNode<T> prevNode = node.getPrev();
        MyNode<T> nextNode = node.getNext();
        node.setNext(null);
        node.setPrev(null);
        prevNode.setNext(nextNode);
        nextNode.setPrev(prevNode);
        size--;
    }

    // Method to remove the first item in the linked list
    @Override
    public void removeFirst() {
        checkIndex(0);
        head = head.getNext();
        head.setPrev(null);
        size--;
    }

    // Method to remove the last item in the linked list
    @Override
    public void removeLast() {
        checkIndex(size - 1);
        MyNode<T> prevNode = tail.getPrev();
        tail.setPrev(null);
        if (prevNode != null) {
            prevNode.setNext(null);
        } else {
            head = null;
        }
        tail = prevNode;
        size--;
    }

    // Method to sort the linked list (not implemented)
    @Override
    public void sort() {
        // Not implemented yet
    }

    // Method to get the index of the first occurrence of an object in the linked list
    @Override
    public int indexOf(Object object) {
        MyNode<T> node = head;
        for (int i = 0; i < size; i++) {
            if (node.getValue().equals(object)) {
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

    // Method to get the index of the last occurrence of an object in the linked list
    @Override
    public int lastIndexOf(Object object) {
        MyNode<T> node = tail;
        for (int i = 0; i < size; i++) {
            if (node.getValue().equals(object))
                return i;
            node = node.getPrev();
        }
        return -1;
    }

    // Method to check if an object exists in the linked list
    @Override
    public boolean exists(Object object) {
        MyNode<T> node = head;
        for (int i = 0; i < size; i++) {
            if (node.getValue().equals(object))
                return true;
            node = node.getNext();
        }
        return false;
    }

    // Method to convert the linked list to an array
    @Override
    public Object[] toArray() {
        T[] newArray = (T[]) new Object[size];
        MyNode<T> node = head;
        for (int i = 0; i < size; i++) {
            newArray[i] = node.getValue();
            node = node.getNext();
        }
        return newArray;
    }

    // Method to clear the linked list
    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    // Method to get the size of the linked list
    @Override
    public int size() {
        return size;
    }

    // Method to return an iterator for the linked list (not implemented)
    @Override
    public Iterator<T> iterator() {
        return null; // Not implemented yet
    }

    // Method to check if the index is valid
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of range");
        }
    }

    // Method to print the elements of the linked list
    public void printArr() {
        MyNode<T> node = head;
        while (node != null) {
            System.out.printf(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    // Inner class representing a node in the linked list
    private class MyNode<T> {
        private MyNode<T> next;
        private MyNode<T> prev;
        private T value;

        // Constructor to create a node with a given value
        public MyNode(T value) {
            this.value = value;
        }

        // Getter and setter methods for the next node
        public void setNext(MyNode<T> next) {
            this.next = next;
        }

        public MyNode<T> getNext() {
            return next;
        }

        // Getter and setter methods for the previous node
        public void setPrev(MyNode<T> prev) {
            this.prev = prev;
        }

        public MyNode<T> getPrev() {
            return prev;
        }

        // Getter and setter methods for the value of the node
        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }
    }
}
