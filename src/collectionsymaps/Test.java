package collectionsymaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    
    public static String[] devuelvePalabras(String cuento){
        return cuento.replace(",", "").replace(".", "")
                .replace("\n", " ").split(" ");  
    }
    
    static void arrayPalabras(String[] arr) {
        System.out.println("Array de palabras\n=================");
        for (String s : arr){
            System.out.print("[" + s + "]");
        }
        System.out.printf("%nLista original tiene %d palabra%s.%n",arr.length,arr.length == 1 ? "":"s");
    }
    
    static void arrayListPalabras(String[] arr) {
        System.out.println("ArrayList de palabras\n=================");
        List<String> miArrList = new ArrayList<>(Arrays.asList(arr));
        
        for (String s : arr){
            System.out.print("[" + s + "]");
        }
        System.out.printf("%nLista en ArrayList tiene %d palabra%s.%n",miArrList.size(),miArrList.size() == 1 ? "":"s");
    }
    
//    static void treeSetPalabras() {
//        set<String> miTreet
//    
//    }
//    
    
    
    static void mapConteoPalabras(String[] arr){
        System.out.println("Conteo de repeticiones de palabras\n=================");

        Map<String, Integer> miMap = new HashMap<>();
        for (String s : arr){
            Integer newValue = miMap.containsKey(s) ? miMap.get(s) + 1 : 1;
            System.out.println(miMap.put(s, newValue));
            
        }    
    }
    
    
    
    
    
    public static void main(String[] args) {
        String cuento = CuentaCuentos.cuentoZorro();
        System.out.println(cuento);System.out.println("");
        
        System.out.println(cuento.replace(",", "").replace(".", "")
                .replace("\n", " "));System.out.println("");
                
        String[] miArray = devuelvePalabras(cuento);
        for (String s : miArray){
            System.out.print(s + "|");
        } System.out.println("\n");       
                
        arrayPalabras(miArray);
        
        System.out.println("");
        
        arrayListPalabras(miArray);
        
        System.out.println("");
        
        mapConteoPalabras(miArray);
    }
}
