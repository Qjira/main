/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
 */
package Curriculum_New_1_10;

public class practice2 {

	public static void main(String[] args) {
		//for内のforを9回繰り返す処理
		for(int i = 1; i < 10; i++) {
			//for内の処理を9回繰り返す処理
			for(int j = 1; j < 10; j++) {
				//〇＊〇+スペースの表示と横に同じ表示を表示するための処理
				System.out.print(i + "×" + j + "=" + i * j + " ");
			}
			System.out.println(" ");
		}
	}
}
