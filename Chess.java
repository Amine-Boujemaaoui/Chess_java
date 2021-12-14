/**
 * Chess
 */
public class Chess {

    public static void main(String[] args) {
        Gameur g1 = new Gameur();
        Gameur g2 = new Gameur();

        Game parti = new Game(g1, g2);
        parti.init();
        
    }
}