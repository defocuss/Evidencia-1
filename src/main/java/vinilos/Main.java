package vinilos;

import java.lang.invoke.StringConcatFactory;

public class Main {
    public static void main(String[] args) {
        String vinilos [][] = new String[100][3];
        agregarVinilo(vinilos, "Coldplay","A head full of dreams","2015");
        agregarVinilo(vinilos, "Iron Maiden","Killers","1981");
        printVinilos(vinilos);

    }
    public static void agregarVinilo(String matriz[][], String group, String disc, String release) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == null ){
                matriz[i][0] = group;
                matriz[i][1] = disc;
                matriz[i][2] = release;

                break;
            }
        }
    }
    public static void printVinilos(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++){
            if (matriz[i][0] == null){
                break;
            }
            else {
                System.out.print(matriz[i][0] + " /" + matriz[i][1] + " /" + matriz[i][2] + "\n");
            }

        }

    }
}