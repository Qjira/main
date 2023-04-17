package Curriculum_New_1_5;

public class Curriculum_New_1_5 {

	public static void main(String[] args) {
		// Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		//  好きな食べ物のみインスタンス変数にして、他の項目はローカル変数に代入し○○に入れてください
		// 『山田太郎 18歳 170.5cm 62.2kg 寿司』

		// ↓↓format↓↓
		// 「初めまして○○です」
		// 「年齢は○○歳です」
		// 「身長は○○cmです」
		// 「体重は○○kgです」
		// 「好きな食べ物は○○です」

		// Q1を下記に記載

		//各自己紹介の内容の変数の宣言と代入
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;

		//インスタンス化
		Food food1 = new Food();
		food1.food = "寿司"; 

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		//foodメソッドの呼び出し
		food1.food();

		// Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
		// 「BMIは○○です」
		// ただし計算は数値を直書きせず、全て変数を使ってすること
		// Q2を下記に記載

		//㎝をmに変換
		height /= 100; 

		//bmiの計算
		double bmi = weight / height / height;

		//小数点第2位を四捨五入してBMIを出力
		System.out.println("BMIは" + String.format("%.1f",bmi) + "です");
		System.out.println("");

		// Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
		// 初めまして鈴木一郎です
		// 年齢は24歳です
		// 身長168.5cmです
		// 体重は64.2kgです
		// 好きな食べ物はオムライスです
		// BMIは22.6です

		// Q3を下記に記載

		//各自己紹介の内容を変数に代入
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;

		//インスタンス化
		Food food2 = new Food();
		food2.food = "オムライス";

		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + "kgです");
		//foodメソッドの呼び出し
		food2.food();

		//㎝をmに変換
		height /= 100; 

		//BMIの計算
		bmi = weight / height / height;

		//小数点第2位を四捨五入してBMIを出力
		System.out.println("BMIは" + String.format("%.1f",bmi) + "です");

		// ↓↓コンソール最終結果↓↓

		//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です

	}


}