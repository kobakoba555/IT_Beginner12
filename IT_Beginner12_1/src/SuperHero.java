
public class SuperHero extends Hero {

	//コンストラクタ(親クラスが引数付のコンストラクタのため、定義)
	public SuperHero(String name, int hp, int at, int df) {
		super(name, hp, at, df);
	}
	
	//オーバーライド
	public void attack(Monster monster) {	//2回攻撃
		super.attack(monster);
		super.attack(monster);
	}
	
}
