package drus;

public class Sheep extends Animal {
    private String name = "Овечка";

    @Override
    public String toString() {
        return "3-Sheep{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}