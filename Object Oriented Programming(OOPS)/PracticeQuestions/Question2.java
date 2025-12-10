
class Person {

    void print() {
        System.out.println(" base class is called..");
    }

}

class Student extends Person {

    void print1() {
        System.out.println("child  class is called..");
    }

}

public class Question2 {

    public static void main(String[] args) {
        Person s1 = new Student();
        s1.print();

        Person p1 = new Person();
        p1.print();

    }
}
