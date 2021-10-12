package colls.entity;

public class FPlane {
    private String brand;
    private String model;
    private int year;
    private boolean jet;

    public FPlane(String brand, String model, int year, boolean jet) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.jet = jet;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public boolean isJet() {
        return jet;
    }

    public String toString() {
        return brand + "," + model + "," + year + ", Jet: " + jet;
    }
}
