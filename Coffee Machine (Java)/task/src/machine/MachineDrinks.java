package machine;

import java.util.HashMap;

public class MachineDrinks {
    private final MachineStock stock;
    private final HashMap<String, Integer> espressoRecipe;
    private final HashMap<String, Integer> latteRecipe;
    private final HashMap<String, Integer> cappucinoRecipe;


    public MachineDrinks(MachineStock stock) {
        this.stock = stock;
        espressoRecipe = new HashMap<>() {{
            put("water", 250);
            put("coffee", 16);
            put("money", 4);
        }};
        latteRecipe = new HashMap<>() {{
            put("water", 350);
            put("milk", 75);
            put("coffee", 20);
            put("money", 7);
        }};
        cappucinoRecipe = new HashMap<>() {{
            put("water", 200);
            put("milk", 100);
            put("coffee", 12);
            put("money", 6);
        }};
    }

    public void makeEspresso() {
        if (this.stock.getWater() < espressoRecipe.get("water")) {
            System.out.println("Sorry, not enough water!");
        } else if (this.stock.getCoffee() < espressoRecipe.get("coffee")) {
            System.out.println("Sorry, not enough coffee!");
        }   else if (this.stock.getDisposableCups() < 1) {
            System.out.println("Sorry, not enough cups!");
        } else {
            this.stock.setWater(this.stock.getWater() - espressoRecipe.get("water"));
            this.stock.setCoffee(this.stock.getCoffee() - espressoRecipe.get("coffee"));
            this.stock.setMoney(this.stock.getMoney() + espressoRecipe.get("money"));
            this.stock.setDisposableCups(this.stock.getDisposableCups() - 1);
        }
    }

    public void makeLatte() {
        if (this.stock.getWater() < latteRecipe.get("water")) {
            System.out.println("Sorry, not enough water!");
        } else if (this.stock.getCoffee() < latteRecipe.get("coffee")) {
            System.out.println("Sorry, not enough coffee!");
        } else if (this.stock.getDisposableCups() < 1) {
            System.out.println("Sorry, not enough cups!");
        } else if (this.stock.getMilk() < latteRecipe.get("milk")) {
            System.out.println("Sorry, not enough milk!");
        } else {
            this.stock.setWater(this.stock.getWater() - latteRecipe.get("water"));
            this.stock.setMilk(this.stock.getMilk() - latteRecipe.get("milk"));
            this.stock.setCoffee(this.stock.getCoffee() - latteRecipe.get("coffee"));
            this.stock.setMoney(this.stock.getMoney() + latteRecipe.get("money"));
            this.stock.setDisposableCups(this.stock.getDisposableCups() - 1);
        }
    }

    public void makeCappuccino() {
        if (this.stock.getWater() < cappucinoRecipe.get("water")) {
            System.out.println("Sorry, not enough water!");
        } else if (this.stock.getCoffee() < cappucinoRecipe.get("coffee")) {
            System.out.println("Sorry, not enough coffee!");
        } else if (this.stock.getDisposableCups() < 1) {
            System.out.println("Sorry, not enough cups!");
        } else if (this.stock.getMilk() < cappucinoRecipe.get("milk")) {
            System.out.println("Sorry, not enough milk!");
        } else {
            this.stock.setWater(this.stock.getWater() - cappucinoRecipe.get("water"));
            this.stock.setMilk(this.stock.getMilk() - cappucinoRecipe.get("milk"));
            this.stock.setCoffee(this.stock.getCoffee() - cappucinoRecipe.get("coffee"));
            this.stock.setMoney(this.stock.getMoney() + cappucinoRecipe.get("money"));
            this.stock.setDisposableCups(this.stock.getDisposableCups() - 1);
        }
    }

}
