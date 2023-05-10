package machine;

import java.util.Scanner;

public class MachineActions {
    private final MachineStock stock;

    public MachineActions(MachineStock stock) {
        this.stock = stock;
    }

    public void startActions() {
        stock.checkStock();
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
        String input = scanner.next();
            if (input.equals("exit")) {
                break;
            } else {
                switch (input) {
                    case "remaining":
                        System.out.println(stock);;
                        break;
                    case "buy":
                        buyCoffee();
                        break;
                    case "fill":
                        fillMachine();
                        break;
                    case "take":
                        takeMoney();
                        break;
                }
            }
        }
    }

    public void buyCoffee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String input = scanner.next();
        switch (input) {
            case "1":
                new MachineDrinks(stock).makeEspresso();
                break;
            case "2":
                new MachineDrinks(stock).makeLatte();
                break;
            case "3":
                new MachineDrinks(stock).makeCappuccino();
                break;
            case "back":
                break;
        }
    }

    public void fillMachine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many ml of water do you want to add:");
        this.stock.setWater(this.stock.getWater() + Integer.parseInt(scanner.next()));
        System.out.println("How many ml of milk do you want to add:");
        this.stock.setMilk(this.stock.getMilk() + Integer.parseInt(scanner.next()));
        System.out.println("How many grams of coffee beans do you want to add:");
        this.stock.setCoffee((this.stock.getCoffee() + Integer.parseInt(scanner.next())));
        System.out.println("How many disposable cups of coffee do you want to add:");
        this.stock.setDisposableCups(this.stock.getDisposableCups() + Integer.parseInt(scanner.next()));

    }

    public void takeMoney() {
        System.out.println("I gave you $" + this.stock.getMoney());
        this.stock.setMoney(0);
    }


}

