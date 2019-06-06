package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */
object Boletin13_1 {


    fun main(args: Array<String>) {

        5- Define a clase Boletin 13 cas seguintes sentencias :
        * instancia un obxecto de cada clase
        * instancia un xogador de tipo Seleccion
        * chama ao método concentrarse a través de cada obxecto. ¿ Que observas ?.
        * Invoca ao método viaxar a través de cada obxecto. ¿ Cal é a saida ?
        */

        //instancia un obxecto de cada clase
        val xogadorEx = Xogador(2, "delantero", 2, "Manolo", "Sanchez", 22)
        val entrenadorEx = Entrenador("E22", 3, "Jose", "Perez", 50)
        val maxasistaEx = Maxasista("Fisioterapeuta", 35, 25, "Juan", "Mar", 57)

        // instancia un xogador de tipo Seleccion
        val plantillaEx = Seleccion(1, "Pepe", "Alvarez", 20)
        // chama ao método concentrarse a través de cada obxecto. ¿ Que observas ?.
        //como el metodo no está sobre escrito, siempre sale el mismo mensaje

        //		Viaxa a selección
        //
        //                Viaxan os xogadores
        //
        //                Viaxa o entrenador
        //
        //                Viaxan os maxaxistas
        plantillaEx.concentrarse()
        xogadorEx.concentrarse()
        entrenadorEx.concentrarse()
        maxasistaEx.concentrarse()

        //Invoca ao método viaxar a través de cada obxecto. ¿ Cal é a saida ?
        // como el metodo está sobre escrito salen mensajes especificos para
        //cada clase
        plantillaEx.viaxar()
        xogadorEx.viaxar()
        entrenadorEx.viaxar()
        maxasistaEx.viaxar()

    }
    }

