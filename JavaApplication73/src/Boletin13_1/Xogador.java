package Boletin13_1;

/**
 *
 * @author clamascabaleiro
 */
public class Xogador extends Seleccion{
    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int id, String nome, String apelido, int idade, int dorsal, String demarcacion) {
        super.setId(id);
        super.setNome(nome);
        super.setApelido(apelido);
        super.setIdade(idade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    @Override
    public void viaxar(){
        System.out.println("viaxan os xogadores");
    }
    
    public void xogarPartido(){
       System.out.println("o xogador " + super.getNome() + " xoga");
    }
    
    public void entrenar(){
       System.out.println("o xogador " + super.getNome() + " entrena");
    }

    @Override
    public String toString() {
        return super.toString() + ", Xogador{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

}
