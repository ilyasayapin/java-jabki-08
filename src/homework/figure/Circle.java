package homework.figure;

public class Circle extends Shape {
    int radius;

    public Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public double area () {
        return (Math.PI * this.radius * this.radius);
    }

    @Override
    public void displayArea () {
        super.displayArea();
        System.out.println(area());
    }
}
