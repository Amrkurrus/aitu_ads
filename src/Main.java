import models.MyArrayList;
import models.MyLinkedList;
import models.MyQueue;
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

        // Example of working with MyStack
        System.out.println("Example of work myStack.java: ");

        // Creating an instance of MyStack to store integers
        MyStack<Integer> ms = new MyStack<>();

        // Adding elements in stack
        ms.push(1);

        ms.push(2);

        ms.push(3);

        // Checking stack, it is empty?
        System.out.println(ms.empty());

        // Take top element from stack
        System.out.println(ms.pop());

        // Look at top element in stack
        System.out.println(ms.peek());

        // search position of give value;
        System.out.println(ms.search(1));

        // Example of working with MyQueue
        System.out.println("Example of work myQueue.java: ");

        // Creating an instance of MyQueue to store integers
        MyQueue<Integer> mq = new MyQueue<>();

        // Adding items in queue
        mq.offer(1);
        System.out.println(mq.add(2));
        mq.offer(3);

        // Removing element
        System.out.println(mq.remove());

        // Take a look for element in queue
        System.out.println(mq.element());

        // Removing elements
        System.out.println(mq.poll());
        System.out.println(mq.remove());
        System.out.println(mq.poll());

    }
}
