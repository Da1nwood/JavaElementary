package Homework;

public class Fibonacci {
    public static void main (String[] args) {
        int n1 = 0, n2 = 1, n3, i, count=20;
        System.out.print("Homework.Fibonacci row: " + n1 + " " + n2 + " ");

        for (i = 2; i < count; i ++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

        System.out.print("...");
    }
}