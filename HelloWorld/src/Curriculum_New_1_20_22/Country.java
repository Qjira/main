package Curriculum_New_1_20_22;

public class Country {
	
	//国名の宣言
	private String country;
	//食べ物の宣言
	private String food;
	//○○食の宣言
	private String countryFood;
	
	//コンストラクタの作成
	Country(String country,String food,String countryFood) {
		this.country = country;
		this.food = food;
		this.countryFood = countryFood;
	}
	
	//helloメソッドの作成
	public void hello() {
		//nullチェック
		if(this.country != null && this.food != null && this.countryFood != null) {
			//こんにちは！ここは○○でです！の出力
			System.out.println("こんにちは！ここは" + this.country + "です！");
			//この○○はうまい！の出力
			System.out.println("この" + this.food + "はうまい");
			//○○は○○ですの出力
			System.out.println(this.food + "は" + this.countryFood + "です");
		}
	}
}
