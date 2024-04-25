package models;

public class MyStack<T> {
    private MyArrayList<T> al;

    public MyStack() {
        al = new MyArrayList<>();
    }

    public boolean empty() {
        if (al.size() == 0) {
            return true;
        }
        return false;
    }

    public void push(T item) {
        al.add(item);
    }

    public T pop() {
        T a = al.getLast();
        al.removeLast();
        return a;
    }

    public T peek() {
        return al.getLast();
    }

    public int search(T item){
        return  al.indexOf(item);
    }
}
