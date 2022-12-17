import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthLookAndFeel;

import java.util.ArrayList;
import java.util.Random;
public class game {
    public static void main(String[] args) {
        
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
        ArrayList<String> monster1List = new ArrayList<String>();
        ArrayList<String> monster2List = new ArrayList<String>();
        ArrayList<String> monster3List = new ArrayList<String>();
        ArrayList<String> monster4List = new ArrayList<String>();
        monster1List = monsterList;
        monster2List = monsterList;
        monster3List = monsterList;
        monster4List = monsterList;
        
        Monster monster1Monster = new Monster ("monster1 ");
        Monster monster2Monster = new Monster ("monster2 ");
        Monster monster3Monster = new Monster ("monster3 ");
        Monster monster4Monster = new Monster ("monster4 ");
        Monster monster = new Monster("Monster");

        Hunter hunter = new Hunter("Hunter");
        Healer healer = new Healer("Healer");
        Mage mage = new Mage ("Mage");
        Warrior warrior = new Warrior("Warrior");

        arrowHunter arrowHunter =new arrowHunter("arrowHunter");
        spinachHealer spinachHealer=new spinachHealer("spinachHealer");
        magicMage magicMage =new magicMage("magicMage");
        hitWarrior hitWarrior = new hitWarrior("hitWarrior");

        boolean round_1_win = false;
        boolean round_2_win = false;
        boolean round_3_win = false;
        boolean round_4_win = false;
        boolean round_boos_win =false;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Hello adventurer! Welcome to Mini RPG Lite 3000! What is your name?");
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

            }
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

            boolean round1 =true;
                    while(allList.size()>0){
                        if(round1){
                            for(int i =0;i<heroList.size();i++){
                                System.out.println("Here is your round:"+heroList.get(i));
                                System.out.println("You have 4 options:");
                                System.out.println("1)attack 2)defense 3)use potion 4)use food 5)use Weapon");
                                numChoice = input.nextInt();
                                if (numChoice == 1){
                                    int indexmonster = (int)(Math.random()* monsterList.size());
                                    String element_monsterList = monster1List.get(indexmonster);
                           
                                    if(heroList.get(i) =="Hunter"){
                                        if (element_monsterList == "monster1"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster1Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster1Monster.getHealth());
                                                if (monster1Monster.getHealth()<=0){
                                                    System.out.println("Monster1 is dead");
                                                    monster1List.remove(element_monsterList);
                                                }       
                                        }else if(element_monsterList == "monster2"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster2Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster2Monster.getHealth());
                                            if (monster2Monster.getHealth()<=0){
                                                System.out.println("Monster2 is dead");
                                                monster1List.remove(element_monsterList);
                                            }
                                        }else if(element_monsterList == "monster3"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster3Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster3Monster.getHealth());
                                            if (monster3Monster.getHealth()<=0){
                                                System.out.println("Monster2 is dead");
                                                monster1List.remove(element_monsterList);
                                            }
                                        }else if(element_monsterList == "monster4"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster4Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster4Monster.getHealth());
                                            if (monster4Monster.getHealth()<=0){
                                                System.out.println("Monster4 is dead");
                                                monster1List.remove(element_monsterList);
                                            }
                                        }
                                    }else if (heroList.get(i) =="Healer"){
                                        if (element_monsterList == "Monster1"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster1Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster1Monster.getHealth()<=0){
                                                    System.out.println("Monster1 is dead");
                                                    monster1List.remove(element_monsterList);
                                                }       
                                        }else if(element_monsterList == "Monster2"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster2Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster2Monster.getHealth()<=0){
                                                System.out.println("Monster2 is dead");
                                                monster1List.remove(element_monsterList);
                                            }
                                        }else if(element_monsterList == "Monster3"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster3Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                            if (monster3Monster.getHealth()<=0){
                                                System.out.println("Monster2 is dead");
                                                monster1List.remove(element_monsterList);
                                            }
                                        }else if(element_monsterList == "Monster4"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster4Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster4Monster.getHealth()<=0){
                                                    System.out.println("Monster4 is dead");
                                                    monster1List.remove(element_monsterList);
                                                }
                                        }
                                        
                                        
                                    }else if (heroList.get(i) =="Mage"){
                                        if (element_monsterList == "Monster1"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster1Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster1Monster.getHealth()<=0){
                                                    System.out.println("Monster1 is dead");
                                                    monster1List.remove(element_monsterList);
                                                }       
                                        }else if(element_monsterList == "Monster2"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster2Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster2Monster.getHealth()<=0){
                                                    System.out.println("Monster2 is dead");
                                                    monster1List.remove(element_monsterList);
                                                }
                                        }else if(element_monsterList == "Monster3"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster3Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster3Monster.getHealth()<=0){
                                                    System.out.println("Monster2 is dead");
                                                    monster1List.remove(element_monsterList);
                                            }
                                        }else if(element_monsterList == "Monster4"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster4Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster4Monster.getHealth()<=0){
                                                    System.out.println("Monster4 is dead");
                                                    monster1List.remove(element_monsterList);
                                        }
                                    }
                                        
                                        
                                    }else if (heroList.get(i) =="Warrior"){
                                        if (element_monsterList == "Monster1"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster1Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster1Monster.getHealth()<=0){
                                                    System.out.println("Monster1 is dead");
                                                    monster1List.remove(element_monsterList);
                                                }       
                                        }else if(element_monsterList == "Monster2"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster2Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster2Monster.getHealth()<=0){
                                                    System.out.println("Monster2 is dead");
                                                    monster1List.remove(element_monsterList);
                                                }
                                        }else if(element_monsterList == "Monster3"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster3Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster3Monster.getHealth()<=0){
                                                    System.out.println("Monster2 is dead");
                                                    monster1List.remove(element_monsterList);
                                                }
                                        }else if(element_monsterList == "Monster4"){
                                            System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                            monster4Monster.looseHealth(hunter.getAttack());
                                            System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster4Monster.getHealth()<=0){
                                                    System.out.println("Monster4 is dead");
                                                    monster1List.remove(element_monsterList);
                                        }
                                    }
                                        
                                    }
                                
                                }else if (numChoice == 2){
                                    if (heroList.get(i) =="Hunter"){
                                        System.out.println("Hunter defense");
                                        hunter.gainHealth(5);
                                    }else if(heroList.get(i) =="Healer"){
                                        System.out.println("Healer defense");
                                        healer.gainHealth(10);
                                    }else if (heroList.get(i) =="Mage"){
                                        System.out.println("Mage defense");
                                        mage.gainHealth(5);
                                    }else if (heroList.get(i) =="Warrior");
                                        System.out.println("Warrior defense");
                                        warrior.gainHealth(5);

          
                                }else if (numChoice == 3){
                                    
                                        if(heroList.get(i) =="Hunter"){
                                            if(hunter.getPotion() != null){
                                                System.out.println("Hunter use the potion");
                                                hunter.gainAttack(10);                                     
                                            }else {
                                                System.out .println("Hunter don't have potion");
                                            }
                                        }else if(heroList.get(i) =="Healer"){
                                            if(healer.getPotion() != null){
                                                System.out.println("Healer use the potion");
                                                healer.gainAttack(10);                                     
                                            }else {
                                                System.out .println("Healer don't have potion");
                                            }
                                        }else if(heroList.get(i) =="Mage"){
                                            if(mage.getPotion() != null){
                                                System.out.println("Mage use the potion");
                                                mage.gainAttack(10);                                     
                                            }else {
                                                System.out .println("Mage don't have potion");
                                            }
                                        }else if(heroList.get(i) =="Warrior"){
                                            if(warrior.getPotion() != null){
                                                System.out.println("Warrior use the potion");
                                                warrior.gainAttack(10);                                     
                                            }else {
                                                System.out .println("Warrior don't have potion");
                                            }
                                        }
                                }else if (numChoice == 4){
                                    
                                        if(heroList.get(i) =="Hunter"){
                                            if(hunter.getFood() !=null){
                                                System.out.println("Hunter use the food");
                                                hunter.gainHealth(10);
                                            }else{
                                                System.out.println("Hunter don't have food ");
                                            }
                                        }else if (heroList.get(i) =="Healer"){
                                            if(healer.getFood() !=null){
                                                System.out.println("Healer use the food");
                                                healer.gainHealth(5);
                                            }else{
                                                System.out.println("Healer don't have food ");
                                            }
                                        }else if(heroList.get(i) == "Mage"){
                                            if(mage.getFood() !=null){
                                                System.out.println("Mage use the food");
                                                mage.gainHealth(5);
                                            }else{
                                                System.out.println("Mage don't have food ");
                                            }
                                        }else if (heroList.get(i) == "Warrior"){
                                            if(warrior.getFood() !=null){
                                                System.out.println("Warrior use the food");
                                                warrior.gainHealth(5);
                                            }else{
                                                System.out.println("Warrior don't have food ");
                                            }  
                                        }
                                        
                                    }else if (numChoice == 5){
                                        int indexmonster = (int)(Math.random()* monsterList.size());
                                        String element_monsterList = monsterList.get(indexmonster);
                                        if(heroList.get(i) =="Hunter"){
                                            System.out.println("Hunter use Weapon(Arrow)");
                                            arrowHunter.looseAmount(1);
                                                if (element_monsterList =="Monster1"){
                                                    monster1Monster.looseHealth(arrowHunter.getDamage());
                                                    System.out.println("Monstr1 loose"+arrowHunter.getDamage());
                                                }else if(element_monsterList =="Monster2"){
                                                    monster2Monster.looseHealth(arrowHunter.getDamage());
                                                    System.out.println("Monstr2 loose"+arrowHunter.getDamage());
                                                }else if(element_monsterList =="Monster3"){
                                                    monster3Monster.looseHealth(arrowHunter.getDamage());
                                                    System.out.println("Monstr3 loose"+arrowHunter.getDamage());
                                                }else if(element_monsterList =="Monster4"){
                                                    monster4Monster.looseHealth(arrowHunter.getDamage());
                                                    System.out.println("Monstr4 loose"+arrowHunter.getDamage());
                                                }
                                        }else if(heroList.get(i) =="Healer"){
                                            System.out.println("Healer use Weapon(spanach)");
                                            spinachHealer.looseAmount(1);
                                                if (element_monsterList =="Monster1"){
                                                    monster1Monster.looseHealth(spinachHealer.getDamage());
                                                    System.out.println("Monstr1 loose"+spinachHealer.getDamage());
                                                }else if(element_monsterList =="Monster2"){
                                                    monster2Monster.looseHealth(spinachHealer.getDamage());
                                                    System.out.println("Monstr2 loose"+spinachHealer.getDamage());
                                                }else if(element_monsterList =="Monster3"){
                                                    monster3Monster.looseHealth(spinachHealer.getDamage());
                                                    System.out.println("Monstr3 loose"+spinachHealer.getDamage());
                                                }else if(element_monsterList =="Monster4"){
                                                    monster4Monster.looseHealth(spinachHealer.getDamage());
                                                    System.out.println("Monstr4 loose"+spinachHealer.getDamage());
                                                }

                                        }else if(heroList.get(i) =="Mage"){
                                            System.out.println("Mage use Weapon(Magic)");
                                            
                                                if (element_monsterList =="Monster1"){
                                                    monster1Monster.looseHealth(magicMage.getDamage());
                                                    System.out.println("Monstr1 loose"+magicMage.getDamage());
                                                }else if(element_monsterList =="Monster2"){
                                                    monster2Monster.looseHealth(magicMage.getDamage());
                                                    System.out.println("Monstr2 loose"+magicMage.getDamage());
                                                }else if(element_monsterList =="Monster3"){
                                                    monster3Monster.looseHealth(magicMage.getDamage());
                                                    System.out.println("Monstr3 loose"+magicMage.getDamage());
                                                }else if(element_monsterList =="Monster4"){
                                                    monster4Monster.looseHealth(magicMage.getDamage());
                                                    System.out.println("Monstr4 loose"+magicMage.getDamage());
                                                }

                                        }else if(heroList.get(i) =="Warrior"){
                                            System.out.println("Warrior use Weapon(hit)");
                                            
                                                if (element_monsterList =="Monster1"){
                                                    monster1Monster.looseHealth(hitWarrior.getDamage());
                                                    System.out.println("Monstr1 loose"+hitWarrior.getDamage());
                                                }else if(element_monsterList =="Monster2"){
                                                    monster2Monster.looseHealth(hitWarrior.getDamage());
                                                    System.out.println("Monstr2 loose"+hitWarrior.getDamage());
                                                }else if(element_monsterList =="Monster3"){
                                                    monster3Monster.looseHealth(hitWarrior.getDamage());
                                                    System.out.println("Monstr3 loose"+hitWarrior.getDamage());
                                                }else if(element_monsterList =="Monster4"){
                                                    monster4Monster.looseHealth(hitWarrior.getDamage());
                                                    System.out.println("Monstr4 loose"+hitWarrior.getDamage());
                                                }

                                        }

                                    } 
                            
                            round1= false;
                    }
                        }else if(!round1) { 
                            int indexhero = (int)(Math.random()* heroList.size());
                            String element_heroList = heroList.get(indexhero);
                            for(int i = 0;i<monster1List.size();i++){
                                System.out.println(monsterList.get(i) + " attack " + element_heroList);
                                if (element_heroList =="Hunter"){
                                    hunter.looseHealth(monster.getAttack());
                                    System.out.println("and take damage " + monster.getAttack() + "Hunter reste health:"+ hunter.getHealth());
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
                        }else if(heroList.size() == 0){
                                System.out.println("sorry :( you lose!");
                                break;
                            }
                        else if (monster1List.size() == 0){
                            System.out.println("Congratulations! Monsters are all dead,you can enter the second round!");
                            System.out.println("Befor enter the seconde round ,you can choose");
                            System.out.println("1)increase attack 2)increase defense 3)increase the number of potion 4)increase the number of food 5)increase efficaty of potion 6) increase efficaty of food 7)increase the number of arrow(jusfor Hunter!) 8)reduce mana cost 9) increse damage of hit 10) increase damage of magic 11)increase dammage of spanich");
                            int numChoiceBonus = input.nextInt();
                            switch(numChoiceBonus){
                                
                                case 1 :
                                int indexhero = (int)(Math.random()* heroList.size());
                                String element_heroList = heroList.get(indexhero);
                                    if (element_heroList =="Hunter "){
                                        hunter.gainAttack(10);
                                        System.out.print("Hunter increase attack");
                                        System.out.println("Hunter attack is 60 now ");
                                    }else if (element_heroList == "Healer"){
                                        healer.gainAttack(15);
                                        System.out.print("Healer increase attack");
                                        System.out.println("Healer attack is 35 now");
                                    }else if (element_heroList =="Mage"){
                                        mage.gainAttack(5);
                                        System.out.print("Mage increase attack");
                                        System.out.println("Mage attack is  25 now");
                                    }else if (element_heroList =="Warrior"){
                                        warrior.gainAttack(15);
                                        System.out.print("Warrior increase attack");
                                        System.out.println("Warrior attack is 35 now");
                                    }
                                case 2:
                                int indexhero2 = (int)(Math.random()* heroList.size());
                                String element_heroList2 = heroList.get(indexhero2);
                                    if (element_heroList2 =="Hunter "){
                                        hunter.gainHealth(50);
                                        System.out.println("Hunter can use a defense for the next round");
                                    }else if (element_heroList2 == "Healer"){
                                        healer.gainHealth(20);
                                        System.out.println("Healer can use a defense for the next round");
                                    }else if (element_heroList2 =="Mage"){
                                        mage.gainHealth(30);
                                        System.out.println("Mage can use a defense for the next round");
                                    }else if (element_heroList2 =="Warrior"){
                                        warrior.gainHealth(30);
                                        System.out.println("Warrior can use a defense for the next round");
                                    }
                                case 3:
                                int indexhero3 = (int)(Math.random()* heroList.size());
                                String element_heroList3 = heroList.get(indexhero3);
                                    

                                case 5:
                                int indexhero5 = (int)(Math.random()* heroList.size());
                                String element_heroList5 = heroList.get(indexhero5);
                                    if (element_heroList5 =="Hunter "){
                                        hunter.gainHealth(10);
                                        System.out.println("Hunter use potion");
                                    }else if (element_heroList5 == "Healer"){
                                        healer.gainHealth(20);
                                        System.out.println("Healer use potion");
                                    }else if (element_heroList5 =="Mage"){
                                        mage.gainHealth(30);
                                        System.out.println("Mage use potion");
                                    }else if (element_heroList5 =="Warrior"){
                                        warrior.gainHealth(30);
                                        System.out.println("Warrior use potion");
                                    }


                            }
                            
                        round_1_win =round_2_win;
                    if (round_2_win == false){
                        boolean round2 =true;
                        while(allList.size()>0){
                            if(round2){
                                for(int i =0;i<heroList.size();i++){
                                    System.out.println("Here is your round:"+heroList.get(i));
                                    System.out.println("You have 4 options:");
                                    System.out.println("1)attack 2)defense 3)use potion 4)use food 5)use Weapon");
                                    numChoice = input.nextInt();
                                    if (numChoice == 1){
                                        int indexmonster = (int)(Math.random()* monsterList.size());
                                        String element_monsterList = monsterList.get(indexmonster);
                               
                                        if(heroList.get(i) =="Hunter"){
                                            if (element_monsterList == "monster1"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster1Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster1Monster.getHealth());
                                                    if (monster1Monster.getHealth()<=0){
                                                        System.out.println("Monster1 is dead");
                                                        monster2List.remove(element_monsterList);
                                                    }       
                                            }else if(element_monsterList == "monster2"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster2Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster2Monster.getHealth());
                                                if (monster2Monster.getHealth()<=0){
                                                    System.out.println("Monster2 is dead");
                                                    monster2List.remove(element_monsterList);
                                                }
                                            }else if(element_monsterList == "monster3"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster3Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster3Monster.getHealth());
                                                if (monster3Monster.getHealth()<=0){
                                                    System.out.println("Monster2 is dead");
                                                    monster2List.remove(element_monsterList);
                                                }
                                            }else if(element_monsterList == "monster4"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster4Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster4Monster.getHealth());
                                                if (monster4Monster.getHealth()<=0){
                                                    System.out.println("Monster4 is dead");
                                                    monster2List.remove(element_monsterList);
                                                }
                                            }
                                        }else if (heroList.get(i) =="Healer"){
                                            if (element_monsterList == "Monster1"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster1Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster1Monster.getHealth()<=0){
                                                        System.out.println("Monster1 is dead");
                                                        monster2List.remove(element_monsterList);
                                                    }       
                                            }else if(element_monsterList == "Monster2"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster2Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster2Monster.getHealth()<=0){
                                                    System.out.println("Monster2 is dead");
                                                    monster2List.remove(element_monsterList);
                                                }
                                            }else if(element_monsterList == "Monster3"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster3Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                if (monster3Monster.getHealth()<=0){
                                                    System.out.println("Monster2 is dead");
                                                    monster2List.remove(element_monsterList);
                                                }
                                            }else if(element_monsterList == "Monster4"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster4Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster4Monster.getHealth()<=0){
                                                        System.out.println("Monster4 is dead");
                                                        monster2List.remove(element_monsterList);
                                                    }
                                            }
                                            
                                            
                                        }else if (heroList.get(i) =="Mage"){
                                            if (element_monsterList == "Monster1"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster1Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster1Monster.getHealth()<=0){
                                                        System.out.println("Monster1 is dead");
                                                        monster2List.remove(element_monsterList);
                                                    }       
                                            }else if(element_monsterList == "Monster2"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster2Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster2Monster.getHealth()<=0){
                                                        System.out.println("Monster2 is dead");
                                                        monster2List.remove(element_monsterList);
                                                    }
                                            }else if(element_monsterList == "Monster3"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster3Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster3Monster.getHealth()<=0){
                                                        System.out.println("Monster2 is dead");
                                                        monster2List.remove(element_monsterList);
                                                }
                                            }else if(element_monsterList == "Monster4"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster4Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster4Monster.getHealth()<=0){
                                                        System.out.println("Monster4 is dead");
                                                        monster2List.remove(element_monsterList);
                                            }
                                        }
                                            
                                            
                                        }else if (heroList.get(i) =="Warrior"){
                                            if (element_monsterList == "Monster1"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster1Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster1Monster.getHealth()<=0){
                                                        System.out.println("Monster1 is dead");
                                                        monster2List.remove(element_monsterList);
                                                    }       
                                            }else if(element_monsterList == "Monster2"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster2Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster2Monster.getHealth()<=0){
                                                        System.out.println("Monster2 is dead");
                                                        monster2List.remove(element_monsterList);
                                                    }
                                            }else if(element_monsterList == "Monster3"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster3Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack() + element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster3Monster.getHealth()<=0){
                                                        System.out.println("Monster2 is dead");
                                                        monster2List.remove(element_monsterList);
                                                    }
                                            }else if(element_monsterList == "Monster4"){
                                                System.out.println(heroList.get(i) + " attack " +element_monsterList);
                                                monster4Monster.looseHealth(hunter.getAttack());
                                                System.out.println("and take damage "+hunter.getAttack()+ element_monsterList+"reste health:"+ monster.getHealth());
                                                    if (monster4Monster.getHealth()<=0){
                                                        System.out.println("Monster4 is dead");
                                                        monster2List.remove(element_monsterList);
                                            }
                                        }
                                            
                                        }
                                    
                                    }else if (numChoice == 2){
                                        if (heroList.get(i) =="Hunter"){
                                            System.out.println("Hunter defense");
                                            hunter.gainHealth(5);
                                        }else if(heroList.get(i) =="Healer"){
                                            System.out.println("Healer defense");
                                            healer.gainHealth(10);
                                        }else if (heroList.get(i) =="Mage"){
                                            System.out.println("Mage defense");
                                            mage.gainHealth(5);
                                        }else if (heroList.get(i) =="Warrior");
                                            System.out.println("Warrior defense");
                                            warrior.gainHealth(5);
    
              
                                    }else if (numChoice == 3){
                                        
                                            if(heroList.get(i) =="Hunter"){
                                                if(hunter.getPotion() != null){
                                                    System.out.println("Hunter use the potion");
                                                    hunter.gainAttack(10);                                     
                                                }else {
                                                    System.out .println("Hunter don't have potion");
                                                }
                                            }else if(heroList.get(i) =="Healer"){
                                                if(healer.getPotion() != null){
                                                    System.out.println("Healer use the potion");
                                                    healer.gainAttack(10);                                     
                                                }else {
                                                    System.out .println("Healer don't have potion");
                                                }
                                            }else if(heroList.get(i) =="Mage"){
                                                if(mage.getPotion() != null){
                                                    System.out.println("Mage use the potion");
                                                    mage.gainAttack(10);                                     
                                                }else {
                                                    System.out .println("Mage don't have potion");
                                                }
                                            }else if(heroList.get(i) =="Warrior"){
                                                if(warrior.getPotion() != null){
                                                    System.out.println("Warrior use the potion");
                                                    warrior.gainAttack(10);                                     
                                                }else {
                                                    System.out .println("Warrior don't have potion");
                                                }
                                            }
                                    }else if (numChoice == 4){
                                        
                                            if(heroList.get(i) =="Hunter"){
                                                if(hunter.getFood() !=null){
                                                    System.out.println("Hunter use the food");
                                                    hunter.gainHealth(10);
                                                }else{
                                                    System.out.println("Hunter don't have food ");
                                                }
                                            }else if (heroList.get(i) =="Healer"){
                                                if(healer.getFood() !=null){
                                                    System.out.println("Healer use the food");
                                                    healer.gainHealth(5);
                                                }else{
                                                    System.out.println("Healer don't have food ");
                                                }
                                            }else if(heroList.get(i) == "Mage"){
                                                if(mage.getFood() !=null){
                                                    System.out.println("Mage use the food");
                                                    mage.gainHealth(5);
                                                }else{
                                                    System.out.println("Mage don't have food ");
                                                }
                                            }else if (heroList.get(i) == "Warrior"){
                                                if(warrior.getFood() !=null){
                                                    System.out.println("Warrior use the food");
                                                    warrior.gainHealth(5);
                                                }else{
                                                    System.out.println("Warrior don't have food ");
                                                }  
                                            }
                                            
                                        }else if (numChoice == 5){
                                            int indexmonster = (int)(Math.random()* monsterList.size());
                                            String element_monsterList = monsterList.get(indexmonster);
                                            if(heroList.get(i) =="Hunter"){
                                                System.out.println("Hunter use Weapon(Arrow)");
                                                arrowHunter.looseAmount(1);
                                                    if (element_monsterList =="Monster1"){
                                                        monster1Monster.looseHealth(arrowHunter.getDamage());
                                                        System.out.println("Monstr1 loose"+arrowHunter.getDamage());
                                                    }else if(element_monsterList =="Monster2"){
                                                        monster2Monster.looseHealth(arrowHunter.getDamage());
                                                        System.out.println("Monstr2 loose"+arrowHunter.getDamage());
                                                    }else if(element_monsterList =="Monster3"){
                                                        monster3Monster.looseHealth(arrowHunter.getDamage());
                                                        System.out.println("Monstr3 loose"+arrowHunter.getDamage());
                                                    }else if(element_monsterList =="Monster4"){
                                                        monster4Monster.looseHealth(arrowHunter.getDamage());
                                                        System.out.println("Monstr4 loose"+arrowHunter.getDamage());
                                                    }
                                            }else if(heroList.get(i) =="Healer"){
                                                System.out.println("Healer use Weapon(spanach)");
                                                spinachHealer.looseAmount(1);
                                                    if (element_monsterList =="Monster1"){
                                                        monster1Monster.looseHealth(spinachHealer.getDamage());
                                                        System.out.println("Monstr1 loose"+spinachHealer.getDamage());
                                                    }else if(element_monsterList =="Monster2"){
                                                        monster2Monster.looseHealth(spinachHealer.getDamage());
                                                        System.out.println("Monstr2 loose"+spinachHealer.getDamage());
                                                    }else if(element_monsterList =="Monster3"){
                                                        monster3Monster.looseHealth(spinachHealer.getDamage());
                                                        System.out.println("Monstr3 loose"+spinachHealer.getDamage());
                                                    }else if(element_monsterList =="Monster4"){
                                                        monster4Monster.looseHealth(spinachHealer.getDamage());
                                                        System.out.println("Monstr4 loose"+spinachHealer.getDamage());
                                                    }
    
                                            }else if(heroList.get(i) =="Mage"){
                                                System.out.println("Mage use Weapon(Magic)");
                                                
                                                    if (element_monsterList =="Monster1"){
                                                        monster1Monster.looseHealth(magicMage.getDamage());
                                                        System.out.println("Monstr1 loose"+magicMage.getDamage());
                                                    }else if(element_monsterList =="Monster2"){
                                                        monster2Monster.looseHealth(magicMage.getDamage());
                                                        System.out.println("Monstr2 loose"+magicMage.getDamage());
                                                    }else if(element_monsterList =="Monster3"){
                                                        monster3Monster.looseHealth(magicMage.getDamage());
                                                        System.out.println("Monstr3 loose"+magicMage.getDamage());
                                                    }else if(element_monsterList =="Monster4"){
                                                        monster4Monster.looseHealth(magicMage.getDamage());
                                                        System.out.println("Monstr4 loose"+magicMage.getDamage());
                                                    }
    
                                            }else if(heroList.get(i) =="Warrior"){
                                                System.out.println("Warrior use Weapon(hit)");
                                                
                                                    if (element_monsterList =="Monster1"){
                                                        monster1Monster.looseHealth(hitWarrior.getDamage());
                                                        System.out.println("Monstr1 loose"+hitWarrior.getDamage());
                                                    }else if(element_monsterList =="Monster2"){
                                                        monster2Monster.looseHealth(hitWarrior.getDamage());
                                                        System.out.println("Monstr2 loose"+hitWarrior.getDamage());
                                                    }else if(element_monsterList =="Monster3"){
                                                        monster3Monster.looseHealth(hitWarrior.getDamage());
                                                        System.out.println("Monstr3 loose"+hitWarrior.getDamage());
                                                    }else if(element_monsterList =="Monster4"){
                                                        monster4Monster.looseHealth(hitWarrior.getDamage());
                                                        System.out.println("Monstr4 loose"+hitWarrior.getDamage());
                                                    }
    
                                            }
    
                                        } 
                                
                                round2= false;
                        }
                            }else if(!round2) { 
                                int indexhero = (int)(Math.random()* heroList.size());
                                String element_heroList = heroList.get(indexhero);
                                for(int i = 0;i<monster2List.size();i++){
                                    System.out.println(monster2List.get(i) + " attack " + element_heroList);
                                    if (element_heroList =="Hunter"){
                                        hunter.looseHealth(monster.getAttack());
                                        System.out.println("and take damage " + monster.getAttack() + "Hunter reste health:"+ hunter.getHealth());
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
                        
                                round2 = true;
                            }else if(heroList.size() == 0){
                                    System.out.println("sorry :( you lose!");
                                    break;
                                }
                            else if (monster2List.size() == 0){
                                System.out.println("Congratulations! Monsters are all dead,you can enter the second round!");
                                System.out.println("Befor enter the seconde round ,you can choose");


                    }
                        
                        
                    }
                    
                    
                }
            }
        }
    }
}
}
    
    
        
    
 

                                   