package Singleclasses;

public class arrayDosD {    
    public static void main(String[] args) {
        int totalFilas = 3;
        int totalCols = 5;
        String[][] array2D = new String[totalFilas][totalCols];
        for (int fila = 0 ; fila < totalFilas ; fila++) {
            for (int columna=0; columna < totalCols; columna++){
                array2D[fila][columna] = "(" + fila + ", " + columna + ")";               
            }
        }
        
        for(String[] arr : array2D){
            for(String s : arr){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}