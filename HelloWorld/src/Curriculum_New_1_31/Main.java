package Curriculum_New_1_31;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		Person person2 = new Person("鈴木次郎", 15, 1.7, 60);
		
		//printメソッドを呼び出し
		person1.print();
		person2.print();
		
		//インスタンス化
		Car car = new Car();
		car.setOwner(person1.getName());
		
		//インスタンス化
		Bicycle bicycle = new Bicycle();
		bicycle.setOwner(person2.getName());
		
		//各オーナー名出力
		System.out.println(car.getOwner());
		System.out.println(bicycle.getOwner());
		
		
		person1.buy(car);
		person2.buy(bicycle);
		
		//合計人数の出力
		System.out.println("合計" + Person.count() + "人です");
	}
}
