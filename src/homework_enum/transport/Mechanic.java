package homework_enum.transport;

import java.util.*;

public class Mechanic<T extends Transport> {
    private final String firstName;
    private final String secondName;
    private final String company;
    private Set<T> cars;

    public Mechanic(String firstName, String secondName, String company, T car) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.company = company;
        cars = new HashSet<>();
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

    public Set<T> getCars() {
        return cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(secondName, mechanic.secondName) && Objects.equals(company, mechanic.company) && Objects.equals(cars, mechanic.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, company, cars);
    }

    @Override
    public String toString() {
        return "Mechanic " + firstName +" "+ secondName + " from "+company+", works only with " + cars;
    }
}
