package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */
class Seleccion {

    var id: Int = 0
    var nome: String? = ""
    var apelido: String? = ""
    var idade: Int = 0

    constructor() {}

    constructor(id: Int, nome: String, apelido: String, idade: Int) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.idade = idade
    }

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
