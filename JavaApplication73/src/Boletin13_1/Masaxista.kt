package Boletin13_1

/**
 *
 * @author clamascabaleiro
 */

//Constructor primario y constructor de la superclase Seleccion
class Masaxista(var titulacion: String, var anosExperiencia: Int, id: Int, nome: String, apelido: String, edade: Int) : Seleccion (id, nome, apelido, edade){


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
