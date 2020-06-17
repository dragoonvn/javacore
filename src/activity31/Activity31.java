package activity31;

import java.util.Scanner;

public class Activity31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, j;
        System.out.println("Nhập số dòng n: ");
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
