//AUTHOR T0MW0ZZER

public class Monster {
    String type;
    int health;
    int attack;
    boolean isLive;
    
    public Monster(String type){
        this.type = type;
        this.health=150;
        this.attack=20;
        isLive = true;
    }

    public void die(){
        this.health = 0;
        isLive = false;
        System.out.println(type + " is dead!");
    }

    
    public void attack(){
        System.out.println(type + "attack!");
    }


    public void defend(){
        System.out.println(type + " defend!");
    }

    public String getType(){
        return type;
    }

    public int getHealth(){
        return health;
    }

    public int getAttack(){
        return attack;
    }

    public void looseHealth(int looseHealth){
        health = health - looseHealth;
    }
    
}
