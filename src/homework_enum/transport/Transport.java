package homework_enum.transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final float engineVolume;
    private boolean isDiagnosed;

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

    @Override
    public String toString() {
        return brand +" "+ model +" "+ engineVolume;
    }
}
