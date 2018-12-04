package Boletin13_1;

/**
 *
 * @author clamascabaleiro
 */
public class Masaxista extends Seleccion{
    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(int id, String nome, String apelido, int idade, String titulacion, int anosExperiencia) {
        super.setId(id);
        super.setNome(nome);
        super.setApelido(apelido);
        super.setIdade(idade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    @Override
    public void viaxar(){
        System.out.println("viaxan os masaxistas");
    }
    
    public void darMasaxes(){
       System.out.println("o masaxista " + super.getNome() + " da masaxes");
    }

    @Override
    public String toString() {
        return super.toString() + ", Masaxista{" + "titulacion=" + titulacion 
                + ", anosExperiencia=" + anosExperiencia + '}';
    }
}
