package activity22;

import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        int b = a + ((a * 10) + a) + ((a * 100) + (a * 10) + a);
        System.out.printf(a + " + " + a + a + " + " + a + a + a + " = " + b);
    }
}
