import models.MyArrayList;
import models.MyLinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Example of work myArrayList: ");
        MyArrayList<Integer> mal = new MyArrayList<>();
        mal.addFirst(1);
        mal.add(1,2);
        mal.addLast(4);
        mal.add(5);
        System.out.println(mal.size());
        mal.printArr();
        mal.set(2, 3);
        System.out.println(mal.get(2));
        System.out.println(mal.getFirst() + " " + mal.getLast());
        mal.remove(1);
        mal.removeFirst();
        mal.removeFirst();
        System.out.println(mal.lastIndexOf(2));
        System.out.println(mal.indexOf(1));
        mal.printArr();
        System.out.println(mal.exists(5));
        mal.toArray();
        mal.clear();

        System.out.println("Example of work myLinkedList.java: ");
        MyLinkedList<Integer> mll =new MyLinkedList<>();
        mll.addFirst(1);
        mll.add(1,2);
        mll.addLast(4);
        mll.add(5);
        System.out.println(mll.size());
        mll.printArr();
        mll.set(2, 3);
        System.out.println(mll.get(2));
        System.out.println(mll.getFirst() + " " + mll.getLast());
        mll.remove(1);
        mll.removeFirst();
        mll.removeFirst();
        System.out.println(mll.lastIndexOf(2));
        System.out.println(mll.indexOf(1));
        mll.printArr();
        System.out.println(mll.exists(5));
        mll.toArray();
        mll.clear();
    }
}