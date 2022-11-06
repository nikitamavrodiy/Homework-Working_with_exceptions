package homework_enum.transport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Mechanic<T extends Transport> {
    private final String firstName;
    private final String secondName;
    private final String company;
    private List<T> cars;

    public Mechanic(String firstName, String secondName, String company, T car) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.company = company;
        cars = new LinkedList<>();
        this.cars.add(car);
        if (car instanceof Car) {
            ((Car) car).getMechanicList().add(this);
        } else if (car instanceof Bus){
            ((Bus) car).getMechanicList().add(this);
        } else if (car instanceof Truck) {
            ((Truck) car).getMechanicList().add(this);
        }
    }

    public void doMaintenance() {
        System.out.println(this);
    }

    public void fixCar() {
        System.out.println();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getCompany() {
        return company;
    }

    public List<T> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return "Mechanic " + firstName +" "+ secondName + " from "+company+", works only with " + cars;
    }
}
