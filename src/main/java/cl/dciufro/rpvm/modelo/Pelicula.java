package cl.dciufro.rpvm.modelo;

public class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;

    public Pelicula(String actorPrincipal, String actrizPrincipal, String titulo, String autor, String duracion, Formato formato) {
        super(titulo, autor, duracion, formato);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public Pelicula(String titulo, String autor, Formato formato, String duracion, String actorPrincipal) {
        super(titulo, autor, duracion, formato);
        this.actorPrincipal = actorPrincipal;
    }

    public Pelicula(String titulo, String autor, String duracion, Formato formato, String actrizPrincipal) {
        super(titulo, autor, duracion, formato);
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return this.actorPrincipal;
    }

    public void setActorPrincipal(String aActorPrincipal) {
        this.actorPrincipal = aActorPrincipal;
    }

    public String getActrizPrincipal() {
        return this.actrizPrincipal;
    }

    public void setActrizPrincipal(String aActrizPrincipal) {
        this.actrizPrincipal = aActrizPrincipal;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void reproducir(Multimedia aMult) {

    }

}
