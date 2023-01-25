package lesson_17;

public class Car <T extends CarDriver> extends Transport implements Competing{
    T driver;
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public Car(String brand, String model, double engineVolume, T driver) {
        super(brand, model, engineVolume);
        this.driver=driver;
    }

    @Override
    public void changeDriver(Driver driver) {
        if(driver.getLicence()==DriverLicence.CAR_LICENCE)
            this.driver= (T) driver;
    }
    @Override
    public void printMessage() {
        if (this.driver==null) {
            System.out.println("У машины " + this.getBrand() + " " + this.getModel() + " еще нет водителя");
            return;
        }
        System.out.println("Водитель " + this.driver.getDriverFullName() +
                " управляет автомобилем " + this.getBrand() + " " + this.getModel() + " и будет участвовать в заезде");
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
