import java.util.Scanner;

public class LinerMenu {

    public static int Menubar(String[] menu, String search) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i].equals(search)) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        String[] menu = {"poha","Dosa","tea","rice","gulabjamun","chiwda","coffee"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Search what you want:");
        String search = sc.nextLine();

        int order = Menubar(menu, search);
        if(order == -1) {
            System.out.println("This item is not available");
        } else {
            System.out.println(menu[order] + " is available, give me 4 minutes to serve");
        }
    }
}
