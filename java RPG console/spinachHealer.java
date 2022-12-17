public class spinachHealer {
    int amount;
    int damage;
    String owner;
    String name;

    public spinachHealer(String name){
        this.damage = 20;
        this.amount = 10;
        this.owner ="Healer";
        this.name ="Spinach";
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getAmount() {
        return amount;
    }
    public void gainAmount(int gainAmount){
        amount=amount+gainAmount;
    }

    public void looseAmount(int looseAmount) {
        amount = amount - looseAmount;
    }
}
