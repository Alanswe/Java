package figuras;

public class Figuras {
        
    public static boolean mismoTipo(Figura... figs){
        if (figs.length == 0) return false;

        String clasePrimera = figs[0].getClass().getName();
        for (Figura fig : figs){
            if (!fig.getClass().getName().equals(clasePrimera)){
                return false;
            }  
        }
        return true;
    }
    
    public static boolean mayorArea(Figura F1,Figura F2){
        return F1.area() > F2.area();
    }
    
}
