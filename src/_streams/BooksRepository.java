package _streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooksRepository {

    private List<Book> books = new ArrayList<>();

    public BooksRepository() {
        generateDefaultData();
    }

    private void generateDefaultData() {
        books = Arrays.asList(
                
                new Book("La gitanilla", "Miguel de Cervantes Saavedra", 21.0),
                new Book("El ingenioso hidalgo Don Quijote de La Mancha", "Miguel de Cervantes Saavedra", 17.0),
                new Book("Rinconete y Cortadillo", "Miguel de Cervantes Saavedra", 10.0),
                new Book("El coloquio de los perros", "Miguel de Cervantes Saavedra", 15.0),
                new Book("El celoso extremeño", "Miguel de Cervantes Saavedra", 2.99),
                new Book("La ilustre fregona", "Miguel de Cervantes Saavedra", 10.35),
                new Book("Viaje del Parnaso", "Miguel de Cervantes Saavedra", 20.00),
                new Book("Los trabajos de Persiles y Sigismunda", "Miguel de Cervantes Saavedra", 17.15), 
                
                new Book("La hojarasca", "Gabriel García Márquez", 32.20),
                new Book("El coronel no tiene quien le escriba", "Gabriel García Márquez", 15.7),
                new Book("La mala hora", "Gabriel García Márquez", 12.23),
                new Book("Cien años de soledad", "Gabriel García Márquez", 12.75),
                new Book("El otoño del patriarca", "Gabriel García Márquez", 13.35),
                new Book("Crónica de una muerte anunciada", "Gabriel García Márquez", 10.00),
                new Book("El amor en los tiempos del cólera", "Gabriel García Márquez", 17.00),
                new Book("El general en su laberinto", "Gabriel García Márquez", 11.14), 
                new Book("Del amor y otros demonios", "Gabriel García Márquez", 14.15), 
                new Book("Memoria de mis putas tristes", "Gabriel García Márquez", 19.99),
                
                new Book("El maestro de esgrima", "Arturo Pérez Reverte", 11.0),
                new Book("La tabla de Flandes", "Arturo Pérez Reverte", 15.0),
                new Book("El club Dumas", "Arturo Pérez Reverte", 22.99),
                new Book("La sombra del águila", "Arturo Pérez Reverte", 17.15),
                new Book("La piel del tambor", "Arturo Pérez Reverte", 13.35),
                new Book("La carta esférica", "Arturo Pérez Reverte", 11.00),
                new Book("La Reina del Sur", "Arturo Pérez Reverte", 17.50),
                new Book("El pintor de batallas", "Arturo Pérez Reverte", 9.5), 
                new Book("El tango de la guardia vieja", "Arturo Pérez Reverte", 13.55), 
                new Book("Un día de cólera", "Arturo Pérez Reverte", 11.22),
                
                new Book("La arcadia", "Lope de Vega", 30.00),
                new Book("El peregrino en su patria", "Lope de Vega", 13.75),
                new Book("Pastores de Belén", "Lope de Vega", 10.00),
                new Book("La Dorotea", "Lope de Vega", 20.00),
                new Book("La discreta enamorada", "Lope de Vega", 1.35),
                new Book("La dama boba", "Lope de Vega", 21.3)
            );
    }

    public List<Book> getBooks() {
        return books;
    }
}
