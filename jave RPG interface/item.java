public class item {
    String weapon;             
    Consumable consumable; 
    
    public item(String weapon){
        this.weapon = weapon;
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public String useWeapon(){
        return weapon;
    }
    
    public void useConsumable(Consumable use_Consumable) {
        this.consumable = consumable;
            
    }
}
