package _exceptions;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String i = null;
            System.out.println(i.length());
        } catch(NullPointerException e){
            System.out.println("Capturada excepción tipo NullPointerException");
        } finally {
            System.out.println("Salgo del try");
        }     
        
    }
}
