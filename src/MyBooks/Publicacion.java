package MyBooks;

public abstract class Publicacion implements CanRead{
    private String titulo;
    private String autor;
    private int numPags;
    private boolean formatoDigital;
    private double precio;
    private int ID;
    private int pagActual;
    private boolean leido;
    
    private static long nextID = 0;

    
    // constructor
    
    Publicacion(String titulo, String autor, int numPags, boolean formatoDigital, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
        this.formatoDigital = formatoDigital;
        this.precio = precio;
        this.ID = (int)nextID++; // suma 1 para el siguiente ID
    }
      
    // methods
    
    public String toString() {
        return "Publicación '" + titulo + "' con " + numPags + " páginas y precio " + precio + " €";
    }
    

    // interface
    
    
    public abstract void leePagina(boolean silenciosamente);
      
    
//    public static void leePaginaStatic(Publicacion p){
//        p.leePagina(true);
//    } 
//    
//    public void leePagina(boolean silenciosamente){
//        if (this instanceof Libro){
//            if (silenciosamente == true){
//                if (!(this.getPagActual() >= this.getNumPags())){
//                    int actual = this.getPagActual();
//                    int leer = ++actual;
//                    this.setPagActual(leer);
//                    System.out.printf("Página %d leída del libro titulado %s del" +
//                        " autor %s %n",this.getPagActual(),this.getTitulo(),this.getAutor());
//                } else if (this.getPagActual() == this.getNumPags()){
//                    System.out.printf("Libro titulado %s del autor %s ya ha sido leído %n"
//                            ,this.getTitulo(),this.getAutor());
//                } else {
//                    this.setLeido(true);
//                    System.out.printf("Ultima página %d leída del libro titulado %s del" +
//                        " autor %s %n",this.getPagActual(),this.getTitulo(),this.getAutor());
//                }     
//            } else {
//                if (!(this.getPagActual() >= this.getNumPags())){
//                    int actual = this.getPagActual();
//                    int leer = ++actual;
//                    this.setPagActual(leer);
//                } else if (this.getPagActual() == this.getNumPags()){
//                    System.out.printf("Libro titulado %s del autor %s ya ha sido leído %n"
//                            ,this.getTitulo(),this.getAutor());
//                } else {
//                    this.setLeido(true);
//                }           
//            }
//        } else {
//            if (silenciosamente == true){
//                if (!(this.getPagActual() >= this.getNumPags())){
//                    int actual = this.getPagActual();
//                    int leer = ++actual;
//                    this.setPagActual(leer);
//                    System.out.printf("Página (%d) leída de la revista titulada %s %n",
//                            this.getPagActual(),this.getTitulo());
//                }   else if (this.getPagActual() == this.getNumPags()){
//                    System.out.printf("Revista titulada %s ya ha sido leído %n"
//                            ,this.getTitulo());
//                } else {
//                    this.setLeido(true);
//                    System.out.printf("Ultima página (%d) leída de la revista titulada %s %n",
//                        this.getPagActual(),this.getTitulo());
//                }
//            } else {
//                if (!(this.getPagActual() >= this.getNumPags())){
//                    int actual = this.getPagActual();
//                    int leer = ++actual;
//                    this.setPagActual(leer);
//                } else if (this.getPagActual() == this.getNumPags()){
//                    System.out.printf("Revista titulada %s ya ha sido leído %n"
//                            ,this.getTitulo());
//                } else {
//                    this.setLeido(true);
//                }          
//            }
//        }
//    
//    };
    
// Setters

    public void setPagActual(int pagActual) {
        this.pagActual = pagActual;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }
    
    // Getters
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPags() {
        return numPags;
    }

    public boolean isFormatoDigital() {
        return formatoDigital;
    }

    public double getPrecio() {
        return precio;
    }

    public int getID() {
        return ID;
    }

    public int getPagActual() {
        return pagActual;
    }

    public boolean isLeido() {
        return leido;
    }

    public static long getNextID() {
        return nextID;
    }
   
    
}