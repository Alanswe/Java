package ModuloDos;

public class repasoLunes { // par inpar 2,1,4,3,6,5...
    public static void main(String[] args) {
        int[] miArray = new int[10];
        int[] miArray2 = new int[10];

        
        for (int i = 0; i < 10; i++){
            miArray[i] = (i%2 == 0) ? i + 2 : i;
        }
        
        for (int i = 0; i < 10; i++){
            miArray2[i] = (i%2 == 0) ? 2 + i : i;
        }
        
        for (int num: miArray){
            System.out.print(num + " ");
        }System.out.println("");
        
        for (int num: miArray2){
            System.out.print(num + " ");
        }System.out.println("");

    }
}
