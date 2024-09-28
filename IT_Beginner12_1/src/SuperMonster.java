
public class SuperMonster extends Monster {

	//追加フィールド
	private int poisonAt;
	private int poisonCount;
	
	//getterとsetter
	public int getPoisonAt() {
		return this.poisonAt;
	}
	
	public void setPoisonAt(int poisonAt) {
		this.poisonAt = Math.max(poisonAt, 0);
	}
	
	public int getPoisonCount() {
		return this.poisonCount;
	}
	
	public void setPoisonCount(int poisonCount) {
		this.poisonCount = Math.max(poisonCount, 0);
	}
	
    //コンストラクタ
    public SuperMonster(String name, int hp, int at, int df, int poisonAt, int poisonCount) {
    	super(name, hp, at, df);
    	setPoisonAt(poisonAt);
    	setPoisonCount(poisonCount);
    }

	//追加メソッド
	//毒攻撃
	public void attack(Character opponent) {
		super.attack(opponent);
		if(opponent.getHp() > 0) {
			if(this.poisonCount > 0) {
		        System.out.println(this.getName() + "の毒攻撃！");
		        System.out.println(opponent.getName() + "に追加ダメージを" + this.poisonAt + "与えた！");
		        opponent.takeDamage(this.poisonAt);
		        this.poisonCount --;
		        System.out.println("残り毒攻撃回数:" + this.poisonCount);
			}else {
				System.out.println(this.getName() + "は毒攻撃を使えない！");
			}
		}
	}
}
