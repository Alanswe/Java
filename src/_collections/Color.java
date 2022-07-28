package _collections;
public enum Color {
    RO("rojo"), NA("naranja"), AM("amarillo"), 
		VE("verde"), AZ("azul"), IN("indigo"), VI("violeta");
    
    String name;
    
    private Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}