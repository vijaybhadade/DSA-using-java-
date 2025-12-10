
class Book {

    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

public class Question3 {

    public static void main(String[] args) {
        System.out.println("Before count of Book = " + Book.count);
        Book b = new Book(150);
        Book b1 = new Book(250);
        System.out.println("After count of Book = " + Book.count);
    }
}
