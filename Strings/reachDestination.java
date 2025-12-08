
public class reachDestination {

    public static float getShortestPath(String str) {
        int x = 0, y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);

            switch (dir) {
                case 'W' ->
                    x--;
                case 'N' ->
                    y++;
                case 'E' ->
                    x++;
                case 'S' ->
                    y--;
                default -> {
                }
            }
        }

        return (float) Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("Following values is shortest way to visit destination");
        System.out.println(getShortestPath(str));
    }
}
