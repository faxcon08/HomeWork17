package lesson_17;

public class Truck<T extends  TruckDriver> extends Transport implements Competing{
    T driver;
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    public Truck(String brand, String model, double engineVolume,T driver) {
        super(brand, model, engineVolume);
        this.driver=driver;
    }
    @Override
    public void changeDriver(Driver driver) {
        if(driver.getLicence()==DriverLicence.TRUCK_LICENCE)
            this.driver=(T)driver;
    }
    @Override
    public void printMessage() {
        if (this.driver==null) {
            System.out.println("У грозовика " + this.getBrand() + " " + this.getModel() + " еще нет водителя");
            return;
        }
        System.out.println("Водитель " + this.driver.getDriverFullName() +
                " управляет грузовиком " + this.getBrand() + " " + this.getModel() + " и будет участвовать в заезде");
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
