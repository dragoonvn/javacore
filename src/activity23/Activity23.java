package activity23;

import java.util.Scanner;

public class Activity23 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            b = a * i;
            System.out.println(a + " x " + i + " = " + b);
            i++;
        }
    }
}
