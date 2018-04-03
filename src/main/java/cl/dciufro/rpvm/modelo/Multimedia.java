package cl.dciufro.rpvm.modelo;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Multimedia implements Reproducible {

    private String titulo;
    private String autor;
    private String duracion;
    public Formato formato;

    public Multimedia(String titulo, String autor, String duracion, Formato formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + ", formato=" + formato + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.autor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Multimedia other = (Multimedia) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    public boolean validarDuracion() {
        Pattern pat = Pattern.compile("[0-9]{2}[:]{1}[0-9]{2}[:]{1}[0-9]{2}");
        Matcher mac = pat.matcher(duracion);
        return mac.matches();
    }

    public void reproducir(Multimedia aMult) {

    }
}
