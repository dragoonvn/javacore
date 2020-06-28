package activity42;

import java.util.Scanner;

public class Activity42 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j;
        System.out.println("Nhập vào số phần tử mảng:");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        System.out.println("Nhập vào phần tử mảng: ");
        for (int n = 0; n < a; n++) {
            System.out.printf("a[%d] = ", n);
            arr[n] = scanner.nextInt();
        }
        System.out.println("Các phần tử trong mảng:");
        for (int m = 0; m < a; m++) {
            System.out.print(arr[m] + " ");
        }
        System.out.println("\nMảng sau khi xóa các phần tử trùng:");

        for (i = 0; i < a; ++i) {
            for (j = i + 1; j < a; j++) {
                if (arr[i] == arr[j]) {
                    int temp = j;
                    for (int k = j + 1; k < a; k++, temp++) {
                        arr[temp] = arr[k];
                    }
                    a--;
                    j--;
                }
            }
        }
        for (i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}