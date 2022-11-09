package homework_enum.transport;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing {
    private final CarriageCapacity carriageCapacity;
    private Set<Sponsor> sponsorList = new HashSet<>();
    private Set<Mechanic> mechanicList = new HashSet<>();

    public Truck(String brand, String model, float engineVolume, CarriageCapacity carriageCapacity) {
        super(brand, model, engineVolume);
        this.carriageCapacity = carriageCapacity;
    }

    @Override
    public void startMovement() {
        System.out.printf("Truck %s %s started moving",
                this.getBrand(), this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Truck %s %s stopped moving",
                this.getBrand(), this.getModel());
        System.out.println();
    }

    @Override
    public void printType() {
        if (this.carriageCapacity != null) {
            System.out.println(this.carriageCapacity);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    @Override
    public void passDiagnostics() {
        setDiagnosed(true);
        System.out.println("Грузовик прошел диагностику");
    }

    @Override
    public void pitStop() {
        System.out.printf("Truck %s %s performed pit-stop",
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

    public Set<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public Set<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
