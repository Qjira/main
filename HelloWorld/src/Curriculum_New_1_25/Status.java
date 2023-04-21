package Curriculum_New_1_25;

public class Status extends RandomStatus{
	
	Status(int hp, int mp, int atk, int agi, int def) {
		super(hp, mp, atk, agi, def);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//ステータスの表示メソッドのオーバーライド
	public void status() {
		super.status();
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");
	}
}
