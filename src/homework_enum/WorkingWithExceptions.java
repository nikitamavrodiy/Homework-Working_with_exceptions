package homework_enum;

import homework_enum.transport.*;


public class WorkingWithExceptions {
    public static void main(String[] args) {
/*        Car car = new Car("bmw","x5", 1.5f, BodyType.CROSSOVER);
        car.printType();
        Bus bus = new Bus("Test","test", 1.3f, PassengerCapacity.S);
        bus.printType();
        Truck truck = new Truck("super", "track", 1.3f, CarriageCapacity.N1);
        truck.printType();
        Truck truckNull = new Truck("super", "track", 1.3f, null);
        truckNull.printType();*/
        try {
            System.out.println(Data.verificationOfLogin("dfsd333d", "d329239", "d329239"));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}
