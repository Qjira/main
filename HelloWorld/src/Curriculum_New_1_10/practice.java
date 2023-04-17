/*
問題.for文を使用し、以下のプログラムを作成してください。
	①変数iに1を代入
	②変数iに2ずつ足す処理を10回繰り返す。
		出力結果：  3
					5
					7
					9
					・
					・
					・
					21
 */
package Curriculum_New_1_10;

public class practice {

	public static void main(String[] args) {
		//変数iの宣言と1の代入
		int i = 1;
		//jの宣言と0の代入、jが10未満で1づつ増える処理
		for(int j = 0; j < 10; j++) {
			//変数iに2を足した値を代入を処理
			i += 2;
			//出力
			System.out.println(i);
		}
	}

}