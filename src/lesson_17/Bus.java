package lesson_17;

public class Bus extends Transport implements Competing{
    public Bus(String brand, String model, double engineVolume) {
        super(brand,model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Bus move");
    }

    @Override
    public void stopMoving() {
        System.out.println("Bus stop");
    }

    @Override
    public String toString() {
        return "Bus:" + super.toString();
    }

    ////////////////////////////// interface methods ////////////////
    @Override
    public void pitStop() {
        System.out.println("Bus on pitStop");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Best Circle Time for Bus");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max Speed for Bus");
    }
}
