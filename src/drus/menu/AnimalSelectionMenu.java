package drus.menu;

import drus.animal.Animals;

import java.util.Scanner;

/**
 * Выбор животных, у которых показаны их текущие парметры.
 * Возможность вернуться к главному меню игры.
 */
public class AnimalSelectionMenu implements Menu {
    private Animals animals;
    private MainMenu mainMenu;

    public AnimalSelectionMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public AnimalSelectionMenu(Animals animals) {
        this.animals = animals;;

    }

    @Override
    public void processInput(Scanner scanner) {
        System.out.println("New game");
        System.out.println("Выберите животное");
        System.out.println(animals.getChiken());
        System.out.println(animals.getCow());
        System.out.println(animals.getSheep());
        System.out.println("4 - Выход в Главное Меню");
        int z = scanner.nextInt();
        if (z == 1) {
            new AnimalActionsMenu(animals.getChiken().getId(),animals,this).processInput(scanner);
        }
        else if (z == 2) {
            new AnimalActionsMenu(animals.getCow().getId(),animals,this).processInput(scanner);
        }
        else if (z == 3) {
            new AnimalActionsMenu(animals.getSheep().getId(),animals,this).processInput(scanner);
        }
        else if (z == 4) {
            new MainMenu().processInput(scanner);
        }
        else {
            this.processInput(scanner);
        }
    }
}

