package Curriculum_New_1_4;

public class Curriculum_New_1_4 {

	public static void main(String[] args) {

		// Q1 下記9個をクラス変数として宣言のみしてください
		//		・バイト型・短整数型・整数型・長整数型
		// 	　　・単精度浮動小数点数型・倍精度浮動小数点数型
		//   	・文字型・文字列型
		//	 	・ブーリアン型
		
		//各変数の宣言
		byte b;
		short s;
		int i;
		long l;
		float f;
		double dbl;
		char c;
		String str;
		boolean bool;

		// Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
		
		//各変数の初期値の代入
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		dbl = 0.0d;
		c = '\u0000';
		str = null;
		bool = false;


		// Q3 初期化をしたそれぞれの変数に下記の値を代入してください

		// ・バイト型                 10
		// ・短整数型                 100
		// ・整数型                	 1000
		// ・長整数型                 10000
		// ・単精度浮動小数点数型   	 9.5
		// ・倍精度浮動小数点数型		 10.5
		// ・文字型                   a
		// ・文字列型              	 ハロー
		// ・ブーリアン型          	 true

		//各変数を指定された値に変更
		b = 10;
		s = 100;
		i = 1000;
		l = 10000l;
		f = 9.5f;
		dbl = 10.5;
		c = 'a';
		str = "ハロー";
		bool = true;

		// Q4 下記の通りにコンソール出力されるようにしてください
		// 必ず変数を使用すること

		// 11110
		// 20.0
		// a ハロー true
		// 11130.0                    数字を全て足す
		// 10000000000                小数点以外の数字を全てかける
		// 0.105                      10.5割る100をする
		// -90                        10引く100をする
		
		//10+100+1000+10000＝11110
		System.out.println(b + s +i + l);
		//小数点を表示させるためにdouble型とfloat型の変数を使用
		System.out.println(f + dbl);
		//各変数の間にスペースを作るため各変数間で" "を結合
		System.out.println(c + " " + str + " " + bool);
		//数字をすべて足す
		System.out.println(b + s + i + l + f + dbl);
		//小数点以外の数字をすべてかける
		System.out.println(b * s * i * l);
		//10.5割る100
		System.out.println(dbl / s);
		//10引く100
		System.out.println(b - s);
		
		// Q5 
		// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
		//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
		
		//変数numがString型となっているためint型に修正
		int num = 20;
		int num1 = 23;
		
		System.out.println("ハローJAVA" + (num + num1));

	}

}
