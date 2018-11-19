package drus.animal;

public abstract class Animal {
    private int id;
    private int happiness=50;
    private int satiety=50;
    private int purity=50;

    public Animal(int id) {
        this.id = id;
    }

    public void chosenAnimalHappinessRule() {
        setHappiness(getHappiness()+1);
        setPurity(getPurity()-1);
        setSatiety(getSatiety()-1);
    }
    public void chosenAnimalPurityRule() {
        setHappiness(getHappiness()-1);
        setPurity(getPurity()+1);
        setSatiety(getSatiety()-1);
    }
    public void chosenAnimalSatietyRule() {
        setHappiness(getHappiness()-1);
        setPurity(getPurity()-1);
        setSatiety(getSatiety()+1);
    }
    public void otherAnimalRule() {
        setHappiness(getHappiness()-1);
        setPurity(getPurity()-1);
        setSatiety(getSatiety()-1);
    }

    public int getId() {
        return id;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getPurity() {
        return purity;
    }

    public void setPurity(int purity) {
        this.purity = purity;
    }

    @Override
    public String toString() {
        return "State{" +
                "happiness=" + happiness +
                ", satiety=" + satiety +
                ", purity=" + purity +
                '}';
    }
}
