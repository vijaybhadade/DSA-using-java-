
class Animal {

    String skinColor = "Yellows red";

    void eat() {
        System.out.println(" they are eating..");
    }

    void breathe() {
        System.out.println(" they are breathes");
    }
}

class fish extends Animal {

    int fins = 2;

}

public class Inheritance {

    public static void main(String[] args) {
        // fish f1 = new fish();
        // f1.eat();
        // f1.breathe();
        // System.out.println(" finges of fish = " + f1.fins);
        // System.out.println(" skinColor of fish = " + f1.skinColor);

    }
}
