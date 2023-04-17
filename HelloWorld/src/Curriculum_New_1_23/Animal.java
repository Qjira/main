package Curriculum_New_1_23;

public class Animal {
	
	//各変数の宣言（カプセル化）
	private String animalName;
	private double height;
	private int speed;
	
	//コンストラクタの作成
	Animal(String animalName, double height, int speed){
		this.animalName = animalName;
		this.height = height;
		this.speed = speed;
	}
	
	/* 動物名：○○
	 * 体長：○○m
	 * 速度：○○km/h
	 * 上記内容の出力メソッド
	 */
	public void animal() {
		//nullチェック
		if(this.animalName != null) {
		System.out.println("動物名：" + this.animalName);
		System.out.println("体長：" + this.height);
		System.out.println("速度：" + this.speed);
		}
	}
	
	//setterメソッド
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	//setterメソッド
	public void setHeight(double height) {
		this.height = height;
	}
	//setterメソッド
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//getterメソッド
	public String getAnimalName() {
		return this.animalName;
	}
	//getterメソッド
	public double getHeight() {
		return this.height;
	}
	//getterメソッド
	public int getSpeed() {
		return this.speed;
	}
}
