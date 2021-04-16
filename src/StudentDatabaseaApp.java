import java.util.Scanner;

public class StudentDatabaseaApp {

    public static void main(String[] args) {

        // Ask how many new students we want to add
        System.out.println("Enter number of new students to enroll : ");
        Scanner in = new Scanner(System.in);
        int numbOfStudents = in.nextInt();
        Student[] students = new Student[numbOfStudents];

        // create a n number of new students
        for (int n = 0; n < numbOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition(500);
            System.out.println(students[n].toString());
        }
        for (int n = 0; n < numbOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
