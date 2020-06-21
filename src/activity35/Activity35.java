package activity35;

import java.util.Scanner;

public class Activity35 {
    public static void main(String[] args) {
        int a, dem1 = 1, dem2 = 1;
        char c = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng: ");
        a = scanner.nextInt();
        for (int i = 1; i < (a * 2); i++) {
            for (int j = a - dem1; j > 0; j--) {
                System.out.print(" ");
            }
            if (i < a) {
                dem1++;
            } else {
                dem1--;
            }
            for (int n = 0; n < dem2; n++) {
                System.out.print(c);
                if (n < dem2 / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            if (i < a) {
                dem2 = dem2 + 2;
            } else {
                dem2 = dem2 - 2;
            }
            c = 'A';
            System.out.println();
        }
    }
}
