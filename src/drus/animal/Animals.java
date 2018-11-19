package drus.animal;

import java.util.ArrayList;

public class Animals {
    private Sheep sheep = new Sheep(1);
    private Cow cow = new Cow(2);
    private Chiken chiken = new Chiken(3);

    public Animal findAnimalByID(int id) {
        if (cow.getId() == id) return cow;
        else if (sheep.getId() == id) return sheep;
        else if (chiken.getId() == id) return chiken;
        else return null;
    }
    public ArrayList<Animal> findAnotherAnimalByID(int id) {
        ArrayList<Animal> list = new ArrayList<>();
        if (cow.getId() != id) {
            list.add(cow);
        }
        if (sheep.getId() != id) {
            list.add(sheep);
        }
        if (chiken.getId() != id) {
            list.add(chiken);
        }
        return list;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public Cow getCow() {
        return cow;
    }

    public Chiken getChiken() {
        return chiken;
    }
}
