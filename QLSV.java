import java.util.Scanner;

public class QLSV {
    /* Return something */
    public static void main(String[] args) {
        StudentManagement smt = new StudentManagement();

        //Student 1
        Student std1 = new Student();
        smt.addStudent(std1);

        //Student 2
        Student std2 = new Student("name", "id", "email");
        std2.setGroup("sdsd");
        smt.addStudent(std2);

        //Student 3
        Student tmpStd = new Student("test de","id cx test luon","mail test");
        Student std3 = new Student(tmpStd);
        std3.setGroup("655");
        smt.addStudent(std3);

        std2 = new Student();
        std2.setGroup("655");
        smt.addStudent(std2);
        
        //Compare Student
        System.out.print(smt.sameGroup(std2, std3));

        Scanner scanner = new Scanner(System.in);
        smt.removeStudent(scanner.nextLine());

        scanner.close();

        System.out.print(smt.studentsByGroup());
    }
}