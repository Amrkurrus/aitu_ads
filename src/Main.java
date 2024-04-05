

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number № of problem: ");
        int tn = sc.nextInt();
        switch (tn) {
            case 1:
                p1();
                break;
            case 2:
                P2();
                break;
            default:
                System.out.println("there is no problem: " + tn);
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
        if (index == n - 1) {
            return min;
        }

        if (arr[index] < min) {
            min = arr[index];
        }
        return p1r(n, arr, index + 1, min);
    }


    public static void P2() {
        System.out.println("234");
    }
}