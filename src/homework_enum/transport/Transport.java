package homework_enum.transport;

import homework_enum.driver.Driver;

import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;
    private boolean isDiagnosed;
    private Driver<Transport> driver;

    public Transport(String brand, String model, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    public abstract void startMovement();

    public abstract void stopMovement();

    public abstract void printType();

    public abstract void passDiagnostics();

    public boolean isDiagnosed() throws BusDiagnosticException {
        return isDiagnosed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setDiagnosed(boolean diagnosed) {
        isDiagnosed = diagnosed;
    }

    public Driver<Transport> getDriver() {
        return driver;
    }

    public void setDriver(Driver<Transport> driver) {
        this.driver = driver;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return brand +" "+ model;
    }
}
