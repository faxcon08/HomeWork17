package lesson_17;

public class Car extends Transport implements Competing{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Car start");
    }

    @Override
    public void stopMoving() {
        System.out.println("Car stop");
    }

    @Override
    public String toString() {
        return "CAR: "+super.toString();
    }

    ////////////////////// interface methods //////////////////////
    @Override
    public void pitStop() {
        System.out.println("Car on pitStop");
    }

    @Override
    public void bestCircleTime() {
        System.out.println("Best Circle Time for Car");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max Speed for Car");
    }
}// class Car
