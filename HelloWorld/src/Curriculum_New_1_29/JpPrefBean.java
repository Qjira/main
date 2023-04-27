package Curriculum_New_1_29;

public class JpPrefBean {
	/*
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
	 */

	// 県のデータを格納する配列
	private String[] prefData = {
			"北海道,札幌市,83424",
			"青森県,青森市,9646",
			"岩手県,盛岡市,15275",
			"宮城県,仙台市,7282",
			"秋田県,秋田市,11638",
			"山形県,山形市,9323",
			"福島県,福島市,13784",
			"茨城県,水戸市,6097",
			"栃木県,宇都宮市,6408",
			"群馬県,前橋市,6362",
			"埼玉県,さいたま市,3798"
	};

	// prefDataのsetter,getter処理
	public String[] getPrefData(int i) {
		// 要素内の":区切りで分割
		String[] arrayPrefData = prefData[i].split(":");
		return arrayPrefData;
	}
	public void setPrefData(String[] prefData) {
		this.prefData = prefData;
	}
}
