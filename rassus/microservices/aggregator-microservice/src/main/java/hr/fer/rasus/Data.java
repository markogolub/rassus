package hr.fer.rasus;

import java.io.Serializable;

public class Data implements Serializable {
    public String name;
    public int value;
    public String unit;

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }
}
