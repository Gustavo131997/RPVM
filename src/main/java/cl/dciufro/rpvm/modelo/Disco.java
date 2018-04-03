package cl.dciufro.rpvm.modelo;

public class Disco extends Multimedia {

    public Genero genero;

    public Disco(Genero genero, String titulo, String autor, String duracion, Formato formato) {
        super(titulo, autor, duracion, formato);
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "";
    }
}
