package models;

import java.util.Iterator;

// Interface defining the basic operations for a list data structure
public interface MyList<T> {
    // Method to add an item to the list
    void add(T item);

    // Method to set the value of an item at a specific index in the list
    void set(int index, T item);

    // Method to add an item at a specific index in the list
    void add(int index, T item);

    // Method to add an item at the beginning of the list
    void addFirst(T item);

    // Method to add an item at the end of the list
    void addLast(T item);

    // Method to get the item at a specific index in the list
    T get(int index);

    // Method to get the first item in the list
    T getFirst();

    // Method to get the last item in the list
    T getLast();

    // Method to get the size of the list
    int size();

    // Method to remove an item at a specific index in the list
    void remove(int index);

    // Method to remove the first item in the list
    void removeFirst();

    // Method to remove the last item in the list
    void removeLast();

    // Method to sort the list
    void sort();

    // Method to get the index of the first occurrence of an object in the list
    int indexOf(Object object);

    // Method to get the index of the last occurrence of an object in the list
    int lastIndexOf(Object object);

    // Method to check if an object exists in the list
    boolean exists(Object object);

    // Method to convert the list to an array
    Object[] toArray();

    // Method to clear the list
    void clear();

    // Method to return an iterator for the list
    Iterator<T> iterator();
}
