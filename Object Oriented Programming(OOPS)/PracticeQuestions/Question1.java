
class Student {

    String name;
    int marks;
}

public class Question1 {

    public static void main(String[] args) {
        Student c = new Student();
        String name = c.name = "vijay";
        System.out.println(name);

    }
}
