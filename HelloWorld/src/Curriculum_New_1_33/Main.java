package Curriculum_New_1_33;

public class Main {

	public static void main(String[] args) {
		// インスタンス化
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		person1.print();

		// インスタンス化
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		person2.print();
		
		// インスタンス化
		Car car = new Car();
		car.setOwner(person1.fullName());
		
		// インスタンス化
		Bicycle bicycle = new Bicycle();
		bicycle.setOwner(person2.fullName());
		
		// 各オーナー名出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		// 購入者の表示
		person1.buy(car);
		person2.buy(bicycle);
		
		// 合計人数の出力
		System.out.println("合計" + Person.count + "人です");
		Person.printCount();
	}
}
