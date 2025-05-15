package homework.figure;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayArea () {
        System.out.println("Площадь прямоугольника = " + this.width * this.height);
    }


}
