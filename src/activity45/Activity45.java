package activity45;

import java.util.Scanner;

public class Activity45 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhập vào  1 chuỗi:");
        String input = scanner.nextLine();
        char[] str = input.toCharArray();
        int i, j = 0;
        j = str.length - 1;
        System.out.println("Chuỗi đảo:");
        for (i = 0; i < j; i++, j--) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
        for (char c:str) {
            System.out.print(c);}
    }
}
