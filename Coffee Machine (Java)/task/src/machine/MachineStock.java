package machine;

public class MachineStock {
    private int water;
    private int milk;
    private int coffee;
    private int disposableCups;
    private int money;

    public MachineStock(int water, int milk, int coffee) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.disposableCups = 0;
        this.money = 0;
    }

    public MachineStock(int water, int milk, int coffee, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public int getMoney() {
        return money;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int checkStock() {
        int lcm = this.milk;
        if (lcm > this.coffee) {
            lcm = this.coffee;
        } else if (lcm > this.water) {
            lcm = this.water;
        }
        return lcm;
    }

    @Override
    public String toString() {
           return ("The coffee machine has:\n" +
                   getWater() + " of water\n" +
                   getMilk() + " of milk\n" +
                   getCoffee() + " of coffee beans\n" +
                   getDisposableCups() + " of disposable cups\n" +
                   getMoney() + " of money");
        }
    }

