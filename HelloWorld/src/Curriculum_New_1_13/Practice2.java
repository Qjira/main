/*
	①配列aを作成し、1～5を格納してください。

	②参照型配列bを作成し、3を表示してください。
		出力結果：3

	③配列a[3]を10で上書きし表示してください。
		出力結果：10

	④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
		出力結果：配列aの要素数は、５です。
 */
package Curriculum_New_1_13;

public class Practice2 {

	public static void main(String[] args) {
		//配列aの作成と値の格納
		int a[] = {1, 2, 3, 4, 5};

		//参照型配列bの作成
		int[] b = new int[1];
		//b[0]に3を代入
		b[0] = 3;
		//bで3を出力
		System.out.println(b[0]);

		//配列a[3]の値を10に上書き
		a[3] = 10;
		//出力
		System.out.println(a[3]);

		//a.lengthで配列の要素数を表示し出力
		System.out.println("配列aの要素数は、" + a.length + "です。");
	}

}
