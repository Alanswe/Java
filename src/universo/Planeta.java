package universo;

public class Planeta {
    public static void main(String[] args) {
        Persona p1 = new Persona("María","Pérez","Gómez",'H');
        Persona p2 = new Persona("Pedro","Gutiérrez","Pérez",'V');
        Persona p3 = new Persona("Antonio","Domínguez","Antúnez",'V');
        Persona p4 = new Persona("Javier","Luque","Porras",'V');
        Persona p5 = new Persona("Luisa","Mínguez","Mora",'H');
        
        // b
        Persona p6 = new Persona("José","Mora","Larios",'V',2003,93849228,'M');
        Persona p7 = new Persona("Rocío","Pérez","Pérez",'H',1967,94329532,'J');
        Persona p8 = new Persona("Pilar","Laguna","López",'H',1999,83453624,'K');
        Persona p9 = new Persona("David","Ravina","Díez",'V',1945,76532345,'A');
        Persona p10 = new Persona("Juan","Lechuga","Montes",'V',2012,98432232,'Z');
        
        Persona[] personas = {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
       
        // Apartado 3
       
        // D
        System.out.println("Listados de personas A:");
        System.out.println("====================");
        
        for (Persona objetoPersona : personas){
            System.out.println("ID : " + objetoPersona.getPersonaID() 
                + ", Nombre: " + objetoPersona.nombreCompleto() + ", DNI: " +
                objetoPersona.dniCompleto());
        }        
        System.out.println("");

        System.out.println("Listados de personas B:");
        System.out.println("====================");
        
        for (Persona objetoPersona : personas){
            if (objetoPersona.calculaEdad() >= 18) {
                System.out.println("Nombre: " + objetoPersona.nombreCompleto() +
                        ", Edad: " + objetoPersona.calculaEdad());
            }       
        }                
        
        System.out.println("");        
        System.out.println("Verificación de lectura");
        System.out.println("====================");
        System.out.println(personas[7].show());

    }
    
}
