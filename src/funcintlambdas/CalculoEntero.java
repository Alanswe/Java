package funcintlambdas;

public class CalculoEntero {
    
    public static int cuadrado(int num){
        return num*num;
    }
    
    public static int cubo(int num){
        return num*num*num;
    }
    
    public static int doble(int num){
        return num*2;
    }
    
    public static int triple(int num){
        return num*3;
    }
    
    public static int polinomio(int num){
        return 5*CalculoEntero.cubo(num)+7*CalculoEntero.cuadrado(num)+9;
    }
    
    public static int polinomioVariable(int num,int a,int b,int c){
        return a*CalculoEntero.cubo(num)+b*CalculoEntero.cuadrado(num)+c;
    }
    
    public static void main(String[] args) {
        System.out.println(cuadrado(10));
        System.out.println(cubo(10));
        System.out.println(doble(10));
        System.out.println(triple(10));
        System.out.println(polinomio(10));
        System.out.println(polinomioVariable(10,5,7,9));
    }
}
