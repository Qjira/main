package Curriculum_New_1_20_22;

public class Theme2  {

	public static void main(String[] args) {
/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
		//引数に"日本","寿司","和食"を渡したCountryクラスのインスタンス生成
		Country country1 = new Country("日本","寿司","和食");
		//現在時刻を取得するためにNowTimeクラスのインスタンス生成
		NowTime nowTime1 = new NowTime();
		
		//上記インスタンスを用いたhelloメソッド処理
		country1.hello();
		//上記インスタンスを用いたnowメソッド処理
		nowTime1.now(); 
	}
}