package hr.fer.rasus;

public class Humidity {
    public String name;
    public int value;
    public String unit;

    public Humidity(int value) {
        this.name = "Humidity";
        this.unit = "%";
        this.value = value;
    }
}
