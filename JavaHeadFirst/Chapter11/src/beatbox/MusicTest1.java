package beatbox;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/*
 * File: MusicTest1.java
 * Project: beatbox
 * File Created: Friday, 25th February 2022 11:57:14 am
 * Author: tung.dao (thanhtungpfiev@gmail.com)
 * -----
 */
public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Successfully got a sequencer");
        } catch (MidiUnavailableException ex) {
            System.out.println("Bummer");
        }

    } // close play

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    } // close main
} // close class
