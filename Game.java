/**
 * Game
 */

import java.util.ArrayList;

public class Game{

    private int[][] chest = 
    {{1,2,3,4,5,6,7,8},
    {9,10,11,12,13,14,15,16},
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
    {0,0,0,0,0,0,0,0},
    {17,18,19,20,21,22,23,24},
    {25,26,27,28,29,30,31,32}};

    private Gameur gameur1,gameur2;

    public Game(Gameur g1,Gameur g2){
        this.gameur1 = g1;
        this.gameur2 = g2;
    }

    public Gameur getGameur1(){
        return this.gameur1;
    }
    public Gameur getGameur2(){
        return this.gameur2;
    }
    public int[][] getChest(){
        return this.chest;
    }

    public ArrayList<Integer> init(){
        int i = 0;
        ArrayList<Integer> chest_list = new ArrayList<Integer>();
        boolean t = true;
        while (i < chest.length){
            int j = 0;
            while (j < 8){
                if (chest[i][j] == 1 || chest[i][j] == 8){
                System.out.print("\u265C"+"  | ");
                chest_list.add(chest[i][j]);
                }else if (chest[i][j] == 2 || chest[i][j] == 7){
                System.out.print("\u265E"+"  | ");
                chest_list.add(chest[i][j]);
                }else if (chest[i][j] == 3 || chest[i][j] == 6){
                System.out.print("\u265D"+"  | ");
                chest_list.add(chest[i][j]);
                }else if (chest[i][j] == 4){
                System.out.print("\u265B"+"  | ");
                chest_list.add(chest[i][j]);
                }else if (chest[i][j] == 5){
                System.out.print("\u265A"+"  | ");
                chest_list.add(chest[i][j]);
                }else if (chest[i][j] == 28){
                System.out.print("\u2655"+"  | ");
                chest_list.add(chest[i][j]);
                }else if (chest[i][j] == 29){
                System.out.print("\u2654"+"  | ");
                chest_list.add(chest[i][j]);
                }else if (chest[i][j] == 27 || chest[i][j] == 30){
                System.out.print("\u2657"+"  | ");
                chest_list.add(chest[i][j]);
                }else if (chest[i][j] == 26 || chest[i][j] == 31){
                System.out.print("\u2658"+"  | ");
                chest_list.add(chest[i][j]);
                }else if (chest[i][j] == 25 || chest[i][j] == 32){
                System.out.print("\u2656"+"  | ");
                chest_list.add(chest[i][j]);
                }else if(chest[i][j] == 0) {
                System.out.print("\u25FC"+"  | ");
                chest_list.add(chest[i][j]);
                }else{
                    if (t){
                        int[] p_b = chest[1];
                        while (j < p_b.length){
                            System.out.print("\u265F"+"  | "); 
                            chest_list.add(p_b[j]);
                            break;
                        }
                        t = false;
                    }else{
                        int[] p_n = chest[7];
                        while (j < p_n.length){
                            System.out.print("\u2659"+"  | ");
                            chest_list.add(p_n[j]);
                            break;
                        }
                    }
                    // break;
                }
                j+=1;                          
            }
            System.out.print("\n");
            i+=1;  
        }
        return chest_list;
    }

}