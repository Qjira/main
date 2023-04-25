package StatusLogic;
import java.util.Random;

public class RandomStatus {
	//rndのインスタンス化
	Random rnd = new Random();
	//フィールド変数
	private String name;
	
	//コンストラクタの作成
	public RandomStatus(String name){
		this.name = name;
	}
	
	//インスタンス化
	Status status = new Status();

	public void status() {
		//ランダム(0～999)
		for(int i = 0; i < 5; i++) {
			switch(i){
			//HP生成
			case 0:
				status.setHp(rnd.nextInt(1000));
				break;
			//MP生成
			case 1:
				status.setMp(rnd.nextInt(1000));
				break;
			//攻撃力生成
			case 2:	
				status.setAtk(rnd.nextInt(1000));
				break;
			//素早さ生成
			case 3:	
				status.setAgi(rnd.nextInt(1000));
				break;
			//防御力生成
			case 4:
				status.setDef(rnd.nextInt(1000));
				break;
			}
		}
		//各ステータスの表示
		//nullチェック
		if(this.name != null) {
			System.out.println("こんにちは「" + this.name + "」さん");
			System.out.println("ステータス");
			System.out.println("HP：" + status.getHp());
			System.out.println("MP：" + status.getMp());
			System.out.println("攻撃力：" + status.getAtk());
			System.out.println("素早さ：" + status.getAgi());
			System.out.println("防御力：" + status.getDef());
			System.out.println();
			System.out.println("さあ冒険に出かけよう！");
			System.out.println();
		}
	}
}
