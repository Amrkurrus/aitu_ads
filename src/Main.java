import models.MyArrayList;
import models.MyLinkedList;
import models.MyStack;

public class Main {
    public static void main(String[] args) {

        // Example of working with MyArrayList
        System.out.println("Example of work myArrayList: ");

        // Creating an instance of MyArrayList to store integers
        MyArrayList<Integer> mal = new MyArrayList<>();

        // Adding elements to the MyArrayList
        mal.addFirst(1);
        mal.add(1, 2);
        mal.addLast(4);
        mal.add(5);

        // Printing the size of the MyArrayList
        System.out.println(mal.size());

        // Printing the elements of the MyArrayList
        mal.printArr();

        // Setting an element at a specific index in the MyArrayList
        mal.set(2, 3);
        System.out.println(mal.get(2)); // Printing the element at index 2
        System.out.println(mal.getFirst() + " " + mal.getLast()); // Printing the first and last elements

        // Removing elements from the MyArrayList
        mal.remove(1);
        mal.removeFirst();
        mal.removeFirst();

        // Finding the last and first occurrences of an element in the MyArrayList
        System.out.println(mal.lastIndexOf(2));
        System.out.println(mal.indexOf(1));

        // Printing the elements of the MyArrayList after removal
        mal.printArr();

        // Checking if an element exists in the MyArrayList
        System.out.println(mal.exists(5));

        // Converting the MyArrayList to an array
        mal.toArray();

        // Clearing the MyArrayList
        mal.clear();

        // Example of working with MyLinkedList
        System.out.println("Example of work myLinkedList.java: ");

        // Creating an instance of MyLinkedList to store integers
        MyLinkedList<Integer> mll = new MyLinkedList<>();

        // Adding elements to the MyLinkedList
        mll.addFirst(1);
        mll.add(1, 2);
        mll.addLast(4);
        mll.add(5);

        // Printing the size of the MyLinkedList
        System.out.println(mll.size());

        // Printing the elements of the MyLinkedList
        mll.printArr();

        // Setting an element at a specific index in the MyLinkedList
        mll.set(2, 3);
        System.out.println(mll.get(2)); // Printing the element at index 2
        System.out.println(mll.getFirst() + " " + mll.getLast()); // Printing the first and last elements

        // Removing elements from the MyLinkedList
        mll.remove(1);
        mll.removeFirst();
        mll.removeFirst();

        // Finding the last and first occurrences of an element in the MyLinkedList
        System.out.println(mll.lastIndexOf(2));
        System.out.println(mll.indexOf(1));

        // Printing the elements of the MyLinkedList after removal
        mll.printArr();

        // Checking if an element exists in the MyLinkedList
        System.out.println(mll.exists(5));

        // Converting the MyLinkedList to an array
        mll.toArray();

        // Clearing the MyLinkedList
        mll.clear();

        // Example of working with MyLinkedList
        System.out.println("Example of work myStack.java: ");

        // Creating an instance of MyLinkedList to store integers
        MyStack<Integer> ms = new MyStack<>();

        ms.push(1);

        ms.push(2);

        ms.push(3);

        System.out.println(ms.empty());

        System.out.println(ms.pop());

        System.out.println(ms.peek());

        System.out.println(ms.search(1));

    }
}
