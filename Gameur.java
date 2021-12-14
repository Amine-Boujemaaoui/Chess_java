/**
 * Joueur
 */
import java.util.Scanner;
public class Gameur {

    private String pseudo,colorPiece;
    private Piece pieces;

    public Gameur(){
        
    }
    public Gameur(String ps, String cP, Piece p){
        this.pseudo = ps;
        this.colorPiece = cP;
        this.pieces = p;
    }

    //jouer

    // public void game(){
    //     Piece board = new Piece("t");
    // }

    
}