public class Hero {
    String name;
    int health;
    int attack;
    int armor;
    String weapons;
    String classType;
    String potion;
    String food;

    public Hero(String name, String weapons, String classType, String potion,String food, int health2, int attack2, int armor ){
        this.name = name;
        this.health = health2;
        this.attack = attack2;
        this.armor = armor;
        this.weapons = weapons;
        this.classType = classType;
        this.potion = potion;
        this.food = food;
    } 
    //verifier si les heros sont morts
    public boolean isAlive(){
        return health > 0;
    }
    
  
        
    public String getName(){
        return name;
    } 


    public int getHealth(){
        return health;
    }

    public int getAttack(){
        return attack;
    }

    public int getArmor(){
        return armor;
    }

    public String getPotion(){
        return potion;
    }

    public String getFood(){
        return food;
    }

    public String enhancePotion(){
        return potion;
    }

    public String enhanceFood(){
        return food;
    }

    public void gainHealth(int gainHealth){
        health = health + gainHealth;
    }

    public void looseHealth(int looseHealth){
        health = health - looseHealth;
    }
    public void gainArmor(int gainArmor){
        armor = armor + gainArmor;
    }
}