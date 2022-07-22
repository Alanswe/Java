package MyBooks;

public class Libro extends Publicacion{
    
    private int pagInicial;

    // static
    
    private static final String mensajeCaabecera = "\nDATOS LIBRO\n==========\n";
    
    // construcutor
    
    Libro(String titulo, String autor, int numPags, int pagInicial, 
            boolean formatoDigital, double precio){
        super(titulo, autor, numPags, formatoDigital, precio);
        this.pagInicial = pagInicial;
    }  
    
    // Methods
    
    public void mensajeCabecera(){
        System.out.printf("%sTítulo: %s%nAutor: %s%nId: %d%nPáginas: %d%n"
                + "Página inicial: %d%nPáginaActual: %d%nPrecio: %.2f%n"
                + "Formato digital: %b%nLeído: %b%n",mensajeCaabecera,this.getTitulo()
                ,this.getAutor(),this.getID(),this.getNumPags(),this.pagInicial,
                this.getPagActual(),this.getPrecio(),this.isFormatoDigital(),
                this.isLeido());
    }
    
    public static void showStatic(Libro L){
        L.mensajeCabecera();
    } 

    @Override
    public void leePagina(boolean silenciosamente) {
        if (silenciosamente == true){
            if (!(this.getPagActual() >= this.getNumPags())){
                int actual = this.getPagActual();
                int leer = ++actual;
                this.setPagActual(leer);
                System.out.printf("Página %d leída del libro titulado %s del" +
                    " autor %s %n",this.getPagActual(),this.getTitulo(),this.getAutor());
            } else if (this.getPagActual() == this.getNumPags()){
                System.out.printf("Libro titulado %s del autor %s ya ha sido leído %n"
                        ,this.getTitulo(),this.getAutor());
            } else {
                this.setLeido(true);
                System.out.printf("Ultima página %d leída del libro titulado %s del" +
                    " autor %s %n",this.getPagActual(),this.getTitulo(),this.getAutor());
            }     
        } else {
            if (!(this.getPagActual() >= this.getNumPags())){
                int actual = this.getPagActual();
                int leer = ++actual;
                this.setPagActual(leer);
            } else if (this.getPagActual() == this.getNumPags()){
                System.out.printf("Libro titulado %s del autor %s ya ha sido leído %n"
                        ,this.getTitulo(),this.getAutor());
            } else {
                this.setLeido(true);
            }           
        }
    }
    
    public static void leePaginaStatic(Libro L){
        L.leePagina(true);
    } 

}