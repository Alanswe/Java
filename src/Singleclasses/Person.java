package Singleclasses;

import java.time.Period;
import java.time.LocalDate;

public class Person {
    
    // Propiedades
    
    short yearOfBirth = 2022;
    String name = ""; // máximo 20 caracteres.
    String surname = ""; // máximo 20 caracteres.
    boolean brokenName;
    boolean brokenSurname;
    
    // Constructores
    
    Person(String name, String surname){
    this.name = name;
    this.surname = surname;
    }
    
    Person(short yearOfBirth,String name, String surname){
    this.yearOfBirth = yearOfBirth;
    this.name = name;
    this.surname = surname;
    }
    
    Person(Person p){
    this.yearOfBirth = p.yearOfBirth;
    this.name = p.name;
    this.surname = p.surname;
    this.brokenName = p.brokenName;
    this.brokenSurname = p.brokenSurname;
    }
    
    // Métodos
    
    void show(){
        System.out.printf("Person %s %s de %d años.%n",this.name,this.surname,this.getAge()); // calcular la edad
    }
    
    
    boolean isBroken(){
        return this.brokenName||this.brokenSurname;
    }
    
    
    boolean changeName(String name, String surname){
        //if (name && surname)
        return false; // pass
    }
    
    short getAge(){
        
        return (short)(2022 - this.yearOfBirth);

    }
    
    boolean sameAge(Person p){
        if (this.yearOfBirth == p.yearOfBirth){
            return true;
        } else {
            return false;
            }
    }    
    
    boolean compareWith(Person p){
        if (this.yearOfBirth == p.yearOfBirth && 
                this.name == p.name &&
                this.surname == p.surname){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Person p1 = new Person((short)2000,"Pepe","Fernandez");
        Person p2 = new Person((short)1996,"María","Rodriguez");
        Person p3 = new Person((short)2000,"Juan","Fernandez");
        Person p4 = new Person((short)2000,"Pepe","Fernandez");
        Person p5 = new Person("Pepe","Segovia");

        System.out.println("Prueba show :");
        p5.show(); // (acaba de nacer)
        p1.show(); System.out.println("");
        
        System.out.println("Prueba isBroken: ");
        System.out.println(p1.isBroken());
        System.out.println("");
        
        System.out.println("Prueba changeName: ");
        System.out.println(p3.changeName("Juanito", "Fernandito"));
        System.out.println("");

        System.out.println("Prueba sameAge: ");
        System.out.println(p1.sameAge(p2)); // false
        System.out.println(p1.sameAge(p3)); // true
        System.out.println("");

        System.out.println("Prueba compareWith: ");
        System.out.println(p1.compareWith(p2)); // flase
        System.out.println(p1.compareWith(p4)); // true
        System.out.println("");

    }
    
}
