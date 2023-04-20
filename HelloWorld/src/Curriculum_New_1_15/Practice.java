/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点

②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
 */
package Curriculum_New_1_15;

public class Practice {

	public static void main(String[] args) {
		//配列int test[][]に生徒ごとに成績を格納
		int test[][] = {
				{64, 73, 69},
				{58, 81, 75},
				{86, 68, 79},
				{72, 55, 80}
		};

		//生徒の人数分繰り返し処理
		for(int i = 0; i < test.length; i++) {
			//（i + 1)で生徒番号を表示
			System.out.println("生徒" + (i + 1) + "：国語" + test[i][0] + "点、数学" + test[i][1] + "点、英語" + test[i][2] + "点");
		}

		//各科目ごとの点数を合計した値を配列sumTestに格納
		int sumTest[] =  {
				test[0][0] + test[1][0] + test[2][0] + test[3][0],
				test[0][1] + test[1][1] + test[2][1] + test[3][1],
				test[0][2] + test[1][2] + test[2][2] + test[3][2]
		};
		//テスト科目を格納
		String curriculum[] = {"国語", "数学", "英語"};

		//科目の平均値を求める処理を科目数分繰り返し処理
		for(int i = 0; i < sumTest.length; i++) {
			double avgTest = (double)sumTest[i] /  + test.length; 
			System.out.println(curriculum[i] + "の平均点は" + Math.round(avgTest * 10 / 10)  + "です。");
		}
	}

}
