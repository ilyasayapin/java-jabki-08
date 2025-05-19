package homework;

import homework.figure.Circle;
import homework.figure.Rectangle;
import homework.figure.Shape;
import homework.files.CalculateTotalSize;
import homework.files.File;
import homework.files.ImageFile;
import homework.files.TextFile;
import homework.sound.*;
import org.w3c.dom.UserDataHandler;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Shape[] shape = {new Circle(5), new Rectangle(7, 5)};
        for (Shape i : shape) {
            i.displayArea();
        }

        SoundEmitter[] devices = new SoundEmitter[]{
                new Dog(),
                new AlarmClock(),
                new CarHorn()
        };
        Player.playAllSounds(devices);

        TextFile textFile = new TextFile("Пример");
        ImageFile imageFile = new ImageFile(5, 10, 4);
        textFile.getSize();
        imageFile.getSize();

        File[] files = new File[]{
                new TextFile("Пример"),
                new ImageFile(5, 10, 4)
        };

        CalculateTotalSize.totalSize(files);


    }
}
