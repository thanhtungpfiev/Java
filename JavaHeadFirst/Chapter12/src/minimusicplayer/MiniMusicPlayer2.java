package minimusicplayer;

import javax.sound.midi.*;

/**
 * @author tung.dao
 * @date 3/1/2022
 */
public class MiniMusicPlayer2 implements ControllerEventListener {
    int count = 0;

    public static void main(String[] args) {
        MiniMusicPlayer2 mini = new MiniMusicPlayer2();
        mini.go();
    }

    public void go() {
        Sequencer sequencer = null;
        try {
            sequencer = MidiSystem.getSequencer();
            sequencer.open();

            int[] eventsIWant = {127};
            sequencer.addControllerEventListener(this, eventsIWant);

            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            for (int i = 5; i < 61; i += 4) {
                track.add(makeEvent(144, 1, i, 100, i));
                track.add(makeEvent(176, 1, 127, 0, i));
                track.add(makeEvent(128, 1, i, 100, i + 2));
            } // end loop
            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();
        } catch (Exception ex) {
            ex.printStackTrace();
        } // close
    }


    @Override
    public void controlChange(ShortMessage event) {
        count++;
        System.out.println(count + ": la");
    }

    public MidiEvent makeEvent(int comd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(comd, chan, one, two);
            event = new MidiEvent(a, tick);
        } catch (Exception e) {

        }
        return event;
    }
} // close class
