package homework.sound;

public class CarHorn implements SoundEmitter {

    @Override
    public void makeSound() {
        System.out.println("Машина бибикает: пау-пау!");
    }
}
