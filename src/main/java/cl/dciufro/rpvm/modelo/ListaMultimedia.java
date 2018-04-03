package cl.dciufro.rpvm.modelo;

import java.util.ArrayList;

public class ListaMultimedia {

    public ArrayList<Multimedia> multimedias;

    public ListaMultimedia() {
        this.multimedias = new ArrayList<>();
    }

    public int tamanoList() {
        return this.multimedias.size();
    }

    public boolean agregarList(Multimedia aMul) {
        if (!this.multimedias.contains(aMul)) {
            this.multimedias.add(aMul);
            return true;
        }
        return false;
    }

    public Multimedia obtenerObjeto(int aPos) {
        return this.multimedias.get(aPos);
    }

    public int obtenerIndice(Multimedia aMul) {
        return this.multimedias.indexOf(aMul);
    }

    @Override
    public String toString() {
        String cadena = "";
        for (Multimedia mul : this.multimedias) {
            cadena = cadena.concat("\n" + mul.toString());
        }
        return cadena;
    }
}
