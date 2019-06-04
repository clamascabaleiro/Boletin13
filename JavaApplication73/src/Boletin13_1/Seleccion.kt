package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */
class Seleccion(var id : Int = 0, var nome : String = "", var apelido : String = "", var idade : Int = 0 ) {

    fun concentrarse() {
        System.out.println("concentrase a selección")
    }

    fun viaxar() {
        System.out.println("viaxa a selección")
    }

    @Override
    fun toString(): String {
        return "Seleccion{id=$id, nome=$nome, apelido=$apelido, idade=$idade}"
    }
}
