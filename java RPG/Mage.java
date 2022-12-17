public class Mage {
    
    int health;
    int attack;
    int armor;
    int mana;
    String classtype;
    String potion;
    String weapon;
    String food;
    boolean isLive;

    public Mage(String classtype){
        this.health=100;
        this.attack = 20;
        this.armor = 20;
        this.mana = 50;
        this.classtype="Mage";
        this.weapon ="Magic";
        this.potion ="";
        this.food ="";
        this.isLive = true;
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
    public String getWeapon(){
        return weapon;
    }
    public String getPotion(){
        return potion ;
    }
    public String getFood(){
        return food;
    }
    public void gainHealth(int gainHealth){
        health=health+gainHealth;
    }
    public void looseHealth(int looseHealth) {
        health = health - looseHealth;
    }   
    public void gainAttack(int gainAttack) {
        attack = attack + gainAttack;
    }
        
    public void looseAttack(int looseAttack) {
        attack = attack - looseAttack;
    }
        
    public void gainArmor(int gainArmor) {
        armor = armor + gainArmor;
    }

    public void looseArmor(int looseArmor) {
        armor = armor - looseArmor;
    }

    public void haveOption(String potion) {
        this.potion = potion;
    }

    public void haveFood(String food) {
        this.food = food;
    }

    public void gainPotion(String gainpotion) {
        potion = potion + gainpotion;
    }

    public void loosePotion(String loosePotion) {
        potion = "";
    }

    public void gainFood(String gainFood) {
        food = food + gainFood;
    }

    public void looseFood(String looseFood) {
        food = "";
    }

    public void die() {
        this.health = 0;
        isLive = false;
        System.out.println(classtype + " is dead.");
    }
}
