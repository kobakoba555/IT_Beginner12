
import java.util.List;

public class Battle {

	//バトルメソッドの作成
	//勇者側のリスト:heros、モンスター側のリスト:monsters
	public static void battle(List<Character> heros, List<Monster> monsters) {
		
		System.out.println("バトル開始！");
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");

		//全滅しているチームがないか確認する
		while(!allDownHeros(heros) && !allDownMonsters(monsters)) {
			
			//勇者側の攻撃
			for(Character h : heros) {
				//体力が0でないキャラクターが攻撃する
				if(h.getHp() > 0) {
					//体力が0でないモンスター側のターゲットに攻撃する
					Monster target = findAliveMonster(monsters);
					if(target != null) {
						h.attack(target);
					}
				}
			}
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
			
			//モンスター側の攻撃
			for(Character m : monsters) {
				//体力が0でないキャラクターが攻撃する
				if(m.getHp() > 0) {
					//体力が0でないモンスター側のターゲットに攻撃する
					Character target = findAliveHero(heros);
					if(target != null) {
						m.attack(target);
					}
				}
			}
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		}
		
		//どちらかが全滅した場合、バトル結果を出力
		if(allDownHeros(heros)) {
			System.out.println("敗北しました、、、");
		}else if(allDownMonsters(monsters)) {
			System.out.println("勝利しました！！");
		}
	}
	
	//勇者側が全滅しているか判定するメソッド
    public static boolean allDownHeros(List<Character> heros) {
        for (Character member : heros) {
            if (member.getHp() > 0) {
                return false;
            }
        }
        return true;
    }

	//モンスター側が全滅しているか判定するメソッド
    public static boolean allDownMonsters(List<Monster> monsters) {
        for (Character member : monsters) {
            if (member.getHp() > 0) {
                return false;
            }
        }
        return true;
    }

	//生きている勇者側のキャラクターを探すメソッド
	public static Character findAliveHero(List<Character> heros) {
		for(Character  member : heros) {
			if(member.getHp() > 0) {
				return member;	//生きているキャラクターを返す
			}
		}
		return null;	//生きているキャラクターがいない場合、nullを返す
	}
	
	//生きているモンスターを探すメソッド
	//親クラスから子クラスには変換できないため、モンスターは別で作る
	public static Monster findAliveMonster(List<Monster> monsters) {
		for(Monster  member : monsters) {
			if(member.getHp() > 0) {
				return member;	//生きているモンスターを返す
			}
		}
		return null;	//生きているモンスターがいない場合、nullを返す
	}

}
