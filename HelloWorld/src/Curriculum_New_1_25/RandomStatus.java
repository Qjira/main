package Curriculum_New_1_25;

import java.util.Random;

public class RandomStatus {
	//rndのインスタンス化
		Random rnd = new Random();
		//フィールド変数の宣言
		private int hp;
		private int mp;
		private int atk;
		private int agi;
		private int def;
		
		//コンストラクタの作成
		RandomStatus(int hp, int mp, int atk, int agi, int def) {
			//変数hpに0～999の中の値をランダムに代入
			this.hp = rnd.nextInt(1000);
			//変数mpに0～999の中の値をランダムに代入
			this.mp = rnd.nextInt(1000);
			//変数atkに0～999の中の値をランダムに代入
			this.atk = rnd.nextInt(1000);
			//変数agiに0～999の中の値をランダムに代入
			this.agi = rnd.nextInt(1000);
			//変数defに0～999の中の値をランダムに代入
			this.def = rnd.nextInt(1000);
		}
		
		//ステータスの表示メソッド
		public void status() {
			System.out.println("ステータス");
			System.out.println("HP：" + this.hp);
			System.out.println("MP：" + this.mp);
			System.out.println("攻撃力：" + this.atk);
			System.out.println("素早さ：" + this.agi);
			System.out.println("防御力：" + this.def);
		}
		
		//getter処理
		public int getHp() {
			return this.hp;
		}
		public int getMp(){
			return this.mp;
		}
		public int getAtk() {
			return this.atk;
		}
		public int getAgi() {
			return this.agi;
		}
		public int getDef() {
			return this.def;
		
		}
		
}
