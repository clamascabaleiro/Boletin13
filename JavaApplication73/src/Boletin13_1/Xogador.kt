package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */
//Constructor primario y constructor de la superclase Seleccion
class Xogador(var dorsal: Int , var demarcacion: String ,id: Int, nome: String, apelido: String, edade: Int) : Seleccion(id, nome, apelido, edade) {

    init{

    }

    @Override
    fun viaxar() {
        System.out.println("viaxan os xogadores")
    }

    fun xogarPartido() {
        System.out.println("o xogador " + super.getNome() + " xoga")
    }

    fun entrenar() {
        System.out.println("o xogador " + super.getNome() + " entrena")
    }

    @Override
    fun toString(): String {
        return super.toString() + ", Xogador{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}'.toString()
    }

}
