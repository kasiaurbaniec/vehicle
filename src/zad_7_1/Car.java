package zad_7_1;

public class Car extends Vehicle{
    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 0;
    }

    @Override
    public double getDistance() {
        return 0;
    }
}
