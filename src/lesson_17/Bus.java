package lesson_17;

public class Bus extends Transport{
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

}
