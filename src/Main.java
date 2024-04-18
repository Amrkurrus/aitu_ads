import models.MyArrayList;

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

        System.out.println();
    }
}