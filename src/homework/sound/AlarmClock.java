package homework.sound;

public class AlarmClock implements SoundEmitter {

    @Override
    public void makeSound() {
        System.out.println("Будильник звенит: динь-динь-динь!");
    }
}
