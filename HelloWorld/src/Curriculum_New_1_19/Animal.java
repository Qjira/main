package Curriculum_New_1_19;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		//インスタンスの生成
		Dog dog1 = new Dog();
		//Dogクラスの動物の名前の出力
		System.out.println(dog1.animalName);
		
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		//動物の数を引数に渡したインスタンスの生成
		Dog dog2 = new Dog(3);
		//Dogクラスの動物の数の出力
		System.out.println(dog2.animalNum);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		//CalendarクラスのgetInsranceメソッドで現在の日時を初期化
		Calendar calendar = Calendar.getInstance();

		//getTimeメソッドで現在時刻を取得しDate型に変換
		Date date = calendar.getTime();
		//aaa MM dd HH:mm:ss JST yyyy

		//"yyyy-MM-dd HH:mm:ss"のフォーマットに設定
		SimpleDateFormat sformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//現在時刻を上記フォーマットに変換
		String now = sformat.format(date);

		//現在時刻の出力
		System.out.println(now);
	}
}
