
public class Monster extends Character {

	//親クラスに引数付コンストラクタが定義されているため、子クラスでも定義する
	public Monster(String name, int hp, int at, int df) {
		super(name, hp, at, df);
	}
	
}
