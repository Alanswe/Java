
package mipaquete;

public class Test {
    public static void main(String[] args) throws Exception {
        PostIt a = new PostIt();
        PostIt b = new PostIt();
        PostIt c = new PostIt();
        PostIt d = new PostIt();

        a.color = "rosa";
        a.msg = "AA";
        a.alto = 60;
        a.ancho = 60;
        
        
        b.color = "verde";
        b.msg = "BB";
        b.alto = 30;
        b.ancho = 30;
        
        c.color = "rojo";
        c.msg = "CC";
        c.alto = 100;
        c.ancho = 100;
        
        d.color = "morado";
        d.msg = "DD";
        d.alto = 50;
        d.ancho = 50;
        
        System.out.printf("%nEl postit a tiene %d de alto y %d de ancho, con color %s y su mensaje es %s %n",a.alto,a.ancho,a.color,a.msg);
        System.out.printf("%nEl postit b tiene %d de alto y %d de ancho, con color %s y su mensaje es %s %n",b.alto,b.ancho,b.color,b.msg);
        System.out.printf("%nEl postit c tiene %d de alto y %d de ancho, con color %s y su mensaje es %s %n",c.alto,c.ancho,c.color,c.msg);
        System.out.printf("%nEl postit d tiene %d de alto y %d de ancho, con color %s y su mensaje es %s %n",d.alto,d.ancho,d.color,d.msg);
        
        // un array de objetos
        PostIt[] postIts = {a,b,c,d};
        
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------");
        
        for (PostIt p : postIts){
            System.out.printf("%nEl postit '%s' tiene de alto %d y de ancho %d ,su mensaje es '%s' %n",p.color,p.alto,p.ancho,p.msg);

        }
    }
}
