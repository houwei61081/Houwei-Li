public class Food {
    
    int amount;
    int recover;

    public Food(String name){
        this.amount = 50;
        this.recover= 5;
    }
    
    
    public int getAmount(){
        return amount;
    }
    public int getrecover(){
        return recover;
    }
    
    public void getAmount(int loose_Amount ){
        amount = amount-loose_Amount;
    }
}