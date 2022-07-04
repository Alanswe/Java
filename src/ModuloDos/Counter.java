package ModuloDos;

public class Counter {
    int value;
    int maxValue = 10_000;
    String model = "NO-Model";
    
    Counter(String s){
        model = s;
    }
    
    Counter(int m,String s){
        value = m;
        model = s;
    }
    
    Counter(int value,int maxValue, String model){
        this.value = value;
        this.maxValue = maxValue >= 100_000 ? 100_000 : maxValue <= 1_000 ? 1_000 : maxValue;
        this.model = model;
    }
 
    Counter(){
        
    }
}
