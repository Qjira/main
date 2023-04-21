package Curriculum_New_1_31;

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
		this.setName(name);
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
		System.out.println("私の名前は" + this.getName() + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + ((double)Math.round(this.bmi() * 10)) / 10 + "です");
		//出力されるたびに人数をカウント
		count++;
	}

	//カウントした数を返すメソッド
	public static int count() {
		return count;

	}

	public void buy(Car car) {
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
	
	//nameのsetter,getter処理
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
