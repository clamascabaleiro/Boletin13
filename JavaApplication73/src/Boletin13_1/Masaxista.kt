package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */
class Masaxista(var titulacion: String = "", var anosExperiencia: Int = 0) : Seleccion {

    constructor(id: Int, nome: String, apelido: String, idade: Int, titulacion: String, anosExperiencia: Int) {
        super.setId(id)
        super.setNome(nome)
        super.setApelido(apelido)
        super.setIdade(idade)
        this.titulacion = titulacion
        this.anosExperiencia = anosExperiencia
    }

    @Override
    fun viaxar() {
        System.out.println("viaxan os masaxistas")
    }

    fun darMasaxes() {
        System.out.println("o masaxista " + super.getNome() + " da masaxes")
    }

    @Override
    fun toString(): String {
        return (super.toString() + ", Masaxista{" + "titulacion=" + titulacion
                + ", anosExperiencia=" + anosExperiencia + '}'.toString())
    }
}
