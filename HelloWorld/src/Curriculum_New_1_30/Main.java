package Curriculum_New_1_30;

public class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// printメソッドを呼び出し
		person1.print();
		
		// 合計人数の出力
		System.out.println("合計" + Person.count() + "人です");
	}
}
