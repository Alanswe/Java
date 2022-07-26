package _functionales;

import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        _Supplier<Integer> aleatorio100 = () -> (int)(Math.random() * 100 + 1);
        Supplier<Integer> aleatorio10 = () -> (int)(Math.random() * 10 + 1);

        System.out.println(aleatorio100.get());
        System.out.println(aleatorio10.get());
        System.out.println("================");
        
        _Consumer<String> imprimeTexto = s -> System.out.println(s);
        _Consumer<Integer> imprimeDobleNumero = s -> System.out.println(s*2);
        
        imprimeTexto.accept("Hola");
        imprimeDobleNumero.accept(2);
        System.out.println("================");
        
        
        _BiConsumer<String, Integer> replicaTexto = (s, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println(s);
            }
        }; 
        
        replicaTexto.accept("hola", 3);
        System.out.println("================");
       
        _BiConsumer<String, String> concatena = (s1, s2) -> System.out.println(s1 + " " + s2);

        concatena.accept("Hola", "Mundo");
        System.out.println("================");
       
       
        _Predicate<String> masDeTresCaracteres = s -> s.length() > 3;
       
        imprimeTexto.accept("" + masDeTresCaracteres.test("Holaaa")); 
        imprimeTexto.accept("" + masDeTresCaracteres.test("Yo")); 
       
        _Predicate<Integer> positivo = x -> x > 0;
       
        imprimeTexto.accept("" + positivo.test(-10)); 
        imprimeTexto.accept("" + positivo.test(3)); 
        System.out.println("================");
        
        _BiPredicate<Integer, Integer> iguales = (x1, x2) -> x1.equals(x2);
        
        System.out.println(iguales.test(3, 4));
        System.out.println(iguales.test(3, 3));
        System.out.println("================");
        
        Function<String, Integer> cuentaLetras = s -> s.length();
        
        System.out.println(cuentaLetras.apply("Holasdsfweofk"));
        System.out.println("================");
        
        BiFunction<String, String, Integer> cuentatodasLetras = (s1, s2) -> s1.length() + s2.length();
        
        System.out.println(cuentatodasLetras.apply("Hola", "adios"));        
        System.out.println("================");

        UnaryOperator<Integer> cuadrado = x -> x * x;
        
        System.out.println(cuadrado.apply(4));
        System.out.println("================");
       
        BinaryOperator<String> concatenados = (s, t) -> s + t;
        
        System.out.println(concatenados.apply("Hola ", "Mundo"));
    }
}
