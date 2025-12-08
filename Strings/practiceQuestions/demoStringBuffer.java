package practiceQuestions;

public class demoStringBuffer {

    public static void main(String[] args) {

        //1)using default constructor
        StringBuffer s = new StringBuffer();
        s.append("hello");
        System.out.println("Default constuctor:" + s);

        //2)using costructor with specified capability 
        StringBuffer sb1 = new StringBuffer(50);
        sb1.append("java programming");
        System.out.println("With capacity 50:" + sb1);

        //3)Using constructor with sting 
        StringBuffer sb2 = new StringBuffer("Welcome ");
        sb2.append("to java");
        System.out.println("With String :" + sb2);

    }
}
