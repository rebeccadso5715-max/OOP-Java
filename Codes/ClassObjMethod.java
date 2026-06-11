import java.util.Scanner;
class Student{
    int prn;
    int rollNo;
    String course;
    int marks;
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter prn: ");
        prn = sc.nextInt();
        System.out.println("Enter rollNo: ");
        rollNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter course: ");
        course = sc.nextLine();
        System.out.println("Enter marks: ");
        marks = sc.nextInt();
    }
    void displayData() {
        System.out.println("prn: " + prn);
        System.out.println("rollNo: " + rollNo);
        System.out.println("course: " + course);
        System.out.println("marks: " + marks);
    }
    void findGrade() {
        if(marks >=90) {
            System.out.println("A");
        } else if(marks >=75) {
            System.out.println("B");
        } else if(marks >=60) {
            System.out.println("C");
        }
    }
    void ifPass() {
        if (marks >=40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}

public class ClassObjMethod {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.getData();
        obj.displayData();
        obj.findGrade();
        obj.ifPass();
    }
}
