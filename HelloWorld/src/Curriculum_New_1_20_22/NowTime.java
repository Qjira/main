package Curriculum_New_1_20_22;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NowTime {
	public void now() {
		//CalendarクラスのgetInsranceメソッドで現在の日時を初期化
		Calendar calendar = Calendar.getInstance();

		//getTimeメソッドで現在時刻を取得しDate型に変換
		Date date = calendar.getTime();
		//aaa MM dd HH:mm:ss JST yyyy

		//"yyyy/MM/dd HH:mm:ss"のフォーマットに設定
		SimpleDateFormat sformat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//現在時刻を上記フォーマットに変換
		String now = sformat.format(date);

		//現在時刻の出力
		System.out.println("現在日時は" + now + "です");
	}
}
