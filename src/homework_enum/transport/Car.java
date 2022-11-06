package homework_enum.transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Transport implements Competing {
    private final BodyType bodyType;
    private List<Sponsor> sponsorList = new ArrayList<>();
    private List<Mechanic> mechanicList = new LinkedList<>();

    public Car(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
    }

    @Override
    public void startMovement() {
        System.out.printf("Car %s %s started moving",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void stopMovement() {
        System.out.printf("Car %s %s stopped moving",
                this.getBrand(),
                this.getModel());
        System.out.println();
    }

    @Override
    public void printType() {
        if (this.bodyType != null) {
            System.out.println(bodyType);
        } else {
            System.out.println("Информации недостаточно");
        }
    }

    @Override
    public void passDiagnostics() {
        setDiagnosed(true);
        System.out.println("Машина прошла диагностику");
    }

    @Override
    public void pitStop() {
        System.out.printf("Car %s %s performed pit-stop",
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

    public List<Sponsor> getSponsorList() {
        return sponsorList;
    }

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }
}

