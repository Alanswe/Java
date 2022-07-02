public class bloque_5_ejercicio_4_2 {
    public static void main(String[] args) throws Exception {
        char c1 = 'g';
        char c2 = 'f';
        char c3 = (char)((c1+c2)/2);
        char cmax = c1>c2?c1:c2;
        char cmin = c1>c2?c2:c1;
        
        if(c1>'z'|| c1<'a'||c2>'z'|| c2<'a'){    
            System.out.println(
                "Alguna de las letras no es del alfabeto inglés en minúsculas.");
        
        } else if(c1==c2){
            System.out.println(
                "Las dos letras introducidas son la "+c1+".");
            
        }else if((cmax-cmin)==1){
            System.out.println(
                "Entre la letra "+ cmin +" y "+cmax+" no hay letra.");
            
        }else{
            System.out.println(
                "Entre la letra "+ cmin +" y "+cmax+" está la mitad la letra "+c3+".");
        }
    }
}
