package ModuloDos;

public class Counter {
    int value;
    int maxValue = 100_000;
    String model = "N-COUNTER";
    
    public static void main(String[] args) {
        Counter c1 = new Counter(123, 93000, "ISOLUXU 400");
        Counter c2 = new Counter();
        Counter c3 = new Counter(100_000, 100_000, "ISOLUXU 1080");

        System.out.println("Antes: "+c1.value);
        System.out.println(c1.increment());
        System.out.println("Después: "+c1.value);
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Antes: "+c3.value);
        System.out.println(c3.increment());
        System.out.println("Después: "+c3.value);
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Antes: "+c1.value);
        System.out.println(c1.increment(13));
        System.out.println("Después: "+c1.value);

        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Antes: "+c3.value);
        System.out.println(c3.reset());
        System.out.println("Después: "+c3.value);
        
        System.out.println("-------------------------------------------------");

        System.out.println(c1.show());
    }
    
    Counter(String model){
        this.model = model;
    }
    
    Counter(int value,String model){
        this.value = value;
        this.model = model;
    }
    
    Counter(int value,int maxValue, String model){
        this.value = value;
        this.maxValue = maxValue >= 100_000 ? 100_000 : // para que sea menor que 100_000
                maxValue <= 1_000 ? 1_000 : maxValue; // para que sea mayor que 1_000
        this.model = model;
    }
 
    Counter(){
        
    }
    
    Counter(Counter counterOriginal){ // Copia
        this.value = counterOriginal.value;
        this.maxValue = counterOriginal.maxValue;
        this.model = counterOriginal.model;
    }
    
    boolean increment(){
        if (value > 0 && value < 100_000) {
            value += 1;
        }
        return value > 0 && value < 100_000;
    }
    
    boolean increment(int n){
        if (value > 0 && value < 100_000) {
            value += n;
        }
        return value > 0 && value < 100_000;
    }
    
    boolean reset(){
        //value >= 100_000 ? value = 0 : false;
        
        if (value >= 100_000) {
            value = 0;
            return true;
        } else {
            return value >= 100_000;
        }
    }
    
    String show(){
        return "Contador: modelo " + this.model + " y valor " + this.value + " de " + this.maxValue + ".";
    }
    
    
    
}
