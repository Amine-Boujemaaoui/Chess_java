/**
 * Chest
 * Classe avec la méthode main
 */
package src;

public class Chest {
    public static void main(String[] args) {
        System.out.println(Game.reglesDeJeu());
        Gameur g1 = new Gameur("Amine");
        Gameur g2 = new Gameur("Mounirou");
        Game parti = new Game(g1, g2);
        parti.game();

    }
}