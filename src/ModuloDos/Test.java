
package ModuloDos;

public class Test {
    public static void main(String[] args) throws Exception {
    Rectangulo rect1 = new Rectangulo();
    
    Counter a = new Counter();
    Counter b = new Counter("NO-Model");
    Counter c = new Counter(200,"ISOLUXU 1200");
    
    rect1.altura = 100;
    rect1.base = 300;
    System.out.printf("%nEl Rectangulo tiene de base %d y de altura %d, su perimetro es de %d %n",rect1.base,rect1.altura,rect1.base*rect1.altura);
    
    a.value = 100;
    System.out.printf("%nEl Contador %d tiene un máximo de %d y su modelo es %s %n",a.value,a.maxValue,a.model);
    System.out.printf("%nEl Contador %d tiene un máximo de %d y su modelo es %s %n",b.value,b.maxValue,b.model);
    System.out.printf("%nEl Contador %d tiene un máximo de %d y su modelo es %s %n",c.value,c.maxValue,c.model);
    
        System.out.println(rect1.perimetro);
    }
}
