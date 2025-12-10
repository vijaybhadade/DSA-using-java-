
class Test {

    static int a = 23;
    static int b;

    static void changeB() {
        b = a * 3;
    }

}

public class Question5 {

    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();
        System.out.println(Test.a + Test.b);
    }
}
