public class Item {
    String name;
    int amount;

    public Item(String name,  int amount){
        this.name = name;
        this.amount = amount;
    }
    
    public String getItemName(){
        return name;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public void setAmount(int newAmount){
        amount = amount + newAmount;
    }

}
