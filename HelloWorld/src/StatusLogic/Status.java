package StatusLogic;

public class Status {
	
	//フィールド変数
	private int hp;
	private int mp;
	private int atk;
	private int agi;
	private int def;
	
	//変数hpに対するsetter,getter処理
	public void setHp(int hp) {
		this.hp = hp;
	}public int getHp() {
		return this.hp;
	}

	//変数mpに対するsetter,getter処理
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getMp() {
		return this.mp;
	}

	//変数atkに対するsetter,getter処理
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getAtk() {
		return this.atk;
	}

	//変数agiに対するsetter,getter処理
	public void setAgi(int agi) {
		this.agi = agi;
	}
	public int getAgi() {
		return this.agi;
	}

	//変数defに対するsetter,getter処理
	public void setDef(int def) {
		this.def = def;
	}
	public int getDef() {
		return this.def;
	}

}
