package Curriculum_New_1_30;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	
	//クラスフィールドを定義（インスタンスの数を数えるため）
	private static int count;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; 
	}
	
	//BMIの計算をするメソッド
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	//自己紹介文を出力するメソッド
	public void print() {
		System.out.println("私の名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + ((double)Math.round(this.bmi() * 10)) / 10 + "です");
	//出力されるたびに人数をカウント
		count++;
	}
	
	//カウントした数を返すメソッド
	public static int count() {
		return count;
		
	}
}
