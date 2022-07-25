package funcintlambdas;

public class Test {
    

    
    public static void main(String[] args) {
//        CalculaDesdeIntAInt cuadrado = (int s) -> {return s * s;}; // Funciona igual
        CalculaDesdeIntAInt cuadrado = s -> s * s;

        CalculaDesdeIntAInt cubo = s -> s * s * s;
        
        CalculaDesdeIntAInt doble = s -> s * 2;
  
        CalculaDesdeIntAInt triple = s -> s * 3;
        
        CalculaDesdeIntAInt polinomio = s -> 5 * cubo.calcula(s) + 7 * cuadrado.calcula(s) + 9;
        
        int a = 5, b = 7, c = 9;
        CalculaDesdeIntAInt polinomioVariable = s -> a * cubo.calcula(s) + b * cuadrado.calcula(s) + c;
                
        System.out.println(cuadrado.calcula(10));
        System.out.println(cubo.calcula(10));
        System.out.println(doble.calcula(10));
        System.out.println(triple.calcula(10));
        System.out.println(polinomio.calcula(10));
        System.out.println(polinomioVariable.calcula(10));
        
        
        System.out.println("=================================================");
        
        CalculaDeIntADouble mitad = s -> s / 2.;
        CalculaDeIntADouble cuarta = s -> s / 4.;
        CalculaDeIntADouble decima = s -> s / 10.;
        int n = 10;
        CalculaDeIntADouble nsima = s -> (double)s / n;
        
        
        System.out.println(mitad.calcula(10));
        System.out.println(cuarta.calcula(10));
        System.out.println(decima.calcula(10));
        System.out.println(nsima.calcula(10));
        
        System.out.println("=================================================");
        
        TestIf par = x -> x % 2 == 0;
        TestIf inpar = x -> x % 2 != 0;
        TestIf negativo = x -> x < 0;
        TestIf positivo = x -> x > 0;      
        
        System.out.println(par.test(2));
        System.out.println(par.test(3));
        System.out.println(inpar.test(2));
        System.out.println(inpar.test(3)); 
        System.out.println(negativo.test(-3));
        System.out.println(negativo.test(3));
        System.out.println(positivo.test(3));
        System.out.println(positivo.test(-3));
        
        System.out.println("=================================================");
        
       int[] miArray = {-2, -4, 0, 54, 10, 90, -30};
       
        System.out.println(sumaMagica(miArray, par));
    }
    
    public static int sumaMagica(int[] arr, TestIf filtro){
        int suma = 0;
        for (int x : arr){
            if (filtro.test(x))
                suma += x;
        }
        return suma;
    }
    
}
