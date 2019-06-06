package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */
//Constructor primario y constructor de la superclase Seleccion
class Adestrador(var idFederacion: Int, id: Int, nome: String, apelido: String, edade: Int) : Seleccion (id, nome, apelido, edade) {


    @Override
    fun viaxar() {
        System.out.println("viaxan os adestradores")
    }

    fun dirixirPartido() {
        System.out.println("o adestrador " + super.getNome() + " dirixe o partido")
    }

    fun dirixirAdestramento() {
        System.out.println("o adestrador " + super.getNome() + " dirixe o entrenamento")
    }

    @Override
    fun toString(): String {
        return super.toString() + ", Adestrador{" + "idFederacion=" + idFederacion + '}'.toString()
    }

}

