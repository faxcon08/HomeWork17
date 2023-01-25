package lesson_17;

public class Truck extends Transport implements Competing{
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Truck start moving");
    }

    @Override
    public void stopMoving() {
        System.out.println("Truck stop moving");
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString();
    }

    ////////////////////////////// interface methods ////////////////
    @Override
    public void pitStop() {
        System.out.println("Truck on pitStop");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Best Circle Time for Truck");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max Speed for Truck");
    }
}
