

package Boletin13_1;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin13_1 {

 
    public static void main(String[] args) {
       //
        Xogador xog1 = new Xogador(1, "Pedro", "Sánchez", 26, 7, "delantero");
        Seleccion xog2 = new Xogador(2, "Juan", "Martínez", 28, 2, "defensa");
        System.out.println(xog1.toString());
        System.out.println(xog2.toString());
        xog1.entrenar();
        xog1.viaxar();
        
    }
}
