
import java.util.List;
import java.util.ArrayList;

public class Story {

	public static void main(String args[]) {
		
		//勇者側のキャラクターの生成
		
		//勇者生成
		SuperHero sh = new SuperHero("エイト", 100, 50, 30);
		System.out.println("勇者誕生！");
		System.out.println("名前：" + sh.getName());
		System.out.println("体力：" + sh.getHp());
		System.out.println("攻撃力：" + sh.getAt());
		System.out.println("防御力：" + sh.getDf());
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//魔法使い生成
		SuperMagician smg = new SuperMagician("ゼシカ", 70, 50, 40, 20, 10);
		System.out.println("魔法使い誕生！");
		System.out.println("名前：" + smg.getName());
		System.out.println("体力：" + smg.getHp());
		System.out.println("MP：" + smg.getMp());		
		System.out.println("攻撃力：" + smg.getAt());
		System.out.println("防御力：" + smg.getDf());
		System.out.println("基本消費MP：" + smg.getCostMp());		
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//モンスター側のモンスター生成
		
		//モンスター(1体目)生成
		SuperMonster sm = new SuperMonster("ポイズンドラゴン", 300, 30, 20, 10, 2);
		System.out.println("モンスターが現れた！");
		System.out.println("名前：" + sm.getName());
		System.out.println("体力：" + sm.getHp());
		System.out.println("攻撃力：" + sm.getAt());
		System.out.println("防御力：" + sm.getDf());
		System.out.println("毒攻撃力：" + sm.getPoisonAt());
		System.out.println("毒攻撃回数：" + sm.getPoisonCount());
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//モンスター(2体目)生成
		Monster m = new Monster("ミニドラゴン", 150, 40, 20);
		System.out.println("モンスターが現れた！");
		System.out.println("名前：" + m.getName());
		System.out.println("体力：" + m.getHp());
		System.out.println("攻撃力：" + m.getAt());
		System.out.println("防御力：" + m.getDf());
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
	
		//勇者側のリスト
		List<Character> heros = new ArrayList<>();
		heros.add(sh);
		heros.add(smg);
		
		//モンスター側のリスト
		List<Monster> monsters = new ArrayList<>();
		monsters.add(sm);
		monsters.add(m);
		
		//バトル
		//static(静的メンバ)のため、クラス名を通じて、インスタンス化させることなく呼び出すことができる
		Battle.battle(heros, monsters);
		
	}
}
