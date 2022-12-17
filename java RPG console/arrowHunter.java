public class arrowHunter {
    int amount;
    int damage;
    String owner;
    String name;

    public arrowHunter(String name){
        this.damage = 50;
        this.amount = 3;
        this.owner ="Hunter";
        this.name ="arrow";
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
