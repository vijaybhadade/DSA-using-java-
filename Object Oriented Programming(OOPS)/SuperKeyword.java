
class Animal {

    String color;

    public Animal() {
        System.out.println("Animal constructor is called");
    }

}

class Horse extends Animal {

    Horse() {
        super.color = "brown";
        System.out.println(" Horse constructor is called");
    }
}

public class SuperKeyword {

    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println("color is = " + h.color);
    }
}
