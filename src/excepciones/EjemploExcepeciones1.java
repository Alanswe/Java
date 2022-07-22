package excepciones;

public class EjemploExcepeciones1 {
    public static int recogePar(int num) throws Exception { // para infomar a java de que puede lanzar esto y lo obliga a gestionarlo 
        if (num % 2 == 0){
            return num;
        } else {
            //throw new RuntimeException(); // Unchecked
            throw new Exception(); // checked
        }
    }
    
    public static void main(String[] args) throws Exception {
        
        System.out.println(recogePar(2));
        System.out.println(recogePar(3));
    }
}
