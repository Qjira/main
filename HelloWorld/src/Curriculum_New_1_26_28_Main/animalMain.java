package Curriculum_New_1_26_28_Main;
import java.util.Scanner;

import Curriculum_New_1_26_28_Data.AnimalData;
public class animalMain {
	/*

 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
	 */

	public static void main(String[] args) {
		
		// スキャナーの初期化
		Scanner scanner = new Scanner(System.in);

		// 文字の入力指示
		System.out.println("コンソールに文字を入力してください");
		// 文字の入力処理
		String data = scanner.next();
		System.out.println();

		// インスタンス化
		AnimalData animData = new AnimalData(data);
		// 入力された文字列を分割し出力するメソッドの呼び出し
		animData.printAnimData();
	}

	/*
  	コンソール出力結果

  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ

	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス

	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ

	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス

	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ

	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明


	 */
}
