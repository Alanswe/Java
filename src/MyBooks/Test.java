package MyBooks;

public class Test {
    public static void main(String[] args) {
        
        Libro L1 = new Libro("Cien años de soledad", "Gabriel García Marquez", 735, 3, false, 20.99);
        Libro L2 = new Libro("Cien años de soledad", "Gabriel García Marquez", 4, 3, false, 20.99);
        Revista r1 = new Revista("Muy Interesante", " ", 127, false, 3.5);
        
        System.out.println("================================");
        System.out.println(L1);
        System.out.println(r1);
        
        System.out.println("================================");
        L1.mensajeCabecera();
        r1.mensajeCabecera();
        
        System.out.println("================================");
        System.out.println(L2.isLeido());
        L2.leePagina(false);
        L2.leePagina(true);
        L2.leePagina(true);
        L2.leePagina(true);
        L2.leePagina(true);
        L2.leePagina(true);
        L2.leePagina(true);

        System.out.println(L2.isLeido());

        System.out.println("================================================================");
        
        Libro L3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
        Libro L4 = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
        Libro L5 = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
        Libro L6 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
        Libro L7 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
        Libro L8 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
        Libro L9 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
        Libro L10 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
        Libro L11 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
        Libro L12 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);
        Revista r2 = new Revista("Muy Interesante", " ", 127, true, 3.5);
        Revista r3 = new Revista("Muy POCO Interesante", " ", 227, false, 3);
        Revista r4 = new Revista("Nada Interesante", " ", 27, false, 1);
        Revista r5 = new Revista("Un poco Interesante", " ", 97, false, 2);
        Revista r6 = new Revista("Muy Entretenida", " ", 327, true, 4.99);

//        Libro[] libros = {L3,L4,L5,L6,L7,L8,L9,L10};
//        Revista[] revistas = {r2,r3,r4,r5,r6};

        Publicacion[] publicaciones = {L3,L4,L5,L6,L7,L8,L9,L10,r2,r3,r4,r5,r6};              
        
        System.out.println("Todas las publicaciones del array publicaciones con título y ID.");

        for (Publicacion publ : publicaciones){
            System.out.println("Título: " + publ.getTitulo() + " ID: " + publ.getID());
        }
        
        System.out.println("================================");
        System.out.println("Solo libros del array publicaciones");
        for (Publicacion publ : publicaciones){
            if (publ instanceof Libro){
                System.out.println("Título: " + publ.getTitulo() + " ID: " + publ.getID());
            }
        }
        
        System.out.println("================================");
        System.out.println("Solo revistas");

        for (Publicacion publ : publicaciones){
            if (publ instanceof Revista){
                System.out.println("Título: " + publ.getTitulo() + " ID: " + publ.getID());
            }
        }
        
        System.out.println("================================");
        System.out.println("Todas las publicaciones del array publicaciones con ID, título y\n" +
            "precio pero filtrando aquellas que tienen un precio mayor de 20 euros");
        
        for (Publicacion publ : publicaciones){
            if (publ.getPrecio() >= 20){
                System.out.println("Título: " + publ.getTitulo() + " ID: " +
                        publ.getID() + " Precio: " + publ.getPrecio());
            }
        }
        
        System.out.println("================================");
        System.out.println("Solo libros que tienen un precio mayor de 20 euros");
        
        for (Publicacion publ : publicaciones){
            if (publ instanceof Libro){
                if (publ.getPrecio() >= 20){
                    System.out.println("Título: " + publ.getTitulo() + " ID: " +
                            publ.getID() + " Precio: " + publ.getPrecio());
                }
            }
        }
        
        System.out.println("================================");
        System.out.println("Solo revistas que tienen un precio mayor de 20 euros");
        
        for (Publicacion publ : publicaciones){
            if (publ instanceof Revista){
                if (publ.getPrecio() >= 3){
                    System.out.println("Título: " + publ.getTitulo() + " ID: " +
                            publ.getID() + " Precio: " + publ.getPrecio());
                }
            }
        }
        
        System.out.println("================================");
        
        System.out.println(publicaciones[7].toString()); // L10

        for (int i = 0; i < 304; i++){
            publicaciones[7].leePagina(false);
        } 

        System.out.println("despues");
        System.out.println(publicaciones[7].getPagActual());
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        System.out.println(publicaciones[7].getPagActual());
        System.out.println("================================");
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        publicaciones[7].leePagina(true);
        System.out.println(publicaciones[7].getPagActual());

        for (int i = 0; i < 82; i++){ // simplente se cambia el 82 por 1000
            publicaciones[7].leePagina(false);
        } 
        System.out.println(publicaciones[7].getPagActual());
   
    }
}