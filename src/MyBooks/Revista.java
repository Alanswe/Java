package MyBooks;

public class Revista extends Publicacion{

    private int pagInicial;
   
    // 
    
    private static final String mensajeCaabecera = "\nDATOS REVISTA\n==========\n";
    
    // construcutor
    
    Revista(String titulo, String autor, int numPags, boolean formatoDigital, double precio){
        super(titulo, autor, numPags, formatoDigital, precio);
        this.pagInicial = 0;
    }
    
    public void mensajeCabecera(){
        System.out.printf("%sTítulo: %s%nId: %d%nPáginas: %d%n"
                + "PáginaActual: %d%nPrecio: %.2f%n"
                + "Formato digital: %b%nLeído: %b%n",mensajeCaabecera,this.getTitulo()
                ,this.getID(),this.getNumPags(),this.getPagActual(),this.getPrecio(),
                this.isFormatoDigital(),this.isLeido());
    }
    
    public static void showStatic(Revista r){
        r.mensajeCabecera();
    } 

    @Override
    public void leePagina(boolean silenciosamente) {
        if (silenciosamente == true){
            if (!(this.getPagActual() >= this.getNumPags())){
                int actual = this.getPagActual();
                int leer = ++actual;
                this.setPagActual(leer);
                System.out.printf("Página (%d) leída de la revista titulada %s %n",
                        this.getPagActual(),this.getTitulo());
            }   else if (this.getPagActual() == this.getNumPags()){
                System.out.printf("Revista titulada %s ya ha sido leído %n"
                        ,this.getTitulo());
            } else {
                this.setLeido(true);
                System.out.printf("Ultima página (%d) leída de la revista titulada %s %n",
                    this.getPagActual(),this.getTitulo());
            }
        } else {
            if (!(this.getPagActual() >= this.getNumPags())){
                int actual = this.getPagActual();
                int leer = ++actual;
                this.setPagActual(leer);
            } else if (this.getPagActual() == this.getNumPags()){
                System.out.printf("Revista titulada %s ya ha sido leído %n"
                        ,this.getTitulo());
            } else {
                this.setLeido(true);
            }          
        }
    }
    
    public static void leePaginaStatic(Revista r){
        r.leePagina(true);
    } 
}