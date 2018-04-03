package cl.dciufro.rpvm.lanzador;

import cl.dciufro.rpvm.modelo.ListaMultimedia;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

public class RPVM_main {

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        ListaMultimedia listaMultimedia = new ListaMultimedia();
        System.out.println("1. Agregar Cancion");
        switch (leer().next()) {
            case "1":
                JFileChooser filechooser = new JFileChooser();
                int f = filechooser.showOpenDialog(filechooser);
                if (f == JFileChooser.APPROVE_OPTION) {
                    File file = filechooser.getSelectedFile();

                    try {
                        AudioFile g = AudioFileIO.read(file);
                        Tag tag = g.getTag();
                        String artist = tag.getFirst(FieldKey.ARTIST);
                        String album = tag.getFirst(FieldKey.ALBUM);
                        String title = tag.getFirst(FieldKey.TITLE);
                        String comment = tag.getFirst(FieldKey.COMMENT);
                        String year = tag.getFirst(FieldKey.YEAR);
                        String track = tag.getFirst(FieldKey.TRACK);
                        String disc_no = tag.getFirst(FieldKey.DISC_NO);
                        String composer = tag.getFirst(FieldKey.COMPOSER);
                        String artist_sort = tag.getFirst(FieldKey.ARTIST_SORT);
                        System.out.println(artist+" ; "+album+" , "+title+" , "+comment+" , "+year+" , "+track+" , "+disc_no+" , "+composer+" , "+artist_sort);
                    } catch (Exception ex) {

                    }

                    try {
                        BasicPlayer basicPlayer = new BasicPlayer();
                        basicPlayer.open(file);
                        basicPlayer.play();
                    } catch (BasicPlayerException ex) {
                        System.out.println(ex.getMessage());
                    }
                } else {
                    System.out.println("Save command cancelled by user.");
                }
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }
    }

    public static Scanner leer() {
        return new Scanner(System.in);
    }

}
