package Curriculum_New_1_33;

public class Person {
	// インスタンスフィールドを定義
	private String firstName;
	private String lastName;
	private int age;
	private double height;
	private double weight;

	// クラスフィールドを定義（インスタンスの数を数えるため）
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName, String lastName, int age, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	// 生成されるたびに人数をカウント
		Person.count++;
	}

	// BMIの計算をするメソッド
	public double bmi() {
		return this.weight / this.height / this.height;
	}
	
	// ファーストネームとラストネームの連結
	public String fullName(){
		return this.firstName + this.lastName;
	}


	// 自己紹介文を出力するメソッド
	public void print() {
		System.out.println("私の名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + ((double)Math.round(this.bmi() * 10)) / 10 + "です");
		
	}

	// カウントした数を返すメソッド
	public static void printCount() {
		System.out.println("合計" + count + "人です");

	}
	
	// 車の購入者を表示
	public void buy(Car car) {
	// carクラスのsetOwnerメソッドの呼び出し
		car.setOwner(this.fullName());
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	// 自転車の購入者の表示
	public void buy(Bicycle bicycle) {
	// bicycleクラスのsetOwnerメソッドの呼び出し
		bicycle.setOwner(this.fullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}
}
