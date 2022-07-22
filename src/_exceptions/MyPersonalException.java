package _exceptions;

public class MyPersonalException extends Exception {
    // constructor sin parámetros
    MyPersonalException() {    
    }
    // constructor parametrizado
    MyPersonalException(String str) {
        super(str); 
    }
    public static void main(String[] args) {
        try  {
            for(int counter = 0; counter < 100 ; counter++) {
            // lanza excepción si counter > 10
                if (counter > 10) {
                    MyPersonalException me = 
                        new MyPersonalException(
                            "Counter " + counter + " grande");
                    throw me;
                }
            }
        } catch (MyPersonalException e) {
            e.printStackTrace();
        }
    }
}