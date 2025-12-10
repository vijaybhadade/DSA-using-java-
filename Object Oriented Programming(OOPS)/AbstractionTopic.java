
abstract class Animal {

    String color = "golden";

    abstract void eat();
}

class fish extends Animal {

    int fins;

    void eat() {
        System.out.println("fish can be eat");
    }
}

public class AbstractionTopic {

    public static void main(String[] args) {
        fish fh = new fish();
        System.out.println(fh.color);
        fh.eat();
        fh.fins = 4;
        System.out.println(fh.fins);

    }
}
