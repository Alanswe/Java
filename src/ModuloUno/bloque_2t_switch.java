public class bloque_2t_switch {
    public static void main(String[] args) throws Exception {
    
        int a = 1;
        switch (a) {
                case 0: 
                System.out.println(0);
                break;
                case 1: 
                System.out.println(1);
                break;
                case 2: 
                System.out.println(2);
                break;
                default: // el default puede estar en cualquier orden
                    System.out.println(10);
        }
    }
}
