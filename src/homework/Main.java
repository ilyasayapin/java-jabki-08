package homework;

import homework.figure.Circle;
import homework.figure.Rectangle;
import homework.figure.Shape;
import homework.files.CalculateTotalSize;
import homework.files.File;
import homework.files.ImageFile;
import homework.files.TextFile;
import homework.sorting.FileSize;
import homework.sorting.Person;
import homework.sorting.Sort;
import homework.sorting.Sortable;
import homework.sound.*;
import homework.transport.Airplane;
import homework.transport.Bicycle;
import homework.transport.StartRace;
import homework.transport.Transport;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shape[] shape = {new Circle(5), new Rectangle(7, 5)};
        for (Shape i : shape) {
            i.displayArea();
        }
        System.out.println();

        SoundEmitter[] devices = new SoundEmitter[]{
                new Dog(),
                new AlarmClock(),
                new CarHorn()
        };
        Player.playAllSounds(devices);
        System.out.println();

        TextFile textFile = new TextFile("Текст", "Пример");
        ImageFile imageFile = new ImageFile("Фото", 5, 10, 4);
        textFile.getSize();
        imageFile.getSize();
        System.out.println();

        File[] files = new File[]{
                new TextFile("Текст", "Пример"),
                new ImageFile("Фото", 5, 10, 4)
        };
        CalculateTotalSize.totalSize(files);
        System.out.println();

        Transport[] vehicles = new Transport[]{
                new Bicycle(60),
                new Airplane(800)
        };
        StartRace.startRace(vehicles);
        System.out.println();

        Sortable[] cheloveki = new Sortable[]{
                new Person(5),
                new Person(6),
                new Person(2),
                new Person(1),
        };
        System.out.println("Исходный порядок людей: " + Arrays.toString(cheloveki));
        Sort.sort(cheloveki);
        System.out.println("Сортировка людей по возрасту: " + Arrays.toString(cheloveki));
        System.out.println();

        Sortable[] dokumenty = new Sortable[]{
                new FileSize(23),
                new FileSize(5),
                new FileSize(17),
                new FileSize(1),
        };
        System.out.println("Исходный порядок файлов: " + Arrays.toString(dokumenty));
        Sort.sort(dokumenty);
        System.out.println("Сортировка файлов по размеру: " + Arrays.toString(dokumenty));
    }
}