package homework.sound;

public class CarHorn implements SoundEmitter {

    private String sound;

    public CarHorn(String sound) {
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println("Машина бибикает: пау-пау!");
    }
}
