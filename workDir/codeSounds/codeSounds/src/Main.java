import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main {
    public static void main(String[] args) {
        /**
         * PCM= thunderbold
         * Master= default
         */
        Audio a= new Audio("PCM");
        a.setMasterOutputMute(false);
        a.setMasterOutputVolume(0.9f);
        a.adjustPan(Audio.getMasterOutputLine(), 0.1f);


    }
}
