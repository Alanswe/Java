package _streams;

import java.text.DecimalFormat;
import java.util.Optional;


public class BooksManagement {
    
    private static void p(String s){
        String result = "\n" + s + "\n";
        for (int i = 0; i < s.length(); i++)
            result += "=";
        result += "\n";
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        
        p("- 5 primeros libros de la lista de libros");
        new BooksRepository().getBooks().stream()
                .limit(5)
                .forEach(System.out :: println); // :: viene a ser s -> System.out.println(s)

        p("- 5 libros de menor precio");
        new BooksRepository().getBooks().stream()
                .sorted((l1, l2) -> l1.getPrice() > l2.getPrice() ? 1 : -1)
                .limit(5)
                .forEach(System.out :: println);
        
        p("- 5 libros de mayor precio");
        new BooksRepository().getBooks().stream()
                .sorted((l1, l2) -> l1.getPrice() > l2.getPrice() ? -1 : 1)
                .limit(10)
                .forEach(System.out :: println);
        
        p("- 10 Libros de mayor precio, pero excluyendo los 5 más caros");
        new BooksRepository().getBooks().stream()
                .sorted((l1, l2) -> l1.getPrice() > l2.getPrice() ? -1 : 1)
                .skip(5)
                .limit(10)
                .forEach(System.out :: println);
        
        p("- Lista de autores únicos ordenados alfabeticamente");
        new BooksRepository().getBooks().stream()
                .map(l -> l.getAuthor())
                .distinct()
                .sorted()
                .forEach(System.out::println);
        
        long value = new BooksRepository().getBooks().stream()
                .filter(l -> l.getAuthor().contains("Cervantes"))
                .count();
        p("- Hay " + value + " libros de Cervantes");
        
        double value2  = new BooksRepository().getBooks().stream()
                .filter(l -> l.getAuthor().contains("Cervantes"))
                .map(l -> l.getPrice())
                .reduce(0.0, (x, y) -> x + y);
        DecimalFormat dosDecimales = new DecimalFormat("#.00");
        p("- El precio sumado de los libros de Cervantes es " 
                + dosDecimales.format(value2) + " €");        
        
        
        p("- Listado de autores únicos ordenados por logitud de su nombre");
        new BooksRepository().getBooks().stream()
                .map(b -> b.getAuthor())
                .distinct()
                .sorted(((b1, b2) -> b1.length() - b2.length()))
                .forEach(System.out :: println);

        p("- Listado de autores únicos ordenados por logitud inversa de su nombre");
        new BooksRepository().getBooks().stream()
                .map(b -> b.getAuthor())
                .distinct()
                .sorted(((b1, b2) -> b2.length() - b1.length()))
                .forEach(System.out :: println);
        
        p("- Listado de precios con 2 decimales: ordenado numéricamente sin repeticiones");
        new BooksRepository().getBooks().stream()
                .map(b -> b.getPrice())
                .sorted()
                .forEach(s -> System.out.println(dosDecimales.format(s)));
        
        p("- El libro más barato");
        Optional<Book> opt1 = new BooksRepository().getBooks().stream()
                .sorted((b1, b2) -> (int)(b1.getPrice() - b2.getPrice()))
                .findFirst();
        Book book1 = opt1.get();
        
        System.out.println(book1);     
        
        p("- El libro más caro");
        
        Optional<Book> opt2 = new BooksRepository().getBooks().stream()
                .sorted((b1, b2) -> (int)(-b1.getPrice() + b2.getPrice()))
                .findFirst();
        
        System.out.println(opt2.get()); 
        
        p("- Un libro cualquiera");

        Optional<Book> opt3 = new BooksRepository().getBooks().stream()
                .findAny();
        
        System.out.println(opt3.get()); 
        
        p("- Total de libros");

        System.out.println(new BooksRepository().getBooks().stream().count());
        
        p("- Total libros de Cervantes");
        
        System.out.println(new BooksRepository().getBooks().stream()
                .filter(b -> b.getAuthor().contains("Cervantes"))
                .count());
        
        p("- Existen libros de Cervantes de precio mayor de 19 €");
        System.out.println(    
            new BooksRepository().getBooks().stream()
                    .anyMatch(b -> b.getPrice() > 19 && b.getAuthor().contains("Cervantes"))
        );
        
        p("- Todos los libros de Cervantes tienen o no precio mayor de 10 €");
        System.out.println(    
            new BooksRepository().getBooks().stream()
                    .filter(b -> b.getAuthor().contains("Cervantes"))
                    .allMatch(b -> b.getPrice() > 10)
        );     
        
        p("- Ningún libro es de Cervantes");
        System.out.println(    
            new BooksRepository().getBooks().stream()
                    .noneMatch(b -> b.getAuthor().contains("Cervantes"))
        );   
        
        p("- Libro de máximo precio de los libros de Reverte");
        System.out.println(    
            new BooksRepository().getBooks().stream()
                .filter(b -> b.getAuthor().contains("Reverte"))
                .max((b1, b2) -> b1.getPrice() > b2.getPrice() ? 1 : -1).get()
        );
        
        p("- Libro de mínimo precio de los libros de Reverte");
        System.out.println(    
            new BooksRepository().getBooks().stream()
                .filter(b -> b.getAuthor().contains("Reverte"))
                .min((b1, b2) -> b1.getPrice() > b2.getPrice() ? 1 : -1).get()
        );
        
        p("- (OJO)Libros de Cervantes: listado títulos y listado títulos en mayúsculas y precio más IVA");
        new BooksRepository().getBooks().stream()
                .filter(b -> b.getAuthor().contains("Cervantes"))
                .peek(b -> System.out.println(b.getTitle()))
                .forEach(b -> System.out.println(b.getTitle().toUpperCase() + " " + dosDecimales.format(b.getPrice() * 1.10) + " €"));

        p("- Precio total de todos los libros");
        System.out.println(
            new BooksRepository().getBooks().stream()
                .map(b -> b.getPrice())
                .reduce((a, b) -> a + b)
                .get()
        );    

        p("Puesta a 0 de todos los precios");
        new BooksRepository().getBooks().stream()
                .peek(b -> b.setPrice(0))
                .forEach(System.out :: println);
        
        System.out.println();
        
    }
}
