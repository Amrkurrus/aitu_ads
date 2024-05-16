import classes.MyTestingClass;
import classes.Person;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Person> table = new MyHashTable<>();

//        MyTestingClass mtc = new MyTestingClass(23);
//        Person p1 = new Person("Amir", 18);
//        table.put(mtc, p1);
//        System.out.println(table.get(mtc));

        for (int i = 0; i < 10; i++) {
            MyTestingClass mtc = new MyTestingClass((int) (Math.random() * 1000));//is just random number
            Person p = new Person(("name" + i), ((int) (Math.random() * 120)));
            table.put(mtc, p);
        }

        table.print();
    }
}
