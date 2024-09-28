
public class SuperMagician extends Magician {

	//コンストラクタ
	public SuperMagician(String name, int hp, int mp, int at, int df, int costMp) {
		super(name, hp, mp, at, df, costMp);
	}
	//追加メソッド
	//超攻撃魔法（魔法攻撃の2倍のダメージ、2倍の消費MP）
	public void superMagicAttack(Character opponent) {
		
		//魔法攻撃の2倍の消費MP
		int costMp = getCostMp();
		int superCostMp = costMp * 2;
		setMp(getMp() - superCostMp);
		
		System.out.println(this.getName() + "の超攻撃魔法！");
		System.out.println(opponent.getName() + "にダメージを" + this.getAt()*2 + "与えた！");
		System.out.println("MPを" + superCostMp + "消費した");
		System.out.println("MP:" + this.getMp());
		opponent.takeDamage(this.getAt()*2);
		
	}
}
