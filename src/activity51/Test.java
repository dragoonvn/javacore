package activity51;

import java.util.Scanner;

public class Test {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float width, height;
        System.out.println("Nhập vào width: ");
        width = scanner.nextFloat();
        System.out.println("Nhập vào height: ");
        height = scanner.nextFloat();
        scanner.close();
        RectangleOOp rectangleOOp = new RectangleOOp(width, height);
        System.out.println("Chu vi hình: " + rectangleOOp.tinhChuVi());
        System.out.println("Diện tích hình: " + rectangleOOp.tinhDienTich());
        rectangleOOp.inWidthHeight();
        System.out.println(rectangleOOp.check() ? "Đây là hình vuông !!!" : "Đây là hình chữ nhật !!!");
    }
}
