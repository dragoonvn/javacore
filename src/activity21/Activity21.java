package activity21;

import java.util.Scanner;

public class Activity21 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println(a + " + " + b + " = " + c);
        System.out.println(a + " - " + b + " = " + d);
        System.out.println(a + " x " + b + " = " + e);
        System.out.println(a + " / " + b + " = " + f);
        System.out.println(a + " mod " + b + " = " + g);
    }
}
