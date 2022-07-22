package excepciones;

public class MyClass {
    public static void m1() {
        System.out.println("Pasando por M1 de MyClass");
        
        try{
            m2();
        } catch(ArithmeticException e){
            System.out.println("Capturada ArithmeticException => " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            //System.out.println("Capturada ArrayIndexOutOfBoundsException => " + e.getMessage());
            System.out.printf("Capturada %s %n",e.toString());
        } finally {
            System.out.println("Soy el finally");
            System.out.println("Saliendo de M2 de MyClass"); 
        }
        
        System.out.println("Saliendo de M1 de MyClass");    
    }
    
    public static void m2() {
        
        System.out.println("Pasando por M2 de MyClass");
        //System.out.println(7/0);
        int[] arr2 = new int[2];
        System.out.println(arr2[10]);
        System.out.println("Saliendo de M2 de MyClass");    

    }
    
}


