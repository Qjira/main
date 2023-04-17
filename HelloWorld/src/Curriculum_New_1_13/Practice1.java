/*
	int型の配列aを作成してください。
	配列aに1～5の数字を格納してください。
	繰り返し処理を使用し、
	配列aの数字を順番に表示させてください。

	出力結果：1
			  2
			  3
			  4
			  5
 */
package Curriculum_New_1_13;

public class Practice1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//int型配列aの作成
		int a[] = {1, 2, 3, 4, 5};
		//配列aの要素を順番に表示するために変数jの宣言を行い、拡張for文を用いて処理
		for (int j: a) {
			System.out.println(j);
		}
	}

}