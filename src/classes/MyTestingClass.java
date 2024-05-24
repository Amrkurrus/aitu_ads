package classes;

public class MyTestingClass implements Comparable<MyTestingClass> {
    private int value;

    public MyTestingClass(int value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
//        int hash = Math.abs((int) (Math.pow(value, value) - value * Math.PI)); // "value *" is important idk why...
        int hash = Math.abs(value * (int)Math.pow(value, Math.exp(value)));
        return hash;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }


    @Override
    public int compareTo(MyTestingClass o) {
        return Integer.compare(this.value, o.value);

    }
}
