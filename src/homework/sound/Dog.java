package homework.sound;

public class Dog implements SoundEmitter {

    private String sound;

    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает: вуф-вуф!");
    }
}
