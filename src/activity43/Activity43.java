package activity43;

import java.util.Arrays;
import java.util.Scanner;

public class Activity43 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, a, b;
        int pos = 0;
        System.out.println("Nhập số phần tử mảng 1: ");
        a = scanner.nextInt();
        System.out.println("Nhập số phần tử mảng 2:");
        b = scanner.nextInt();
        int[] arr = new int[a];
        int[] arr1 = new int[b];
        System.out.println("Nhập vào phần tử mảng 1:");
        for (i = 0; i < a; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập phần tử mảng 2:");
        for (j = 0; j < b; j++) {
            System.out.printf("b[%d] = ", j);
            arr1[j] = scanner.nextInt();
        }
        System.out.println("Các phần tử trong mảng 1:");
        for (int m = 0; m < a; m++) {
            System.out.print(arr[m] + " ");
        }
        System.out.println("\nCác phần tử trong mảng 2:");
        for (int m = 0; m < b; m++) {
            System.out.print(arr1[m] + " ");
        }
        System.out.println("\nKết nối 2 mảng: ");
        int length = a + b;
        int[] result = new int[length];
        for (int element : arr) {
            result[pos] = element;
            pos++;
        }
        for (int element : arr1) {
            result[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(result));
    }
}
