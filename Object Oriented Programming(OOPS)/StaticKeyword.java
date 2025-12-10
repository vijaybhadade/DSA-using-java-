
class Student {

    static int returnPersentage(int math, int physic, int chemistry) {
        return (math + physic + chemistry) / 3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

public class StaticKeyword {

    public static void main(String[] args) {
        Student st = new Student();
        st.schoolName = "JVM";
        st.setName("vijay");
        System.out.println("Name = " + st.getName());
        int result = Student.returnPersentage(45, 56, 65);
        System.out.println(" average of percentage is =" + result);
        Student s2 = new Student();
        System.out.println("schoolName = " + s2.schoolName);
    }
}
