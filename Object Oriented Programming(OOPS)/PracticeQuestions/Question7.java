
class Automobile {

    private String drive() {
        return "Driving Vehicle";
    }
}

class car extends Automobile {

    protected String drive() {
        return "Driving car";
    }
}

public class Question7 extends car {

    public final String drive() {
        return "driving electronic car";  // this is output 
    }

    public static void main(String[] args) {
        final car car = new Question7();
        System.out.println(car.drive());
    }
}
