package homework;

import homework.figure.Circle;
import homework.figure.Rectangle;
import homework.figure.Shape;
import homework.sound.*;
import org.w3c.dom.UserDataHandler;

public class Main {
    public static void main(String[] args) {

        Shape[] shape = {new Circle(5), new Rectangle(7, 5)};
            for (Shape i : shape) {
                i.displayArea();
            }

        SoundEmitter[] devices = new SoundEmitter[] {
                new Dog(),
                new AlarmClock(),
                new CarHorn()
            };
        Player.playAllSounds(devices);


    }
}
