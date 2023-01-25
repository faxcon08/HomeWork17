package lesson_17;

public class Truck extends Transport{
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
}
