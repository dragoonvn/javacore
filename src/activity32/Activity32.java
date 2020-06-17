package activity32;

import java.util.Scanner;

public class Activity32 {
    public static void main(String[] args) {
        int a, d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài fibonacci");
        a = scanner.nextInt();
        int b = 0, c = 1;
        for (int i = 0; i < a; i++) {
            if (i < (a - 1)) {
                System.out.print(b + ", ");
            } else {
                System.out.print(b);
            }
            d = b + c;
            b = c;
            c = d;
        }
    }
}
