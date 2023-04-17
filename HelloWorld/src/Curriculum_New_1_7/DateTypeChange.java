package Curriculum_New_1_7;

public class DateTypeChange {
	public static void main(String[] args) {

		//		問１）
		//		以下のプログラムを作成してください。
		//		①int型変数 i に 3 を代入する。


		//変数iに3を代入
		int i = 3;

		//		②double型変数 d に i を代入する。

		//dに変数iを代入
		double d = i;

		//		③変数 i と変数 d の値をそれぞれコンソールに表示する。

		//それぞれの変数を出力
		System.out.println(i);
		System.out.println(d);

		//		問２）
		//		以下のプログラムを作成してください。
		//		①double型変数 pi に数値「3.14」を代入して下さい。。

		//double型変数piに3.14を代入
		double pi = 3.14;

		//		②変数 pi に「3」を掛けた値をコンソールに出力して下さい。

		//piに3を掛けた値を出力
		System.out.println(pi * 3);		
		//		④int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。

		//int型変数integerの宣言とint型に変換したpiを代入
		int integer = (int)pi;

		//integerの出力
		System.out.println(integer);

		//		問３）
		//		①double型の変数を定義し、「2 + 6.0」を代入して下さい。
		//		　double型の変数をコンソールに出力して下さい。

		//double型変数d2に2 + 6.0 を代入
		double d2 = 2 + 6.0;
		//出力
		System.out.println(d2);

		//		②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
		//		　int型の変数をコンソールに出力して下さい。

		//int型変数jにd2を因とに変換して代入
		int j = (int)d2;
		//出力
		System.out.println(j);

		//		③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
		//		　String型の変数をコンソールに出力して下さい。

		//変数jをString型に変換しstrに代入
		String str = String.valueOf(j);
		//出力
		System.out.println(str);

		//		④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
		//		　int型の変数をコンソールに出力して下さい。

		//jにString型変数strをint型に変換し代入
		j = Integer.parseInt(str);
		//出力
		System.out.println(j);
	}
}
