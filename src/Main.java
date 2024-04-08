/*
 * This method calculates the factorial of given number.
 * It uses a recursive approach.
 * Time complexity: O(n), where n is the input number.
 * The recursive algorithm iterates through all number from n to 1,
 * resulting in linear time complexity.
 *
 * @param n the number for which the factorial is to be calculated.
 * @return The factorial of the given number.
 */

import java.util.Scanner;

public class Main {
    /*
     * This main method used as selector for problem.
     * @param tn the number from 1 to 10 (number of problem).
     * @return execute problem method.
     */
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
            case 9:
                p9();
                break;
            case 10:
                p10();
                break;
            default:
                System.out.println("There is no problem: " + tn);
        }
    }

    /*
     * Problem 1
     * This method find minimum number of array.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all number of array,
     * @param n length of array, nArr - array of integers.
     * @return minimum number.
     */
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
/*Recursive part*/
    public static int p1r(int n, int[] arr, int index, int min) {
        if (arr[index] < min) min = arr[index];
        if (index == n - 1) return min;
        return p1r(n, arr, index + 1, min);
    }

    /*
     * Problem 2
     * This method find average number of array.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all number of array,
     * @param n length of array, nArr - array of integers.
     * @return average number.
     */
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
    /*Recursive part*/
    public static double p2r(int n, int[] arr, int index, int sum) {
        sum = sum + arr[index];
        if (index == n - 1) return (double) sum / (double) n;
        return p2r(n, arr, index + 1, sum);
    }

    /*
     * Problem 3
     * This method indicates is digit is primal.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all number from 1 to n,
     * @param n number that may be prime.
     * @return "Prime" or "Composite" string.
     */
    public static void p3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 2;
        System.out.println(p3r(n, index));
    }
    /*Recursive part*/
    public static String p3r(int n, int index) {
        if (index == n || n == 1) return "Prime";
        if (n % index == 0) return "Composite";
        return p3r(n, index + 1);
    }

    /*
     * Problem 4
     * This method calculates the factorial of given number.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all number from n to 1,
     * resulting in linear time complexity.
     * @param n the number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static void p4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p4r(n));
    }
    /*Recursive part*/
    public static int p4r(int n) {
        if (n == 1) return 1;
        return n * p4r(n - 1);
    }

    /*
     * Problem 5
     * This method find n'th fibonacci number.
     * It uses a recursive approach.
     * Time complexity: O(2^n), where n is the input number.
     * The recursive algorithm iterates through all number from n to 0,
     * @param n the position of fibonacci number.
     * @return The factorial number itself.
     */
    public static void p5() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p5r(n));
    }
    /*Recursive part*/
    public static int p5r(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return p5r(n - 1) + p5r(n - 2);
    }

    /*
     * Problem 6
     * This method calculates the power of given numbers.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all number from n to 1,
     * @param a number, n power: (a^n).
     * @return The power of the given numbers.
     */
    public static void p6() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(p6r(a, n));
    }
    /*Recursive part*/
    public static int p6r(int a, int n) {
        if (n == 0) return 1;
        return a * p6r(a, n - 1);
    }

    /*
     * Problem 7
     * This method reflex the sequence.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all number from n to 1,
     * @param n length of array, a array elements.
     * @return Reversed array.
     */
    public static void p7() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(p7r(n, sc));
    }
    /*Recursive part*/
    public static String p7r(int n, Scanner sc) {
        int a = sc.nextInt();
        if (n == 1) return " " + a;
        return p7r(n - 1, sc) + " " + a;
    }

    /*
     * Problem 8
     * This method check is this string contain only letters.
     * It uses a recursive approach.
     * Time complexity: O(n), where n is the input number.
     * The recursive algorithm iterates through all number from n to 1,
     * @param s the given string.
     * @return "Yes" or "No" string ("Yes" if string is number-free).
     */
    public static void p8() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int index = 0;
        char[] sArr = s.toCharArray();
        System.out.println(p8r(sArr, index, len));
    }
    /*Recursive part*/
    public static String p8r(char[] arr, int index, int len) {
        if (Character.isDigit(arr[index])) return "No";
        if (index + 1 == len) return "Yes";
        return p8r(arr, index + 1, len);
    }

    /*
     * Problem 9
     * This method calculates the binomial coefficient of given numbers.
     * It uses a recursive approach.
     * Time complexity: O(2^n), where n is the input number.
     * The recursive algorithm iterates through all number from n to 1,
     * @param n and k that is 2 attributes of binomial coefficient.
     * @return The binomial coefficient itself.
     */
    public static void p9() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(p9r(n, k));
    }
    /*Recursive part*/
    public static int p9r(int n, int k) {
        if (n == k || k == 0) return 1;
        return p9r(n - 1, k - 1) + p9r(n - 1, k);
    }

    /*
     * Problem 10
     * This method calculates the GCD of given number.
     * It uses a recursive approach.
     * Time complexity: O(log(n), where n is the input number.
     * The recursive algorithm iterates through all number from n to 1,
     * @param a and b that is numbers between is needed to find GCD.
     * @return The GCD itself.
     */
    public static void p10() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(p10r(a, b));
    }
    /*Recursive part*/
    public static int p10r(int a, int b) {
        if (b == 0) return a;
        return p10r(b, a % b);
    }
}