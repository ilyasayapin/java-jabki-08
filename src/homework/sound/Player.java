package homework.sound;

public class Player {

    public static void playAllSounds(SoundEmitter[] devices) {
        for (int i = 0; i < devices.length; i++) {
            devices[i].makeSound();
        }
    }
}
