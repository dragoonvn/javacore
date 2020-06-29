package activity44;

import java.util.Scanner;

public class Activity44 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, a, temp;
        int pos = 0;
        int pos1 = 0;
        int pos2 = 0;
        System.out.println("Nhập số phần tử mảng: ");
        a = scanner.nextInt();
        int[] arr = new int[a];
        System.out.println("Nhập thông tin mảng:");
        for (i = 0; i < a; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Thông tin mảng:");
        for (j = 0; j < a; j++) {
            System.out.print(arr[j] + " ");
        }
        //copy mang tam tim gia tri lon thu 2
        int length = a;
        int[] arrTam = new int[length];
        for (int element : arr) {
            arrTam[pos] = element;
            pos++;
        }
        //copy mang tam tim gia tri nho thu 2
        int length1 = a;
        int[] arrTam1 = new int[length1];
        for (int element : arr) {
            arrTam1[pos1] = element;
            pos1++;
        }
        //copy mang thay thế giá trị âm
        int length5 = a;
        int[] arrTam2 = new int[length5];
        for (int element : arr) {
            arrTam2[pos2] = element;
            pos2++;
        }

        // In vi tri va gia tri cua phan tu lon nhat trong mang
        System.out.println("\n1. In ra vị trí và giá trị của phần tử lớn nhất trong mảng");
        int max = arr[0];
        int location = 0;
        for (i = 1; i < a; i++) {
            if (arr[i] > max) {
                max = arr[i];
                location = i;
            }
        }
        System.out.print("Vị trí " + location + " có phần tử lớn nhất = " + max);
        //In vi tri va gia tri cua phan tu nho nhat trong mang
        System.out.println("\n2. In ra vị trí và giá trị của phần tử nhỏ nhất trong mảng");
        int min = arr[0];
        int location1 = 0;
        for (i = 1; i < a; i++) {
            if (arr[i] < min) {
                min = arr[i];
                location1 = i;
            }
        }
        System.out.print("Vị trí " + location1 + " có phần tử nhỏ nhất = " + min);
        //In ra vị trí và giá trị của phần tử lớn thứ 2 trong mảng
        System.out.print("\n3. In ra vị trí và giá trị của phần tử lớn thứ 2 trong mảng");
        int c, k;
            //xoa phan tu lon nhat trong bang tam lay ra gia tri
        for (c = k = 0; k < a; k++) {
            if (arrTam[k] != max) {
                arrTam[c] = arrTam[k];
                c++;
            }
        }
        int length2 = c;
        int max2 = arrTam[0];
        int location3 = 0;
        for (i = 1; i < length2; i++) {
            if (arrTam[i] > max2) {
                max2 = arrTam[i];
            }
        }
             //lay vi tri gia tri lon thu 2 o mang goc
        for (i = 1; i < a; i++) {
            if (arr[i] == max2) {
                location3 = i;
            }
        }
        System.out.print("\nVị trí " + location3 + " có phần tử lớn thứ hai = " + max2);
        //In ra vị trí và giá trị của phần tử nhỏ thứ 2 trong mản
        System.out.print("\n4. In ra vị trí và giá trị của phần tử nhỏ thứ 2 trong mảng");
        int c1, k1;
            //xoa phan tu lon nhat trong bang tam lay ra gia tri
        for (c1 = k1 = 0; k1 < a; k1++) {
            if (arrTam1[k1] != min) {
                arrTam1[c1] = arrTam1[k1];
                c1++;
            }
        }
        int length3 = c1;
        int min2 = arrTam1[0];
        int location4 = 0;
        for (i = 1; i < length3; i++) {
            if (arrTam1[i] < min2) {
                min2 = arrTam1[i];
            }
        }
            //lay vi tri gia tri lon thu 2 o mang goc
        for (i = 1; i < a; i++) {
            if (arr[i] == min2) {
                location4 = i;
            }
        }
        System.out.print("\nVị trí " + location4 + " có phần tử nhỏ thứ hai = " + min2);
        //Thay thế tất các phần tử âm bằng số 0
        System.out.print("\n5. Thay thế tất các phần tử âm bằng số 0");
        for (i = 0; i < a; i++) {
            if (arrTam2[i] < 0) {
                arrTam2[i] = 0;
            }
        }
        System.out.println();
        for (j = 0; j < a; j++) {
            System.out.print(arrTam2[j] + " ");
        }
        //Sắp xếp mảng theo chiều tăng dần
        System.out.print("\n6. Sắp xếp mảng theo chiều tăng dần");
        for (i = 0; i < a; i++) {
            for (j = i + 1; j < a; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (j = 0; j < a; j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
