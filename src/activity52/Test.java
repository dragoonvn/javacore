package activity52;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        float gpa;
        int n;
        System.out.println("Nhập vào số lượng sinh viên:");
        n = scanner.nextInt();
        Student[] student = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhâp sinh viên thứ " + (i + 1));
            System.out.println("Tên sinh viên:");
            name = scanner.nextLine();
            name = scanner.nextLine();
            System.out.println("GPA: ");
            gpa = scanner.nextFloat();
            student[i] = new Student(name, gpa);
            System.out.println("*****************************************");
        }
        for (int j = 0; j < n; j++) {
            System.out.println(student[j]);
        }
        StudentManagement studentManagement = new StudentManagement(student);
//        System.out.println("Số sinh viên thi đậu: " + studentManagement.countPass());
//        System.out.println("Số sinh viên thi rớt: " + studentManagement.countFail());
        Student maxSV = studentManagement.maxGPA();
        System.out.println("Sinh viên có GPA cao nhất: " + maxSV.getName() + " , GPA = " + maxSV.getGpa());
        Student minSV = studentManagement.minGPA();
        System.out.println("Sinh viên có GPA thấp nhất: " + minSV.getName() + " , GPA = " + minSV.getGpa());
        CheckResult result = studentManagement.checkPasOrFail();
        System.out.println("Số lượng sinh viên đạt " + result.getNumberOfPass() + " ; Số lượng sinh viên trượt: " + result.getNumberOfFail());
        System.out.println("Tên sinh viên cao nhât " + result.getNameOfHighestStudent());
    }

}
