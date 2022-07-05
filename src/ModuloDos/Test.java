
package ModuloDos;

public class Test {
    public static void main(String[] args) throws Exception {
    Rectangulo rect1 = new Rectangulo();
    
    Counter a = new Counter();
    Counter b = new Counter("NO-Model");
    Counter c = new Counter(200,"ISOLUXU 1200");
    Counter d = new Counter(12, 200, "ISOLUXU 3500");    
    Counter e = new Counter(146, 150000, "ISOLUXU 6500");
    Counter f = new Counter(123, 93000, "ISOLUXU 400");

    
    rect1.altura = 100;
    rect1.base = 300;
    System.out.printf("%nEl Rectangulo tiene de base %d y de altura %d, su perimetro es de %d %n",rect1.base,rect1.altura,rect1.base*rect1.altura);
    
    a.value = 100;

    // un array de objetos
    Counter[] Counters = {a,b,c,d,e,f};

    for (Counter p : Counters){
        System.out.printf("%nEl Contador %d tiene un máximo de %d y su modelo es %s %n",p.value,p.maxValue,p.model);

    }
        
    System.out.println("-----------------------------------------------------");

        
        
    }
}
