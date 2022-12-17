public class equipementattack {

    String name;	// 武器名字
    float harm = 0;	// 伤害
    Heros owner;		// 武器的主人
    public String classeType;
    public equipementattack(String name) {
        this.name = name;
        System.out.println("creer une arme" + name + ",la puissance d'attaque est：" + harm);
    }
        public equipementattack(String name, float harm){
            this.name = name;
            this.harm = harm;
            System.out.println("creer une arme" + name + ",la puissance d'attaque est：" + harm);
        }
        private void showHarm(){
            System.out.println(name + "point d 'attaque" + harm);
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public float getHarm() {
            return harm;
        }
        public void setHarm(float harm) {
            this.harm = harm;
        }
}
