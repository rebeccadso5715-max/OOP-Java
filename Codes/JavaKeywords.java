class Parent {
    String name = "Parent class";
    void dislayParent() {
        System.out.println("This is a Parent class");
    }
}
class Child extends Parent {
    String name;
    static String college = "KITCOEK";
    final int rollNo = 10;
    Child(String name) {
        this.name = name;
    }
    void getstatic() {
        System.out.println("Static: " + college);
    }
    void getfinal() {
        System.out.println("Final: " + rollNo);
    }
    void getthis() {
        System.out.println("this: " + this.name);
    }
    void getsuper() {
        System.out.println("Super: " + super.name);
    }
    void getextends() {
        System.out.println("Child is inherited from Parent");
    }
}
public class JavaKeywords {
    public static void main(String[] args) {
        Child obj = new Child("Rebecca");
        obj.getstatic();
        obj.getfinal();
        obj.getextends();
        obj.getsuper();
        obj.getthis();
    }

}
