package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        MachineStock stock = new MachineStock(400, 540, 120,9,550);
        MachineActions coffeeCalculator = new MachineActions(stock);
        coffeeCalculator.startActions();

    }

}
