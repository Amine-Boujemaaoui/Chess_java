package test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        char a = 'h';
        int ascii = (int)a;
        System.out.println(ascii);
        String ab = "ab";
        System.out.println(ab.charAt(0));
    }

    public String[][] maj(ArrayList<String> ech){
        String[][] maj = new String[8][8];
        int i = 0,j = 0;
        while (i < 8){
            while (j < 8){
                int k = 0;
                maj[i][k] = ech.get(j);
                k++;
                j++;
            }
            i++;
        }
        return maj;
    }
}
