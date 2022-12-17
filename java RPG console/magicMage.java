public class magicMage {
    int damage;
    int cost;
    String owner;
    String name;


    public magicMage(String name){
        this.damage = 20;
        this.cost =10;
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
    public void add_cost(int add_cost) {
        cost = cost + add_cost;
    }

    public void loose_cost(int loose_cost) {
        cost = cost - loose_cost;
    }
}
