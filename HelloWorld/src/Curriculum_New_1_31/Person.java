package Curriculum_New_1_31;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;

	// クラスフィールドを定義（インスタンスの数を数えるため）
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight; 
	}

	// BMIの計算をするメソッド
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// 自己紹介文を出力するメソッド
	public void print() {
		System.out.println("私の名前は" + this.getName() + "です");
		System.out.println("年は" + this.age + "歳です");
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
	// 生成されるたびに人数をカウント
		count++;
	}

	// カウントした数を返すメソッド
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
	// 車の購入者の表示
	public void buy(Car car) {
	// carクラスのsetOwnerメソッドの呼び出し
		car.setOwner(this.name);
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	// 自転車の購入者の表示
	public void buy(Bicycle bicycle) {
	// bicycleクラスのsetOwnerメソッドの呼び出し
		bicycle.setOwner(this.name);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
	
	// nameのsetter,getter処理
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
