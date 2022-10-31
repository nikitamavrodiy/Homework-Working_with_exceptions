package homework_enum.transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing {
    private final PassengerCapacity passengerCapacity;

    public Bus(String brand, String model, float engineVolume, PassengerCapacity passengerCapacity) {
        super(brand, model, engineVolume);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void startMovement() {
        System.out.printf("Bus %s %s started moving",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Bus %s %s stopped moving",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void printType() {
        if (this.passengerCapacity != null) {
            System.out.println(this.passengerCapacity);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Автобус не может пройти диагностику. Отмена.");
    }

    public boolean isDiagnosed() throws BusDiagnosticException {
        throw new BusDiagnosticException("Автобус "+this.toString()+" в диагностике не нуждается");
    }


    @Override
    public void pitStop() {
        System.out.printf("Bus %s %s performed pit-stop",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public int getBestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 1000);
    }

    @Override
    public int getMaxSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 400);
    }
}
