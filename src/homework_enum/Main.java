package homework_enum;

import homework_enum.driver.Driver;
import homework_enum.driver.DriverB;
import homework_enum.driver.DriverC;
import homework_enum.driver.DriverD;
import homework_enum.transport.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Car car = new Car("bmw","x5", 1.5f, BodyType.CROSSOVER);
        DriverB driverCar = new DriverB("Carl", 2, car);
        Bus bus = new Bus("School","Rover", 1.3f, PassengerCapacity.S);
        DriverD driverBus = new DriverD("Bob", 2, bus);
        Truck truck = new Truck("super", "track", 1.3f, CarriageCapacity.N1);
        DriverC driverTruck = new DriverC("Tomas", 2, truck);
//        Truck truckNull = new Truck("super", "track", 1.3f, null);

//        try {
//            System.out.println("Checking the correctness of the entered data(true or false):");
//            System.out.println(Data.verificationOfLogin("dfsd333d", "d329239", "d329239"));
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage());
//        }
//
//        System.out.println();
//
//        car.passDiagnostics();
//        bus.passDiagnostics();
//        truck.passDiagnostics();
//        areDiagnosed(car, truck, bus);

        System.out.println("\nHomework Lists and queues.");
        List<Transport> competingList = new ArrayList<>();
        competingList.add(car);
        competingList.add(bus);
        competingList.add(truck);
//        System.out.println("Список участников(авто) = " + competingList);
        Sponsor.COCA_COLA.toSponsorTheRace(car);
        Sponsor.COCA_COLA.toSponsorTheRace(truck);
        Sponsor.PEPSI.toSponsorTheRace(truck);
        Sponsor.LADA.toSponsorTheRace(bus);
//        System.out.println("Список спонсоров("+car+") = " + car.getSponsorList());
//        System.out.println("Список спонсоров("+truck+") = " + truck.getSponsorList());
//        System.out.println("Список спонсоров("+bus+") = " + bus.getSponsorList());
//        System.out.println("Водитель("+car+") = "+ car.getDriver());
//        System.out.println("Водитель("+truck+") = "+ truck.getDriver());
//        System.out.println("Водитель("+bus+") = "+ bus.getDriver());
        List<Driver> competingDrivers = new LinkedList<>();
//        System.out.println("Список участников(drivers):");
//        for (Transport transport : competingList) {
//            competingDrivers.add(transport.getDriver());
//            System.out.println(transport.getDriver().getFullName() +" ");
//        }
        Car car2 = new Car("bmw","x6", 1.5f, BodyType.CROSSOVER);
        Mechanic<Car> bobster = new Mechanic<>("Bobster", "Bobich", "CarFanta", car);
        bobster.getCars().add(car2);
        car2.getMechanicList().add(bobster);
//        System.out.println("bobster.getCars() = " + bobster.getCars());
//        System.out.println("car.getMechanicList() = " + car.getMechanicList());
//        System.out.println("car2.getMechanicList() = " + car2.getMechanicList());
//

    }

    public static void areDiagnosed(Transport... transports) throws RuntimeException {
        System.out.println("Проверяем, все ли  прошли диагностику...");
        try {
            for (Transport t : transports) {
                if(!t.isDiagnosed()) {
                    throw new RuntimeException("Не все объекты прошли диагностику!");
                }
            }
        } catch (BusDiagnosticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Проверка завершена");
        }
        System.out.println("Диагностику прошли все объекты.");
    }



}
