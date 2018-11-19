package drus.animal;

public class Sheep extends Animal {
    private String name = "Овечка";

    public Sheep(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return "3-Sheep{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}