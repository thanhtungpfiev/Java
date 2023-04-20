package jukebox3;

import java.util.Comparator;

/**
 * @author Admin
 * @date 3/12/2022
 */
public class ArtistCompare implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return (o1.artist.compareTo(o2.artist));
    }
}
