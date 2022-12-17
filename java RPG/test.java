import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class test {

    public static void main(String[] args) {
        Item [] potion_backpack = new Item[20];
        Item blood_potion = new Item("potion",13);
        potion_backpack[0] = blood_potion;
        Item [] food_backpack = new Item[20];
        Item bread = new Item("Food", 50);
        food_backpack[0] = bread;
        boolean iskill = false;
        int numHeros = 0;
        int numChoice = 0;
        int numChoice1 = 0;
        int numChoice2 = 0;
        int numChoice3 = 0;
        int numChoice4 = 0;
        int attack = 0;
        int health = 0;
        int armor = 0;
        String weapons = "";
        String classType = "";
        String name = "";
        ArrayList<String> allList = new ArrayList<String>();
        ArrayList<String> heroList = new ArrayList<String>();
        ArrayList<String> monsterList = new ArrayList<String>();
        String monster1 = "monster1";
        String monster2 = "monster2";
        String monster3 = "monster3";
        String monster4 = "monster4";
        //ArrayList <String> round1allList =new ArrayList<String>();
        //ArrayList <String> round2allList =new ArrayList<String>();
        //ArrayList <String> round3allList =new ArrayList<String>();
        //ArrayList <String> round4allList =new ArrayList<String>();
        //round1allList = allList;
        //round2allList = allList;
       // round3allList = allList;
        //round4allList = allList;
        ArrayList<String> monster1List = new ArrayList<String>();
        ArrayList<String> monster2List = new ArrayList<String>();
        ArrayList<String> monster3List = new ArrayList<String>();
        ArrayList<String> monster4List = new ArrayList<String>();
        monster1List = monsterList;
        monster2List = monsterList;
        monster3List = monsterList;
        monster4List = monsterList;
        Monster monster1 = new Monster("monster1");
        Monster monster2 = new Monster("monster2");
        Monster monster3 = new Monster("monster3");
        Monster monster3 = new Monster("monster3");
        

        

        Monster monster = new Monster("Monster");
        Hunter hunter = new Hunter("Hunter");
        Healer healer = new Healer("Healer");
        Mage mage = new Mage ("Mage");
        Warrior warrior = new Warrior("Warrior");

        boolean round_1_win = false;
        boolean round_2_win = false;
        boolean round_3_win = false;
        boolean round_4_win = false;
        boolean round_boos_win =false;


        
    
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Hello adventurer! What is your name?");
            name = input.nextLine();
            
            System.out.println("Greetings " + name);
            System.out.println("how many heros you want to have(max 4 heros)");
            
            numHeros= input.nextInt();

                    if (numHeros == 1){
                        System.out.println("What class would you like to have?");
                        System.out.println("1) Hunter");
                        System.out.println("2) Warrior");
                        System.out.println("3) Mage");
                        System.out.println("4) Healer");
                        
                        numChoice1 = input.nextInt();
                        switch(numChoice1){
                            case 1:
                                classType = "Hunter";
                                break;  
                            case 2:
                                classType = "Warrior";
                                break;  
                            case 3:
                                classType = "Mage";
                                break;  
                            case 4:
                                classType = "Healer";
                                break;  
                            default:
                                System.out.println("default");
                        }        
                        allList.add(classType);
                        allList.add(monster1);
                        monsterList.add(monster1);
                        heroList.add(classType);

                    }else if(numHeros == 2){
                        System.out.println("first class");
                        System.out.println("1) Hunter");
                        System.out.println("2) Warrior");
                        System.out.println("3) Mage");
                        System.out.println("4) Healer");
                        numChoice1 = input.nextInt();
                        switch(numChoice1){
                            case 1:
                                classType = "Hunter";
                                break;  
                            case 2:
                                classType = "Warrior";
                                break;  
                            case 3:
                                classType = "Mage";
                                break;  
                            case 4:
                                classType = "Healer";
                                break;  
                            default:
                                System.out.println("default");
                        }
                        allList.add(classType);
                        allList.add(monster1);
                        monsterList.add(monster1);
                        heroList.add(classType);

                        System.out.println("second class");
                        System.out.println("1) Hunter");
                        System.out.println("2) Warrior");
                        System.out.println("3) Mage");
                        System.out.println("4) Healer");
                        numChoice2 = input.nextInt();
                        switch(numChoice2){
                            case 1:
                                classType = "Hunter";
                                break;  
                            case 2:
                                classType = "Warrior";
                                break;  
                            case 3:
                                classType = "Mage";
                                break;  
                            case 4:
                                classType = "Healer";
                                break;  
                            default:
                                System.out.println("default");
                        } 
                        allList.add(classType);
                        allList.add(monster2);
                        monsterList.add(monster2);
                        heroList.add(classType);

                    }else if(numHeros == 3){
                        System.out.println("first class");
                        System.out.println("1) Hunter");
                        System.out.println("2) Warrior");
                        System.out.println("3) Mage");
                        System.out.println("4) Healer");
                        numChoice1 = input.nextInt();
                        switch(numChoice1){
                            case 1:
                                classType = "Hunter";
                                break;  
                            case 2:
                                classType = "Warrior";
                                break;  
                            case 3:
                                classType = "Mage";
                                break;  
                            case 4:
                                classType = "Healer";
                                break;  
                            default:
                                System.out.println("default");    
                        }
                    
                        allList.add(classType);
                        allList.add(monster1);
                        monsterList.add(monster1);
                        heroList.add(classType);
                    }
                        

                        System.out.println("second class");
                        System.out.println("1) Hunter");
                        System.out.println("2) Warrior");
                        System.out.println("3) Mage");
                        System.out.println("4) Healer");
                        numChoice2 = input.nextInt();
                        switch(numChoice2){
                            case 1:
                                classType = "Hunter";
                                break;  
                            case 2:
                                classType = "Warrior";
                                break;  
                            case 3:
                                classType = "Mage";
                                break;  
                            case 4:
                                classType = "Healer";
                                break;  
                            default:
                                System.out.println("default");        
                        } 
                        allList.add(classType);
                        allList.add(monster2);
                        monsterList.add(monster2);
                        heroList.add(classType);

                        System.out.println("third class");
                        System.out.println("1) Hunter");
                        System.out.println("2) Warrior");
                        System.out.println("3) Mage");
                        System.out.println("4) Healer");
                        numChoice3 = input.nextInt();
                        switch(numChoice3){
                            case 1:
                                classType = "Hunter";
                                break;  
                            case 2:
                                classType = "Warrior";
                                break;  
                            case 3:
                                classType = "Mage";
                                break;  
                            case 4:
                                classType = "Healer";
                                break;  
                            default:
                                System.out.println("default");
                        
                        }
                        allList.add(classType);
                        allList.add(monster3);
                        monsterList.add(monster3);
                        heroList.add(classType);

                    
                    while (numHeros != 1 && numHeros != 2 && numHeros != 3){
                        if (numHeros == 4){
                            System.out.println("first class");
                            System.out.println("1) Hunter");
                            System.out.println("2) Warrior");
                            System.out.println("3) Mage");
                            System.out.println("4) Healer");
                            numChoice1 = input.nextInt();
                            switch(numChoice1){
                                case 1:
                                    classType = "Hunter";
                                    break;  
                                case 2:
                                    classType = "Warrior";
                                    break;  
                                case 3:
                                    classType = "Mage";
                                    break;  
                                case 4:
                                    classType = "Healer";
                                    break;  
                                default:
                                    System.out.println("default");
                            }        
                        
                            allList.add(classType);
                            allList.add(monster1);
                            monsterList.add(monster1);
                            heroList.add(classType);

                            System.out.println("second class");
                            System.out.println("1) Hunter");
                            System.out.println("2) Warrior");
                            System.out.println("3) Mage");
                            System.out.println("4) Healer");
                            numChoice2 = input.nextInt();
                            switch(numChoice2){
                                case 1:
                                    classType = "Hunter";
                                    break;  
                                case 2:
                                    classType = "Warrior";
                                    break;  
                                case 3:
                                    classType = "Mage";
                                    break;  
                                case 4:
                                    classType = "Healer";
                                    break;  
                                default:
                                    System.out.println("default");
                            } 
                            allList.add(classType);
                            allList.add(monster2);
                            monsterList.add(monster2);
                            heroList.add(classType);

                            System.out.println("third class");
                            System.out.println("1) Hunter");
                            System.out.println("2) Warrior");
                            System.out.println("3) Mage");
                            System.out.println("4) Healer");
                            numChoice3 = input.nextInt();
                            switch(numChoice3){
                                case 1:
                                    classType = "Hunter";
                                    break;  
                                case 2:
                                    classType = "Warrior";
                                    break;  
                                case 3:
                                    classType = "Mage";
                                    break;  
                                case 4:
                                    classType = "Healer";
                                    break;  
                                default:
                                    System.out.println("default");
                        
                            }
                            allList.add(classType);
                            allList.add(monster3);
                            monsterList.add(monster3);
                            heroList.add(classType);

                            System.out.println("fourth class");
                            System.out.println("1) Hunter");
                            System.out.println("2) Warrior");
                            System.out.println("3) Mage");
                            System.out.println("4) Healer");
                            numChoice4 = input.nextInt();
                            switch(numChoice4){
                                case 1:
                                    classType = "Hunter";
                                    break;  
                                case 2:
                                    classType = "Warrior";
                                    break;  
                                case 3:
                                    classType = "Mage";
                                    break;  
                                case 4:
                                    classType = "Healer";
                                    break;    
                                default:
                                    System.out.println("default");
                        
                            }
                            allList.add(classType);
                            allList.add(monster4);
                            monsterList.add(monster4);
                            heroList.add(classType);    
                            }else {
                                System.out.println("Please enter a valid option");
                            }
                    }

                    input.nextLine();  

                    Hero hero = new Hero(name,weapons, classType, "0","0",health, attack,armor);

            System.out.println("Greetings " + hero.getName() );
            System.out.println("As a challenger, you will encounter 5 rounds of monsters, the last round is the boss");
            System.out.println("------FIRST ROUND------");

          
        boolean round1 = true;    
            while(allList.size() > 0){
                System.out.println("?");
                if (round1){
                    for(int i = 0; i<heroList.size(); i++){
                        System.out.println("Here is your hero's round: " + heroList.get(i));
                        System.out.println("You have 4 options:");
                        System.out.println("1) attack🔫  2) defense 🛡️ 3) use potion💊  4) use food🍎");
                        numChoice = input.nextInt();
                        if (numChoice == 1){    
                            int indexmonster = (int)(Math.random()* monsterList.size());
                            String element_monsterList = monsterList.get(indexmonster);
                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                            if ( heroList.get(i) =="Hunter"){
                                monster.looseHealth(hunter.getAttack());
                                System.out.println("and take damage " + hunter.getAttack() + monsterList + "reste health:"+ monster.getHealth());
                                
                    


                            } 
                                     
                            }else if (heroList.get(i) =="Healer"){
                                monster.looseHealth(healer.getAttack());
                                System.out.println("and take damage " + healer.getAttack() + element_monsterList + "reste health:"+ monster.getHealth());
                                if (element_monsterList == "Monster1"){
                                    (monster1.getHealth()<=0);
                                    System.out.println("Monster1 is dead"); 
                                    monster1List.remove(element_monsterList);   
                                }else if (element_monsterList == "Monster2"){
                                    (monster2.getHealth()<=);
                                    System.out.println("Monster2 is dead")
                                    monster1List.remove (element_monsterList);
                                }else if (element_monsterList == "Monster3"){
                                    (monster3.getHealth()<=);
                                    System.out.println("Monster3 is dead")
                                    monster1List.remove (element_monsterList);
                                }else if (element_monsterList == "Monster4"){
                                    (monster4.getHealth()<=);
                                    System.out.println("Monster4 is dead")
                                    monster1List.remove (element_monsterList);
                                }

                                
                            }else if (heroList.get(i) =="Mage"){
                                monster.looseHealth(mage.getAttack());
                                System.out.println("and take damage " + mage.getAttack() + element_monsterList + "reste health:"+ monster.getHealth());
                                if (element_monsterList == "Monster1"){
                                    (monster1.getHealth()<=0);
                                    System.out.println("Monster1 is dead"); 
                                    monster1List.remove(element_monsterList);   
                                }else if (element_monsterList == "Monster2"){
                                    (monster2.getHealth()<=);
                                    System.out.println("Monster2 is dead")
                                    monster1List.remove (element_monsterList);
                                }else if (element_monsterList == "Monster3"){
                                    (monster3.getHealth()<=);
                                    System.out.println("Monster3 is dead")
                                    monster1List.remove (element_monsterList);
                                }else if (element_monsterList == "Monster4"){
                                    (monster4.getHealth()<=);
                                    System.out.println("Monster4 is dead")
                                    monster1List.remove (element_monsterList);
                                }
                                
                            }else if (heroList.get(i) =="Warrior"){
                                monster.looseHealth(warrior.getAttack());
                                System.out.println("and take damage " + warrior.getAttack() + element_monsterList + "reste health:"+monster.getHealth());
                                if (element_monsterList == "Monster1"){
                                    (monster1.getHealth()<=0);
                                    System.out.println("Monster1 is dead"); 
                                    monster1List.remove(element_monsterList);   
                                }else if (element_monsterList == "Monster2"){
                                    (monster2.getHealth()<=);
                                    System.out.println("Monster2 is dead")
                                    monster1List.remove (element_monsterList);
                                }else if (element_monsterList == "Monster3"){
                                    (monster3.getHealth()<=);
                                    System.out.println("Monster3 is dead")
                                    monster1List.remove (element_monsterList);
                                }else if (element_monsterList == "Monster4"){
                                    (monster4.getHealth()<=);
                                    System.out.println("Monster4 is dead")
                                    monster1List.remove (element_monsterList);
                                }
                                
                            }

                            
                        
                        }else if (numChoice == 2){
                            System.out.println(heroList + "defense");

                            
                        }else if (numChoice == 3){
                            System.out.println("Which potion would you like to use?");
                            for(int i1 = 0; i1<potion_backpack.length; i1++){
                                if(potion_backpack[i1] != null){
                                    System.out.println("number " + i1 + " is " + potion_backpack[i1].getItemName());
                                }
                            }
                            
                        }else if (numChoice == 4){
                            System.out.println("Which food would you like to use?");
                            for(int i2 = 0; i2<food_backpack.length; i2++){
                                if(food_backpack[i2] != null){
                                    System.out.println("number " + i2 + " is " + food_backpack[i2].getItemName());
                                }
                            }
                            
                        }
                        
                        
                    }
                    round1 = false;
                       
                }else if (!round1) {
                    System.out.println("We're here");
                    int indexhero = (int)(Math.random()* heroList.size());
                    String element_heroList = heroList.get(indexhero);
                    for(int i = 0;i<monster1List.size();i++){
                        System.out.println(monsterList.get(i) + " attack " + element_heroList);
                            if (element_heroList =="Hunter"){
                                hunter.looseHealth(monster.getAttack());
                                System.out.println(monsterList.get(i)+ "attack"+element_heroList+ "and take damage " + monster.getAttack() + "Hunter reste health:"+ hunter.getHealth());
                                if(hunter.getHealth()<=0){
                                    System.out.println("Hunter is dead"); 
                                    heroList.remove("Hunter");
                                }      
                            }else if (element_heroList =="Healer"){
                                healer.looseHealth(monster.getAttack());
                                System.out.println(monsterList.get(i)+ "attack"+element_heroList+ "and take damage " + monster.getAttack() + "Healer reste health:"+ healer.getHealth());
                                if(healer.getHealth()<=0){
                                    heroList.remove("Healer");
                                    System.out.println("Healer is dead");
                                }
                            }else if (element_heroList =="Mage"){
                                mage.looseHealth(monster.getAttack());
                                System.out.println(monsterList.get(i)+ "attack"+element_heroList+ "and take damage " + monster.getAttack()+ "Mage reste health:"+ mage.getHealth());
                                if(mage.getHealth()<=0){
                                    System.out.println("Mage is dead");
                                    heroList.remove("Mage");
                                }
                            }else if (element_heroList =="Warrior"){
                                warrior.looseHealth(monster.getAttack());
                                System.out.println(monsterList.get(i)+ "attack"+element_heroList+ "and take damage " + monster.getAttack() + "Warrior reste health:"+ warrior.getHealth());
                                if(warrior.getHealth()<=0){
                                    System.out.println("Warrior is dead");
                                    heroList.remove("Warrior");
                                }
                            }
                        }
                    
                        round1 = true;
                

                }else if (monster1List.size() == 0){
                    System.out.println("Congratulations! Monsters are all dead,you can enter the second round!");
                    round_1_win = true;
                    break;
                    
                
                }else if(heroList.size() == 0){
                    System.out.println("sorry :( you lose!");
                    break;
                }
            }
        }
    }




            
        
    
    


 
 


          

   

