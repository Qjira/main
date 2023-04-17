
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package Curriculum_New_1_14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//配列strの作成とa～jまでの格納
		String str[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		//a～jまで繰り返し出力を行う
		for (int i = 0; i < 10; i++) {
			//strがe以降のアルファベットになったら繰り返し処理を止める
			if(i >= 4) {
				break;
			}
			//出力
			System.out.println(str[i]);
		}

		System.out.println();

		//a～jまで繰り返し出力を行う
		for (int i = 0; i < str.length; i++) {
			//iの出力のみ飛ばす
			if(i == 8) {
				continue;
			}
			//出力
			System.out.println(str[i]);
		}
	}

}
