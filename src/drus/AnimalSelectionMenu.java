package drus;

import java.util.Scanner;

public class AnimalSelectionMenu implements Menu {

    @Override
    public void processInput(Scanner scanner) {
        System.out.println("New game");
        System.out.println("Выберите животное");
        Chiken chiken = new Chiken();
        System.out.println(chiken);
        Cow cow = new Cow();
        System.out.println(cow);
        Sheep sheep = new Sheep();
        System.out.println(sheep);
        int z = scanner.nextInt();
        if (z == 1) {
            new AnimalActionsMenu().processInput(scanner);
        }
        else if (z == 2) {
            new AnimalActionsMenu().processInput(scanner);
        }
        else if (z == 3) {
            new AnimalActionsMenu().processInput(scanner);
        }
        else {
            this.processInput(scanner);
        }
    }
}

