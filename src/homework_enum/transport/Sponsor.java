package homework_enum.transport;

public enum Sponsor {
    COCA_COLA("Coca-Cola", 100_000),
    LADA("Лада", 10_000),
    PEPSI("Пепси", 50_000);

    private String name;
    private int sponsorShip;

    Sponsor(String name, int sponsorShip) {
        this.name = name;
        this.sponsorShip = sponsorShip;
    }

    public void toSponsorTheRace(Transport transport) {
        if (transport instanceof Car) {
            ((Car) transport).getSponsorList().add(this);
        } else if (transport instanceof Bus){
            ((Bus) transport).getSponsorList().add(this);
        } else if (transport instanceof Truck) {
            ((Truck) transport).getSponsorList().add(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSponsorShip() {
        return sponsorShip;
    }

    public void setSponsorShip(int sponsorShip) {
        this.sponsorShip = sponsorShip;
    }
}
