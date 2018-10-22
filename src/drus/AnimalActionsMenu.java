package drus;

import java.util.Scanner;

public class AnimalActionsMenu implements Menu {

    @Override
    public void processInput(Scanner scanner) {
        System.out.println("Выберите действия с Курицей");
        System.out.println("1-Поиграть");
        System.out.println("2-Покормить");
        System.out.println("3-Помыть");
        int c = scanner.nextInt();
        if (c == 1) {
            System.out.println("Поиграли");
        } else if (c == 2) {
            System.out.println("Покормили");
        } else if (c == 3) {
            System.out.println("Помыли");
        } else {
            this.processInput(scanner);
        }

    }
}
