package _exceptions;

public class ArrayIndexOutOfBoundExample {
    public static void main(String[] args) {
        try{
            int[] arrayPrueba = new int[5];
            System.out.println(arrayPrueba[10]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Capturada excepción tipo ArrayIndexOutOfBoundsException");
        } finally {
            System.out.println("Salgo del try");
        }      
    }
}
