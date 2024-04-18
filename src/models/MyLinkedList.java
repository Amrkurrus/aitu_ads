package models;

import java.util.Iterator;

public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;
    private int size;

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        MyNode<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setValue(item);
    }

    @Override
    public void add(int index, T item) {
        if (index == 0) {
            addFirst(item);
        } else if (index == size) {
            addLast(item);
        } else {
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

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T getFirst() {
        checkIndex(0);
        return head.getValue();
    }

    @Override
    public T getLast() {
        checkIndex(size-1);
        return tail.getValue();
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        MyNode<T> node = head;
        for(int i=0;i<index;i++){
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

    @Override
    public void removeFirst() {
        checkIndex(0);
        head = head.getNext();
        head.setPrev(null);
        size--;
    }

    @Override
    public void removeLast() {
        checkIndex(size-1);
        MyNode<T> prevNode = tail.getPrev();
        tail.setPrev(null);
        if(prevNode != null) {
            prevNode.setNext(null);
        } else{
            head = null;
        }
        tail = prevNode;
        size--;
    }

    @Override
    public void sort() {
//        too hard ☹️
    }

    @Override
    public int indexOf(Object object) {
        MyNode<T> node = head;
        for(int i=0;i<size;i++){
            if(node.getValue().equals(object)){
                return i;
            }
            node = node.getNext();
        }
        return -1;
    }

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

    @Override
    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index out of range");
        }
    }


    public void printArr() {
        MyNode<T> node = head;
        while (node != null) {
            System.out.printf(node.getValue() + " ");
            node = node.getNext();
        }
        System.out.println();
    }

    private class MyNode<T> {
        private MyNode<T> next;
        private MyNode<T> prev;
        private T value;

        public MyNode(T value) {
            this.value = value;
        }

        public void setNext(MyNode<T> next) {
            this.next = next;
        }

        public void setPrev(MyNode<T> prev) {
            this.prev = prev;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public MyNode<T> getNext() {
            return next;
        }

        public MyNode<T> getPrev() {
            return prev;
        }

        public T getValue() {
            return value;
        }
    }

}
