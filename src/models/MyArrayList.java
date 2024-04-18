package models;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private int size;

    public MyArrayList() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void set(int index, T item) {
        arr[index] = item;
    }

    public void add(int index, T item) {
        if (size >= arr.length) {
            increaseBuffer();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = item;
        size++;
    }

    @Override
    public void addFirst(T item) {
        if (size >= arr.length) {
            increaseBuffer();
        }
        for (int i = 1; i < size; i++) {
            arr[i] = arr[i - 1];
        }
        arr[0] = item;
        size++;
    }

    @Override
    public void addLast(T item) {
        if (size >= arr.length) {
            increaseBuffer();
        }
        arr[size++] = item;
    }


    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public T getFirst() {
        checkIndex(0);
        return arr[0];
    }

    @Override
    public T getLast() {
        checkIndex(size - 1);
        return arr[size - 1];
    }


    @Override
    public int size() {
        return size;
    }


    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == size - 1) {
            removeLast();
        }
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        checkIndex(size - 1);
        size--;
    }

    @Override
    public void sort() {
//    Too hard
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(object)) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i].equals(object)) return i;
        }
        return -1;
    }

    @Override
    public boolean exists(Object object) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(object)) return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        T[] newArray = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    @Override
    public void clear() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index not correct");
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    public void printArr() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
