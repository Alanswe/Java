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
    
    Counter(){
    
    }
    
}
