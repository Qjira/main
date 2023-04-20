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
	
	//setterメソッド
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	//getterメソッド
	public String getAnimalName() {
		return this.animalName;
	}
	
	//setterメソッド
	public void setHeight(double height) {
		this.height = height;
	}
	//getterメソッド
		public double getHeight() {
			return this.height;
		}
	
	//setterメソッド
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//getterメソッド
	public int getSpeed() {
		return this.speed;
	}
}
