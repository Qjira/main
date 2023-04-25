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
	
	// 県名を格納する配列
	private String[] pref = {
		"北海道",
		"青森県",
		"岩手県",
		"宮城県",
		"秋田県",
		"山形県",
		"福島県",
		"茨城県",
		"栃木県",
		"群馬県",
		"埼玉県"
	};
	
	// 県庁所在地を格納する配列
	private String[] prefCap = {
		"札幌市",
		"青森市",
		"盛岡市",
		"仙台市",
		"秋田市",
		"山形市",
		"福島市",
		"水戸市",
		"宇都宮市",
		"前橋市",
		"さいたま市"
	};
	
	// 面積を格納する配列
	private double[] prefArea = {
		83424,
		9646,
		15275,
		7282,
		11638,
		9323,
		13784,
		6097,
		6408,
		6362,
		3798
	};
	
	// 県名のsetter,getter処理
	public void setPref(String[] pref) {
		this.pref = pref;
	}
	public String getPref(int sortNum) {
		return pref[sortNum];
	}

	// 市名のsetter,getter処理
	public void setPrefCap(String[] prefCap) {
		this.prefCap = prefCap;
	}
	public String getPrefCap(int sortNum) {
		return prefCap[sortNum];
	}

	// 面積のsetter,getter処理
	public void setPrefArea(double[] prefArea) {
		this.prefArea = prefArea;
	}
	public double getPrefArea(int sortNum) {
		return prefArea[sortNum];
	}
}
