package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */
class Adestrador(var idFederacion: String = "") : Seleccion {

    constructor(id: Int, nome: String, apelido: String, idade: Int, idFederacion: String) {
        super.setId(id)
        super.setNome(nome)
        super.setApelido(apelido)
        super.setIdade(idade)
        this.idFederacion = idFederacion
    }

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
