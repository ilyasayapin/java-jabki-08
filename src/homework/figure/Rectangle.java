package homework.figure;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle (int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area () {
        return (this.width * this.height);
    }

    @Override
    public void displayArea () {
        super.displayArea();
        System.out.println(area());
    }
}
