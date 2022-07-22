package _exceptions;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt ("hola");
            System.out.println(num);
        } catch(NumberFormatException e){
            System.out.println("Capturada excepción tipo NumberFormatException");
        } finally {
            System.out.println("Salgo del try");
        }        
        //NumberFormatException
    }
}
