package classes;

public class MyTestingClass {
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

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
