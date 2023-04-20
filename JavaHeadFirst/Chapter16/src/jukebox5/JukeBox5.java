package jukebox5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

/**
 * @author Admin
 * @date 3/10/2022
 */
public class JukeBox5 {
    ArrayList<Song> songList = new ArrayList<>();

    public static void main(String[] args) {
        new JukeBox5().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        TreeSet<Song> songSet = new TreeSet<>();
        songSet.addAll(songList);
        System.out.println(songSet);

    }

    private void getSongs() {
        try {
            File myFile = new File("Chapter16/src/jukebox4/SongListMore.txt");
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                addSong(line);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void addSong(String line) {
        String[] tokens = line.split("/");
        songList.add(new Song(tokens[0], tokens[1], tokens[2], tokens[3]));
    }
}
