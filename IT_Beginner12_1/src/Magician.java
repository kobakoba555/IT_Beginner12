
//親クラスに追加、更新したい要素を書き込む
public class Magician extends Character {

	// フィールド(追加)
	private int mp;			// MP
	private int costMp;		// 消費MP
	
	//親クラスに引数付コンストラクタが定義されているため、子クラスでも定義する
	public Magician(String name, int hp, int at, int df, int mp, int costMp) {
		super(name, hp, at, df);
		setMp(mp);
		setCostMp(costMp);
	}
	
    // getterとsetter(追加)
    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = Math.max(mp, 0);  // 0未満の場合は0に設定
    }

    public int getCostMp() {
        return this.costMp;
    }

    public void setCostMp(int costMp) {
        this.costMp = Math.max(costMp, 0);  // 0未満の場合は0に設定
    }
    	
	// 魔法攻撃(追加)
	public void magicAttack(Character opponent) {
		this.mp = this.mp - this.costMp;
		System.out.println(this.getName() + "の魔法攻撃！");
		System.out.println(opponent.getName() + "にダメージを" + this.getAt() + "与えた！");
		System.out.println("MPを" + this.costMp + "消費した");
		System.out.println("MP:" + this.mp);
		opponent.takeDamage(this.getAt());
	}
	
	//　回復魔法(更新)
	@Override
	public void heal() {		
		setHp(getHp() + 10);	//親クラスのprivateフィールドにアクセスできないためsetter, getterを使用
		this.mp = this.mp - this.costMp;
		System.out.println(this.getName() + "は回復魔法を唱えた！");
		System.out.println("MPを" + this.costMp + "消費し、体力が10回復した！！");
		System.out.println("HP:" + this.getHp() + " MP:" + this.mp);
	}
}
