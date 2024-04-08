
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter № (number) of problem: ");
        int tn = sc.nextInt();
        switch (tn) {
            case 1:
                p1();
                break;
            case 2:
                p2();
                break;
            case 3:
                p3();
                break;
            case 4:
                p4();
                break;
            case 5:
                p5();
                break;
            case 6:
                p6();
                break;
            case 7:
                p7();
                break;
            case 8:
                p8();
                break;
            default:
                System.out.println("There is no problem: " + tn);
        }
    }

    public static void p1() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }
        int index = 0;
        int min = 999999;
        System.out.println(p1r(n, nArr, index, min));
    }

    public static int p1r(int n, int[] arr, int index, int min) {
        if (arr[index] < min) min = arr[index];
        if (index == n - 1) return min;
        return p1r(n, arr, index + 1, min);
    }

    public static void p2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }
        int index = 0;
        int sum = 0;
        System.out.println(p2r(n, nArr, index, sum));
    }

    public static double p2r(int n, int[] arr, int index, int sum) {
        sum = sum + arr[index];
        if (index == n - 1) return (double) sum / (double) n;
        return p2r(n, arr, index + 1, sum);
    }

    public static void p3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 2;
        System.out.println(p3r(n, index));
    }

    public static String p3r(int n, int index) {
        if (index == n || n == 1) return "Prime";
        if (n % index == 0) return "Composite";
        return p3r(n, index + 1);
    }

    public static void p4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p4r(n));
    }

    public static int p4r(int n) {
        if (n == 1) return 1;
        return n * p4r(n - 1);
    }

    public static void p5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p5r(n));
    }

    public static int p5r(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return p5r(n - 1) + p5r(n - 2);
    }

    public static void p6() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(p6r(a, n));
    }

    public static int p6r(int a, int n) {
        if (n == 0) return 1;
        return a * p6r(a, n - 1);
    }

    public static void p7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p7r(n, sc));
    }

    public static String p7r(int n, Scanner sc) {
        int a = sc.nextInt();
        if (n == 1) return " " + a;
        return p7r(n - 1, sc) + " " + a;
    }

    public static void p8() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int index = 0;
        char[] sArr = s.toCharArray();
        System.out.println(p8r(sArr, index, len));
    }

    public static String p8r(char[] arr, int index, int len) {
        if (Character.isDigit(arr[index])) return "No";
        if (index + 1 == len) return "Yes";
        return p8r(arr, index + 1, len);
    }
}