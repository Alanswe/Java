package myutils;

public class Test {
    public static void main(String[] args) {
        
        Mes m = Mes.MAR;
        Mes m1 = Mes.FEB;
        Mes m2 = Mes.FEB;

        System.out.println(m.getNombreCompleto());
        System.out.println(m.getNumAsociado());
        System.out.println(m1 == m2);
        System.out.println(m == m1);
        System.out.println(m2.toString());
                
        System.out.println("=======================");

        Mes[] listadoMeses = Mes.values();
        
        for(Mes miMes : listadoMeses){
                System.out.println(miMes);       
        }
        
        System.out.println("=======================");
        
        for(int i = listadoMeses.length - 1; i >= 0 ; i--) { // - 1  para que sea al revés
            int numberOfDays = 0;
            
            switch(listadoMeses[i]) {
                case FEB: numberOfDays = 28;
                    break;
                case ABR: numberOfDays = 30; 
                    break;
                case JUN: numberOfDays = 30;  
                    break;
                case SEP: numberOfDays = 30;  
                    break;
                case NOV: numberOfDays = 30;  
                    break;
                default: numberOfDays = 31;
                    break;
            }
            
            System.out.printf("NumAsociado: %d, NombreMes: %s, numMes: %d %n",
                listadoMeses[i].getNumAsociado(), listadoMeses[i].getNombreCompleto(),
                numberOfDays);
        }
        
    }
}
