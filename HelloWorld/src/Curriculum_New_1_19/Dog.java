package Curriculum_New_1_19;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	public String animalName;
	// Q2：フィールドに動物の数の変数を定義してください。
	public int animalNum;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	
	//引数なしのDogコンストラクタの作成
	Dog(){
		//animalNameに"犬"を代入
		animalName = "犬";
	}
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	
	//引数にanimalNumを用いたDogコンストラクタの作成
	Dog(int animalNum){
		//変数animalNumにdog2インスタンスの引数を代入
		this.animalNum = animalNum; 
	}
}
