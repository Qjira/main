package Curriculum_New_1_23;

public class Theme2 {
	public static void main(String[] args) {
/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
	//インスタンスの生成
		Animal animal1 = new Animal(null, 0.0d, 0);
		animal1.animal();
		
		//setterでanimal1の各変数を代入
		animal1.setAnimalName("ライオン");
		animal1.setHeight(2.1);
		animal1.setSpeed(80);
		
		//nullチェック
		if(animal1.getAnimalName() != null) {
		//動物名をgetterで取得
		System.out.println("動物名：" + animal1.getAnimalName());
		}
		//体長をgetterで取得
		System.out.println("体長：" + animal1.getHeight());
		//速度をgetterで取得
		System.out.println("速度：" + animal1.getSpeed());
	}
}
