/*
	問題．while文を使用し、以下のプログラムを作成してください。
		・1～100を出力
		・奇数の数字に「〇は奇数です」と出力
		・偶数の数字に「○は偶数です」と出力
		  出力結果  1は奇数です
					2は偶数です
					3は奇数です
					4は偶数です
						・
						・
						・
					100は偶数です
 */
package Curriculum_New_1_12;

public class practice {

	public static void main(String[] args) {
		//while文で100回処理を行うために用いる変数iの宣言と1の代入
		int i = 1;
		//100回で処理を止める
		while(i < 101) {
			//偶数を判別するための処理
			if(i % 2 == 0) {
				System.out.println(i + "は偶数です");
				//奇数を判別するための処理
			}else {
				System.out.println(i + "は期数です");
			}
			//100回処理を行うために1から1回の処理が終わるごとにiにプラス1する
			i++;
		}
	}

}
