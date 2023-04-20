/*
	問題．switch文を使用し、以下のプログラムを作成してください。
			変数に数値を代入

		①2の場合は、「（変数）月は28日です。」
			出力結果：2月は28日です。

		②4，6，9，11の場合は、「（変数）月は30日です。」
			出力例：4月は30日です。

		③その他の場合は、「（変数）月は31日です。」
			出力例：1月は31日です。
 */
package Curriculum_New_1_11;
//Randomクラスのインポート
import java.util.Random;

public class sample {

	public static void main(String[] args) {
		//インスタンス化
		Random rnd = new Random();
		//iの宣言と1～12のランダムな数字の代入
		int i = rnd.nextInt(13) + 1; 
		//switch文
		switch(i) {
		//iが2の場合の処理
		case 2:
			System.out.println(i + "月は28日です。");
			break;
			//iが4,6,9,11の場合の処理
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(i + "月は30日です。");
			break;
			//iが上記ケース以外の値の場合の処理
		default:
			System.out.println(i + "月は31日です。");
		}
	}    
}