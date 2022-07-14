package universo;

public class Persona {
    private String nombre = "nombre no consta";
    private String primerApellido = "apellido1 no consta";
    private String segundoApellido = "apellido2 no consta";
    private int DNISinLetra;
    private char letraDNIMayusculas = ' ';
    private int anioNacimiento;
    private char genero = this.validaGenero(); // V o H o -;
    
    private int personaID; // se irá incrementando de uno en uno por cada nueva persona “instanciada”
    
    // Campos estáticos
    private static long nextPersonaID;
    // Se utilizará para saber cual es el próximo ID disponible.
    
    // Constructores
    
    Persona(String nombre, String primerApellido, String segundoApellido, char genero){
        this(nombre,primerApellido,segundoApellido,genero,2022,0,' ');
    }
    
    Persona(String nombre, String primerApellido, String segundoApellido, 
            char genero, int anioNacimiento, int DNISinLetra, char letraDNIMayusculas){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.genero = genero;
        this.anioNacimiento = anioNacimiento;
        this.DNISinLetra = DNISinLetra;
        this.letraDNIMayusculas = letraDNIMayusculas;
        this.personaID = (int)nextPersonaID++; // suma 1 para el siguiente ID
    }

    // Métodos
    
    String dniCompleto(){
        String numeroDniCompleto = (this.DNISinLetra == 0 || this.letraDNIMayusculas == ' ') ? 
                null: "" + this.DNISinLetra + this.letraDNIMayusculas;
        return numeroDniCompleto;
    }
    
    private char validaGenero(){
        char generoFinalValidado = (this.genero == ' ')? '-':(this.genero == 'V') ?
                'V':'H';
        return generoFinalValidado;
    }
    
    String sexo(){
        String generoFinal = (this.genero == '-')? "No Definido":(this.genero == 'V') ?
                "Varón":"Hembra";
        return generoFinal;
    }
    
    String nombreCompleto(){
        return "" + this.nombre + " " + this.primerApellido + " " + this.segundoApellido;
    }
    
    String show(){
        return "DATOS PERSONA\n" + 
                "=============\n" +
                "Nombre: "+ this.nombre +"\n" +
                "Apellidos: " + this.primerApellido + " " + this.segundoApellido + "\n" +
                "DNI: "+ this.dniCompleto() + "\n" +
                "Año de nacimiento: "+ this.anioNacimiento + "\n" +
                "Edad: " + this.calculaEdad() + "\n" +
                "Género: " + this.sexo();
    }
    
    public static String showStatic(Persona p){
        return p.show();
    }
    
    public int calculaEdad(){
        return 2022 - this.anioNacimiento;
    }
    
    // Métodos para test
    
    private static long getNextPersonaID() {
        return nextPersonaID;
    }
    
    // Gets para clase Planeta

    public int getPersonaID() {
        return personaID;
    }
    
    // MAIN
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe","Dominguez","Fernandez",'V');
        Persona p2 = new Persona("Antonia","Fernandez","Dominguez",'H',1996,04324567,'Y');
        Persona p3 = new Persona("Juana","Fernandez","Dominguez",'-');

        // Apartado 1
        System.out.println("Get ID");
        System.out.println("=======");
        System.out.println(p1.personaID);  
        System.out.println(p2.personaID);
        System.out.println(p2.getNextPersonaID());   
        System.out.println("");
        
        // Apartado 2
        
        System.out.println("Prueba DniCompleto:");
        System.out.println("==================");
        System.out.println(p1.dniCompleto());
        System.out.println(p2.dniCompleto());
        System.out.println("");
        
        System.out.println("Prueba sexo:");
        System.out.println("===========");

        System.out.println(p1.sexo());
        System.out.println(p2.sexo());
        System.out.println(p3.sexo());
        System.out.println("");
        
        System.out.println("Prueba nombreCompleto:");
        System.out.println("=====================");

        System.out.println(p1.nombreCompleto());
        System.out.println("");
        
        System.out.println("Prueba show:");
        System.out.println("============");

        System.out.println(p2.show());
        System.out.println("\n\n=== Estatico");
        System.out.println(p2.showStatic(p3));
        System.out.println("");

    }

}
