package homework.transport;

public class Bicycle extends Transport {

    public Bicycle(int speed) {
        super(speed);
    }

    @Override
    public void move() {
        System.out.println("Велосипед катится по земле со скоростью " + super.getSpeed() + "км/ч");
    }
}
