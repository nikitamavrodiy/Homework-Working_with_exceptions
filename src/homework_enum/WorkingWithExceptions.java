package homework_enum;

import homework_enum.driver.Driver;
import homework_enum.driver.DriverB;
import homework_enum.transport.*;


public class WorkingWithExceptions {
    public static void main(String[] args) {
        Car car = new Car("bmw","x5", 1.5f, BodyType.CROSSOVER);
        DriverB driverCar = new DriverB("Carl", 2, car);
//        car.printType();
        Bus bus = new Bus("School","Rover", 1.3f, PassengerCapacity.S);
//        bus.printType();
        Truck truck = new Truck("super", "track", 1.3f, CarriageCapacity.N1);
//        truck.printType();
        Truck truckNull = new Truck("super", "track", 1.3f, null);
//        truckNull.printType();

        try {
            System.out.println("Checking the correctness of the entered data(true or false):");
            System.out.println(Data.verificationOfLogin("dfsd333d", "d329239", "d329239"));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        System.out.println();

        car.passDiagnostics();
        bus.passDiagnostics();
        truck.passDiagnostics();
        areDiagnosed(car, truck, bus);


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
