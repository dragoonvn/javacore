package activity33;

import java.util.Scanner;

public class Activity33 {
    public static void main(String[] args) {
        int a, b = 0, c;
        String d = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân");
        a = scanner.nextInt();
        while (a > 0) {
            c = a % 2;
            if (c == 1) {
                b++;
            }
            d = c + "" + d;
            a = a / 2;
        }
        System.out.println("Số nhị phân:" + d);
    }
}
