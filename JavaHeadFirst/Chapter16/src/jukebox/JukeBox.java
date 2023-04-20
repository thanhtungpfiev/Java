package jukebox;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Admin
 * @date 3/10/2022
 */
public class JukeBox {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new JukeBox().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    private void getSongs() {
        try {
            File myFile = new File("Chapter16/src/jukebox/SongList.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void addSong(String line) {
        String[] tokens = line.split("/");
        songList.add(tokens[0]);
    }
}
