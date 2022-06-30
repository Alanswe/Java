public class bloque_6_switch {
    public static void main(String[] args) {
    
    /*  1 Crea un programa que dado el valor de una variable numérica entre 1 y 12 imprima el valor textual del mes con el que corresponde, en caso de que el número no sea ninguno de ellos imprimirá no entiendo.
            1. Hazlo primero utilizando sentencias if - else
            2. Hazlo a continuación utilizando sentencia switch
    */
    
    // 1.1
    int num_mes = 8;
    
    if (num_mes == 1){
        System.out.println("Enero");
    } else if (num_mes == 2){
        System.out.println("Febrero");
    }else if (num_mes == 3){
        System.out.println("Marzo");
    }else if (num_mes == 4){
        System.out.println("Abril");
    }else if (num_mes == 5){
        System.out.println("Mayo");
    }else if (num_mes == 6){
        System.out.println("Junio");
    }else if (num_mes == 7){
        System.out.println("Julio");
    }else if (num_mes == 8){
        System.out.println("Agosto");
    }else if (num_mes == 9){
        System.out.println("Septiembre");
    }else if (num_mes == 10){
        System.out.println("Octubre");
    }else if (num_mes == 11){
        System.out.println("Noviembre");
    }else if (num_mes == 12){
        System.out.println("Diciembre");
    }else {
        System.out.println("no entiendo");
    }

    // 1.2
    switch (num_mes) {
        case 1: 
        System.out.println("Enero");
        break;
        case 2: 
        System.out.println("Febrero");
        break;
        case 3: 
        System.out.println("Marzo");
        break;
        case 4: 
        System.out.println("Abril");
        break;
        case 5: 
        System.out.println("Mayo");
        break;
        case 6: 
        System.out.println("Junio");
        break;
        case 7: 
        System.out.println("Julio");
        break;
        case 8: 
        System.out.println("Agosto");
        break;
        case 9: 
        System.out.println("Septiembre");
        break;
        case 10: 
        System.out.println("Octubre");
        break;
        case 11: 
        System.out.println("Noviembre");
        break;
        case 12: 
        System.out.println("Diciembre");
        break;
        default:
        System.out.println("no entiendo");
    }
    

    // Alternativa 
    String[] array_meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    if (num_mes > 12){
        System.out.println("no entiendo");
    } else{
        System.out.println(array_meses[num_mes-1]);
    }

    // Alternativa ternario 
    // usa el array_meses
    String solucion = num_mes > 12 ? "no entiendo" : num_mes-1;
    System.out.println(solucion);


    /* 
    2 2. Crea otro programa que dado el valor de una variable texto con el valor de un nombre de mes imprima el valor del mes con el que corresponde, en caso de que el valor no coincida imprimirá un 0 (debe estar escrito con la primera y mayúsculas y resto en minúsculas).
    1. Hazlo primero utilizando sentencias if - else
    2. Hazlo a continuación utilizando sentencia  switch
    */ 

    // 1.1
    String text_mes = "Junio";
    
    if (text_mes == "Enero"){
        System.out.println(1);
    } else if (text_mes == "Febrero"){
        System.out.println(2);
    }else if (text_mes == "Marzo"){
        System.out.println(3);
    }else if (text_mes == "Abril"){
        System.out.println(4);
    }else if (text_mes == "Mayo"){
        System.out.println(5);
    }else if (text_mes == "Junio"){
        System.out.println(6);
    }else if (text_mes == "Julio"){
        System.out.println(7);
    }else if (text_mes == "Agosto"){
        System.out.println(8);
    }else if (text_mes == "Septiembre"){
        System.out.println(9);
    }else if (text_mes == "Octubre"){
        System.out.println(10);
    }else if (text_mes == "Noviembre"){
        System.out.println(11);
    }else if (text_mes == "Diciembre"){
        System.out.println(12);
    }else {
        System.out.println("no entiendo");
    }

    // 1.2
    switch (text_mes) {
        case "Enero": 
        System.out.println(1);
        break;
        case "Febrero": 
        System.out.println(2);
        break;
        case "Marzo": 
        System.out.println(3);
        break;
        case "Abril": 
        System.out.println(4);
        break;
        case "Mayo": 
        System.out.println(5);
        break;
        case "Junio": 
        System.out.println(6);
        break;
        case "Julio": 
        System.out.println(7);
        break;
        case "Agosto": 
        System.out.println(8);
        break;
        case "Septiembre": 
        System.out.println(9);
        break;
        case "Octubre": 
        System.out.println(10);
        break;
        case "Noviembre": 
        System.out.println(11);
        break;
        case "Diciembre": 
        System.out.println(12);
        break;
        default:
        System.out.println("no entiendo");
    }


    }
}
