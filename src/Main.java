import lesson_17.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static public void printSeparator() {
        System.out.println("-----------------------------------------------------");
    }

    static public void printSeparator(String str) {
        String separator = " ============================ ";
        System.out.println(separator + str + separator);
    }
    public static void main(String[] args) {
        printSeparator("FIRST TASK 1.1"); ////////////////////////////////////// 1.1
        Transport car1 = new Car("BMW", "X5", 2.5);
        Transport car2 = new Car("BMW", "X7", 3);
        Transport car3 = new Car("LADA", "XRAY", 2);
        Transport car4 = new Car("hyundai", "SONATA", 1.5);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        car1.startMoving();
        car1.stopMoving();
        printSeparator();
        Transport truck1 = new Truck("KAMAZ", "6511", 5);
        Transport truck2 = new Truck("KAMAZ", "4311", 4.5);
        Transport truck3 = new Truck("MAN", "TGS", 5);
        Transport truck4 = new Truck("URAL", "4320", 5.2);
        System.out.println(truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        System.out.println(truck4);
        printSeparator();

        Transport bus1 = new Bus("Volvo", "7900", 4);
        Transport bus2 = new Bus("Liza", "6212", 3.4);
        Transport bus3 = new Bus("JAC", "HK6118G", 4);
        Transport bus4 = new Bus("LAZ", "CityLAZ-12LF", 3.2);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        printSeparator();

        printSeparator("Second Task 1.2");
        printSeparator("Third Task 1.3");

        Competing car = new Car("BMW","X3",1.5);
        Competing bus = (Competing) bus1;
        Competing truck = (Competing) truck1;

        bus.pitStop();
        bus.bestCircleTime();
        bus.maxSpeed();

    }
}