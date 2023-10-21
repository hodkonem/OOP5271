package domain;

public class Bottle extends Product {
    private double bottleVolume;

    public Bottle(String name, double price, double bottleVolume) {
        super(name, price, new PrType("bottle"));
        this.bottleVolume = bottleVolume;
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(double bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return super.toString() + " volume = " + this.bottleVolume;
    }
}
