package activity41;

public class Acitivity41 {
    public static void main(String[] args) {
        int i, a, b, tc = 0;
        System.out.println("Print out all Armstrong: ");
        for (i = 1; i <= 500; i++) {
            a = i;
            while (a > 0) {
                b = a % 10;
                tc = tc + (b * b * b);
                a = a / 10;
            }
            if (tc == i) {
                System.out.print(i + ", ");
            }
            tc = 0;
        }
    }
}
