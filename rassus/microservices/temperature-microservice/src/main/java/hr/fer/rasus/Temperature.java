package hr.fer.rasus;

public class Temperature {
    public String name;
    public int value;
    public String unit;

    public Temperature(int value) {
        this.name = "Temperature";
        this.unit = "C";
        this.value = value;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
