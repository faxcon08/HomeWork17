package lesson_17;

public class Car  extends Transport <CarDriver> implements Competing{
    CarDriver driver;
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
        this.setLicence(DriverLicence.CAR_LICENCE);
    }
    public Car(String brand, String model, double engineVolume, CarDriver driver) {
        super(brand, model, engineVolume);
        this.driver=driver;
        this.setLicence(DriverLicence.CAR_LICENCE);

    }
    @Override
    public CarDriver getDriver() {
        if(driver==null) {
            System.out.println("У машины " + this.getBrand() + " " + this.getModel() + " еще нет водителя");
            return new CarDriver("no car driver", 0);
        }
        return driver;
    }

    @Override
    public void setDriver(CarDriver driver) {this.driver =  driver;}
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
