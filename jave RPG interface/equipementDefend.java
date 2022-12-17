public class equipementDefend implements EquDefInterface {
    String name;	// 装备名字
	float defence = 0;	// 防御力
	public String classeType;
	public equipementDefend(String name) {
		this.name = name;
		System.out.println("创建了一件" + name + ",防御力为：" + defence);
	}
	public equipementDefend(String name, float defence){
		this.name = name;
		this.defence = defence;
		System.out.println("创建了一件" + name + ",防御力为：" + defence);
	}
	private void showDefence(){
		System.out.println(name + "的防御力为：" + defence);
	}
	public String getName() {
		return name;
	}
	public void setDefence(float defence) {
		this.defence = defence;
	}
	public float getDefence() {
		return defence;
	}
}
