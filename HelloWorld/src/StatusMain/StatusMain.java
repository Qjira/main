package StatusMain;
//Scannerを扱うためにjava.util.Scannerをインポート
import java.util.Scanner;

import StatusLogic.RandomStatus;

public class StatusMain {

	public static void main(String[] args) {
/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
	 	 メソッドのオーバーライドを使用してください
		 superクラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
		//scannerの初期化
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("何人：");
		int j = scanner.nextInt();
		
		for(int i = 0; i < j; i++) {
		//名前：の出力
		System.out.print("名前：");
		//名前の入力
		String name = scanner.next();
		
		//person1のインスタンスの生成
		RandomStatus person1 = new RandomStatus(name);
		//ステータスを表示するためのメソッドの呼び出し
		person1.status();
		}
	}
}