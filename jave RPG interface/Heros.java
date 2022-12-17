public class Heros  implements HerosInterface{
    String classeType;
    int sang; 		
    int harm;		
    int defence;	
    int nourriture;
    int potion;
    int armure;
	equipementattack equipement_attack;
	equipementDefend equipement_defend;
    boolean isLive;
    
    public Heros(String classeType , int sang,int harm,int defence ,int nourriture,int potion,int armure,boolean islive){
		this.classeType = classeType;
		this.sang = sang;
		this.harm = harm;
		this.defence = defence;
        this.nourriture = nourriture;
        this.potion = potion;
        this.armure=armure;
		isLive = true;
	}
	public StringBuilder getAttr(){
		StringBuilder stringBuilder = new StringBuilder();
		// stringBuilder.append(name + "的名字为：" + name + "\n");
		stringBuilder.append(classeType + "'s sang est : " + sang + "\n");
		stringBuilder.append(classeType + "'s attack est : " + harm + "\n");
		stringBuilder.append(classeType + "'s defence est : " + defence + "\n");
		if ( equipement_attack == null) {
			stringBuilder.append(classeType+ "'s arme est : null\n");
		}else{
			stringBuilder.append(classeType + "'s arme est : " + equipement_attack.classeType + "\n");
		}
		if (equipement_defend == null) {
			stringBuilder.append(classeType + "'s protection est : null" + "\n");
		}else{
			stringBuilder.append(classeType + "'s protection est : " + equipement_defend.classeType + "\n");
		}
		return stringBuilder;
	}
	public void showAttr(){
		// System.out.println(name + "的名字为：" + name);
		System.out.println(classeType + "'s sang est : " + sang);
		System.out.println(classeType+ "'s attaque est : " + harm);
		System.out.println(classeType + "'s defence is : " + defence);
		if (equipement_attack == null) {
			System.out.println(classeType + "'s arme is : null");
		}else{
			System.out.println(classeType + "'s arme is : " + equipement_attack.name);
		}
		if (equipement_defend == null) {
			System.out.println(classeType + "'s protection est : null");
		}else{
			System.out.println(classeType + "'s protection est : " + equipement_defend.name);
		}
	}
	public void die(){
		this.sang = 0;
		isLive = false;
		System.out.println(classeType + " est mort");
	}
	@Override
	public void attack() {
		System.out.println("hero attaque");
	}
	@Override
	public void defend() {
		System.out.println("hero defence");
	}
	public String getName() {
		return classeType;
	}
	public void setName(String classeType) {
		this.classeType = classeType;
	}
	public equipementattack getEquipment_attack() {
		return equipement_attack;
	}
	public equipementDefend getEquipment_defend() {
		return equipement_defend;
	}
	public float getHarm() {
		return harm;
	}
	public void setHarm(int harm) {
		this.harm = harm;
	}
	public float getDefence(int defemce) {
		return defence;
	}
	public void setDefence(int defence ) {
		this.defence = defence;
	}
	public float getHp() {
		return sang;
	}
	public void setHp(int sang) {
		this.sang = sang;
	}
	public void setSang(float f) {
	}
    public float getSang() {
        return 0;
    }
}

