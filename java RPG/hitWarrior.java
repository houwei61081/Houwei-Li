public class hitWarrior {
    int damage ;
    String name;
    String owner;

    public hitWarrior(String name){
        this.damage = 20;
        this.name = "hit";
        this.owner = "Warrior";
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

}

