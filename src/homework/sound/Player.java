package homework.sound;

import homework.figure.Shape;

public class Player {
    public void playAllSounds(SoundEmitter[] devices) {
        for (devices i : devices) {
            i.displayArea();
        }
    }
}
