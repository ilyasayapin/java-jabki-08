package homework.sound;

public class AlarmClock implements SoundEmitter {

    private String sound;

    public AlarmClock(String sound) {
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println("Будильник звенит: динь-динь-динь!");
    }
}
