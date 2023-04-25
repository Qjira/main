package Curriculum_New_1_29_30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class JpPrefSort {
	JpPrefBean prefBean = new JpPrefBean();
	
	/*
	 	都道府県名：山形県
		県庁所在地：山形市
		面積：9323.0km2
	 */
	
	// 県のデータの出力
	public void prefData(int sortNum) {
	// 都道府県名：○○
		System.out.println("都道府県名：" + prefBean.getPref(sortNum));
	// 県庁所在地：○○
		System.out.println("県庁所在地：" + prefBean.getPrefCap(sortNum));
	// 面積：○○km2
		System.out.println("面積：" + prefBean.getPrefArea(sortNum) + "km2");
		System.out.println();
	}
	// 指定された数だけ0～10の値を入力する
	public static ArrayList<Integer> inputNum(int count,int sortNum,Scanner scanner) {
	// 入力された数字を格納する配列の作成
		ArrayList<Integer> beforSortNums = new ArrayList<Integer>();

		System.out.println("0～10の数字を入力してください");
		
	// countに入力された数繰り返し処理
		for(int i = 0; i < count; i++) {
			sortNum = scanner.nextInt();
	// 0～10の入力の場合
			if(sortNum <= 10 && sortNum >= 0) {
	// beforSortNumsに値を格納
				beforSortNums.add(sortNum);
			}
		}

	// 重複した値の排除
		Set<Integer> tmpSet = new LinkedHashSet<Integer>(beforSortNums);
		ArrayList<Integer> afterSortNums = new ArrayList<Integer>(tmpSet);
		
	// 重複が削除されているか確認
	// System.out.println(afterSortNums);
		return afterSortNums; 
	}
	
	// 昇順にソート
	public static ArrayList<Integer> sort(ArrayList<Integer> afSortNums) {
		Collections.sort(afSortNums);
		return afSortNums;
	}
	
	// 降順にソート
	public static ArrayList<Integer> reverseSort(ArrayList<Integer> afSortNums){
	// sort関数で降順に並び替え 
        Collections.sort(afSortNums, Collections.reverseOrder());
        return afSortNums;
	}
}
