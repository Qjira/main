package Curriculum_New_1_25;
import java.util.Scanner;

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
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("名前：");
		String name = scanner.next();
		
		System.out.println("こんにちは「" + name + "」さん");
		System.out.println();
		
		Status person1 = new Status(0,0,0,0,0);
		person1.status();
	}
}