package models;

import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    // Fields to store the array and its size
    private T[] arr;
    private int size;

    // Constructor to initialize the array with a default size of 5 and size as 0
    public MyArrayList() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    // Method to add an item to the end of the array list
    @Override
    public void add(T item) {
        addLast(item);
    }

    // Method to set the value of an item at a specific index in the array list
    @Override
    public void set(int index, T item) {
        arr[index] = item;
    }

    // Method to add an item at a specific index in the array list
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

    // Method to add an item at the beginning of the array list
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

    // Method to add an item at the end of the array list
    @Override
    public void addLast(T item) {
        if (size >= arr.length) {
            increaseBuffer();
        }
        arr[size++] = item;
    }

    // Method to get the item at a specific index in the array list
    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    // Method to get the first item in the array list
    @Override
    public T getFirst() {
        checkIndex(0);
        return arr[0];
    }

    // Method to get the last item in the array list
    @Override
    public T getLast() {
        checkIndex(size - 1);
        return arr[size - 1];
    }

    // Method to get the size of the array list
    @Override
    public int size() {
        return size;
    }

    // Method to remove an item at a specific index in the array list
    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == size - 1) {
            removeLast();
        }
        for (int i = index + 1; i < size+1; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }

    // Method to remove the first item in the array list
    @Override
    public void removeFirst() {
        remove(0);
    }

    // Method to remove the last item in the array list
    @Override
    public void removeLast() {
        checkIndex(size - 1);
        arr[0] = arr[1];
        size--;
    }

    // Method to sort the array list (not implemented)
    @Override
    public void sort() {
        // Not implemented yet
    }

    // Method to get the index of the first occurrence of an object in the array list
    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(object)) return i;
        }
        return -1;
    }

    // Method to get the index of the last occurrence of an object in the array list
    @Override
    public int lastIndexOf(Object object) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i].equals(object)) return i;
        }
        return -1;
    }

    // Method to check if an object exists in the array list
    @Override
    public boolean exists(Object object) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(object)) return true;
        }
        return false;
    }

    // Method to convert the array list to an array
    @Override
    public Object[] toArray() {
        T[] newArray = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    // Method to clear the array list
    @Override
    public void clear() {
        arr = (T[]) new Object[5];
        size = 0;
    }

    // Method to increase the buffer size of the array list
    private void increaseBuffer() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Method to check if the index is valid
    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index not correct");
    }

    // Method to return an iterator for the array list (not implemented)
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    // Method to print the elements of the array list
    public void printArr() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
