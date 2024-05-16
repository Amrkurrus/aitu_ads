import classes.MyTestingClass;
import classes.Person;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Person> table = new MyHashTable<>();

        MyTestingClass mtc1 = new MyTestingClass(23);
        Person p1 = new Person("Amir", 18);
        table.put(mtc1, p1);


        for (int i = 0; i < 100; i++) {
            MyTestingClass mtc = new MyTestingClass((int) (Math.random() * 1000));//is just random number
            Person p = new Person(("name" + i), ((int) (Math.random() * 120)));
            table.put(mtc, p);
        }

        table.print();

        System.out.println(table.get(mtc1));
    }
}
