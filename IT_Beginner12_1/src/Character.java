
//抽象メソッドを持つため、抽象クラスとなる
public abstract class Character {

	//フィールド
	//Hero, Magician, Monster共通のフィールドを定義する
    private String name;  // 名前
    private int hp;       // 体力
    private int at;       // 攻撃力
    private int df;       // 防御力

    //コンストラクタ
    //setterを使用し、適切な値を代入する
    public Character(String name, int hp, int at, int df) {
    	setName(name);
    	setHp(hp);
    	setAt(at);
    	setDf(df);   	
    }
    
    //getterとsetter
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 3 && name.length() <= 10) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("名前が不適切です。");
        }
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);  //0未満の場合は0に設定
    }

    public int getAt() {
        return this.at;
    }

    public void setAt(int at) {
        this.at = Math.max(at, 0);  //0未満の場合は0に設定
    }

    public int getDf() {
        return this.df;
    }

    public void setDf(int df) {
        this.df = Math.max(df, 0);  //0未満の場合は0に設定
    }

    //Hero, Magician, Monster共通のメソッドを定義する
    
    //通常攻撃メソッド
    public void attack(Character opponent) {
        System.out.println(this.name + "の攻撃！");
        System.out.println(opponent.getName() + "にダメージを" + this.at + "与えた！");
        opponent.takeDamage(this.at);
    }

    //防御メソッド
    public void defence() {
        this.df += 10;
        System.out.println(this.name + "は防御をした");
        System.out.println("防御力が10upし、" + this.df + "になった");
    }
    
    //ダメージメソッド
    public void takeDamage(int damage) {
    	this.hp -= damage;
		if(this.hp > 0) {
			System.out.println(this.name + "の残りHP:" + this.hp);
		}else {
			System.out.println(this.name + "は倒れた");
		}
    }

    //Hero, Magician, Monster共通のメソッドであるが、中身が異なる場合、抽象メソッドで定義する
    //Hero, Monsterは共通の内容であるため、中身の定義する
    //Magicianで上書きしたいため、抽象メソッドにしておく
    
	//回復メソッド
    public void heal() {
        this.hp += 10;
        System.out.println(this.name + "は休憩した");
        System.out.println("HPが10回復し、" + this.hp + "になった");
    }
   
}
