package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */
object Boletin13_1 {


    fun main(args: Array<String>) {

        val xog1 = Xogador(1, "Pedro", "Sánchez", 26, 7, "delantero")
        val xog2 = Xogador(2, "Juan", "Martínez", 28, 2, "defensa")
        System.out.println(xog1.toString())
        System.out.println(xog2.toString())
        xog1.entrenar()
        xog1.viaxar()

    }
}
