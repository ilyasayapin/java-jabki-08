package homework.figure;

public class Circle extends Shape {
    int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public void displayArea () {
        System.out.println("Площадь круга = " + Math.PI * this.radius * this.radius);
    }
}
