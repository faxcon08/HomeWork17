package lesson_17;

public class Car extends Transport{
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
}// class Car
