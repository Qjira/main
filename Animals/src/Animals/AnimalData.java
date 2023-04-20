package Animals;

public class AnimalData {
	//フィールド変数
	private String data;

	//コンストラクタ
	AnimalData(String data) {
		this.data = data;
	}

	//インスタンス化
	AnimalDataBean animDataBean = new AnimalDataBean();

	//入力された文字列を分割し出力するメソッド
	public void printAnimData() {
		//入力された情報をカンマ区切りで分割
		String[] arrayAnimal = data.split(",");
		//配列の各要素をそれぞれ”：”区切りで分割を行うための繰り返し処理
		for(int i = 0; i < arrayAnimal.length; i++) {
			//要素確認のため出力
			//System.out.println(arrayAnimal[i]);

			//配列の要素をそれぞれ”：”区切りで分割
			String[] arrayAnimalData = arrayAnimal[i].split(":");
			//動物の各項目を出力するためのループ文
			for(int j = 0; j < arrayAnimalData.length; j++) {
				switch(j) {
				//動物名の要素が来た場合
				case 0:
					animDataBean.setAnimalName(arrayAnimalData[j]);
					System.out.println("動物名：" + animDataBean.getAnimalName()
							);
					break;
					//体長の要素が来た場合
				case 1:
					double height = Double.parseDouble(arrayAnimalData[j]);
					animDataBean.setHeight(height);
					System.out.println("体長：" + animDataBean.getHeight() + "m");
					break;
					//速度の要素が来た場合
				case 2:
					int speed = Integer.parseInt(arrayAnimalData[j]);
					animDataBean.setSpeed(speed);
					System.out.println("速度：" + animDataBean.getSpeed() + "km/h");
					break;
				}
			}
			//学名を参照するメソッドの呼び出し
			scientificName(animDataBean.getAnimalName());
		}
	}
	
	//動物名から学名を参照
	public void scientificName(String animName) {
		//学名の出力
		System.out.print("学名：");
		//各動物名に適応した学名の出力
		switch(animName) {
		case "ライオン":
			System.out.println("パンテラ　レオ");
			break;
		case "ゾウ":
			System.out.println("ロキソドンタ・サイクロティス");
			break;
		case "パンダ":
			System.out.println("アイルロポダ・メラノレウカ");
			break;
		case "チンパンジー":
			System.out.println("パン・トゥログロディス");
			break;
		case "シマウマ":
			System.out.println("チャップマンシマウマ");
			break;
		case "インコ":
			System.out.println("不明");
			break;
		}
		System.out.println();
	}
}
