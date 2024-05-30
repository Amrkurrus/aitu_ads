import classes.BST;
import classes.MyHashTable;
import classes.MyTestingClass;
import classes.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("My Hash table implementation");
        MyHashTable<MyTestingClass, Person> table = new MyHashTable<>();

        MyTestingClass mtc1 = new MyTestingClass(23);
        MyTestingClass mtc2 = new MyTestingClass(45);
        Person p1 = new Person("Amir", 18);
        Person p2 = new Person("Beks", 18);
        table.put(mtc1, p1);


        for (int i = 0; i < 10000; i++) {
            MyTestingClass mtc = new MyTestingClass((int) (Math.random() * 1000));//is just random number
            Person p = new Person(("name" + i), ((int) (Math.random() * 120)));
            table.put(mtc, p);
        }

        table.print();

//        System.out.println(table.get(mtc1));
//        System.out.println(table.getKey(p1));
//        System.out.println(table.remove(mtc1));
//        System.out.println(table.get(mtc2));
//        System.out.println(table.get(mtc1));
//        System.out.println(table.contains(p1));
//
        System.out.println("My classes.BST implementation");
        BST<MyTestingClass, Person> tree = new BST<>();
        tree.put(mtc1, p1);
        System.out.println(tree.getSize());
        for (int i = 0; i < 100; i++) {
            MyTestingClass mtc3 = new MyTestingClass((int) (Math.random() * 1000));//is just random number
            Person p3 = new Person(("name" + i), ((int) (Math.random() * 120)));
            tree.put(mtc3, p3);

        }
        tree.put(mtc2, p2);
        System.out.println(tree.getSize());
        Iterable<MyTestingClass> keys = tree.iterator();
        for (MyTestingClass k : keys) {
            System.out.println(k);
        }
    }
}
