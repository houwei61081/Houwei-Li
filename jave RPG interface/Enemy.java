public class Enemy implements EnemyInterface{
    private String classeType ="monstre";
	private int sang = 100;
	private int armure = 10;
	private int attaque = 10;
	boolean isLive;	// 是否活着

	// 敌人创建
	public Enemy(String classeType, int sang ,int armure, int attaque,int defence,boolean islive ){
		this.classeType = classeType;
		this.sang = sang;
		this.armure = armure;
		this.attaque  = attaque;
		isLive = true;	// 敌人活着
	
	}
	// 怪物死亡
	public void die(){
		this.sang = 0; 	// 生命归零
		isLive = false; // 变为死亡状态
		System.out.println(classeType + " Mort!");
	}
	
	//怪兽攻击
	public void attaque(){
        System.out.println(name + " attaque");
    }

    //怪兽防御
    public void defendce(){
        System.out.println(name + " defence");
    }

    public String getName(){
        return name;
    }

    public void getarmor(int armure){
        this.armure = armure;
    }

    public int getSang(){
        return sang;
    }

    public void setSang(int sang){
        this.sang = sang;
    }

    public int getAttaque(){
        return attaque;
    }

    public void setAttque(int attaque){
        this.attaque = attaque;
    }
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void defend() {
		// TODO Auto-generated method stub
		
	}
}

