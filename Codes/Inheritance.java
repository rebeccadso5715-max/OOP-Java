import java.util.Scanner;
class Person {
    int age;
    void acceptDetails() {
        System.out.print("Enter age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
    }
    void displayDetails() {
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    String name;
    void getData() {
        System.out.print("Enter name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
    void displayData() {
        System.out.println("Name: " + name);
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
        s.acceptDetails();
        s.displayData();
        s.displayDetails();
    }
}
