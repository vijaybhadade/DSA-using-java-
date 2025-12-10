
interface ChessPlayers {

    void moves();
}

class Queen implements ChessPlayers {

    public void moves() {
        System.out.println("Queen moves ->" + "up,down,left,right,diagonal (in all 4 dirn)");
    }
}

class Rook implements ChessPlayers {

    public void moves() {
        System.out.println("Rook moves ->" + "up,down,left,right");
    }
}

class King implements ChessPlayers {

    public void moves() {
        System.out.println("King  moves ->" + "up,down,left,right,diagonal (by 1 step  )");
    }
}

interface Herbivore {

    void eat();

}

interface Carnivore {

    void eat();
}

class Bear implements Herbivore, Carnivore {

    public void eat() {
        System.out.println(" bear  eat grass");
    }
}

public class InterfaceTopic {

    public static void main(String[] args) {
        // System.out.println("\n ==================================================\n");
        // Queen qn = new Queen();
        // qn.moves();
        // Rook rk = new Rook();
        // rk.moves();
        // King kg = new King();
        // kg.moves();

        // System.out.println("\n ==================================================\n");
        Bear br = new Bear();
        br.eat();
    }
}
