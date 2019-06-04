package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */
class Xogador : Seleccion {
    var dorsal: Int = 0
    var demarcacion: String? = ""

    constructor() {}

    constructor(id: Int, nome: String, apelido: String, idade: Int, dorsal: Int, demarcacion: String) {
        super.setId(id)
        super.setNome(nome)
        super.setApelido(apelido)
        super.setIdade(idade)
        this.dorsal = dorsal
        this.demarcacion = demarcacion
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
