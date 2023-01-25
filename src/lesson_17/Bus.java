package lesson_17;

public class Bus <T extends BusDriver> extends Transport implements Competing{
    T driver;
    public Bus(String brand, String model, double engineVolume) {
        super(brand,model, engineVolume);
    }
    public Bus(String brand, String model, double engineVolume, T driver) {
        super(brand,model, engineVolume);
        this.driver=driver;
    }
    @Override
    public void changeDriver(Driver driver) {
        if(driver.getLicence()==DriverLicence.BUS_LICENCE)
            this.driver=(T)driver;
    }
    @Override
    public void printMessage() {
        if (this.driver==null) {
            System.out.println("У автобуса " + this.getBrand() + " " + this.getModel() + " еще нет водителя");
            return;
        }
        System.out.println("Водитель " + this.driver.getDriverFullName() +
                " управляет автобусом " + this.getBrand() + " " + this.getModel() + " и будет участвовать в заезде");
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
