
abstract class Car {

    static {
        System.out.print("1");
    }

    public Car(String name) {
        super();
        System.out.print("2");
    }

    {
        System.out.println("3");
    }
}

public class Question9 extends Car {

    {
        System.out.print("4");
    }

    public Question9() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] args) {
        new Question9();
    }
}
