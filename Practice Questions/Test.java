
class Test {

    void show(int a) {
        System.out.println("int");
    }

    void show(Integer a) {
        System.out.println("Integer");
    }

    void show(long a) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show(5);
    }
}
