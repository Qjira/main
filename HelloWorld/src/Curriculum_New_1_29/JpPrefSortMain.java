package Curriculum_New_1_29;
import java.util.ArrayList;
import java.util.Scanner;

public class JpPrefSortMain {
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

	 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	 	都道府県がソートされてコンソールに出力されるように作ってください
	   	※Packageを2つ作ってください
	   	※複数選択できるようにしてください

	   	例:
   		8
   		5
   		9
   		と入力された場合（昇順）
	 */

	public static void main(String[] args) {

		// インスタンス化
		Scanner scanner = new Scanner(System.in);
		JpPrefSort prefSort = new JpPrefSort();

		// 入力数を入力
		System.out.println("数字をいくつ入力しますか");
		int count = scanner.nextInt();
		// 変数sortNumの宣言と初期化
		int sortNum = 0;

		/*
		 * inputメソッドで入力数の分だけ0～10を入力する処理を繰り返す
		 * 入力された値に重複がある場合に重複を削除しafSortNumsリストに格納
		 */
		ArrayList<Integer> afSortNums = JpPrefSort.inputNum(count,sortNum,scanner);

		// 昇順か降順か選択してもらう
		System.out.println("昇順か降順か選んでください");
		String sort = scanner.next();

		switch (sort) {
		// 昇順が入力された場合
		case "昇順":
			// 昇順処理
			JpPrefSort.sort(afSortNums);
			break;
			// 降順が選択された場合
		case "降順":
			// 降順処理
			JpPrefSort.reverseSort(afSortNums);
			break;
		}

		// afSortNumsに格納された要素数分繰り返し処理
		for(int i = 0; i < afSortNums.size(); i++ ) {
			// 各県の詳細表示処理
			prefSort.prefData(afSortNums.get(i));
		}
	}


}
