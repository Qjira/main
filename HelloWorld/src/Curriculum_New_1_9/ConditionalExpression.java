package Curriculum_New_1_9;
import java.util.Random;

public class ConditionalExpression {
	public static void main(String[] args) {
		//		問１）
		//		boolean型変数 rain を宣言し、今日の天気が雨なら「true」雨でないなら「false」を代入して下さい。
		//		もし rain が true ならコンソールに「DVDを見ます。」と false なら「外で遊びます。」と表示して下さい。

		//変数rainの宣言とtrueの代入
		boolean rain = true;

		//雨の時と雨でないときの表示内容をifを使って表示
		if(rain) {
			System.out.println("DVDを見ます。");
		}else {
			System.out.println("外で遊びます。");
		}

		//		問２）
		//		String型変数 name に任意の名前を入れて下さい。
		//		int型変数 score に「0~100」までの乱数を代入して下さい。
		//		もし score が 40点以下なら「〇〇さんは□□点です。もう少し頑張りましょう。」、
		//		もし score が 40点以上、60点以下なら「〇〇さんは□□点です。もう少しでした。」、
		//		もし score が 60点以上、80点以下なら「〇〇さんは□□点です。よくできました。」、
		//		もし score が 80点以上なら「〇〇さんは□□点です。たいへんよくできました。」とコンソールに出力して下さい。

		//変数nameの宣言と名前の代入
		String name = "aaa";

		//インスタンス化
		Random rnd = new Random();
		//0～100をランダムに表示する変数sucoreの宣言
		int score = rnd.nextInt(101);

		//scoreの値が80以上の場合
		if(score >= 80) {
			System.out.println(name + "さんは" + score + "点です。" + "大変よくできました。");
		}
		//60以上80未満の場合
		else if(score >= 60) {
			System.out.println(name + "さんは" + score + "点です。" + "よくできました。");
		}
		//40以上60未満の場合
		else if(score >= 40) {
			System.out.println(name + "さんは" + score + "点です。" + "もう少しでした。");
		}
		//40以下の場合
		else if(score <= 40) {
			System.out.println(name + "さんは" + score + "点です。" + "もう少し頑張りましょう。");
		}

		//		問３）
		//		①変数 isTired を定義し、0 か 1 を代入する。（どちらを代入しても構わない。）

		//変数isTiredの宣言と0の代入
		int isTired = 0;

		//		②変数 study を定義し、文字列 "カリキュラム" を代入する。

		//変数studyの宣言とカリキュラムの代入
		String study = "カリキュラム";

		//		③もし変数 isTired が 0 であれば「私はとても元気です。」、そうでなければ「私は疲れています。」と表示する。

		//isTiredの値が0の場合とそれ以外の場合の記述をif文を用いて表示
		if(isTired == 0) {
			System.out.println("私はとても元気です。");
		}else {
			System.out.println("私は疲れています。");
		}

		//		※④は System.out.println() のカッコ内に条件演算子（三項演算子）を使って、一行で書いてください。
		//		④もし変数 isTired が 0 であれば、変数 study を利用して「カリキュラムを続けます。」と表示する。

		//三項演算子　条件式 ? trueの場合の戻り値 : falseの場合の戻り値　を用いて出力
		System.out.println(isTired == 0 ? study + "を続けます。" : null);


	}
}
