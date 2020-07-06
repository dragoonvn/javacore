package activity52;

import java.sql.Struct;

public class StudentManagement {
    private Student[] students;
    private int soSV;

    public StudentManagement(Student[] students) {
        this.students = students;
        soSV = students.length;
    }

    public CheckResult checkPasOrFail() {
        int numberOfPass = 0;
        for (Student student : students) {
            if (student.kiemTra()) {
                numberOfPass++;
            }
        }
        int numberOfFail = soSV - numberOfPass;
        String name = "Nguyen Van A";
        CheckResult checkResult = new CheckResult(numberOfPass, numberOfFail, name);
       checkResult.setNameOfHighestStudent(name);
        return checkResult;
    }

//    public int countPass() {
//        int pass = 0;
//        for (Student student : students) {
//            if (student.kiemTra()) {
//                pass++;
//            }
//        }
//        return pass;
//    }
//
//    public int countFail() {
//        int fail = 0;
//        for (Student student : students) {
//            if (!student.kiemTra()) {
//                fail++;
//            }
//        }
//        return fail;
//    }

    public Student maxGPA() {
        float max = students[0].getGpa();
        Student result = students[0];
        for (Student student : students) {
            if (student.getGpa() > max) {
                result = student;
                max = student.getGpa();
            }
        }
        return result;
    }

    public Student minGPA() {
        float min = students[0].getGpa();
        Student result = students[0];
        for (Student student : students) {
            if (student.getGpa() < min) {
                result = student;
                min = student.getGpa();
            }
        }
        return result;
    }
}
