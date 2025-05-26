package homework.sound;

public class Player {

    public static void playAllSounds(SoundEmitter[] devices) {
        for (SoundEmitter device : devices) {
            device.makeSound();
        }
    }
}
