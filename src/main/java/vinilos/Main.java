package vinilos;

import java.lang.invoke.StringConcatFactory;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String vinilos [][] = new String[100][3];
        agregarVinilo(vinilos, "Coldplay","A head full of dreams","2015");
        agregarVinilo(vinilos, "Iron Maiden","Killers","1981");
        printVinilos(vinilos);
        String artista = "Coldplay";
        String artista2= "Red hot chilli peppers";

        mostrarBusquedaArtista(vinilos,artista2);
        mostrarBusquedaArtista(vinilos,artista);

        retornarDisponibles(vinilos);

        retornarTotalVinilos(vinilos);

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
    public static Boolean buscarArtista (String matriz[][], String group ) {
         Boolean validacion = false;
        for (int i = 0; i < matriz.length; i++) {
            if (Objects.equals(matriz[i][0], group)){
                validacion = true;
                break;
            }
            else {
               validacion = false;
               break;
            }
        }
        return  (validacion);
    }
    public static void mostrarBusquedaArtista(String matriz [][], String group) {
        if (buscarArtista(matriz, group) == true) {
            System.out.print("El artista " + group + " si esta en la coleccion" + "\n");
        }
        else{
            System.out.print("El artista " + group + " no esta en la coleccion" + "\n");
        }
    }
    public static int disponibles(String matriz[][]){
        int contadorVacios = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == null){
                contadorVacios++;
            }
        }
        return contadorVacios;
    }
    public static void retornarDisponibles(String matriz[][]){
        System.out.print("Hay un total de: "+ disponibles(matriz)+ " espacios disponibles en la coleccion de vinilos\n" );
    }
    public static int totalVinilosEnColeccion(String matriz[][]){
        int contadorVinilos = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == null){
                break;
            }
            else {
                contadorVinilos++;
            }
        }
        return contadorVinilos;
    }
    public static void retornarTotalVinilos(String matriz[][]){
        System.out.print("Hay " + totalVinilosEnColeccion(matriz) + " vinilos en la coleccion\n" );
    }
}